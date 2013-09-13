/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Cuongdm
 */
public class Location {
    
    private int locationID;
    private String LocationAddress;

    /**
     * @return the locationID
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * @param locationID the locationID to set
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    /**
     * @param LocationAddress the LocationAddress to set
     */
    public void setLocationAddress(String LocationAddress) {
        this.LocationAddress = LocationAddress;
    }

    /**
     * @return the LocationAddress
     */
    public String getLocationAddress() {
        return LocationAddress;
    }
    public Location(int locationID, String LocationAddress){
        this.locationID = locationID;
        this.LocationAddress = LocationAddress;
    }
    public Location(){

    }
}
