/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dao.ProjectDAO;
import com.c1212l.etm.dto.Project;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OLDPC
 */
public class ProjectDAOTest {
    
    public ProjectDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllProject method, of class ProjectDAO.
     */
    @Test
    public void testGetAllProject() throws Exception {
        System.out.println("getAllProject");
        ProjectDAO instance = new ProjectDAO();
        ArrayList expResult = null;
        ArrayList result = instance.getAllProject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProject method, of class ProjectDAO.
     */
    @Test
    public void testAddProject() throws Exception {
        System.out.println("addProject");
        Project project = null;
        ProjectDAO instance = new ProjectDAO();
        instance.addProject(project);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProject method, of class ProjectDAO.
     */
    @Test
    public void testUpdateProject() throws Exception {
        System.out.println("updateProject");
        Project project = null;
        ProjectDAO instance = new ProjectDAO();
        instance.updateProject(project);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProject method, of class ProjectDAO.
     */
    @Test
    public void testDeleteProject() throws Exception {
        System.out.println("deleteProject");
        Project project = null;
        ProjectDAO instance = new ProjectDAO();
        instance.deleteProject(project);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
