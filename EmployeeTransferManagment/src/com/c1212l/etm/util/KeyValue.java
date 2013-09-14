/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.util;

/**
 *
 * @author OLDPC
 */
public class KeyValue {

    private int key;
    private String value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KeyValue() {
    }

    public KeyValue(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        return value.equals(((KeyValue)obj).getValue());
    }
    
    @Override
    public String toString() {
        return value;
    }
}
