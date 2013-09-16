/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Department;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Android21SDK
 */
public class DepartmentDAO extends ConnectionTool{
    public ArrayList<Department> getDepartment() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stt=conn.createStatement();
        ResultSet rs=stt.executeQuery("select *from department");
        ArrayList<Department> result= new ArrayList<>();
        while(rs.next()){
            Department dp= new Department();
            dp.setDepartmentID(rs.getInt("departmentID"));
            dp.setDepartmentName(rs.getString("departmentName"));
            result.add(dp);
        }
        closeConnection();
        return result;
    }
    public void addDepartment(Department department) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs= conn.prepareCall("call addDepartment(?)");
        cs.setString(1, department.getDepartmentName());
        cs.executeUpdate();
        closeConnection();
    }
    public void updateDepartment(Department department) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs=conn.prepareCall("call updateDepartment(?,?)");
        cs.setInt(1, department.getDepartmentID());
        cs.setString(2, department.getDepartmentName());
        cs.executeUpdate();
        closeConnection();             
    }
    public void deleteDepartment(Department department) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs= conn.prepareCall("call deleteDepartment(?)");
        cs.setInt(1, department.getDepartmentID());
        cs.executeUpdate();
        closeConnection();
    }
}
