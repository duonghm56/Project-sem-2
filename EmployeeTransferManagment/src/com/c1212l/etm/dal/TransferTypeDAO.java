/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dto.TransferType;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author OLDPC
 */
public class TransferTypeDAO extends ConnectionTool{
    
    public  ArrayList<TransferType>getAllTransferType() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from transferType");        
        ArrayList<TransferType> result = new ArrayList<>();
        while(rs.next()){
            TransferType transferType = new TransferType();
            transferType.setTransferTypeID(rs.getInt("transferTypeID"));
            transferType.setTransferTypeName(rs.getString("transferTypeName"));
            result.add(transferType);
        }
        closeConnection();
        return result;
    }
    
    public void addTransferType(TransferType transferType) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call addTransferType(?)}");
        cs.setString(1, transferType.getTransferTypeName());        
        cs.executeUpdate();
        closeConnection();
    }
    
    public void updateTransferType(TransferType transferType) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call updateTransferType(?, ?)}");
        cs.setInt(1, transferType.getTransferTypeID());
        cs.setString(2, transferType.getTransferTypeName());        
        cs.executeUpdate();
        closeConnection();
    }
    
    public void deleteTransferType(TransferType transferType) throws ClassNotFoundException, SQLException{
        initConnection();
        CallableStatement cs = conn.prepareCall("{call deleteTransferType(?)}");
        cs.setInt(1, transferType.getTransferTypeID());        
        cs.executeUpdate();
        closeConnection();
    }
    
    public ArrayList<TransferType> searchTransferTypeName(String transferTypeName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from transferType " + transferTypeName);
        ArrayList<TransferType> result = new ArrayList<TransferType>();
        while (rs.next()) {
            TransferType transferType = new TransferType();
            transferType.setTransferTypeID(rs.getInt("transferTypeID"));
            transferType.setTransferTypeName(rs.getString("transferTypeName"));
            result.add(transferType);
        }
        closeConnection();
        return result;
    }
    
    
    public TransferType getTransferTypeById(int id) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from transferType where transferTypeID = " + id);
            TransferType transferType = null;
            if (rs.next()) {
                transferType = new TransferType();
                transferType.setTransferTypeID(rs.getInt("transferTypeID"));
                transferType.setTransferTypeName(rs.getString("transferTypeName"));
            }
            closeConnection();
            return transferType;
        }catch(Exception ex){
            return null;
        }
    }
}
