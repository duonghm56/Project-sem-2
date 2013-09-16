/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;
import com.c1212l.etm.dal.DepartmentDAO;
import com.c1212l.etm.dal.EmployeeDAO;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Android21SDK
 */
public class DepartmentBUS {
    DepartmentDAO departmentDAO;

    public DepartmentBUS() {
        departmentDAO= new DepartmentDAO();
    }
    public ArrayList<Department> getdDepartment() throws ClassNotFoundException, SQLException{
        return departmentDAO.getDepartment();
    }
    public void addDepartment(int dpmID, String dpmName) throws ClassNotFoundException, SQLException{
        Department dpm=new Department();
        dpm.setDepartmentID(dpmID);
        dpm.setDepartmentName(dpmName);
        departmentDAO.addDepartment(dpm);
    }
    public void updateDepartment(int dpmID, String dpmName) throws ClassNotFoundException, SQLException{
        Department dpm= new Department();
        dpm.setDepartmentID(dpmID);
        dpm.setDepartmentName(dpmName);
        departmentDAO.updateDepartment(dpm);
    }
    public void deleteDepartment(int dpmID) throws ClassNotFoundException, SQLException{
        Department dpm= new Department();
        dpm.setDepartmentID(dpmID);
        departmentDAO.deleteDepartment(dpm);
    }
    
}
