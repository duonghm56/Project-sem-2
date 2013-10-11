/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dal.ProjectDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public ArrayList<Project> searchProject(String condition) throws ClassNotFoundException, SQLException {
        return projectDAO.searchProject(condition);
    }

    public void addProject(String projectName, String createDate, String endDate) throws ClassNotFoundException, SQLException, Exception {
        Date createDate_date = null;
        Date endDate_date = null;
        try {
            createDate_date = Date.valueOf(createDate);
        }catch(Exception ex){            
        }
        try{
            endDate_date = Date.valueOf(endDate);
        }catch(Exception ex){            
        }
        if(createDate_date != null && endDate_date != null && createDate_date.compareTo(endDate_date)>0){
            throw new Exception("Error: End date is newer than Created date");
        }
        
        Project project = new Project();
        project.setProjectName(projectName);
        project.setCreateDate(createDate_date);
        project.setEndDate(endDate_date);
        projectDAO.addProject(project);
    }

    public void updateProject(String projectID, String projectName, String createDate, String endDate) throws ClassNotFoundException, SQLException, Exception {
        Date createDate_date = null;
        Date endDate_date = null;
        try {
            createDate_date = Date.valueOf(createDate);
        }catch(Exception ex){            
        }
        try{
            endDate_date = Date.valueOf(endDate);
        }catch(Exception ex){            
        }
        if(createDate_date != null && endDate_date != null && createDate_date.compareTo(endDate_date)>0){
            throw new Exception("Error: End date is newer than Created date");
        }
        Project project = new Project();
        project.setProjectID(Integer.parseInt(projectID));
        project.setProjectName(projectName);
        project.setCreateDate(createDate_date);
        project.setEndDate(endDate_date);
        projectDAO.updateProject(project);
    }

    public void deleteProject(String projectID) throws ClassNotFoundException, SQLException, Exception {
        Project project = new Project();
        project.setProjectID(Integer.parseInt(projectID));
        projectDAO.deleteProject(project);
    }
}
