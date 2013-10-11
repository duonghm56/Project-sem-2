/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.EmployeeClient;
import com.c1212l.etm.ui.LoginFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClientDAO  extends ConnectionTool {
    public EmployeeClient getEmployeeClient() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from employee Inner Join department On \n" +
"	     employee.departmentID = department.departmentID \n" +
"         Inner Join location On department.locationID = location.locationID\n" +
"         Inner Join project On project.projectID =employee.projectID\n" +
"         Where employee.email = "+"'"+LoginFrame.email+"'");
        EmployeeClient e = new EmployeeClient();
        while (rs.next()) {
            e.setFullName(rs.getString("employeeName"));
            e.setGender(rs.getBoolean("gender"));
            e.setEmail(rs.getString("email"));
            e.setSalary(rs.getFloat("salary"));
            e.setBirthday(rs.getDate("birthday"));
            e.setAddress(rs.getString("address"));
            e.setCurrentDepartment(rs.getString("departmentName"));
            e.setCurrentLocation(rs.getString("locationName"));
            e.setCurrentProject(rs.getString("projectName"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getString("workExperience")); 
        }
        closeConnection();
        return e;
    }
}
