/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Bussiness.TableModelLocation;
import Entity.Location;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuongdm
 */
public class LocationDAO {

    private static Connection conn = null;
    private static CallableStatement cs = null;
    private static ResultSet rs = null;
    private static Vector locations;
    private static Location objLocation = null;
    private static String locationName = null;

    public LocationDAO() {
    }

    public static int countTotalLocation() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalLocation}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static Vector getLocationFromDB() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spLocation}");
        rs = cs.executeQuery();
        locations = new Vector();
        locations.add("Select");
        while (rs.next()) {
            locations.addElement(rs.getString(2));
        }
        return locations;
    }

    public static String getLocationName(int locationID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetLocationName(?)}");
            cs.setInt(1, locationID);
            rs = cs.executeQuery();
            while (rs.next()) {
                locationName = rs.getString(1);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return locationName;
    }

    public static int getLocationID(String locationAddress) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetLocationID(?)}");
        cs.setString(1, locationAddress);
        rs = cs.executeQuery();
        int locationID = 0;
        while (rs.next()) {
            locationID = rs.getInt(1);
        }
        return locationID;
    }

    public static Location getLocationByID(int locationID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetLocationByID(?)}");
            cs.setInt(1, locationID);
            rs = cs.executeQuery();
            while (rs.next()) {
                objLocation = new Location();
                objLocation.setLocationID(rs.getInt(1));
                objLocation.setLocationAddress(rs.getString(2));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objLocation;
    }

    public static void insertLocationToDB(String locationName) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spInsertLocation(?)}");
            cs.setString(1, locationName);
            cs.executeUpdate();
            cs.close();
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateLocation(String location, int ID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spUpdateLocationByID(?,?)}");
            cs.setInt(1, ID);
            cs.setString(2, location);
            cs.executeUpdate();
            cs.close();
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadLocationToTable() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spLocation}");
        rs = cs.executeQuery();
        while (rs.next()) {
            objLocation = new Location();
            objLocation.setLocationID(rs.getInt(1));
            objLocation.setLocationAddress(rs.getString(2));
            TableModelLocation.addLocation(objLocation);
        }
        conn.close();
    }

    public static void deleteLocation(int locationID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spDeleteLocation(?)}");
            cs.setInt(1, locationID);
            cs.executeUpdate();
            cs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getProjectByName(String location) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spSearchLocationByName(?)}");
            cs.setString(1, location);
            rs = cs.executeQuery();
            while (rs.next()) {
                objLocation = new Location();
                objLocation.setLocationID(rs.getInt(1));
                objLocation.setLocationAddress(rs.getString(2));
                TableModelLocation.addLocation(objLocation);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LocationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
