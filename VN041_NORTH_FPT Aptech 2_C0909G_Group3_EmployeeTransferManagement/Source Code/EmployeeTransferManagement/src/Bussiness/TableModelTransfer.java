/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Entity.Transfer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thanhnx
 */
public class TableModelTransfer extends AbstractTableModel {

    private static List<Transfer> list = new ArrayList<Transfer>();

    public static void addTransfer(Transfer objTransfer) {
        list.add(objTransfer);
    }

    public void dataChanged() {
        list.clear();
        this.fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        list.remove(rowIndex);
        this.fireTableDataChanged();
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 14;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TransferID";
            case 1:
                return "TransferTypeID";
            case 2:
                return "EmployeeID";
            case 3:
                return "FromLocationID";
            case 4:
                return "FromDepartmentID";
            case 5:
                return "FromProjectID";
            case 6:
                return "ToLocation";
            case 7:
                return "ToDepartment";
            case 8:
                return "ToProject";
            case 9:
                return "RequestDate";
            case 10:
                return "RelievingDate";
            case 11:
                return "JoiningDate";
            case 12:
                return "Approve";
            case 13:
                return "ApproveDate";
            default:
                return null;



        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > list.size()) {
            return null;
        }
        Transfer objTransfer = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objTransfer.getTransferID();
            case 1:
                return objTransfer.getTransferTypeID();
            case 2:
                return objTransfer.getEmployeeID();
            case 3:
                return objTransfer.getFromLocationID();
            case 4:
                return objTransfer.getFromDepartmentID();
            case 5:
                return objTransfer.getFromProjectID();
            case 6:
                return objTransfer.getToLocationID();
            case 7:
                return objTransfer.getToLocationID();
            case 8:
                return objTransfer.getToProjectID();
            case 9:
                return objTransfer.getRequestDate();
            case 10:
                return objTransfer.getTransferRelievingDate();
            case 11:
                return objTransfer.getTransferJoiningDate();
            case 12:
                return objTransfer.getApprove();
            case 13:
                return objTransfer.getApproveDate();
            default:
                return null;
        }
    }
}
