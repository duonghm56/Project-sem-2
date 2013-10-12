/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import com.c1212l.etm.dal.DepartmentDAO;
import com.c1212l.etm.dal.EmployeeDAO;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dal.ProjectDAO;
import com.c1212l.etm.dal.TransferTypeDAO;
import com.c1212l.etm.report.TransferView;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    private int approve;
    private Date approveDate;
    private int fromProjectID;
    private int toProjectID;
    private int fromDepartmentID;
    private int toDepartmentID;
    private int fromLocationID;
    private int toLocationID;
    private String letter;

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

    public int getApprove() {
        return approve;
    }

    public void setApprove(int approve) {
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

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    
    
    public Transfer() {
    }

    public Vector getVector() {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee empl = employeeDAO.getEmployeeByID(employeeID);

        TransferTypeDAO transferTypeDAO = new TransferTypeDAO();
        TransferType transferType = transferTypeDAO.getTransferTypeById(transferTypeID);

        LocationDAO locationDAO = new LocationDAO();
        Location fromLocation = locationDAO.getLocationById(fromLocationID);
        Location toLocation = locationDAO.getLocationById(toLocationID);

        DepartmentDAO departmentDAO = new DepartmentDAO();
        Department fromDepartment = departmentDAO.getDepartmentByID(fromDepartmentID);
        Department toDepartment = departmentDAO.getDepartmentByID(toDepartmentID);

        ProjectDAO projectDAO = new ProjectDAO();
        Project fromProject = projectDAO.getProjectById(fromProjectID);
        Project toProject = projectDAO.getProjectById(toProjectID);

        Vector v = new Vector();
        v.add(transferID);
        v.add(transferType.getTransferTypeName());
        v.add(empl.getEmployeeNumber());
        v.add(empl.getEmployeeName());

        v.add(transferRelievingDate);
        v.add(transferJoiningDate);
        v.add(requestDate);
        v.add(reason);
        v.add(approveDate);

        v.add(fromProject.getProjectName());
        v.add(toProject.getProjectName());
        v.add(fromDepartment.getDepartmentName() + " - " + fromLocation.getLocationName());
        v.add(toDepartment.getDepartmentName() + " - " + toLocation.getLocationName());
        v.add(fromLocation.getLocationName());
        v.add(toLocation.getLocationName());
        
        switch (approve) {
            case 1:
                v.add("Approve");
                break;
            case 2:
                v.add("Disapprove");
                break;
            case 3:
                v.add("Waiting Approve");
                break;
        }

        v.add(letter);

        return v;
        
    }

    public TransferView getTransferView(){
        TransferView transferView = new TransferView();
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee empl = employeeDAO.getEmployeeByID(employeeID);

        TransferTypeDAO transferTypeDAO = new TransferTypeDAO();
        TransferType transferType = transferTypeDAO.getTransferTypeById(transferTypeID);

        LocationDAO locationDAO = new LocationDAO();
        Location fromLocation = locationDAO.getLocationById(fromLocationID);
        Location toLocation = locationDAO.getLocationById(toLocationID);

        DepartmentDAO departmentDAO = new DepartmentDAO();
        Department fromDepartment = departmentDAO.getDepartmentByID(fromDepartmentID);
        Department toDepartment = departmentDAO.getDepartmentByID(toDepartmentID);

        ProjectDAO projectDAO = new ProjectDAO();
        Project fromProject = projectDAO.getProjectById(fromProjectID);
        Project toProject = projectDAO.getProjectById(toProjectID);
        
        transferView.setNumber(empl.getEmployeeNumber());
        transferView.setFromProject(fromProject.getProjectName());
        transferView.setToProject(toProject.getProjectName());
        transferView.setFromDepartment(fromDepartment.getDepartmentName());
        transferView.setToDepartment(toDepartment.getDepartmentName());
        transferView.setFromLocation(fromLocation.getLocationName());
        transferView.setToLocation(toLocation.getLocationName());
        /*
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        if(transferRelievingDate==null){
            transferView.setRelievingDate("Unknown");
        }else{
            transferView.setRelievingDate(df.format(transferRelievingDate));
        }
        if(transferJoiningDate==null){
            transferView.setJoiningDate("Unknown");
        }else{
            transferView.setJoiningDate(df.format(transferJoiningDate));
        }*/
        switch(approve){
            case 1:
                transferView.setApprove("Approved");
                break;
            case 2:
                transferView.setApprove("Disapproved");
                break;
            case 3:
                transferView.setApprove("Waiting");
                break;
        }        
        return transferView;
    }
}
