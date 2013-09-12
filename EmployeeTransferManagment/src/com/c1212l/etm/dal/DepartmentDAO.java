/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.beans.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Android21SDK
 */
public class DepartmentDAO extends ConnectionTool {

    public ArrayList<Department> getDepartment() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt=conn.createStatement();
        ResultSet rs=stt.executeQuery("select *from department");
        closeConnection();
        return null;
    }

}
