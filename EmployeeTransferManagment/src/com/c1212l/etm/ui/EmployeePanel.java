/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.bll.DepartmentBUS;
import com.c1212l.etm.bll.EmployeeBUS;
import com.c1212l.etm.bll.ProjectBUS;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.util.KeyValue;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luu Bi
 */
public class EmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeePanel
     */
    public EmployeePanel() {
        initComponents();
        reloadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmployeeNumber = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtWorkExperience = new javax.swing.JTextField();
        txtEmployeeRole = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        cmbProject = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtSalary = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Employees Manager"));
        setPreferredSize(new java.awt.Dimension(970, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtEmployeeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 190, -1));

        txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNameKeyReleased(evt);
            }
        });
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, -1));

        jLabel11.setText("Project:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jLabel10.setText("Work Experience:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));
        add(txtWorkExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 50, -1));
        add(txtEmployeeRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 180, -1));

        jLabel14.setText("Year");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 30, 20));

        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 100, -1));

        cmbProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        add(cmbProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 180, -1));

        jLabel15.setText("Department");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        add(cmbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 180, -1));

        jLabel1.setText("Employee Number");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel8.setText("Employee ID");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634415_gtk-refresh.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 90, 35));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 60, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634218_001_01.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 80, 35));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634772_001_05.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 85, 35));

        jLabel2.setText("Employee Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel6.setText("Employee Role:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseReleased(evt);
            }
        });
        tblEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblEmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEmployeeKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmployee);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 930, 170));

        jLabel13.setText("Gender:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtEmployeeID.setEditable(false);
        add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 190, -1));

        jLabel3.setText("Email");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 180, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 180, -1));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380633043_gtk-cancel.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 85, 35));

        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel9.setText("Salary:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        jLabel12.setText("Birthday:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, 80));
        add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 89, -1));

        jLabel16.setText("USD");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 30, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            convertDate();
            validateField();
            
            int gender = ((KeyValue) cmbGender.getSelectedItem()).getKey();
            int departmentID = ((KeyValue) cmbDepartment.getSelectedItem()).getKey();
            int projectID = ((KeyValue) cmbProject.getSelectedItem()).getKey();
            /*employeeBUS.updateEmployee(
                    txtEmployeeNumber.getText(),
                    txtEmployeeName.getText(),
                    txtEmail.getText(),
                    Float.parseFloat(txtSalary.getText()),
                    birthday,
                    txtAddress.getText(),
                    new String(txtPassword.getPassword()),
                    txtEmployeeRole.getText(),
                    Integer.parseInt(txtWorkExperience.getText()),
                    gender == 1 ? true : false,
                    departmentID,
                    projectID);
            reloadData();*/
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            convertDate();
            validateField();

            /*employeeBUS.addEmployee(
                    txtEmployeeNumber.getText(),
                    txtEmployeeName.getText(),
                    txtEmail.getText(),
                    Float.parseFloat(txtSalary.getText()),
                    birthday,
                    txtAddress.getText(),
                    new String(txtPassword.getPassword()),
                    txtEmployeeRole.getText(),
                    Integer.parseInt(txtWorkExperience.getText()),
                    ((KeyValue) cmbGender.getSelectedItem()).getKey() == 1 ? true : false,
                    ((KeyValue) cmbDepartment.getSelectedItem()).getKey(),
                    ((KeyValue) cmbProject.getSelectedItem()).getKey());
            reloadData();*/
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblEmployeeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseReleased
        updateFieldWhenSelectEmployee();
    }//GEN-LAST:event_tblEmployeeMouseReleased

    private void tblEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmployeeKeyPressed
    }//GEN-LAST:event_tblEmployeeKeyPressed

    private void tblEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmployeeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            updateFieldWhenSelectEmployee();
        }
    }//GEN-LAST:event_tblEmployeeKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtEmployeeNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select employee");
        } else {
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    employeeBUS.deleteEmployee(txtEmployeeNumber.getText());
                    reloadData();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEmployeeNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyReleased
        try {
            // TODO add your handling code here:
            loadSearchEmployeeName();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtEmployeeNameKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reloadData();
    }//GEN-LAST:event_btnResetActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbDepartment;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEmployeeNumber;
    private javax.swing.JTextField txtEmployeeRole;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtWorkExperience;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Employee> lstEmpl;
    EmployeeBUS employeeBUS = new EmployeeBUS();
    private Date birthday;

    private void initTable() {
        Vector header = new Vector();
        header.add("ID");
        header.add("Number");
        header.add("Name");
        header.add("Email");
        header.add("Salary");
        header.add("Birthday");
        header.add("Address");
        header.add("Password");        
        header.add("Role");
        header.add("Experience");
        header.add("Gender");
        header.add("Project");
        header.add("Department");
        tblModel = new DefaultTableModel(header, 0);
        tblEmployee.setModel(tblModel);
        //TableColumn col = tblEmployee.getColumnModel().getColumn(3);
        //tblEmployee.getColumnModel().removeColumn(col);

        makeColumnInvisible(0);
        makeColumnInvisible(3);
        makeColumnInvisible(5);
        makeColumnInvisible(6);
        makeColumnInvisible(7);
        makeColumnInvisible(8);
    }

    private void makeColumnInvisible(int col) {
        tblEmployee.getColumnModel().getColumn(col).setMaxWidth(0);
        tblEmployee.getColumnModel().getColumn(col).setMinWidth(0);
        tblEmployee.getColumnModel().getColumn(col).setPreferredWidth(0);
        tblEmployee.getColumnModel().getColumn(col).setResizable(false);
    }

    private void fillData(ArrayList<Employee> lst) {
        if (lst != null) {
            for (Employee e : lst) {
                tblModel.addRow(e.getVector());
            }
        }
    }

    private void initTextField() {
        txtEmployeeID.setText("");
        txtEmployeeNumber.setText("");
        txtEmployeeName.setText("");
        txtEmployeeRole.setText("");
        txtPassword.setText("");
        txtWorkExperience.setText("");
    }

    private void reloadData() {
        try {
            initTable();
            fillData(employeeBUS.getAllEmployees());
            initTextField();
            initCmbGender();
            initCmbProject();
            initCmbDepartment();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initCmbGender() {
        cmbGender.removeAllItems();
        cmbGender.addItem(new KeyValue(-1, ""));
        cmbGender.addItem(new KeyValue(1, "Male"));
        cmbGender.addItem(new KeyValue(0, "Female"));
    }

    private void initCmbProject() throws ClassNotFoundException, SQLException {
        cmbProject.removeAllItems();
        cmbProject.addItem(new KeyValue(-1, ""));
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arrProject = projectBUS.getAllProject();
        for (Project p : arrProject) {
            cmbProject.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
    }

    /*
     * Need Department DAL, BLL
     */
    private void initCmbDepartment() throws ClassNotFoundException, SQLException {
        cmbDepartment.removeAllItems();
        cmbDepartment.addItem(new KeyValue(-1, ""));
        DepartmentBUS departmentBUS = new DepartmentBUS();
        ArrayList<Department> arrDepartment = departmentBUS.getAllDepartment();
        for (Department department : arrDepartment) {
            Location location = new LocationDAO().getLocationById(department.getLocationID());
            cmbDepartment.addItem(new KeyValue(department.getDepartmentID(), department.getDepartmentName() + " - " + location.getLocationName()));
        }
    }

    private void convertDate() {
//        int birthdayYear = dcBirthday.getDate().getYear() + 1900;
//        String tempBirthday = birthdayYear + "-" + dcBirthday.getDate().getMonth() + "-" + dcBirthday.getDate().getDate();
//        birthday = Date.valueOf(tempBirthday);
    }

    private void updateFieldWhenSelectEmployee() {
        int selectedRow = tblEmployee.getSelectedRow();
        txtEmployeeID.setText(tblEmployee.getValueAt(selectedRow, 0).toString());
        txtEmployeeNumber.setText(tblEmployee.getValueAt(selectedRow, 1).toString());
        txtEmployeeName.setText(tblEmployee.getValueAt(selectedRow, 2).toString());
        txtEmail.setText(tblEmployee.getValueAt(selectedRow, 3).toString());
        txtSalary.setText(tblEmployee.getValueAt(selectedRow, 4).toString());
//        dcBirthday.setDate(tblEmployee.getValueAt(selectedRow, 5).toString());
        txtAddress.setText(tblEmployee.getValueAt(selectedRow, 6).toString());
        txtPassword.setText(tblEmployee.getValueAt(selectedRow, 7).toString());
        txtEmployeeRole.setText(tblEmployee.getValueAt(selectedRow, 8).toString());
        txtWorkExperience.setText(tblEmployee.getValueAt(selectedRow, 9).toString());
        cmbGender.setSelectedItem(new KeyValue(0, tblEmployee.getValueAt(selectedRow, 10).toString()));
        cmbProject.setSelectedItem(new KeyValue(0, tblEmployee.getValueAt(selectedRow, 11).toString()));
        cmbDepartment.setSelectedItem(new KeyValue(0, tblEmployee.getValueAt(selectedRow, 12).toString()));
    }

    private void loadSearchEmployeeName() throws ClassNotFoundException, SQLException {
        String employeeName = "";
        if (!txtEmployeeName.getText().equals("")) {
            if (!employeeName.contains("where")) {
                employeeName += " where employeeName like '%" + txtEmployeeName.getText() + "%'";
            } else {
                employeeName += " and employeeName like '%" + txtEmployeeName.getText() + "%'";
            }
        }
        initTable();
        lstEmpl = employeeBUS.searchEmployee(employeeName);
        fillData(lstEmpl);
    }

    @Override
    public void validate() {
        super.validate();
        reloadData();
    }

    private void validateField() throws Exception {
        if (txtEmployeeNumber.getText().equals("")) {
            throw new Exception("Please enter Employee Number");
        }
        if (txtEmployeeName.getText().equals("")) {
            throw new Exception("Please enter Employee Name");
        }
        if (txtEmployeeRole.getText().equals("")) {
            throw new Exception("Please enter Employee Role");
        }
        if (txtWorkExperience.getText().equals("")) {
            throw new Exception("Please enter Work Experience");
        }
        if (new String(txtPassword.getPassword()).equals("")){
            throw new Exception("Please enter Password");
        }
        KeyValue department = (KeyValue)cmbDepartment.getSelectedItem();
        if(department.getValue().equals("")){
            throw new Exception("Please select department");
        }
        
        KeyValue project = (KeyValue)cmbProject.getSelectedItem();
        if(project.getValue().equals("")){
            throw new Exception("Please select project");
        }
        
        KeyValue gender = (KeyValue)cmbGender.getSelectedItem();
        if(gender.getValue().equals("")){
            throw new Exception("Please select gender");
        }
                        

        Pattern ptEmplName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
        Matcher mcEmplName = ptEmplName.matcher(txtEmployeeName.getText());
        if (!mcEmplName.find()) {
            throw new Exception("Name is not valid");
        }

        Pattern ptEmplRole = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
        Matcher mcEmplRole = ptEmplRole.matcher(txtEmployeeRole.getText());
        if (!mcEmplRole.find()) {
            throw new Exception("Employee Role is not valid");
        }

        Pattern ptemail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,4}$");
        Matcher mcemail = ptemail.matcher(txtEmail.getText());
        if (!mcemail.find()) {
            throw new Exception("Email is not valid");
        }

        /*Pattern ptEmplNumber = Pattern.compile("^E+[\\d]{4}$");
         Matcher mcEmplNumber = ptEmplNumber.matcher(txtEmployeeNumber.getText());
         if (!mcEmplNumber.find()) {
         throw new Exception("Employee Number is not valid");
         }*/
        Pattern ptWorkExperience = Pattern.compile("^[\\d]{1,2}$");
        Matcher mcWorkExperience = ptWorkExperience.matcher(txtWorkExperience.getText());
        if (!mcWorkExperience.find()) {
            throw new Exception("Work Experience is not valid");
        }
        if (Integer.parseInt(txtWorkExperience.getText()) > 50) {
            throw new Exception("Work Experience ");
        }
    }
}
