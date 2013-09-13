/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Entity.Project;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author KhangDV
 */
public class TableModelProject extends AbstractTableModel {

    private static List<Project> list = new ArrayList<Project>();

    public static void addProject(Project objPro) {
        list.add(objPro);
    }
     public void dataChanged() {
        list.clear();
        this.fireTableDataChanged();
    }


    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public void removeRow(int row) {
        list.remove(row);
        this.fireTableDataChanged();
    }

    public void loadDataChanged() {
        list.clear();
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {

            case 0:
                return "ProjectID";
            case 1:
                return "ProjectName";
            case 2:
                return "CreateDateProject";
            case 3:
                return "EndDateProject";
        }
        return null;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > list.size()) {
            return null;
        }
        Project objPro = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objPro.getProjectID();
            case 1:
                return objPro.getProjectName();
            case 2:
                return objPro.getCreateDateProject();
            case 3:
                return objPro.getEndDateProject();
            default:
                return null;
        }
    }


}
