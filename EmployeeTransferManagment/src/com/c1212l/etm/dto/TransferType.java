/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dto;

import java.util.Vector;

/**
 *
 * @author OLDPC
 */
public class TransferType {
    private int transferTypeID;
    private String transferTypeName;
    /*
     * There are only 3 transferType : 
     *   + only transfer Department
     *   + only transfer Project
     *   + transfer both Department and Project
     */

    public int getTransferTypeID() {
        return transferTypeID;
    }

    public void setTransferTypeID(int transferTypeID) {
        this.transferTypeID = transferTypeID;
    }

    public String getTransferTypeName() {
        return transferTypeName;
    }

    public void setTransferTypeName(String transferTypeName) {
        this.transferTypeName = transferTypeName;
    }

    public TransferType() {
    }

    public TransferType(int transferTypeID, String transferTypeName) {
        this.transferTypeID = transferTypeID;
        this.transferTypeName = transferTypeName;
    }
        public Vector getVector(){
        Vector v = new Vector();
        v.add(transferTypeID);
        v.add(transferTypeName);
        return v;
    }
}
