/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Project;
import java.sql.CallableStatement;
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
    public Vector <Location>  listAllLocation() throws ClassNotFoundException, SQLException
    {
        Vector <Location> listLocation = null;
        initConnection();
        Statement sta = conn.createStatement();
        ResultSet rs = sta.executeQuery("Select * from location");
        if (rs != null) {
            listLocation = new Vector<Location>();
            while(rs.next())
            {
                Location temp = new Location();
                temp.setLocationID(rs.getInt("locationID"));
                temp.setLocationName(rs.getString("locationName"));
                listLocation.add(temp);
            }
        }
        closeConnection();
        return listLocation;
    }
    public int addLocation(Location location)throws ClassNotFoundException, SQLException
    {
        int record = 0;
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addLocation(?)}");
//        cs.setInt(1,location.getLocationID());
        cs.setString(1,location.getLocationName());
        record = cs.executeUpdate();
        closeConnection();
        return record;
    }
    public int updateLocation(Location location)throws ClassNotFoundException, SQLException
    {
        int record =0;
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateLocation(?,?)}");
        cs.setInt(1,location.getLocationID());
        cs.setString(2, location.getLocationName());
        record=cs.executeUpdate();
        closeConnection();
        return record;
    }
    public int deleteLocation(Location location)throws ClassNotFoundException, SQLException
    {
          int record =0;
          initConnection();
          CallableStatement cs = conn.prepareCall("{call deleteLocation(?)}");
          cs.setInt(1,location.getLocationID());
          record = cs.executeUpdate();
          closeConnection();
          return record;
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
                location= new Location();
                location.setLocationID(rs.getInt("locationID"));
                location.setLocationName(rs.getString("locationName"));
            }
            closeConnection();
            return location;
        }catch(Exception ex){
            return null;
        }
    }
}
