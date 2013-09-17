/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.EmployeeDAO;
import com.c1212l.etm.dto.Employee;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClientBUS {
    EmployeeDAO employeeDAO;

    public EmployeeClientBUS() {
        employeeDAO = new EmployeeDAO();
    }
    public ArrayList<Employee>getAllEmployees() throws ClassNotFoundException, SQLException{
        return employeeDAO.getAllEmployee();
    }
}
