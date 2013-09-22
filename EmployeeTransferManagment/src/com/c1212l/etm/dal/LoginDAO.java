/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Android21SDK
 */
public class LoginDAO extends ConnectionTool {
      public Vector<Login> getAdmin() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from [admin]");
        Vector<Login> result = new Vector<Login>();
        while(rs.next()){
            Login login  = new Login();
            login.setEmail(rs.getString("email"));
            login.setPassword(rs.getString("password"));
            result.add(login);
        }
        closeConnection();
        return result;
    }
      public Vector<Employee> getEmployee() throws ClassNotFoundException, SQLException{
         initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From employee");
        Vector<Employee> result = new Vector<Employee>();
        while(rs.next()){
            Employee e = new Employee();
            e.setEmployeeID(rs.getInt("employeeID"));
            e.setEmployeeNumber(rs.getString("employeeNumber"));
            e.setEmployeeName(rs.getString("employeeName"));
            e.setEmail(rs.getString("email"));
            e.setPassword(rs.getString("password"));
            e.setConfirmPassword(rs.getString("confirmPassword"));
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
}
