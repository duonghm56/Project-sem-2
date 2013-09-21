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
 * @author OLDPC
 */
public class EmployeeBUS {
    
    EmployeeDAO employeeDAO;

    public EmployeeBUS() {
        employeeDAO = new EmployeeDAO();
    }
    
    public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException{
        return employeeDAO.getAllEmployee();
    }
    
    public void addEmployee(String emplNum, String emplName,String email, String password,String confirmPassword, String role, int workExperience, boolean gender, int departmentID, int projectID) throws ClassNotFoundException, SQLException{
        Employee e = new Employee();
        e.setEmployeeNumber(emplNum);
        e.setEmployeeName(emplName);
        e.setEmail(email);
        e.setPassword(password);
        e.setConfirmPassword(confirmPassword);
        e.setRole(role);
        e.setWorkExperience(workExperience);
        e.setGender(gender);
        e.setDepartnameID(departmentID);
        e.setProjectID(projectID);
        employeeDAO.addEmployee(e);
    }
    
    public void updateEmployee(String emplNum, String emplName,String email, String password,String confirmPassword, String role, int workExperience, boolean gender) throws ClassNotFoundException, SQLException{
        Employee e = new Employee();
        e.setEmployeeNumber(emplNum);
        e.setEmployeeName(emplName);
        e.setEmail(email);
        e.setPassword(password);
        e.setConfirmPassword(confirmPassword);
        e.setRole(role);
        e.setWorkExperience(workExperience);
        e.setGender(gender);        
        employeeDAO.updateEmployee(e);
    }
    
    public void deleteEmployee(String emplNum) throws ClassNotFoundException, SQLException{
        Employee e = new Employee();
        e.setEmployeeNumber(emplNum);         
        employeeDAO.deleteEmployee(e);
    }
    
    
}
