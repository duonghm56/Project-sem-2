/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.EmployeeClientDAO;
import com.c1212l.etm.dal.EmployeeDAO;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.EmployeeClient;
import com.c1212l.etm.dto.Transfer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClientBUS {
    EmployeeClientDAO employeeClientDAO;

    public EmployeeClientBUS() {
        employeeClientDAO = new EmployeeClientDAO();
    }
    public Vector<EmployeeClient>getEmployeeClient() throws ClassNotFoundException, SQLException{
        
        return employeeClientDAO.getEmployeeClient();
        
    }
}
