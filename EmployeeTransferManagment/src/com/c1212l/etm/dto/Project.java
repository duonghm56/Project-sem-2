/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author OLDPC
 */
public class Project {
    private int projectID;
    private String projectName;
    private Date createDate;
    private Date endDate;

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Project(int projectID, String projectName, Date createDate, Date endDate) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.createDate = createDate;
        this.endDate = endDate;
    }

    public Project() {
    }
    
    public Vector getVector(){
        Vector v = new Vector();
        v.add(projectID);
        v.add(projectName);
        v.add(createDate);
        v.add(endDate);        
        return v;
    }
    
}
