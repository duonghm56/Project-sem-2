/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import java.sql.SQLException;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dto.Location;
/**
 *
 * @author Luu Bi
 */
public class LocationBUS {
    Location bean = new Location();
    LocationDAO dao = new LocationDAO();
    public int addLocation(String locationName)throws ClassNotFoundException, SQLException
    {
//        bean.setLocationID(locationID);
        bean.setLocationName(locationName);
        return dao.addLocation(bean);
    }
        public int updateLocation(int locationID,String locationName)throws ClassNotFoundException, SQLException
    {
        bean.setLocationID(locationID);
        bean.setLocationName(locationName);
        return dao.updateLocation(bean);
    }
    public int deleteLocation(int locationID)throws ClassNotFoundException, SQLException
    {
        bean.setLocationID(locationID);
        return dao.deleteLocation(bean);
    }
}
