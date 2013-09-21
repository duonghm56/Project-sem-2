/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.EmployeeClient;
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
    public ArrayList<EmployeeClient> getEmployeeClient() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
        ArrayList<EmployeeClient> result = new ArrayList<>();
        while (rs.next()) {
            EmployeeClient e = new EmployeeClient();
            e.setFullName(rs.getString("fullName"));
            e.setGender(rs.getBoolean("gender"));
            e.setEmail(rs.getString("email"));
            e.setAddress(rs.getString("address"));
            e.setCurrentDepartment(rs.getString("currentDepartment"));
            e.setCurrentLocation(rs.getString("currentLocation"));
            e.setCurrentProject(rs.getString("currentProject"));
            e.setRole(rs.getString("role"));
            e.setWorkExperience(rs.getString("workExperience"));
            e.setReason(rs.getInt("reason"));
            result.add(e);   
        }
        closeConnection();
        return result;
    }
}
