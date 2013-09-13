/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Bussiness.TableModelDepartment;
import Bussiness.TableModelDepartmentOfLocation;
import Entity.Department;
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
public class DepartmentDAO {

    private static Connection conn = null;
    private static CallableStatement cs = null;
    private static ResultSet rs = null;
    private static Vector departments;
    private static String departmentName = null;
    private static Department objDepartment;

    public DepartmentDAO() {
    }

    public static int countTotalDepartment() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalDepartment}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static void insertDepartmentToDB(String departmentName, int locationID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spInsertDepartment(?,?)}");
            cs.setString(1, departmentName);
            cs.setInt(2, locationID);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateDepartment(int deparmentID, String departmentName, int locationID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spUpdateDepartmentByID(?,?,?)}");
            cs.setInt(1, deparmentID);
            cs.setString(2, departmentName);
            cs.setInt(3, locationID);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadDepartmentToTable() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spDepartment}");
        rs = cs.executeQuery();
        while (rs.next()) {
            objDepartment = new Department();
            objDepartment.setDepartmentID(rs.getInt(1));
            objDepartment.setDepartmentName(rs.getString(2));
            TableModelDepartment.addDepartment(objDepartment);
        }
        conn.close();
    }

    public static void loadDepartmentToTable2(int locationID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetDepartmentByLocationID(?)}");
            cs.setInt(1, locationID);
            rs = cs.executeQuery();
            while (rs.next()) {
                objDepartment = new Department();
                objDepartment.setDepartmentID(rs.getInt(1));
                objDepartment.setDepartmentName(rs.getString(2));
                TableModelDepartmentOfLocation.addDepartment(objDepartment);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Vector getDepartmentFromDB() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spDepartment}");
        rs = cs.executeQuery();
        departments = new Vector();
        departments.add("Select");
        while (rs.next()) {
            departments.addElement(rs.getString(2));
        }
        return departments;
    }

    public static String getDepartmentName(int departmentID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetDepartmentName(?)}");
            cs.setInt(1, departmentID);
            rs = cs.executeQuery();
            while (rs.next()) {
                departmentName = rs.getString(1);
            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departmentName;
    }

    public static int getDepartmentID(String departmentName) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetDepartmentID(?)}");
        cs.setString(1, departmentName);
        rs = cs.executeQuery();
        int deparmentID = 0;
        while (rs.next()) {
            deparmentID = rs.getInt(1);
        }
        return deparmentID;
    }

    public static Department getDepartmentByID(int departmentID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetDepartmentByID(?)}");
            cs.setInt(1, departmentID);
            rs = cs.executeQuery();
            while (rs.next()) {
                objDepartment = new Department();
                objDepartment.setDepartmentID(rs.getInt(1));
                objDepartment.setDepartmentName(rs.getString(2));
                objDepartment.setLocationID(rs.getInt(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objDepartment;
    }

    public static int countDepartmentByLocationID(int ID) {
        int count = 0;
        try {

            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetDepartmentByLocationID(?)}");
            cs.setInt(1, ID);
            rs = cs.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public static void deleteDepartment(int departmentID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spDeleteDepartment(?)}");
            cs.setInt(1, departmentID);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getProjectByName(String projectName) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spSearchDepartmentByName(?)}");
            cs.setString(1, projectName);
            rs = cs.executeQuery();
            while (rs.next()) {
                objDepartment = new Department();
                objDepartment.setDepartmentID(rs.getInt(1));
                objDepartment.setDepartmentName(rs.getString(2));
                objDepartment.setLocationID(rs.getInt(3));
                TableModelDepartment.addDepartment(objDepartment);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
