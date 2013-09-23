/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.client.ui.EmployeeLoginPanel;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.EmployeeClient;
import com.c1212l.etm.dto.Project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClientDAO  extends ConnectionTool {
    public Vector<EmployeeClient> getEmployeeClient() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from employee Inner Join department On \n" +
"	     employee.departmentID = department.departmentID \n" +
"         Inner Join location On department.locationID = location.locationID\n" +
"         Inner Join project On project.projectID =employee.projectID\n" +
"         Where employee.email = "+"'"+EmployeeLoginPanel.email+"'");
        Vector<EmployeeClient> result = new Vector<>();
        while (rs.next()) {
            EmployeeClient e = new EmployeeClient();
            e.setFullName(rs.getString("employeeName"));
            e.setGender(rs.getBoolean("gender"));
            e.setEmail(rs.getString("email"));
//            e.setAddress(rs.getString("address"));
            e.setCurrentDepartment(rs.getString("departmentName"));
            e.setCurrentLocation(rs.getString("locationName"));
            e.setCurrentProject(rs.getString("projectName"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getString("workExperience"));
            e.setReason(rs.getString("reason"));
            e.setBirthday(rs.getDate("birthday"));
            result.add(e);   
        }
        closeConnection();
        return result;
    }
}
