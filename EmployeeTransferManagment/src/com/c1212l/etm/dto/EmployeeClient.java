/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

/**
 *
 * @author Android21SDK
 */
public class EmployeeClient {
    private String fullName;
    private boolean gender;
    private String email;
    private String address;
    private String currentDepartment;
    private String currentLocation;
    private String currentProject;
    private String role;
    private String workExperience;
    private String reason;

    public EmployeeClient() {
    }

    public EmployeeClient(String fullName, boolean gender, String email, String address, String currentDepartment, String currentLocation, String currentProject, String role, String workExperience, String reason) {
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.currentDepartment = currentDepartment;
        this.currentLocation = currentLocation;
        this.currentProject = currentProject;
        this.role = role;
        this.workExperience = workExperience;
        this.reason = reason;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrentDepartment() {
        return currentDepartment;
    }

    public void setCurrentDepartment(String currentDepartment) {
        this.currentDepartment = currentDepartment;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
