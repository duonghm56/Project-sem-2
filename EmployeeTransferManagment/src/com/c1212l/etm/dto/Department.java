/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import com.c1212l.etm.dal.DepartmentDAO;
import com.c1212l.etm.dal.LocationDAO;
import java.util.Vector;

/**
 *
 * @author Android21SDK
 */
public class Department {
    private int departmentID;
    private String departmentName;
    private int locationID;

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    } 
    public Vector getVector(){
        Vector v = new Vector();
        v.add(departmentID);
        v.add(departmentName);
        Location location = new LocationDAO().getLocationById(locationID);
        v.add(location!=null?location.getLocationName():"undifined"); 
        return v;
    }
}
