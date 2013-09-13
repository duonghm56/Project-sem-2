/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thanhnx
 */
public class TableModelEmployee extends AbstractTableModel {

    private static List<Employee> list = new ArrayList<Employee>();
//    private int employeeID;

    public static void addEmployee(Employee objEmpl) {
        list.add(objEmpl);
    }

//    public int ID() {
//        return employeeID;
//    }
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
        return 13;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Number";
            case 2:
                return "Name";
            case 3:
                return "Email";
            case 4:
                return "Role";
            case 5:
                return "WorkExprience";
            case 6:
                return "Address";
            case 7:
                return "BirthDay";
            case 8:
                return "Gender";
            case 9:
                return "Allowance";
            case 10:
                return "LocationID";
            case 11:
                return "DepartmentID";
            case 12:
                return "ProjectID";
            default:
                return null;
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex > list.size()) {
            return null;
        }
        Employee objEmpl = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return objEmpl.getEmployeeID();
            case 1:
                return objEmpl.getEmployeeNumber();
            case 2:
                return objEmpl.getEmployeeName();
            case 3:
                return objEmpl.getEmail();
            case 4:
                return objEmpl.getEmployeeRole();
            case 5:
                return objEmpl.getWorkExperience();
            case 6:
                return objEmpl.getAddress();
            case 7:
                return objEmpl.getBirthday();
            case 8:
                if (objEmpl.getGender() == 1) {
                    return "Male";
                } else if (objEmpl.getGender() == 2) {
                    return "Female";
                } else {
                    return null;
                }
            case 9:
                return objEmpl.getAllowance();
            case 10:
                return objEmpl.getLocationID();
            case 11:
                return objEmpl.getDepartmentID();
            case 12:
                return objEmpl.getProjectID();
            default:
                return null;
        }
    }
}
