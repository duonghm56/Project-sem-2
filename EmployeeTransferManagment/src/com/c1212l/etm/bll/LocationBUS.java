/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import java.sql.SQLException;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Project;
import java.util.ArrayList;
/**
 *
 * @author Luu Bi
 */
public class LocationBUS {
    Location bean = new Location();
    LocationDAO locationdao = new LocationDAO();
     public ArrayList<Location> searchLocation(String locationName) throws ClassNotFoundException, SQLException {
        return locationdao.searchLocationName(locationName);
    }

    public int addLocation(String locationName)throws ClassNotFoundException, SQLException
    {
//        bean.setLocationID(locationID);
        bean.setLocationName(locationName);
        return locationdao.addLocation(bean);
    }
        public int updateLocation(int locationID,String locationName)throws ClassNotFoundException, SQLException
    {
        bean.setLocationID(locationID);
        bean.setLocationName(locationName);
        return locationdao.updateLocation(bean);
    }
    public int deleteLocation(int locationID)throws ClassNotFoundException, SQLException
    {
        bean.setLocationID(locationID);
        return locationdao.deleteLocation(bean);
    }
}
