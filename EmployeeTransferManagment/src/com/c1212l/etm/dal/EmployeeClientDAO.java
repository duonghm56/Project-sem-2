/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClientDAO extends ConnectionTool{
    public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
        ArrayList<Employee> result = new ArrayList<>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setEmployeeID(rs.getInt("employeeID"));
            e.setEmployeeNumber(rs.getString("employeeNumber"));
            e.setEmployeeName(rs.getString("employeeName"));
            e.setDepartnameID(rs.getInt("departmentID"));
            e.setGender(rs.getBoolean("gender"));
            e.setPassword(rs.getString("password"));
            e.setProjectID(rs.getInt("projectID"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getInt("workExperience"));
            result.add(e);
        }
        closeConnection();
        return result;
    }
}
