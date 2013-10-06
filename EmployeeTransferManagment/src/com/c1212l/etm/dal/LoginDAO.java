/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Android21SDK
 */
public class LoginDAO extends ConnectionTool {
      public Login getAdmin(String email,String password) throws ClassNotFoundException, SQLException{
        initConnection();
        Login login = new Login();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From [admin] where email ="+"'"+email+"' and password ="+"'"+password+"'");
        while (rs.next()) {
            login.setEmail(rs.getString("email"));
            login.setPassword(rs.getString("password"));
            login.setRole(rs.getInt("role"));
        }
        closeConnection();
        return login;
    }
     public Login getEmployee(String email,String password) throws ClassNotFoundException, SQLException{
        initConnection();
        Login login = new Login();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From employee where email ="+"'"+email+"' and password ="+"'"+password+"'");
        while (rs.next()) {
            login.setEmail(rs.getString("email"));
            login.setPassword(rs.getString("password"));
        }
        closeConnection();
        return login;
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
