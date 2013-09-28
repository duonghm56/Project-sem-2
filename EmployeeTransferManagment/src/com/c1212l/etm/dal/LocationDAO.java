/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Location;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class LocationDAO extends ConnectionTool {

    public ArrayList<Location> getAllLocation() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from location");
        ArrayList<Location> result = new ArrayList<>();
        while (rs.next()) {
            Location l = new Location();
            l.setLocationID(rs.getInt("locationID"));
            l.setLocationName(rs.getString("locationName"));
            result.add(l);
        }
        closeConnection();
        return result;
    }

    public void addLocation(Location location) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from location where locationName = ?");
        pstmt.setString(1, location.getLocationName());
        if (pstmt.executeQuery().next()) {
            error += "Error: Duplicate location name\n";
        }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call addLocation( ?)}");
            cs.setString(1, location.getLocationName());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }

    public void updateLocation(Location location) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from location where locationName = ?");
        pstmt.setString(1, location.getLocationName());
        if (pstmt.executeQuery().next()) {
            error += "Error: Update duplicate department name\n";
        }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call updateLocation(?, ?)}");
            cs.setInt(1, location.getLocationID());
            cs.setString(2, location.getLocationName());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }

    public void deleteLocation(Location location) throws ClassNotFoundException, Exception {        
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from department where locationID = ?");
        pstmt.setInt(1, location.getLocationID());
        if (pstmt.executeQuery().next()) {
            error += "Some departments are still working on this location\n";
        }
        pstmt = conn.prepareStatement("select * from transfer where fromLocationID = ? or toLocationID = ?");
        pstmt.setInt(1, location.getLocationID());
        pstmt.setInt(2, location.getLocationID());
        if (pstmt.executeQuery().next()) {
            error += "Some transfer records reference to this location\n";
        }

        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call deleteLocation(?)}");
            cs.setInt(1, location.getLocationID());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();        
    }

    public ArrayList<Location> searchLocationName(String locationName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from location " + locationName);
        ArrayList<Location> result = new ArrayList<>();
        while (rs.next()) {
            Location location = new Location();
            location.setLocationID(rs.getInt("locationID"));
            location.setLocationName(rs.getString("locationName"));
            result.add(location);
        }
        closeConnection();
        return result;
    }

    public Location getLocationById(int id) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from location where locationID = " + id);
            Location location = null;
            if (rs.next()) {
                location = new Location();
                location.setLocationID(rs.getInt("locationID"));
                location.setLocationName(rs.getString("locationName"));
            }
            closeConnection();
            return location;
        } catch (Exception ex) {
            return null;
        }
    }
}
