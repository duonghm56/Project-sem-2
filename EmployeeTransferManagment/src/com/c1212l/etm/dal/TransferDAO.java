/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dto.Transfer;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class TransferDAO extends ConnectionTool{
        public ArrayList<Transfer> getAllTransfer() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from [transfer]");
        ArrayList<Transfer> result = new ArrayList<>();
        while (rs.next()) {
            Transfer transfer = new Transfer();
            transfer.setTransferID(rs.getInt("transferID"));
            transfer.setTransferTypeID(rs.getInt("transferTypeID"));
            transfer.setEmployeeID(rs.getInt("employeeID"));
            transfer.setTransferRelievingDate(rs.getDate("transferRelievingDate"));
            transfer.setTransferJoiningDate(rs.getDate("transferJoiningDate"));
            transfer.setRequestDate(rs.getDate("requestDate"));
            transfer.setReason(rs.getString("reason"));
            transfer.setApprove(rs.getBoolean("approve"));
            transfer.setApproveDate(rs.getDate("approveDate"));
            transfer.setFromProjectID(rs.getInt("fromProjectID"));
            transfer.setToProjectID(rs.getInt("toProjectID"));
            transfer.setFromDepartmentID(rs.getInt("fromDepartmentID"));
            transfer.setToDepartmentID(rs.getInt("toDepartmentID"));
            transfer.setFromLocationID(rs.getInt("fromLocationID"));
            transfer.setToLocationID(rs.getInt("toLocationID"));
            result.add(transfer);
        }
        closeConnection();
        return result;
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
        cs.setBoolean(8, transfer.isApprove());
        cs.setDate(9, transfer.getApproveDate());   
        cs.setInt(10, transfer.getFromProjectID());
        cs.setInt(11, transfer.getToProjectID());
        cs.setInt(12, transfer.getFromDepartmentID()); 
        cs.setInt(13, transfer.getToDepartmentID());
        cs.setInt(14, transfer.getFromLocationID()); 
        cs.setInt(15, transfer.getToLocationID());
        cs.executeUpdate();
        closeConnection();        
    }
         public void updateEmployee(Employee employee) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call updateEmployeeTransfer(?, ?, ?)}");
            cs.setInt(1, employee.getEmployeeID());
            cs.setInt(2, employee.getDepartnameID());
            cs.setInt(3, employee.getProjectID());
            cs.executeUpdate();
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
