/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OLDPC
 */
public class ConnectionTool {
    
    Connection conn;
    
    public void initConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=eproject","sa","1234$");        
    }
    
    public void closeConnection() throws SQLException{
        if(conn != null){
            conn.close();
            conn = null;
        }
    }   
    
    public Connection getConnection(){
        return conn;
    }
    
}
