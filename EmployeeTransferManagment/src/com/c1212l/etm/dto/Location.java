/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class Location {

    private int locationID;
    private String locationName;
    private float allowance;

    public Location() {
    }

    public Location(int locationID, String locationName) {
        this.locationID = locationID;
        this.locationName = locationName;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public float getAllowance() {
        return allowance;
    }

    public void setAllowance(float allowance) {
        this.allowance = allowance;
    }
    
    public Vector getVector() {
        Vector v = new Vector();
        v.add(locationID);
        v.add(locationName);
        v.add(allowance);
        return v;
    }
    
    
}
