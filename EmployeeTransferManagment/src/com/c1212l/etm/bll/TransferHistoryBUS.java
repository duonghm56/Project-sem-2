/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.bll;

import com.c1212l.etm.dal.TransferHistoryDAO;
import com.c1212l.etm.dto.Transfer;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class TransferHistoryBUS {
    TransferHistoryDAO transferHistoryDAO;

    public TransferHistoryBUS() {
        transferHistoryDAO = new TransferHistoryDAO();
    }

    public ArrayList<Transfer> getTransferHistory() throws ClassNotFoundException, SQLException {
        return transferHistoryDAO.getTransferHistory();
    }
}
