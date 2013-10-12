/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.report;

import java.sql.Date;

/**
 *
 * @author DUONGHM
 */
public class TransferView {
    String number;
    String fromProject;
    String toProject;
    String fromDepartment;
    String toDepartment;
    String fromLocation;
    String toLocation;
    //String relievingDate;
    //String joiningDate;
    String approve;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFromProject() {
        return fromProject;
    }

    public void setFromProject(String fromProject) {
        this.fromProject = fromProject;
    }

    public String getToProject() {
        return toProject;
    }

    public void setToProject(String toProject) {
        this.toProject = toProject;
    }

    public String getFromDepartment() {
        return fromDepartment;
    }

    public void setFromDepartment(String fromDepartment) {
        this.fromDepartment = fromDepartment;
    }

    public String getToDepartment() {
        return toDepartment;
    }

    public void setToDepartment(String toDepartment) {
        this.toDepartment = toDepartment;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    /*public String getRelievingDate() {
        return relievingDate;
    }

    public void setRelievingDate(String relievingDate) {
        this.relievingDate = relievingDate;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }*/

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }
    
}
