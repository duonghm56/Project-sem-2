/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.beans.Location;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                temp.setLocationName("locationName");
                listLocation.add(temp);
            }
        }
        closeConnection();
        return listLocation;
    }
    public void addLocation(Location location)throws ClassNotFoundException, SQLException
    {
        initConnection();
        CallableStatement cs = conn.prepareCall("call addLocation");
        cs.setInt(1,location.getLocationID());
        cs.setString(2,location.getLocationName());
        cs.executeUpdate();
        closeConnection();
    }
    public void updateLocation(Location location)throws ClassNotFoundException, SQLException
    {
        initConnection();
        CallableStatement cs = conn.prepareCall("call updateLocation");
        cs.setInt(1,location.getLocationID());
        cs.setString(1, location.getLocationName());
        cs.executeUpdate();
        closeConnection();
    }
    public void deleteLocation(Location location)throws ClassNotFoundException, SQLException
    {
          initConnection();
          CallableStatement cs = conn.prepareCall("call deleteLocation");
          cs.setInt(1, location.getLocationID());
          cs.executeUpdate();
          closeConnection();
    }
}
