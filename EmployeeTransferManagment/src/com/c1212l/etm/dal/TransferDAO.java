/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Transfer;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class TransferDAO extends ConnectionTool{
       public Vector <Transfer>  listAllTransfer() throws ClassNotFoundException, SQLException {
        Vector <Transfer> listTransfer = null;
        initConnection();
        Statement sta = conn.createStatement();
        ResultSet rs = sta.executeQuery("Select * from transfer");
        if (rs != null) {
            listTransfer = new Vector<Transfer>();
            while(rs.next())
            {
                Transfer temp = new Transfer();
                temp.setTransferID(rs.getInt("transferID"));
                temp.setTransferTypeID(rs.getInt("transferTypeID"));
                temp.setEmployeeID(rs.getInt("employeeID"));
                temp.setTransferRelievingDate(rs.getDate("transferRelievingDate"));
                temp.setTransferJoiningDate(rs.getDate("transferJoiningDate"));
                temp.setRequestDate(rs.getDate("requestDate"));
                temp.setReason(rs.getString("reason"));
                temp.setApprove(rs.getString("approve"));
                temp.setApproveDate(rs.getDate("approveDate"));
                temp.setFromProjectID(rs.getInt("fromProjectID"));
                temp.setToProjectID(rs.getInt("toProjectID"));
                temp.setFromDepartmentID(rs.getInt("fromDepartmentID"));
                temp.setToDepartmentID(rs.getInt("toDepartmentID"));
                temp.setFromLocationID(rs.getInt("fromLocationID"));
                temp.setToLocationID(rs.getInt("toLocationID"));
                listTransfer.add(temp);
            }
        }
        closeConnection();
        return listTransfer;
    }
       public void addTransfer(Transfer transfer) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addTransfer(?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?)}");
        cs.setInt(1, transfer.getTransferTypeID());
        cs.setInt(2, transfer.getEmployeeID());
        cs.setDate(3, transfer.getTransferRelievingDate());
        cs.setDate(4,transfer.getTransferJoiningDate());
        cs.setDate(5,transfer.getRequestDate());
        cs.setString(6, transfer.getReason());
        cs.setString(7, transfer.getApprove());
        cs.setDate(8, transfer.getApproveDate());   
        cs.setInt(9, transfer.getFromProjectID());
        cs.setInt(10, transfer.getToProjectID());
        cs.setInt(11, transfer.getFromDepartmentID()); 
        cs.setInt(12, transfer.getToDepartmentID());
        cs.setInt(13, transfer.getFromLocationID()); 
        cs.setInt(14, transfer.getToLocationID());
        cs.executeUpdate();
        closeConnection();        
    }
       public void updateTransfer(Transfer transfer) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateTransfer(?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?)}");
        cs.setInt(1, transfer.getTransferID());
        cs.setInt(2, transfer.getTransferTypeID());
        cs.setInt(3, transfer.getEmployeeID());
        cs.setDate(4, transfer.getTransferRelievingDate());
        cs.setDate(5,transfer.getTransferJoiningDate());
        cs.setDate(6,transfer.getRequestDate());
        cs.setString(7, transfer.getReason());
        cs.setString(8, transfer.getApprove());
        cs.setDate(9, transfer.getApproveDate());   
        cs.setInt(10, transfer.getFromProjectID());
        cs.setInt(11, transfer.getToProjectID());
        cs.setInt(12, transfer.getFromDepartmentID()); 
        cs.setInt(13, transfer.getToDepartmentID());
        cs.setInt(14, transfer.getFromLocationID()); 
        cs.setInt(15, transfer.getToLocationID());
        closeConnection();        
    }
       public void deleteTransfer(Transfer transfer) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call deleteTransfer(?)}");
        cs.setInt(1, transfer.getTransferID());
        cs.executeUpdate();     
        closeConnection();        
    }
}
