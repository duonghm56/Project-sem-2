/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Entity.Department;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cuongdm
 */
public class TableModelDepartmentOfLocation extends AbstractTableModel {

    public static List<Department> list = new ArrayList<Department>();

    public static void addDepartment(Department objDepartment) {
        list.add(objDepartment);
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public void removeDepartment(int rowIndex) {
        list.remove(rowIndex);
        this.fireTableDataChanged();
    }

    public void upddateDepartment() {
        this.fireTableDataChanged();
    }

    public void dataChanged() {
        list.clear();
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Department ID";
            case 1:
                return "Department Name";
        }
        return null;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > list.size()) {
            return null;
        }
        Department objDepartment = (Department) list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objDepartment.getDepartmentID();
            case 1:
                return objDepartment.getDepartmentName();
            default:
                return null;
        }
    }
}
