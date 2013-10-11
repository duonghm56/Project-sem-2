/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import com.c1212l.etm.dal.DepartmentDAO;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dal.ProjectDAO;
import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author OLDPC
 */
public class Employee {

    private int employeeID;
    private String employeeNumber;
    private String employeeName;
    private String email;
    private String password;   
    private String role;
    private int workExperience;
    private boolean gender;
    private int departnameID;
    private int projectID;
    private String address;
    private Date birthday;
    private float salary;
    private String photo;

    public Employee() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getDepartnameID() {
        return departnameID;
    }

    public void setDepartnameID(int departnameID) {
        this.departnameID = departnameID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vector getVector() {
        Vector result = new Vector();
        result.add(employeeID);
        result.add(employeeNumber);
        result.add(employeeName);
        result.add(email);
        result.add(salary);
        result.add(birthday);
        result.add(address);
        result.add(password);        
        result.add(role);
        result.add(workExperience);
        result.add(gender ? "Male" : "Female");
        Project project = new ProjectDAO().getProjectById(projectID);
        result.add(project != null ? project.getProjectName() : "undifined");

        Department department = new DepartmentDAO().getDepartmentByID(departnameID);
        Location location = new LocationDAO().getLocationById(department.getLocationID());
        result.add(
                department != null
                ? department.getDepartmentName() + " - " + location.getLocationName()
                : "undifined");
        result.add(photo);
        return result;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
}
