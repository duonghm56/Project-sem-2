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
}
