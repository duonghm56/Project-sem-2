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
public class Admin {
    private int id;
    private String email;
    private String password;
    private int role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public Vector getVector(){
        Vector v = new Vector();
        v.add(id);
        v.add(email);
        v.add(password); 
        switch (role) {
            case 1:
                v.add("Admin 1");
                break;
            case 2:
                v.add("Admin 2");
                break;
            case 3:
                v.add("Admin 3");
                break;
        }
        return v;
    }
}
