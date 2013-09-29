/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.AdminDAO;
import com.c1212l.etm.dto.Admin;
import com.c1212l.etm.dto.Department;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class AdminBUS {
    AdminDAO adminDAO;
    public AdminBUS() {
        adminDAO= new AdminDAO();
    }
      public ArrayList<Admin> searchAdminEmail(String email) throws ClassNotFoundException, SQLException {
        return adminDAO.searchAdminEmail(email);
    }
    public ArrayList<Admin> getAllAdmin() throws ClassNotFoundException, SQLException{
        return adminDAO.getAllAdmin();
    }
    public void addAdmin(String email,String password,int role) throws ClassNotFoundException, Exception{
        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setRole(role);
        adminDAO.addAdmin(admin);
    }
    public void updateAdmin(int id, String email,String password,int role) throws ClassNotFoundException, Exception{
        Admin admin = new Admin();
        admin.setId(id);
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setRole(role);
        adminDAO.updateAdmin(admin);
    }
    public void deleteAdmin(int id) throws ClassNotFoundException, Exception{
        Admin admin = new Admin();
        admin.setId(id);
        adminDAO.deleteAdmin(admin);
    } 
}
