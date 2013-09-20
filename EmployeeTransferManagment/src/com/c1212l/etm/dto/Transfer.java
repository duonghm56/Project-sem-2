/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import com.c1212l.etm.dal.ProjectDAO;
import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class Transfer {
    private int transferID;
    private int transferTypeID;
    private int employeeID;
    private Date transferRelievingDate;
    private Date transferJoiningDate;
    private Date requestDate;
    private String reason;
    private boolean approve;
    private Date approveDate;
    private int fromProjectID;
    private int toProjectID;
    private int fromDepartmentID;
    private int toDepartmentID;
    private int fromLocationID;
    private int toLocationID;
    public Transfer() {
    }

    public Transfer(int transferID, int transferTypeID, int employeeID, Date transferRelievingDate, Date transferJoiningDate, Date requestDate, String reason, boolean approve, Date approveDate, int fromProjectID, int toProjectID, int fromDepartmentID, int toDepartmentID, int fromLocationID, int toLocationID) {
        this.transferID = transferID;
        this.transferTypeID = transferTypeID;
        this.employeeID = employeeID;
        this.transferRelievingDate = transferRelievingDate;
        this.transferJoiningDate = transferJoiningDate;
        this.requestDate = requestDate;
        this.reason = reason;
        this.approve = approve;
        this.approveDate = approveDate;
        this.fromProjectID = fromProjectID;
        this.toProjectID = toProjectID;
        this.fromDepartmentID = fromDepartmentID;
        this.toDepartmentID = toDepartmentID;
        this.fromLocationID = fromLocationID;
        this.toLocationID = toLocationID;
    }

    public int getTransferID() {
        return transferID;
    }

    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }

    public int getTransferTypeID() {
        return transferTypeID;
    }

    public void setTransferTypeID(int transferTypeID) {
        this.transferTypeID = transferTypeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getTransferRelievingDate() {
        return transferRelievingDate;
    }

    public void setTransferRelievingDate(Date transferRelievingDate) {
        this.transferRelievingDate = transferRelievingDate;
    }

    public Date getTransferJoiningDate() {
        return transferJoiningDate;
    }

    public void setTransferJoiningDate(Date transferJoiningDate) {
        this.transferJoiningDate = transferJoiningDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean getApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public int getFromProjectID() {
        return fromProjectID;
    }

    public void setFromProjectID(int fromProjectID) {
        this.fromProjectID = fromProjectID;
    }

    public int getToProjectID() {
        return toProjectID;
    }

    public void setToProjectID(int toProjectID) {
        this.toProjectID = toProjectID;
    }

    public int getFromDepartmentID() {
        return fromDepartmentID;
    }

    public void setFromDepartmentID(int fromDepartmentID) {
        this.fromDepartmentID = fromDepartmentID;
    }

    public int getToDepartmentID() {
        return toDepartmentID;
    }

    public void setToDepartmentID(int toDepartmentID) {
        this.toDepartmentID = toDepartmentID;
    }

    public int getFromLocationID() {
        return fromLocationID;
    }

    public void setFromLocationID(int fromLocationID) {
        this.fromLocationID = fromLocationID;
    }

    public int getToLocationID() {
        return toLocationID;
    }

    public void setToLocationID(int toLocationID) {
        this.toLocationID = toLocationID;
    }
     public Vector getVector(){
        Vector v = new Vector();
        v.add(transferID);
        v.add(transferTypeID);
        v.add(employeeID);
        v.add(transferRelievingDate);
        v.add(transferJoiningDate);
        v.add(requestDate);
        v.add(reason);
        v.add(approve?"Approve":"Unapprove");
        v.add(approveDate);
        v.add(fromProjectID);
        v.add(toProjectID);
        v.add(fromDepartmentID);
        v.add(toDepartmentID);
        v.add(fromLocationID);
        v.add(toLocationID);    
        return v;
    }
}
