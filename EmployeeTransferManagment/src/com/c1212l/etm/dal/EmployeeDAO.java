/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Employee;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author OLDPC
 */
public class EmployeeDAO extends ConnectionTool{
    
    public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
        ArrayList<Employee> result = new ArrayList<Employee>();
        while(rs.next()){
            Employee e = new Employee();
            e.setEmployeeID(rs.getInt("employeeID"));
            e.setEmployeeNumber(rs.getString("employeeNumber"));
            e.setEmployeeName(rs.getString("employeeName"));
            e.setPassword(rs.getString("password"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getInt("workExperience"));
            e.setGender(rs.getBoolean("gender"));
            e.setDepartnameID(rs.getInt("departmentID"));
            e.setProjectID(rs.getInt("projectID"));
            result.add(e);
        }
        closeConnection();
        return result;
    }
    
    public void addEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addEmployee(?, ?, ?, ?, ?, ?, ?, ?)}");
        cs.setString(1, employee.getEmployeeNumber());
        cs.setString(2, employee.getEmployeeName());
        cs.setString(3, employee.getPassword());
        cs.setString(4, employee.getRole());
        cs.setInt(5, employee.getWorkExperience());
        cs.setBoolean(6, employee.getGender());
        cs.setInt(7, employee.getDepartnameID());
        cs.setInt(8, employee.getProjectID());        
        cs.executeUpdate();
        closeConnection();        
    }
    
    public void updateEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateEmployee(?, ?, ?, ?, ?, ?)}");
        cs.setString(1, employee.getEmployeeNumber());
        cs.setString(2, employee.getEmployeeName());
        cs.setString(3, employee.getPassword());
        cs.setString(4, employee.getRole());
        cs.setInt(5, employee.getWorkExperience());
        cs.setBoolean(6, employee.getGender());    
        cs.executeUpdate();
        closeConnection();        
    }
    
    public void deleteEmployee(Employee employee) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call deleteEmployee(?)}");
        cs.setString(1, employee.getEmployeeNumber());
        cs.executeUpdate();     
        closeConnection();        
    }
    
}
