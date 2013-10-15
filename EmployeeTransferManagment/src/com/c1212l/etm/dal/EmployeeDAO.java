/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.ChangePassword;
import com.c1212l.etm.dto.Employee;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author OLDPC
 */
public class EmployeeDAO extends ConnectionTool {

    public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From employee");
        ArrayList<Employee> result = new ArrayList<Employee>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setEmployeeID(rs.getInt("employeeID"));
            e.setEmployeeNumber(rs.getString("employeeNumber"));
            e.setEmployeeName(rs.getString("employeeName"));
            e.setEmail(rs.getString("email"));
            e.setSalary(rs.getFloat("salary"));
            e.setBirthday(rs.getDate("birthday"));
            e.setAddress(rs.getString("address"));
            e.setPassword(rs.getString("password"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getInt("workExperience"));
            e.setGender(rs.getBoolean("gender"));
            e.setDepartnameID(rs.getInt("departmentID"));
            e.setProjectID(rs.getInt("projectID"));
            e.setPhoto(rs.getString("photo"));
            e.setAllowance(rs.getFloat("allowance"));
            result.add(e);
        }
        closeConnection();
        return result;
    }

    public void addEmployee(Employee employee) throws ClassNotFoundException, SQLException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from employee where employeeNumber = ?");
        pstmt.setString(1, employee.getEmployeeNumber());
        if (pstmt.executeQuery().next()) {
            error += "Error: Duplicate employee number\n";
        }
        pstmt = conn.prepareStatement("select * from employee where email= ?");
        pstmt.setString(1, employee.getEmail());
        if (pstmt.executeQuery().next()) {
            error += "Error: Duplicate employee email\n";
        }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call addEmployee(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            cs.setString(1, employee.getEmployeeNumber());
            cs.setString(2, employee.getEmployeeName());
            cs.setString(3, employee.getEmail());
            cs.setFloat(4, employee.getSalary());
            cs.setDate(5, employee.getBirthday());
            cs.setString(6, employee.getAddress());
            cs.setString(7, employee.getPassword());
            cs.setString(8, employee.getRole());
            cs.setInt(9, employee.getWorkExperience());
            cs.setBoolean(10, employee.getGender());
            cs.setInt(11, employee.getDepartnameID());
            cs.setInt(12, employee.getProjectID());
            cs.setString(13, employee.getPhoto());
            cs.setFloat(14, employee.getAllowance());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }

    public void updateEmployee(Employee employee) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateEmployee(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        cs.setString(1, employee.getEmployeeNumber());
        cs.setString(2, employee.getEmployeeName());
        cs.setString(3, employee.getEmail());
        cs.setFloat(4, employee.getSalary());
        cs.setDate(5, employee.getBirthday());
        cs.setString(6, employee.getAddress());
        cs.setString(7, employee.getPassword());
        cs.setString(8, employee.getRole());
        cs.setInt(9, employee.getWorkExperience());
        cs.setBoolean(10, employee.getGender());
        cs.setInt(11, employee.getDepartnameID());
        cs.setInt(12, employee.getProjectID());
        cs.setString(13, employee.getPhoto());
        cs.setFloat(14, employee.getAllowance());
        cs.executeUpdate();
        closeConnection();
    }

    public void changeEmployeePassword(ChangePassword changePassword) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call changeEmployeePassword(?,?,?)}");
        cs.setString(1, changePassword.getEmail());
        cs.setString(2, changePassword.getOldPassword());
        cs.setString(3, changePassword.getNewPassword());
        cs.executeUpdate();
        closeConnection();
    }

    public void deleteEmployee(Employee employee) throws ClassNotFoundException, SQLException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from transfer where employeeID = ?");
        pstmt.setInt(1, employee.getEmployeeID());
        if (pstmt.executeQuery().next()) {
            error += "Error: This employee made at least one transfer\n";
        }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call deleteEmployee(?)}");
            cs.setString(1, employee.getEmployeeNumber());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }

    public ArrayList<Employee> searchEmployeeName(String employeeName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee " + employeeName);
        ArrayList<Employee> result = new ArrayList<>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setEmployeeID(rs.getInt("employeeID"));
            e.setEmployeeNumber(rs.getString("employeeNumber"));
            e.setEmployeeName(rs.getString("employeeName"));
            e.setEmail(rs.getString("email"));
            e.setSalary(rs.getFloat("salary"));
            e.setBirthday(rs.getDate("birthday"));
            e.setAddress(rs.getString("address"));
            e.setPassword(rs.getString("password"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getInt("workExperience"));
            e.setGender(rs.getBoolean("gender"));
            e.setDepartnameID(rs.getInt("departmentID"));
            e.setProjectID(rs.getInt("projectID"));
            e.setPhoto(rs.getString("photo"));
            e.setAllowance(rs.getFloat("allowance"));
            result.add(e);
        }
        closeConnection();
        return result;
    }

    public Employee getEmployeeByID(int id) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee where employeeID = " + id);
            Employee e = null;
            if (rs.next()) {
                e = new Employee();
                e.setEmployeeID(rs.getInt("employeeID"));
                e.setEmployeeNumber(rs.getString("employeeNumber"));
                e.setEmployeeName(rs.getString("employeeName"));
                e.setEmail(rs.getString("email"));
                e.setSalary(rs.getFloat("salary"));
                e.setBirthday(rs.getDate("birthday"));
                e.setAddress(rs.getString("address"));
                e.setPassword(rs.getString("password"));
                e.setRole(rs.getString("role"));
                e.setWorkExperience(rs.getInt("workExperience"));
                e.setGender(rs.getBoolean("gender"));
                e.setDepartnameID(rs.getInt("departmentID"));
                e.setProjectID(rs.getInt("projectID"));
                e.setPhoto(rs.getString("photo"));
                e.setAllowance(rs.getFloat("allowance"));
            }
            closeConnection();
            return e;

        } catch (Exception ex) {
            return null;
        }
    }

    public Employee getEmployeeByNumber(String number) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee where employeeNumber = '" + number+"'");
        Employee e = null;
        if (rs.next()) {
            e = new Employee();
            e.setEmployeeID(rs.getInt("employeeID"));
            e.setEmployeeNumber(rs.getString("employeeNumber"));
            e.setEmployeeName(rs.getString("employeeName"));
            e.setEmail(rs.getString("email"));
            e.setSalary(rs.getFloat("salary"));
            e.setBirthday(rs.getDate("birthday"));
            e.setAddress(rs.getString("address"));
            e.setPassword(rs.getString("password"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getInt("workExperience"));
            e.setGender(rs.getBoolean("gender"));
            e.setDepartnameID(rs.getInt("departmentID"));
            e.setProjectID(rs.getInt("projectID"));
            e.setPhoto(rs.getString("photo"));
            e.setAllowance(rs.getFloat("allowance"));
        }
        closeConnection();
        return e;
    }
    
    public int getTotalNumberEmployee() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select dbo.getTotalNumberEmployee ()");       
        int r = 0;
        if(rs.next()){            
            r = rs.getInt("");
        }
        closeConnection();
        return r;
    }
    public int getTotalMaleNumberEmployee() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select dbo.getTotalMaleNumberEmployee ()");       
        int r = 0;
        if(rs.next()){            
            r = rs.getInt("");
        }
        closeConnection();
        return r;
    }
    public int getTotalFemaleNumberEmployee() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select dbo.getTotalFemaleNumberEmployee ()");       
        int r = 0;
        if(rs.next()){            
            r = rs.getInt("");
        }
        closeConnection();
        return r;
    }
    public int getTotalSalaryEmployee() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select dbo.getTotalSalaryEmployee ()");       
        int r = 0;
        if(rs.next()){            
            r = rs.getInt("");
        }
        closeConnection();
        return r;
    }
    
    
}
