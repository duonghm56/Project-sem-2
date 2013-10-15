/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dao;

import com.c1212l.etm.dto.Admin;
import com.c1212l.etm.dto.ChangePassword;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class AdminDAO extends ConnectionTool {

    public ArrayList<Admin> getAllAdmin(Admin admin) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs;
        if(admin.getRole()!=1){
            rs = stt.executeQuery("Select * From [admin] where [role] >" + admin.getRole() + "or email =" + "'" + admin.getEmail() + "'");
        }else{
            rs = stt.executeQuery("Select * From [admin]");
        }
        ArrayList<Admin> result = new ArrayList<Admin>();
        while (rs.next()) {
            Admin _admin = new Admin();
            _admin.setId(rs.getInt("id"));
            _admin.setEmail(rs.getString("email"));
            _admin.setPassword(rs.getString("password"));
            _admin.setRole(rs.getInt("role"));
            result.add(_admin);
        }
        closeConnection();
        return result;
    }

    public void addAdmin(Admin admin) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addAdmin(?,?,?)}");
        cs.setString(1, admin.getEmail());
        cs.setString(2, admin.getPassword());
        cs.setInt(3, admin.getRole());
        cs.executeUpdate();
        closeConnection();
    }

    public void updateAdmin(Admin admin) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateAdmin(?, ?, ?,?)}");
        cs.setInt(1, admin.getId());
        cs.setString(2, admin.getEmail());
        cs.setString(3, admin.getPassword());
        cs.setInt(4, admin.getRole());
        cs.executeUpdate();
        closeConnection();
    }

    public void changePasswordAdmin(ChangePassword changePassword) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call changePasswordAdmin(?, ?, ?)}");
        cs.setString(1, changePassword.getEmail());
        cs.setString(2, changePassword.getOldPassword());
        cs.setString(3, changePassword.getNewPassword());
        cs.executeUpdate();
        closeConnection();
    }

    public void deleteAdmin(Admin admin) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call deleteAdmin(?)}");
        cs.setInt(1, admin.getId());
        cs.executeUpdate();
        closeConnection();
    }

    public ArrayList<Admin> searchAdminEmail(String email) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from [admin] " + email);
        ArrayList<Admin> result = new ArrayList<Admin>();
        while (rs.next()) {
            Admin admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setEmail(rs.getString("email"));
            admin.setPassword(rs.getString("password"));
            admin.setRole(rs.getInt("role"));
            result.add(admin);
        }
        closeConnection();
        return result;
    }

    public ArrayList<Admin> searchAdminRole(int role) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from [admin] " + role);
        ArrayList<Admin> result = new ArrayList<Admin>();
        while (rs.next()) {
            Admin admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setEmail(rs.getString("email"));
            admin.setPassword(rs.getString("password"));
            admin.setRole(rs.getInt("role"));
            result.add(admin);
        }
        closeConnection();
        return result;
    }
}
