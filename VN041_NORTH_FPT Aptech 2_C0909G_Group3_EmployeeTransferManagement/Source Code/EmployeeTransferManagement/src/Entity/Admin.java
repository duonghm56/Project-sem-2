/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author PROXUANTHI
 */
public class Admin {
    private int adminID;
    private String email;
    private String passWord;
    private String fullName;

    /**
     * @return the adminID
     */
    public int getAdminID() {
        return adminID;
    }

    /**
     * @param adminID the adminID to set
     */
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
