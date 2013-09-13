/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import java.sql.SQLException;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.beans.Location;
/**
 *
 * @author Luu Bi
 */
public class LocationBUS {
    LocationDAO dao = new LocationDAO();
    public int addLocation(int locationID,String locationName)throws ClassNotFoundException, SQLException
    {
        Location bean = new Location();
        bean.setLocationID(locationID);
        bean.setLocationName(locationName);
        return dao.addLocation(bean);
    }
}
