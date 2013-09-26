/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.TransferRequestDAO;
import com.c1212l.etm.dto.Transfer;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Luu Bi
 */
public class TransferRequestBUS {
        TransferRequestDAO transferRequestDAO;
    public TransferRequestBUS() {
        transferRequestDAO = new TransferRequestDAO();
    }   
     public void addTransfer( int transferTypeID,int employeeID,Date requestDate, String reason,boolean approve,  int fromProjectID, int toProjectID, int fromDepartmentID, int toDepartmentID, int fromLocationID, int toLocationID) throws ClassNotFoundException, SQLException{
        Transfer transfer = new Transfer();
        transfer.setTransferTypeID(transferTypeID);
        transfer.setEmployeeID(employeeID);
        transfer.setRequestDate(requestDate);
        transfer.setReason(reason);
        transfer.setApprove(approve);
        transfer.setFromProjectID(fromProjectID);
        transfer.setToProjectID(toProjectID);
        transfer.setFromDepartmentID(fromDepartmentID);
        transfer.setToDepartmentID(toDepartmentID);
        transfer.setFromLocationID(fromLocationID);
        transfer.setToLocationID(toLocationID);
        transferRequestDAO.addTransfer(transfer);
    }
      
}
