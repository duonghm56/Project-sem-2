/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Transfer;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Luu Bi
 */
public class TransferRequestDAO extends ConnectionTool {
        public void addTransfer(Transfer transfer) throws ClassNotFoundException, SQLException{
            initConnection();
            CallableStatement cs = conn.prepareCall("{call addTransfer(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, transfer.getTransferTypeID());
            cs.setInt(2, transfer.getEmployeeID());
            cs.setDate(3,transfer.getRequestDate());
            cs.setString(4, transfer.getReason());  
            cs.setBoolean(5,transfer.isApprove());
            cs.setInt(6,transfer.getFromProjectID());
            cs.setInt(7, transfer.getToProjectID());
            cs.setInt(8, transfer.getFromDepartmentID()); 
            cs.setInt(9, transfer.getToDepartmentID());
            cs.setInt(10, transfer.getFromLocationID()); 
            cs.setInt(11, transfer.getToLocationID());
            cs.executeUpdate();
            closeConnection();        
    }
}
