/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author home
 */
public class connection {

    private static Connection conn = null;
    private static String url = null;

    public connection() {
    }

    public static Connection getConnectionUrl() {
        String databaseName = "";
        String serverName = "";
        String portNumber = "";
        String Instance = "";
        String Password = "";
        String Username = "";
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            Properties pp = new Properties();
            pp.load(fis);
            databaseName = pp.getProperty("databaseName");
            serverName = pp.getProperty("serverName");
            portNumber = pp.getProperty("portNumber");
            Username = pp.getProperty("Username");
            Password = pp.getProperty("Password");
            url = "jdbc:sqlserver://" + serverName
                    + ":" + portNumber
                    + ";databaseName=" + databaseName
                    + ";User=" + Username
                    + ";PassWord=" + Password;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
            if (conn!=null) {
                System.out.println("connect");
            }
        } catch (Exception e) {
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnectionUrl();
    }
}
