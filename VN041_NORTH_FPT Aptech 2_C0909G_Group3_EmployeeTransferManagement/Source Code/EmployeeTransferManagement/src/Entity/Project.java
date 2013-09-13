/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Khangdv
 */
public class Project {

    private int projectID;
    private String projectName;
    private Date createDateProject;
    private Date endDateProject;

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

    public Date getCreateDateProject() {
        return createDateProject;
    }

    public void setCreateDateProject(Date createDateProject) {
        this.createDateProject = createDateProject;
    }

    public Date getEndDateProject() {
        return endDateProject;
    }

    public void setEndDateProject(Date endDateProject) {
        this.endDateProject = endDateProject;
    }
}
   