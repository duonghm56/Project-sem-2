/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;
import com.c1212l.etm.dal.TransferTypeDAO;
import com.c1212l.etm.dto.TransferType;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class TransferTypeBUS {
        TransferTypeDAO transferTypeDAO;

    public TransferTypeBUS() {
        transferTypeDAO = new TransferTypeDAO();
    }

      public ArrayList<TransferType> getAllTransferType() throws ClassNotFoundException, SQLException {
        return transferTypeDAO.getAllTransferType();
    }
    
     public ArrayList<TransferType> searchTransferType(String transferTypeName) throws ClassNotFoundException, SQLException {
        return transferTypeDAO.searchTransferTypeName(transferTypeName);
    }

    public void addTransferType(String transferTypeName)throws ClassNotFoundException, SQLException
    {
        TransferType transferType = new TransferType();
//        bean.setLocationID(locationID);
        transferType.setTransferTypeName(transferTypeName);
         transferTypeDAO.addTransferType(transferType);
    }
        public void updateTransferType(int transferTypeID,String transferTypeName)throws ClassNotFoundException, SQLException
        {
        TransferType transferType = new TransferType();
        transferType.setTransferTypeID(transferTypeID);
        transferType.setTransferTypeName(transferTypeName);
        transferTypeDAO.updateTransferType(transferType);
    }
    public void deleteTransferType(int transferTypeID)throws ClassNotFoundException, SQLException
    {
        TransferType transferType = new TransferType();
        transferType.setTransferTypeID(transferTypeID);
        transferTypeDAO.deleteTransferType(transferType);
    }
}
