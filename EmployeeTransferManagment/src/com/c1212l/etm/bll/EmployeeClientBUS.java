/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.EmployeeClientDAO;
import com.c1212l.etm.dto.EmployeeClient;
import java.sql.SQLException;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClientBUS {
    EmployeeClientDAO employeeClientDAO;

    public EmployeeClientBUS() {
        employeeClientDAO = new EmployeeClientDAO();
    }
    public EmployeeClient getEmployeeClient() throws ClassNotFoundException, SQLException{
        return employeeClientDAO.getEmployeeClient();
    }
}
