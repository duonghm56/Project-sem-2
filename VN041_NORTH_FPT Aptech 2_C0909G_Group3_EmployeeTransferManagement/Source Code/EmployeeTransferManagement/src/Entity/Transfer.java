/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author thanhnx_b00869
 */
public class Transfer {

    private int transferID;
    private int transferTypeID;
    private int employeeID;
    private int fromProjectID;
    private int toProjectID;
    private int fromDepartmentID;
    private int toDepartmentID;
    private int fromLocationID;
    private int toLocationID;
    private Date transferRelievingDate;
    private Date transferJoiningDate;
    private Date requestDate;
    private String reason;
    private String approve;
    private Date approveDate;

    public Transfer() {
    }

    /**
     * @return the transferID
     */
    public int getTransferID() {
        return transferID;
    }

    /**
     * @param transferID the transferID to set
     */
    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }

    /**
     * @return the transferTypeID
     */
    public int getTransferTypeID() {
        return transferTypeID;
    }

    /**
     * @param transferTypeID the transferTypeID to set
     */
    public void setTransferTypeID(int transferTypeID) {
        this.transferTypeID = transferTypeID;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the fromProjectID
     */
    public int getFromProjectID() {
        return fromProjectID;
    }

    /**
     * @param fromProjectID the fromProjectID to set
     */
    public void setFromProjectID(int fromProjectID) {
        this.fromProjectID = fromProjectID;
    }

    /**
     * @return the toProjectID
     */
    public int getToProjectID() {
        return toProjectID;
    }

    /**
     * @param toProjectID the toProjectID to set
     */
    public void setToProjectID(int toProjectID) {
        this.toProjectID = toProjectID;
    }

    /**
     * @return the fromDepartmentID
     */
    public int getFromDepartmentID() {
        return fromDepartmentID;
    }

    /**
     * @param fromDepartmentID the fromDepartmentID to set
     */
    public void setFromDepartmentID(int fromDepartmentID) {
        this.fromDepartmentID = fromDepartmentID;
    }

    /**
     * @return the toDepartmentID
     */
    public int getToDepartmentID() {
        return toDepartmentID;
    }

    /**
     * @param toDepartmentID the toDepartmentID to set
     */
    public void setToDepartmentID(int toDepartmentID) {
        this.toDepartmentID = toDepartmentID;
    }

    /**
     * @return the fromLocationID
     */
    public int getFromLocationID() {
        return fromLocationID;
    }

    /**
     * @param fromLocationID the fromLocationID to set
     */
    public void setFromLocationID(int fromLocationID) {
        this.fromLocationID = fromLocationID;
    }

    /**
     * @return the toLocationID
     */
    public int getToLocationID() {
        return toLocationID;
    }

    /**
     * @param toLocationID the toLocationID to set
     */
    public void setToLocationID(int toLocationID) {
        this.toLocationID = toLocationID;
    }

    /**
     * @return the transferRelievingDate
     */
    public Date getTransferRelievingDate() {
        return transferRelievingDate;
    }

    /**
     * @param transferRelievingDate the transferRelievingDate to set
     */
    public void setTransferRelievingDate(Date transferRelievingDate) {
        this.transferRelievingDate = transferRelievingDate;
    }

    /**
     * @return the transferJoiningDate
     */
    public Date getTransferJoiningDate() {
        return transferJoiningDate;
    }

    /**
     * @param transferJoiningDate the transferJoiningDate to set
     */
    public void setTransferJoiningDate(Date transferJoiningDate) {
        this.transferJoiningDate = transferJoiningDate;
    }

    /**
     * @return the requestDate
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * @param requestDate the requestDate to set
     */
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the approve
     */
    public String getApprove() {
        return approve;
    }

    /**
     * @param approve the approve to set
     */
    public void setApprove(String approve) {
        this.approve = approve;
    }

    /**
     * @return the approveDate
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * @param approveDate the approveDate to set
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

}
