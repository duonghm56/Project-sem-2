/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dao.DepartmentDAO;
import com.c1212l.etm.dao.EmployeeDAO;
import com.c1212l.etm.dao.LocationDAO;
import com.c1212l.etm.dto.ChangePassword;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Location;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OLDPC
 */
public class EmployeeBUS {
    
    EmployeeDAO employeeDAO;

    public EmployeeBUS() {
        employeeDAO = new EmployeeDAO();
    }
     public ArrayList<Employee> searchEmployee(String employeeName) throws ClassNotFoundException, SQLException {
        return employeeDAO.searchEmployeeName(employeeName);
    }
    public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException{
        return employeeDAO.getAllEmployee();
    }
    
    public void addEmployee(String emplNum, String emplName,String email,float salary,Date birthday,String address, String password, String role, int workExperience, boolean gender, int departmentID, int projectID, String photo, float allowance) throws ClassNotFoundException, SQLException, Exception{
        Employee e = new Employee();
        e.setEmployeeNumber(emplNum);
        e.setEmployeeName(emplName);
        e.setEmail(email);
        e.setSalary(salary);
        e.setBirthday(birthday);
        e.setAddress(address);
        e.setPassword(password);        
        e.setRole(role);
        e.setWorkExperience(workExperience);
        e.setGender(gender);
        e.setDepartnameID(departmentID);
        e.setProjectID(projectID);
        e.setPhoto(photo);
        e.setAllowance(allowance);
        employeeDAO.addEmployee(e);
    }
    
    public void updateEmployee(String emplNum, String emplName,String email,float salary,Date birthday,String address, String password, String role, int workExperience, boolean gender, int departmentIP, int projectID, String photo, float allowance) throws ClassNotFoundException, Exception{
        Employee e = new Employee();
        e.setEmployeeNumber(emplNum);
        e.setEmployeeName(emplName);
        e.setEmail(email);
        e.setSalary(salary);
        e.setBirthday(birthday);
        e.setAddress(address);
        e.setPassword(password);        
        e.setRole(role);
        e.setWorkExperience(workExperience);
        e.setGender(gender);  
        e.setDepartnameID(departmentIP);
        e.setProjectID(projectID);
        e.setPhoto(photo);
        e.setAllowance(allowance);
        employeeDAO.updateEmployee(e);
    }
        
    public void changeEmployeePassword(String email,String oldPassword, String newPassword) throws ClassNotFoundException, Exception{
        ChangePassword changePassword = new ChangePassword();
        changePassword.setEmail(email);
        changePassword.setOldPassword(oldPassword);
        changePassword.setNewPassword(newPassword);
        employeeDAO.changeEmployeePassword(changePassword);
    }
    public void deleteEmployee(String emplNum) throws ClassNotFoundException, SQLException, Exception{
        Employee e = new Employee();
        e.setEmployeeNumber(emplNum);         
        employeeDAO.deleteEmployee(e);
    }
    
    public double getTotalAllowance(String emplNum){
        try {
            Employee empl = employeeDAO.getEmployeeByNumber(emplNum);
            Department department = new DepartmentDAO().getDepartmentByID(empl.getDepartnameID());            
            Location location = new LocationDAO().getLocationById(department.getDepartmentID());
            return empl.getAllowance() + location.getAllowance();
        } catch (Exception ex){
            return 0;
        }
    }
    
}
