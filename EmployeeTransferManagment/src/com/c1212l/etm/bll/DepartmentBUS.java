/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;
import com.c1212l.etm.dal.DepartmentDAO;
import com.c1212l.etm.dto.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Android21SDK
 */
public class DepartmentBUS {
    DepartmentDAO departmentDAO;
    public ArrayList<Department> searchDepartmentName(String departmentName) throws ClassNotFoundException, SQLException {
        return departmentDAO.searchDepartmentName(departmentName);
    }
    public DepartmentBUS() {
        departmentDAO= new DepartmentDAO();
    }
    public ArrayList<Department> getAllDepartment() throws ClassNotFoundException, SQLException{
        return departmentDAO.getAllDepartment();
    }
    public ArrayList<Department> getDepartmentByLocationID(int locationID) throws ClassNotFoundException, SQLException{
        return departmentDAO.getDepartmentByLocationId(locationID);
    }
    public void addDepartment(String dpmName,int locationID) throws ClassNotFoundException, Exception{
        Department dpm=new Department();
        dpm.setDepartmentName(dpmName);
        dpm.setLocationID(locationID);
        departmentDAO.addDepartment(dpm);
    }
    public void updateDepartment(int departmentID, String departmentName,int locationID) throws ClassNotFoundException, Exception{
        Department dpm= new Department();
        dpm.setDepartmentID(departmentID);
        dpm.setDepartmentName(departmentName);
        dpm.setLocationID(locationID);
        departmentDAO.updateDepartment(dpm);
    }
    public void deleteDepartment(int dpmID) throws ClassNotFoundException, Exception{
        Department dpm= new Department();
        dpm.setDepartmentID(dpmID);
        departmentDAO.deleteDepartment(dpm);
    }
}
