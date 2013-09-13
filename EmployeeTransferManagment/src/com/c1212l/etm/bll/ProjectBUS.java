/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.beans.Project;
import com.c1212l.etm.dal.ProjectDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OLDPC
 */
public class ProjectBUS {

    ProjectDAO projectDAO;

    public ProjectBUS() {
        projectDAO = new ProjectDAO();
    }

    public ArrayList<Project> getAllProject() throws ClassNotFoundException, SQLException {
        return projectDAO.getAllProject();
    }

    public void addProject(String projectName, String createDate, String endDate) throws ClassNotFoundException, SQLException {
        Date createDate_date = Date.valueOf(createDate);
        Date endDate_date = Date.valueOf(endDate);
        Project project = new Project();
        project.setProjectName(projectName);
        project.setCreateDate(createDate_date);
        project.setEndDate(endDate_date);
        projectDAO.addProject(project);
    }
    
    public void updateProject(int projectID, String projectName, String createDate, String endDate) throws ClassNotFoundException, SQLException {
        Date createDate_date = Date.valueOf(createDate);
        Date endDate_date = Date.valueOf(endDate);
        Project project = new Project();
        project.setProjectID(projectID);
        project.setProjectName(projectName);
        project.setCreateDate(createDate_date);
        project.setEndDate(endDate_date);
        projectDAO.updateProject(project);
    }
    
    public void deleteProject(int projectID) throws ClassNotFoundException, SQLException {        
        Project project = new Project();
        project.setProjectID(projectID);
        projectDAO.deleteProject(project);
    }
    
    
}
