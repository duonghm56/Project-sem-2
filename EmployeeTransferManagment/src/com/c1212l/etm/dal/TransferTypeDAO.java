/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.dal;

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
    
    public ArrayList<TransferType> getAllTransferType() throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from project");        
        ArrayList<TransferType> result = new ArrayList<TransferType>();
        while(rs.next()){
            TransferType p = new TransferType();
            p.setTransferTypeID(rs.getInt("transferTypeID"));
            p.setTransferTypeName(rs.getString("transferTypeName"));
            result.add(p);
        }
        closeConnection();
        return result;
    }
    
    public ArrayList<TransferType> searchTransferType(String condition) throws ClassNotFoundException, SQLException{
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from project " + condition);        
        ArrayList<TransferType> result = new ArrayList<TransferType>();
        while(rs.next()){
            TransferType p = new TransferType();
            p.setTransferTypeID(rs.getInt("transferTypeID"));
            p.setTransferTypeName(rs.getString("transferTypeName"));
            result.add(p);
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
    
}
