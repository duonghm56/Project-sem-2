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
public class TransferDAO extends ConnectionTool {

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
            transfer.setApprove(rs.getInt("approve"));
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

    public ArrayList<Transfer> searchTransfer(String condition) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from [transfer] "
                + "where transferID in ( select transferID from viewtranempl " + condition + ")");
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
            transfer.setApprove(rs.getInt("approve"));
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

    public void updateTransfer(Transfer transfer) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs;
        switch (transfer.getApprove()) {
            case 1:
                //Approve
                System.out.println("CALL APPROVE UPDATE");
                cs = conn.prepareCall("{call updateForApprovedTransfer(?, ?, ?)}");
                cs.setInt(1, transfer.getTransferID());
                cs.setDate(2, transfer.getTransferRelievingDate());
                cs.setDate(3, transfer.getTransferJoiningDate());
                cs.executeUpdate();
                break;
            case 2:
                //Disapprove
                System.out.println("CALL DISAPPROVE UPDATE");
                cs = conn.prepareCall("{call updateForDisapproveTransfer(?, ?, ?)}");
                cs.setInt(1, transfer.getTransferID());
                cs.setDate(2, transfer.getTransferRelievingDate());
                cs.setDate(3, transfer.getTransferJoiningDate());
                cs.executeUpdate();
                break;
            case 3:
                //Wait Approve
                System.out.println("CALL WAIT APPROVE UPDATE");
                cs = conn.prepareCall("{call updateForWaitApproveTransfer(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                cs.setInt(1, transfer.getTransferID());
                cs.setInt(2, transfer.getTransferTypeID());
                cs.setDate(3, transfer.getTransferRelievingDate());
                cs.setDate(4, transfer.getTransferJoiningDate());
                cs.setInt(5, transfer.getFromProjectID());
                cs.setInt(6, transfer.getToProjectID());
                cs.setInt(7, transfer.getFromDepartmentID());
                cs.setInt(8, transfer.getToDepartmentID());
                cs.setInt(9, transfer.getFromLocationID());
                cs.setInt(10, transfer.getToLocationID());
                cs.executeUpdate();
                break;
        }
        closeConnection();
    }

    public void approveTransfer(Transfer transfer) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call approveTransfer(?)}");
        cs.setInt(1, transfer.getTransferID());
        cs.executeUpdate();
        closeConnection();
    }

    public void disapproveTransfer(Transfer transfer) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call disapproveTransfer(?)}");
        cs.setInt(1, transfer.getTransferID());
        cs.executeUpdate();
        closeConnection();
    }

    public void deleteTransfer(Transfer transfer) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call deleteTransfer(?)}");
        cs.setInt(1, transfer.getTransferID());
        cs.executeUpdate();
        closeConnection();
    }

    public void addTransfer(Transfer transfer) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addTransfer(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        cs.setInt(1, transfer.getEmployeeID());
        cs.setInt(2, transfer.getTransferTypeID());
        cs.setString(3, transfer.getReason());
        cs.setInt(4, transfer.getFromProjectID());
        cs.setInt(5, transfer.getToProjectID());
        cs.setInt(6, transfer.getFromDepartmentID());
        cs.setInt(7, transfer.getToDepartmentID());
        cs.setInt(8, transfer.getFromLocationID());
        cs.setInt(9, transfer.getToLocationID());
        cs.executeUpdate();
        closeConnection();
    }
}
