/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dao;

import com.c1212l.etm.dto.Admin;
import com.c1212l.etm.dto.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Android21SDK
 */
public class LoginDAO extends ConnectionTool {

    public Admin getAdmin(String email, String password) throws ClassNotFoundException, SQLException {
        initConnection();
        Admin admin = null;
        PreparedStatement pstmt = conn.prepareStatement("select * from [admin] where email = ? and [password] = ?");        
        pstmt.setString(1, email);
        pstmt.setString(2, password);        
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setEmail(rs.getString("email"));
            admin.setPassword(rs.getString("password"));
            admin.setRole(rs.getInt("role"));
        }
        closeConnection();
        return admin;
    }

    public Employee getEmployee(String email, String password) throws ClassNotFoundException, SQLException {
        initConnection();
        Employee e = null;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From employee where email =" + "'" + email + "' and password =" + "'" + password + "'");
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
        }
        closeConnection();
        return e;
    }
}
//       public Login getEmployee() throws ClassNotFoundException, SQLException{
//          return null;
//       
////        initConnection();
////        try{
////        Statement stmt = conn.createStatement();
////        ResultSet rs = stmt.executeQuery("Select email,password from employee");
////        while(rs.next()){
////            Login l = new Login();
////            l.setEmail(rs.getString("email"));
////            l.setPassword(rs.getString("password"));
////            return l;
////        }
////        closeConnection();
////        return result;
////    }    
//}
