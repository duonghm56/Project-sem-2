/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import java.sql.SQLException;
import com.c1212l.etm.dao.LocationDAO;
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

    public void addLocation(String locationName, float allowance) throws ClassNotFoundException, Exception {
        Location location = new Location();
//        bean.setLocationID(locationID);
        location.setLocationName(locationName);
        location.setAllowance(allowance);
        locationDAO.addLocation(location);
    }

    public void updateLocation(int locationID, String locationName, float allowance) throws ClassNotFoundException, Exception {
        Location location = new Location();
        location.setLocationID(locationID);
        location.setLocationName(locationName);
        location.setAllowance(allowance);
        locationDAO.updateLocation(location);
    }

    public void deleteLocation(int locationID) throws ClassNotFoundException, Exception {
        Location location = new Location();
        location.setLocationID(locationID);
        locationDAO.deleteLocation(location);
    }
}
