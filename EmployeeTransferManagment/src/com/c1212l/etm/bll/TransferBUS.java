/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.TransferDAO;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dto.Transfer;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class TransferBUS {

    TransferDAO transferDAO;

    public TransferBUS() {
        transferDAO = new TransferDAO();
    }

    public ArrayList<Transfer> getAllTransfer() throws ClassNotFoundException, SQLException {
        return transferDAO.getAllTransfer();
    }

    public ArrayList<Transfer> searchTransfer(String condition) throws ClassNotFoundException, SQLException {
        return transferDAO.searchTransfer(condition);
    }

    public void updateTransfer(int transferID, int transferTypeID, String transferRelievingDate, String transferJoiningDate, int fromProjectID, int toProjectID, int fromDepartmentID, int toDepartmentID, int fromLocationID, int toLocationID, int approve) throws ClassNotFoundException, SQLException {
        Date relDate;
        Date joinDate;
        try {
            relDate = Date.valueOf(transferRelievingDate);
        } catch (Exception ex) {
            relDate = null;            
        }
        try {
            joinDate = Date.valueOf(transferJoiningDate);
        } catch (Exception ex) {
            joinDate = null;            
        }
        Transfer transfer = new Transfer();
        transfer.setTransferID(transferID);
        transfer.setTransferTypeID(transferTypeID);
        transfer.setTransferRelievingDate(relDate);
        transfer.setTransferJoiningDate(joinDate);
        transfer.setFromProjectID(fromProjectID);
        transfer.setToProjectID(toProjectID);
        transfer.setFromDepartmentID(fromDepartmentID);
        transfer.setToDepartmentID(toDepartmentID);
        transfer.setFromLocationID(fromLocationID);
        transfer.setToLocationID(toLocationID);
        transfer.setApprove(approve);
        transferDAO.updateTransfer(transfer);
    }

    public void approveTransfer(int transferID) throws ClassNotFoundException, SQLException {
        Transfer transfer = new Transfer();
        transfer.setTransferID(transferID);
        transferDAO.approveTransfer(transfer);
    }

    public void disapproveTransfer(int transferID) throws ClassNotFoundException, SQLException {
        Transfer transfer = new Transfer();
        transfer.setTransferID(transferID);
        transferDAO.disapproveTransfer(transfer);
    }

    /*public void updateTransfer(int transferID,int transferTypeID, int employeeID, Date transferRelievingDate, Date transferJoiningDate, Date requestDate, String reason, boolean approve, Date approveDate, int fromProjectID, int toProjectID, int fromDepartmentID, int toDepartmentID, int fromLocationID, int toLocationID) throws ClassNotFoundException, SQLException{
     Transfer transfer = new Transfer();
     transfer.setTransferID(transferID);
     transfer.setTransferTypeID(transferTypeID);
     transfer.setEmployeeID(employeeID);
     transfer.setTransferRelievingDate(transferRelievingDate);
     transfer.setTransferJoiningDate(transferJoiningDate);
     transfer.setRequestDate(requestDate);
     transfer.setReason(reason);
     transfer.setApprove(approve);
     transfer.setApproveDate(approveDate);
     transfer.setFromProjectID(fromProjectID);
     transfer.setToProjectID(toProjectID);
     transfer.setFromDepartmentID(fromDepartmentID);
     transfer.setToDepartmentID(toDepartmentID);
     transfer.setFromLocationID(fromLocationID);
     transfer.setToLocationID(toLocationID);
     transferDAO.updateTransfer(transfer);
     }
     public void updateEmployeeTransfer(int employeeID,int departmentID,int projectID){
     Employee employee = new Employee();
     employee.setEmployeeID(employeeID);
     employee.setDepartnameID(departmentID);
     employee.setProjectID(projectID);
        
     }*/
    public void deleteTransfer(int transferID) throws ClassNotFoundException, SQLException {
        Transfer transfer = new Transfer();
        transfer.setTransferID(transferID);
        transferDAO.deleteTransfer(transfer);
    }
}
