/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Bussiness.TableModelProject;
import Entity.Project;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khangdv
 */
public class ProjectDAO {

    private static Connection conn = null;
    private static CallableStatement cs = null;
    private static ResultSet rs = null;
    private static Vector projects;
    private static Project objProject = null;

    public ProjectDAO() {
    }

    public static int countTotalProject() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalProject}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static Vector getProjectFromDB() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spProject}");
        rs = cs.executeQuery();
        projects = new Vector();
        projects.add("Select");
        while (rs.next()) {
            projects.addElement(rs.getString(2));
        }
        return projects;
    }

    public static void insertProject(Project objpro) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spInsertProject(?,?,?)}");
        cs.setString(1, objpro.getProjectName());
        cs.setDate(2, new Date(objpro.getCreateDateProject().getTime()));
        cs.setDate(3, new Date(objpro.getEndDateProject().getTime()));
        cs.executeUpdate();
    }

    public static void updateProject(Project objProject, int ID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spUpdateProjectByID(?,?,?,?)}");
        cs.setInt(1, ID);
        cs.setString(2, objProject.getProjectName());
        cs.setDate(3, new Date(objProject.getCreateDateProject().getTime()));
        cs.setDate(4, new Date(objProject.getEndDateProject().getTime()));
        cs.executeUpdate();
    }

    public static void loadProjectToTable() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spProject}");
        rs = cs.executeQuery();
        while (rs.next()) {
            objProject = new Project();
            objProject.setProjectID(rs.getInt(1));
            objProject.setProjectName(rs.getString(2));
            objProject.setCreateDateProject(rs.getDate(3));
            objProject.setEndDateProject(rs.getDate(4));
            TableModelProject.addProject(objProject);
        }
    }

    public static String getProjectName(int projectID) {
        String projectName = null;
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetProjectName(?)}");
            cs.setInt(1, projectID);
            rs = cs.executeQuery();
            while (rs.next()) {
                projectName = rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projectName;
    }

    public static int getProjectID(String projectName) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetProjectID(?)}");
        cs.setString(1, projectName);
        rs = cs.executeQuery();
        int projectID = 0;
        while (rs.next()) {
            projectID = rs.getInt(1);
        }
        return projectID;
    }

    //khangdv
    public static void deleteProject(int projectID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spDelProject(?)}");
            cs.setInt(1, projectID);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //thanhnx
    public static Project getProjectByID(int projectID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetProjectByID(?)}");
            cs.setInt(1, projectID);
            rs = cs.executeQuery();
            while (rs.next()) {
                objProject = new Project();
                objProject.setProjectID(rs.getInt(1));
                objProject.setProjectName(rs.getString(2));
                objProject.setCreateDateProject(rs.getDate(3));
                objProject.setEndDateProject(rs.getDate(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objProject;
    }

    //thanhnx
    public static void getProjectByName(String projectName) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spSearchProjectByName(?)}");
            cs.setString(1, projectName);
            rs = cs.executeQuery();
            while (rs.next()) {
                objProject = new Project();
                objProject.setProjectID(rs.getInt(1));
                objProject.setProjectName(rs.getString(2));
                objProject.setCreateDateProject(rs.getDate(3));
                objProject.setEndDateProject(rs.getDate(4));
                TableModelProject.addProject(objProject);
            }
            conn.close();
        } catch (SQLException ex) {
        }
    }
}
