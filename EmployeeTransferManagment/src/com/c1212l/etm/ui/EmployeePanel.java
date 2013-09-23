/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.bll.DepartmentBUS;
import com.c1212l.etm.bll.EmployeeBUS;
import com.c1212l.etm.bll.ProjectBUS;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.util.KeyValue;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

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
        jLabel5 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        dcBirthday = new com.toedter.calendar.JDateChooser();
        txtSalary = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Employees Manager"));

        txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNameKeyReleased(evt);
            }
        });

        jLabel11.setText("Project:");

        jLabel10.setText("Work Experience:");

        jLabel14.setText("Year");

        cmbProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel15.setText("Department");

        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jLabel1.setText("Employee Number:");

        jLabel8.setText("Employee ID:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee Name:");

        jLabel6.setText("Employee Role:");

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

        jLabel13.setText("Gender:");

        txtEmployeeID.setEditable(false);

        jLabel3.setText("Email:");

        jLabel5.setText("Confirm Password:");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel7.setText("Address:");

        jLabel9.setText("Salary:");

        jLabel12.setText("Birthday:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel16.setText("USD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmployeeRole, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtWorkExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbProject, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(27, 27, 27)
                                .addComponent(btnDelete)
                                .addGap(35, 35, 35)
                                .addComponent(btnReset)))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmployeeRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(dcBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel9)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            convertDate();
            if (txtEmployeeID.getText().equals("")) {
                throw new Exception("Please select Employee");
            }
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
            int gender = ((KeyValue) cmbGender.getSelectedItem()).getKey();
            employeeBUS.updateEmployee(
                    txtEmployeeNumber.getText(),
                    txtEmployeeName.getText(),
                    txtEmail.getText(),
                    Float.parseFloat(txtSalary.getText()),
                    birthday,
                    txtAddress.getText(),
                    new String(txtPassword.getPassword()),
                    new String(txtConfirmPassword.getPassword()),
                    txtEmployeeRole.getText(),
                    Integer.parseInt(txtWorkExperience.getText()),
                    gender==1?true:false
                    );
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            convertDate();
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
            employeeBUS.addEmployee(
                    txtEmployeeNumber.getText(),
                    txtEmployeeName.getText(),
                    txtEmail.getText(),
                    Float.parseFloat(txtSalary.getText()),
                    birthday,
                    txtAddress.getText(),
                    new String(txtPassword.getPassword()),
                    new String(txtConfirmPassword.getPassword()),
                    txtEmployeeRole.getText(),
                    Integer.parseInt(txtWorkExperience.getText()),
                    ((KeyValue) cmbGender.getSelectedItem()).getKey() == 1 ? true : false,
                    ((KeyValue) cmbDepartment.getSelectedItem()).getKey(),
                    ((KeyValue) cmbProject.getSelectedItem()).getKey());
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblEmployeeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseReleased
        updateFieldWhenSelectEmployee();
    }//GEN-LAST:event_tblEmployeeMouseReleased

    private void tblEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmployeeKeyPressed
        
    }//GEN-LAST:event_tblEmployeeKeyPressed

    private void tblEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmployeeKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
            updateFieldWhenSelectEmployee();
        }
    }//GEN-LAST:event_tblEmployeeKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtEmployeeNumber.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select employee");
        }else{
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    employeeBUS.deleteEmployee(txtEmployeeNumber.getText());
                    reloadData();
                }
            } catch (Exception ex){
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
    private com.toedter.calendar.JDateChooser dcBirthday;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
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
        header.add("Confirm Password");
        header.add("Role");
        header.add("Experience");
        header.add("Gender");
        header.add("Project");
        header.add("Department");
        tblModel = new DefaultTableModel(header, 0);
        tblEmployee.setModel(tblModel);
        //TableColumn col = tblEmployee.getColumnModel().getColumn(3);
        //tblEmployee.getColumnModel().removeColumn(col);
        
        tblEmployee.getColumnModel().getColumn(3).setMaxWidth(0);
        tblEmployee.getColumnModel().getColumn(3).setMinWidth(0);
        tblEmployee.getColumnModel().getColumn(3).setPreferredWidth(0);
        tblEmployee.getColumnModel().getColumn(3).setResizable(false);
        tblEmployee.getColumnModel().getColumn(0).setMaxWidth(0);
        tblEmployee.getColumnModel().getColumn(0).setMinWidth(0);
        tblEmployee.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblEmployee.getColumnModel().getColumn(0).setResizable(false);
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
        cmbGender.addItem(new KeyValue(1, "Male"));
        cmbGender.addItem(new KeyValue(0, "Female"));
    }

    private void initCmbProject() throws ClassNotFoundException, SQLException {
        cmbProject.removeAllItems();
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arrProject = projectBUS.getAllProject();
        for (Project p : arrProject) {
            cmbProject.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
    }

    /*
     * Need Department DAL, BLL
     */
    private void initCmbDepartment() throws ClassNotFoundException, SQLException{
            cmbDepartment.removeAllItems();
            DepartmentBUS departmentBUS = new DepartmentBUS();
            ArrayList<Department> arrDepartment = departmentBUS.getAllDepartment();
            for (Department department : arrDepartment) {
                cmbDepartment.addItem(new KeyValue(department.getDepartmentID(), department.getDepartmentName()));
            }
    }
    private void convertDate()
    {
            int birthdayYear = dcBirthday.getDate().getYear()+1900;
            String tempBirthday = birthdayYear+"-"+dcBirthday.getDate().getMonth()+"-"+dcBirthday.getDate().getDate();
            birthday = Date.valueOf(tempBirthday);
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
        txtConfirmPassword.setText(tblEmployee.getValueAt(selectedRow, 8).toString());
        txtEmployeeRole.setText(tblEmployee.getValueAt(selectedRow, 9).toString());
        txtWorkExperience.setText(tblEmployee.getValueAt(selectedRow, 10).toString());
        cmbGender.setSelectedItem(new KeyValue(0, tblEmployee.getValueAt(selectedRow, 11).toString()));
        cmbProject.setSelectedItem(new KeyValue(0, tblEmployee.getValueAt(selectedRow,12).toString()));
        cmbDepartment.setSelectedItem(new KeyValue(0, tblEmployee.getValueAt(selectedRow,13).toString()));
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
}
