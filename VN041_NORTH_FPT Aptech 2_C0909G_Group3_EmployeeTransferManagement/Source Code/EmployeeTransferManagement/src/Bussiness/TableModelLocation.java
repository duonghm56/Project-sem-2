/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Entity.Location;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cuongdm
 */
public class TableModelLocation extends AbstractTableModel {

    private static List<Location> list = new ArrayList<Location>();

    public static void addLocation(Location objLocation) {
        list.add(objLocation);
    }

    public void removeRow(int row) {
        list.remove(row);
        this.fireTableDataChanged();
    }

    public void dataChanged() {
        list.clear();
        this.fireTableDataChanged();
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Location ID";
            case 1:
                return "Location Address";
        }
        return null;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > list.size()) {
            return null;
        }
        Location objLocation = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objLocation.getLocationID();
            case 1:
                return objLocation.getLocationAddress();
            default:
                return null;
        }
    }

  
}
