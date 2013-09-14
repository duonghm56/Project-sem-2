/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Project;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author OLDPC
 */
public class ProjectDAO extends ConnectionTool {

    public ArrayList<Project> getAllProject() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from project");
        ArrayList<Project> result = new ArrayList<>();
        while (rs.next()) {
            Project p = new Project();
            p.setProjectID(rs.getInt("projectID"));
            p.setProjectName(rs.getString("projectName"));
            p.setCreateDate(rs.getDate("createDate"));
            p.setEndDate(rs.getDate("endDate"));
            result.add(p);
        }
        closeConnection();
        return result;
    }

    public ArrayList<Project> searchProject(String condition) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from project " + condition);
        ArrayList<Project> result = new ArrayList<>();
        while (rs.next()) {
            Project p = new Project();
            p.setProjectID(rs.getInt("projectID"));
            p.setProjectName(rs.getString("projectName"));
            p.setCreateDate(rs.getDate("createDate"));
            p.setEndDate(rs.getDate("endDate"));
            result.add(p);
        }
        closeConnection();
        return result;
    }

    public void addProject(Project project) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addProject(?, ?, ?)}");
        cs.setString(1, project.getProjectName());
        cs.setDate(2, project.getCreateDate());
        cs.setDate(3, project.getEndDate());
        cs.executeUpdate();
        closeConnection();
    }

    public void updateProject(Project project) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateProject(?, ?, ?, ?)}");
        cs.setInt(1, project.getProjectID());
        cs.setString(2, project.getProjectName());
        cs.setDate(3, project.getCreateDate());
        cs.setDate(4, project.getEndDate());
        cs.executeUpdate();
        closeConnection();
    }

    public void deleteProject(Project project) throws ClassNotFoundException, SQLException {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call deleteProject(?)}");
        cs.setInt(1, project.getProjectID());
        cs.executeUpdate();
        closeConnection();
    }

    public Project getProjectById(int id) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from project where projectID = " + id);
            Project project = null;
            if (rs.next()) {
                project = new Project();
                project.setProjectID(rs.getInt("projectID"));
                project.setProjectName(rs.getString("projectName"));
                project.setCreateDate(rs.getDate("createDate"));
                project.setEndDate(rs.getDate("endDate"));
            }
            closeConnection();
            return project;
        }catch(Exception ex){
            return null;
        }
    }
}
