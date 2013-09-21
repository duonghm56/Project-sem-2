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
import java.util.Vector;

/**
 *
 * @author Android21SDK
 */
public class DepartmentDAO extends ConnectionTool{
    public ArrayList<Department> getAllDepartment() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stt=conn.createStatement();
        ResultSet rs=stt.executeQuery("Select * From department Inner Join location On department.locationID = location.locationID");
        ArrayList<Department> result = new ArrayList<Department>();
        while(rs.next()){
            Department dp= new Department();
            dp.setDepartmentID(rs.getInt("departmentID"));
            dp.setDepartmentName(rs.getString("departmentName"));
            dp.setLocationName(rs.getString("locationName"));
            result.add(dp);
        }
        closeConnection();
        return result;
    }
    public void addDepartment(Department department) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs= conn.prepareCall("{call addDepartment(?,?)}");
        cs.setString(1, department.getDepartmentName());
        cs.setInt(2, department.getLocationID());
        cs.executeUpdate();
        closeConnection();
    }
    public void updateDepartment(Department department) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs=conn.prepareCall("{call updateDepartment(?,?,?)}");
        cs.setInt(1, department.getDepartmentID());
        cs.setString(2, department.getDepartmentName());
        cs.setInt(3, department.getLocationID());
        cs.executeUpdate();
        closeConnection();             
    }
    public void deleteDepartment(Department department) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs= conn.prepareCall("{call deleteDepartment(?)}");
        cs.setInt(1, department.getDepartmentID());
        cs.executeUpdate();
        closeConnection();
    }
       public ArrayList<Department> searchDepartmentName(String departmentName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from department " + departmentName);
        ArrayList<Department> result = new ArrayList<>();
        while (rs.next()) {
            Department department = new Department();
            department.setDepartmentID(rs.getInt("departmentID"));
            department.setDepartmentName(rs.getString("departmentName"));
            department.setLocationID(rs.getInt("locationID"));
            result.add(department);
        }
        closeConnection();
        return result;
    }
           public Department getDepartmentID(int id) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from department where departmentID = " + id);
            Department department = null;
            if (rs.next()) {
                department = new Department();
                department.setDepartmentID(rs.getInt("departmentID"));
                department.setDepartmentName(rs.getString("departmentName"));
                department.setLocationID(rs.getInt("locationID"));
            }
            closeConnection();
            return department;
        }catch(Exception ex){
            return null;
        }
    }
}
