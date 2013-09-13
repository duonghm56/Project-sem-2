/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.beans.Location;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Luu Bi
 */
public class LocationDAO extends ConnectionTool {
    public ArrayList<Location> getAllLocation() throws ClassNotFoundException, SQLException
    {
        initConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * From location");
        ArrayList<Location> result = new ArrayList<>();
        while(rs.next())
        {
            Location l = new Location();
            l.setLocationID(rs.getInt("locationID"));
            l.setLocationName(rs.getString("locationName"));
            result.add(l);
        }
        closeConnection();
        return result;
    }


            
}
