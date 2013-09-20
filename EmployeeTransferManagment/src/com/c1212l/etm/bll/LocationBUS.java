/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import java.sql.SQLException;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dto.Location;
import java.util.ArrayList;
/**
 *
 * @author Luu Bi
 */
public class LocationBUS {
     LocationDAO locationDAO;

    public LocationBUS() {
        locationDAO = new LocationDAO();
    }

      public ArrayList<Location> getAllLocation() throws ClassNotFoundException, SQLException {
        return locationDAO.getAllLocation();
    }
    
     public ArrayList<Location> searchLocation(String locationName) throws ClassNotFoundException, SQLException {
        return locationDAO.searchLocationName(locationName);
    }

    public int addLocation(String locationName)throws ClassNotFoundException, SQLException
    {
        Location location = new Location();
//        bean.setLocationID(locationID);
        location.setLocationName(locationName);
        return locationDAO.addLocation(location);
    }
        public int updateLocation(int locationID,String locationName)throws ClassNotFoundException, SQLException
        {
        Location location = new Location();
        location.setLocationID(locationID);
        location.setLocationName(locationName);
        return locationDAO.updateLocation(location);
    }
    public int deleteLocation(int locationID)throws ClassNotFoundException, SQLException
    {
        Location location = new Location();
        location.setLocationID(locationID);
        return locationDAO.deleteLocation(location);
    }
}
