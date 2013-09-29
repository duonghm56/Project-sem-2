/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.bll.EmployeeBUS;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Transfer;
import com.c1212l.etm.ui.FrameTestLogin;
import com.c1212l.etm.util.KeyValue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class TransferHistoryDAO extends ConnectionTool {
       int employeeID;
       public ArrayList<Transfer> getTransferHistory() throws ClassNotFoundException, SQLException {
        initConnection();
        EmployeeBUS employeeBUS = new EmployeeBUS();
        ArrayList<Employee> arrEmployee = employeeBUS.getAllEmployees();
        for (Employee e : arrEmployee) {
            if (e.getEmail().equals(FrameTestLogin.email)) {
                employeeID = e.getEmployeeID();
            }
        }
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from [transfer] where employeeID="+employeeID);
        ArrayList<Transfer> result = new ArrayList<>();
        while (rs.next()) {
            Transfer transfer = new Transfer();
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
}
