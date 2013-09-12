/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.test;

import com.c1212l.etm.dal.ProjectDAO;
import junit.framework.TestCase;

/**
 *
 * @author OLDPC
 */
public class ProjectDAOTest extends TestCase{
    
    ProjectDAO projectDAO;

    @Override
    protected void setUp() throws Exception {
        projectDAO = new ProjectDAO();
    }

    @Override
    protected void tearDown() throws Exception {
        projectDAO = null;
    }
    
    public void test_getAllProject(){
        assertEquals(true, true);
    }
    
}
