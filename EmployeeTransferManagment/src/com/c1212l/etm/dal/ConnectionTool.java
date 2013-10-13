/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OLDPC
 */
public class ConnectionTool {

    Connection conn;
    public static String HOST = "localhost";
    public static int PORT = 1433;
    public static String DATABASE = "eproject";
    public static String USERNAME = "sa";
    public static String PASSWORD = "1234$";

    public void initConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://" + HOST + ":" + PORT + ";databaseName=" + DATABASE;
        conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
    }

    public static void testConnection(String host, int port, String database, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + database;
        Connection _conn = DriverManager.getConnection(url, username, password);
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
            conn = null;
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
