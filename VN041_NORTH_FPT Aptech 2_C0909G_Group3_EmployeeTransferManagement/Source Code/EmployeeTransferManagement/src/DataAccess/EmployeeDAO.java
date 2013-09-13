/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Bussiness.TableModelEmployee;
import Entity.Employee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanhnx
 */
public class EmployeeDAO {

    private static Connection conn;
    private static CallableStatement cs = null;
    private static ResultSet rs = null;
    private static Employee objEmpl = null;
    private static Vector nameEmpl;

    public EmployeeDAO() {
    }

    public static int countTotalEmployee() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalEmployee}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static int countEmployeeByDepartmentID(int ID) {
        int count = 0;
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetEmployeeByDepartmentID(?)}");
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

    public static int countEmployeeByLocationID(int ID) {
        int count = 0;
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetEmployeeByLocationID(?)}");
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

    public static int countEmployeeByProjectID(int ID) {
        int count = 0;
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetEmployeeByProjectID(?)}");
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

    public static void insertEmployee(Employee objEmpl) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spInsertEmployee(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cs.setInt(1, objEmpl.getEmployeeNumber());
        cs.setString(2, objEmpl.getEmployeeName());
        cs.setString(3, objEmpl.getEmail());
        cs.setString(4, objEmpl.getPassword());
        cs.setString(5, objEmpl.getEmployeeRole());
        cs.setInt(6, objEmpl.getWorkExperience());
        cs.setString(7, objEmpl.getAddress());
        cs.setDate(8, new Date(objEmpl.getBirthday().getTime()));
        cs.setInt(9, objEmpl.getGender());
        cs.setFloat(10, objEmpl.getAllowance());
        cs.setInt(11, objEmpl.getLocationID());
        cs.setInt(12, objEmpl.getDepartmentID());
        cs.setInt(13, objEmpl.getProjectID());
        cs.executeUpdate();
    }

    public static void updateEmployee(Employee objEmpl, int ID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spUpdateEmployeebyID(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cs.setInt(1, ID);
        cs.setInt(2, objEmpl.getEmployeeNumber());
        cs.setString(3, objEmpl.getEmployeeName());
        cs.setString(4, objEmpl.getEmail());
        cs.setString(5, objEmpl.getPassword());
        cs.setString(6, objEmpl.getEmployeeRole());
        cs.setInt(7, objEmpl.getWorkExperience());
        cs.setString(8, objEmpl.getAddress());
        cs.setDate(9, new Date(objEmpl.getBirthday().getTime()));
        cs.setInt(10, objEmpl.getGender());
        cs.setFloat(11, objEmpl.getAllowance());
        cs.setInt(12, objEmpl.getLocationID());
        cs.setInt(13, objEmpl.getDepartmentID());
        cs.setInt(14, objEmpl.getProjectID());
        cs.executeUpdate();
    }

    public static void deleteEmployee(int ID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spDeleteEmployee(?)}");
            cs.setInt(1, ID);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadEmployeeToTable() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetEmployee}");
        rs = cs.executeQuery();
        while (rs.next()) {
            objEmpl = new Employee();
            objEmpl.setEmployeeID(rs.getInt(1));
            objEmpl.setEmployeeNumber(rs.getInt(2));
            objEmpl.setEmployeeName(rs.getString(3));
            objEmpl.setEmail(rs.getString(4));
            objEmpl.setPassword(rs.getString(5));
            objEmpl.setEmployeeRole(rs.getString(6));
            objEmpl.setWorkExperience(rs.getInt(7));
            objEmpl.setAddress(rs.getString(8));
            objEmpl.setBirthday(rs.getDate(9));
            objEmpl.setGender(rs.getInt(10));
            objEmpl.setAllowance(rs.getFloat(11));
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));
            TableModelEmployee.addEmployee(objEmpl);
        }
    }

    public static Vector getNameEmployee() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetEmployee}");
        rs = cs.executeQuery();
        nameEmpl = new Vector();
        nameEmpl.addElement("Select");
        while (rs.next()) {
            nameEmpl.addElement(rs.getString(3));
        }
        conn.close();
        return nameEmpl;
    }

    public static Employee getEmployeeDB(String email) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetEmployeeByName(?)}");
            cs.setString(1, email);
            rs = cs.executeQuery();
            nameEmpl = new Vector();
            while (rs.next()) {
                objEmpl = new Employee();
                objEmpl.setEmployeeID(rs.getInt(1));
                objEmpl.setEmployeeNumber(rs.getInt(2));
                objEmpl.setEmployeeName(rs.getString(3));
                objEmpl.setEmail(rs.getString(4));
                objEmpl.setPassword(rs.getString(5));
                objEmpl.setEmployeeRole(rs.getString(6));
                objEmpl.setWorkExperience(rs.getInt(7));
                objEmpl.setAddress(rs.getString(8));
                objEmpl.setBirthday(rs.getDate(9));
                objEmpl.setGender(rs.getInt(10));
                objEmpl.setAllowance(rs.getFloat(11));
                objEmpl.setLocationID(rs.getInt(12));
                objEmpl.setDepartmentID(rs.getInt(13));
                objEmpl.setProjectID(rs.getInt(14));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objEmpl;

    }

    public static Employee getEmployeeByID(int employeeID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetEmployeeByID(?)}");
        cs.setInt(1, employeeID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objEmpl = new Employee();
            objEmpl.setEmployeeID(rs.getInt(1));
            objEmpl.setEmployeeNumber(rs.getInt(2));
            objEmpl.setEmployeeName(rs.getString(3));
            objEmpl.setEmail(rs.getString(4));
            objEmpl.setPassword(rs.getString(5));
            objEmpl.setEmployeeRole(rs.getString(6));
            objEmpl.setWorkExperience(rs.getInt(7));
            objEmpl.setAddress(rs.getString(8));
            objEmpl.setBirthday(rs.getDate(9));
            objEmpl.setGender(rs.getInt(10));
            objEmpl.setAllowance(rs.getFloat(11));
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));

        }
        return objEmpl;
    }

    public static void getEmployeeByName(String employeeName) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchEmployeeByName(?)}");
        cs.setString(1, employeeName);
        rs = cs.executeQuery();
        while (rs.next()) {
            objEmpl = new Employee();
            objEmpl.setEmployeeID(rs.getInt(1));
            objEmpl.setEmployeeNumber(rs.getInt(2));
            objEmpl.setEmployeeName(rs.getString(3));
            objEmpl.setEmail(rs.getString(4));
            objEmpl.setPassword(rs.getString(5));
            objEmpl.setEmployeeRole(rs.getString(6));
            objEmpl.setWorkExperience(rs.getInt(7));
            objEmpl.setAddress(rs.getString(8));
            objEmpl.setBirthday(rs.getDate(9));
            objEmpl.setGender(rs.getInt(10));
            objEmpl.setAllowance(rs.getFloat(11));
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));
            TableModelEmployee.addEmployee(objEmpl);
        }
    }

    public static int getEmployeeID(String employeeName) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchEmployeeByName(?)}");
        cs.setString(1, employeeName);
        rs = cs.executeQuery();
        int employeeID = 0;
        while (rs.next()) {
            employeeID = rs.getInt(1);
        }
        return employeeID;
    }

    public static Employee getEmployee(String employeeName) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchEmployeeByName(?)}");
        cs.setString(1, employeeName);
        rs = cs.executeQuery();
        objEmpl = new Employee();
        while (rs.next()) {
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));
        }
        return objEmpl;
    }
    public static void main(String[] args) {
        try {
            System.out.println(getEmployee("thanh").getLocationID());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getEmployeeByDepartment(int departmentID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchEmployeeByDepartment(?)}");
        cs.setInt(1, departmentID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objEmpl = new Employee();
            objEmpl.setEmployeeID(rs.getInt(1));
            objEmpl.setEmployeeNumber(rs.getInt(2));
            objEmpl.setEmployeeName(rs.getString(3));
            objEmpl.setEmail(rs.getString(4));
            objEmpl.setPassword(rs.getString(5));
            objEmpl.setEmployeeRole(rs.getString(6));
            objEmpl.setWorkExperience(rs.getInt(7));
            objEmpl.setAddress(rs.getString(8));
            objEmpl.setBirthday(rs.getDate(9));
            objEmpl.setGender(rs.getInt(10));
            objEmpl.setAllowance(rs.getFloat(11));
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));
            TableModelEmployee.addEmployee(objEmpl);
        }
    }

    public static void getEmployeeByProject(int projectID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchEmployeeByProject(?)}");
        cs.setInt(1, projectID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objEmpl = new Employee();
            objEmpl.setEmployeeID(rs.getInt(1));
            objEmpl.setEmployeeNumber(rs.getInt(2));
            objEmpl.setEmployeeName(rs.getString(3));
            objEmpl.setEmail(rs.getString(4));
            objEmpl.setPassword(rs.getString(5));
            objEmpl.setEmployeeRole(rs.getString(6));
            objEmpl.setWorkExperience(rs.getInt(7));
            objEmpl.setAddress(rs.getString(8));
            objEmpl.setBirthday(rs.getDate(9));
            objEmpl.setGender(rs.getInt(10));
            objEmpl.setAllowance(rs.getFloat(11));
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));
            TableModelEmployee.addEmployee(objEmpl);
        }
    }

    public static void getEmployeeByLocation(int locationID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchEmployeeByLocation(?)}");
        cs.setInt(1, locationID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objEmpl = new Employee();
            objEmpl.setEmployeeID(rs.getInt(1));
            objEmpl.setEmployeeNumber(rs.getInt(2));
            objEmpl.setEmployeeName(rs.getString(3));
            objEmpl.setEmail(rs.getString(4));
            objEmpl.setPassword(rs.getString(5));
            objEmpl.setEmployeeRole(rs.getString(6));
            objEmpl.setWorkExperience(rs.getInt(7));
            objEmpl.setAddress(rs.getString(8));
            objEmpl.setBirthday(rs.getDate(9));
            objEmpl.setGender(rs.getInt(10));
            objEmpl.setAllowance(rs.getFloat(11));
            objEmpl.setLocationID(rs.getInt(12));
            objEmpl.setDepartmentID(rs.getInt(13));
            objEmpl.setProjectID(rs.getInt(14));
            TableModelEmployee.addEmployee(objEmpl);
        }
    }

    //ThiNx
    public static void ChangePassWordEmployee(String oldPass, String newPass) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spChagePasswordEmployee(?,?)}");
            cs.setString(1, oldPass);
            cs.setString(2, newPass);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
