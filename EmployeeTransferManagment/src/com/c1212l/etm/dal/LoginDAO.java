/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

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
        ResultSet rs = stmt.executeQuery("select * from [admin]");
        Vector<Login> result = new Vector<Login>();
        while(rs.next()){
            Login l = new Login();
            l.setUserName(rs.getString("userName"));
            l.setPassword(rs.getString("password"));
            result.add(l);
        }
        closeConnection();
        return result;
    }
    
}
