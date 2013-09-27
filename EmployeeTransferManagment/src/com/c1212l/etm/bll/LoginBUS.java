/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.LoginDAO;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Login;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class LoginBUS {
       LoginDAO loginDAO;
       public LoginBUS() {
        loginDAO= new LoginDAO();
    }
    public Vector<Login> getAdmin() throws ClassNotFoundException, SQLException{
        return loginDAO.getAdmin();
    }
        public Vector<Login> getEmployee() throws ClassNotFoundException, SQLException{
        return loginDAO.getEmployee();
    }
}
