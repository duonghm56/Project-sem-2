/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.client.ui_new;

import com.c1212l.etm.bll.DepartmentBUS;
import com.c1212l.etm.bll.EmployeeBUS;
import com.c1212l.etm.bll.LocationBUS;
import com.c1212l.etm.bll.ProjectBUS;
import com.c1212l.etm.bll.TransferBUS;
import com.c1212l.etm.bll.TransferTypeBUS;
import com.c1212l.etm.dal.DepartmentDAO;
import com.c1212l.etm.dal.LocationDAO;
import com.c1212l.etm.dal.ProjectDAO;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dto.TransferType;
import com.c1212l.etm.util.KeyValue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Luu Bi
 */
public class TransferRequest extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public TransferRequest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtEmployeeNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTransferLetter = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbTransferType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbFromProject = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbToProject = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbFromDepartment = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbToDepartment = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbFromLocation = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmbToLocation = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Transfer Request"));

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSend.setText("Send Request");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Information"));

        txtEmployeeNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNumberKeyReleased(evt);
            }
        });

        jLabel13.setText("Employee Number");

        txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNameKeyReleased(evt);
            }
        });

        jLabel1.setText("Employee Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Letter"));

        txtTransferLetter.setColumns(20);
        txtTransferLetter.setRows(5);
        jScrollPane2.setViewportView(txtTransferLetter);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Transfer Information"));

        jLabel11.setText("Transfer Type");

        cmbTransferType.setEnabled(false);

        jLabel2.setText("From Project");

        cmbFromProject.setEnabled(false);

        jLabel3.setText("To Project");

        cmbToProject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbToProjectItemStateChanged(evt);
            }
        });

        jLabel8.setText("From Department");

        cmbFromDepartment.setEnabled(false);
        cmbFromDepartment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFromDepartmentItemStateChanged(evt);
            }
        });

        jLabel4.setText("To Department");

        cmbToDepartment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbToDepartmentItemStateChanged(evt);
            }
        });

        jLabel5.setText("From Location");

        cmbFromLocation.setEnabled(false);

        jLabel6.setText("To Location");

        cmbToLocation.setEnabled(false);
        cmbToLocation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbToLocationItemStateChanged(evt);
            }
        });

        jLabel7.setText("Reason");

        txtReason.setColumns(20);
        txtReason.setRows(5);
        jScrollPane1.setViewportView(txtReason);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addComponent(cmbTransferType, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cmbFromProject, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbFromDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbFromLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbToProject, javax.swing.GroupLayout.Alignment.TRAILING, 0, 194, Short.MAX_VALUE)
                                    .addComponent(cmbToDepartment, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbToLocation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbTransferType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbFromProject, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbToProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbFromDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbToDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbFromLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cmbToLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerate)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSend))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbToLocationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbToLocationItemStateChanged
        updateCmbTransferType();
    }//GEN-LAST:event_cmbToLocationItemStateChanged

    private void cmbToDepartmentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbToDepartmentItemStateChanged
        updateCmbTransferType();
        updateCmbLocationByCmbDepartment();
    }//GEN-LAST:event_cmbToDepartmentItemStateChanged

    private void txtEmployeeNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyReleased
    }//GEN-LAST:event_txtEmployeeNameKeyReleased

    private void cmbFromDepartmentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFromDepartmentItemStateChanged
    }//GEN-LAST:event_cmbFromDepartmentItemStateChanged

    private void txtEmployeeNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNumberKeyReleased
       
    }//GEN-LAST:event_txtEmployeeNumberKeyReleased

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        ProjectDAO projectDAO = new ProjectDAO();
        DepartmentDAO departmentDAO = new DepartmentDAO();
        LocationDAO locationDAO = new LocationDAO();

        String content = "";
        content += "Dear Manager, \n\n";
        content += "My name is " + employee.getEmployeeName()+".\n";
        content += "My employee number is " + employee.getEmployeeNumber() + "\n";
        content += "Now, I work at: \n";
        Department fromDept = departmentDAO.getDepartmentByID(employee.getDepartnameID());
        content += " - Department: " + fromDept.getDepartmentName() + " in " + locationDAO.getLocationById(fromDept.getLocationID()).getLocationName() + "\n";
        content += " - Project: " + projectDAO.getProjectById(employee.getProjectID()).getProjectName() + "\n\n";

        switch (checkFieldAndReturnTransferType()) {
            case "Project Transfer":
                content += "I would like to transfer from " + ((KeyValue) cmbFromProject.getSelectedItem()).getValue()
                        + " to " + ((KeyValue) cmbToProject.getSelectedItem()).getValue() + "\n";
                break;
            case "Department Transfer":
                content += "I would like to transfer from " + ((KeyValue) cmbFromDepartment.getSelectedItem()).getValue()
                        + " to " + ((KeyValue) cmbToDepartment.getSelectedItem()).getValue() + "\n";
                break;
            case "Location Transfer":
                content += "I would like to transfer from " + ((KeyValue) cmbFromLocation.getSelectedItem()).getValue()
                        + " to " + ((KeyValue) cmbToLocation.getSelectedItem()).getValue() + "\n";
                break;
            case "Custom Transfer":
                content += "I would like to transfer: \n";
                content += " - From " + ((KeyValue) cmbFromProject.getSelectedItem()).getValue()
                        + " to " + ((KeyValue) cmbToProject.getSelectedItem()).getValue() + "\n";
                content += " - From " + ((KeyValue) cmbFromDepartment.getSelectedItem()).getValue()
                        + " to " + ((KeyValue) cmbToDepartment.getSelectedItem()).getValue() + "\n";
                content += " - From " + ((KeyValue) cmbFromLocation.getSelectedItem()).getValue()
                        + " to " + ((KeyValue) cmbToLocation.getSelectedItem()).getValue() + "\n";
                break;
        }
        content += "\nMy reason is: " + txtReason.getText() + "\n\n";
        content += "I hope this transfer will be accepted soon\n\n";

        content += "Your faithfully,\n";
        content += employee.getEmployeeName() + ".";
        txtTransferLetter.setText(content);
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void cmbToProjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbToProjectItemStateChanged
        updateCmbTransferType();
    }//GEN-LAST:event_cmbToProjectItemStateChanged

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            loadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            TransferBUS transferBUS = new TransferBUS();
            int employeeID = employee.getEmployeeID();
            int transferTypeID = ((KeyValue) cmbTransferType.getSelectedItem()).getKey();
            String reason = txtReason.getText();
            int fromProjectID = ((KeyValue) cmbFromProject.getSelectedItem()).getKey();
            int toProjectID = ((KeyValue) cmbToProject.getSelectedItem()).getKey();
            int fromDepartmentID = ((KeyValue) cmbFromDepartment.getSelectedItem()).getKey();
            int toDepartmentID = ((KeyValue) cmbToDepartment.getSelectedItem()).getKey();
            int fromLocationID = ((KeyValue) cmbFromLocation.getSelectedItem()).getKey();
            int toLocationID = ((KeyValue) cmbToLocation.getSelectedItem()).getKey();
            String letter = txtTransferLetter.getText();
            if (transferTypeID == -1) {
                throw new Exception("You didn't choose to transfer");
            } else {
                transferBUS.addTransfer(employeeID, transferTypeID, reason, fromProjectID, toProjectID, fromDepartmentID, toDepartmentID, fromLocationID, toLocationID, letter);
                JOptionPane.showMessageDialog(null, "Your request has been sent", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSendActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox cmbFromDepartment;
    private javax.swing.JComboBox cmbFromLocation;
    private javax.swing.JComboBox cmbFromProject;
    private javax.swing.JComboBox cmbToDepartment;
    private javax.swing.JComboBox cmbToLocation;
    private javax.swing.JComboBox cmbToProject;
    private javax.swing.JComboBox cmbTransferType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEmployeeNumber;
    private javax.swing.JTextArea txtReason;
    private javax.swing.JTextArea txtTransferLetter;
    // End of variables declaration//GEN-END:variables
    Employee employee;
    EmployeeBUS employeeBUS = new EmployeeBUS();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        try {
            this.employee = employee;
            loadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initCmbProject(JComboBox cmb) throws ClassNotFoundException, SQLException {
        cmb.removeAllItems();
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arr = projectBUS.getAllProject();
        for (Project p : arr) {
            cmb.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
    }

    private void initCmbFromProject() throws ClassNotFoundException, SQLException {
        initCmbProject(cmbFromProject);
        ProjectDAO projectDAO = new ProjectDAO();
        cmbFromProject.setSelectedItem(
                new KeyValue(employee.getProjectID(),
                projectDAO.getProjectById(employee.getProjectID()).getProjectName()));
    }

    private void initCmbToProject() throws ClassNotFoundException, SQLException {
        initCmbProject(cmbToProject);
        ProjectDAO projectDAO = new ProjectDAO();
        cmbToProject.setSelectedItem(
                new KeyValue(employee.getProjectID(),
                projectDAO.getProjectById(employee.getProjectID()).getProjectName()));
    }

    private void initCmbDepartment(JComboBox cmb) throws ClassNotFoundException, SQLException {
        cmb.removeAllItems();
        DepartmentBUS departmentBUS = new DepartmentBUS();
        ArrayList<Department> arr = departmentBUS.getAllDepartment();
        LocationDAO locationDAO = new LocationDAO();
        for (Department d : arr) {
            Location l = locationDAO.getLocationById(d.getLocationID());
            cmb.addItem(
                    new KeyValue(
                    d.getDepartmentID(),
                    d.getDepartmentName() + " - " + l.getLocationName()));
        }
    }

    private void initCmbFromDepartment() throws ClassNotFoundException, SQLException {
        initCmbDepartment(cmbFromDepartment);
        cmbFromDepartment.setSelectedItem(
                new KeyValue(employee.getDepartnameID(), employee.getEmployeeDepartment()));
    }

    private void initCmbToDepartment() throws ClassNotFoundException, SQLException {
        initCmbDepartment(cmbToDepartment);
        cmbToDepartment.setSelectedItem(
                new KeyValue(employee.getDepartnameID(), employee.getEmployeeDepartment()));
    }

    private void initCmbLocation(JComboBox cmb) throws ClassNotFoundException, SQLException {
        cmb.removeAllItems();
        LocationBUS locationBUS = new LocationBUS();
        ArrayList<Location> arr = locationBUS.getAllLocation();
        for (Location l : arr) {
            cmb.addItem(new KeyValue(l.getLocationID(), l.getLocationName()));
        }
    }

    private void initCmbFromLocation() throws ClassNotFoundException, SQLException {
        initCmbLocation(cmbFromLocation);
        /*DepartmentDAO departmentDAO = new DepartmentDAO();
         Department department = departmentDAO.getDepartmentByID(employee.getDepartnameID());
         LocationDAO locationDAO = new LocationDAO();
         Location location = locationDAO.getLocationById(department.getLocationID());        
         cmbFromLocation.setSelectedItem(
         new KeyValue(location.getLocationID(), location.getLocationName()));*/
        cmbFromLocation.setSelectedItem(
                new KeyValue(0, employee.getEmployeeLocation()));
    }

    private void initCmbToLocation() throws ClassNotFoundException, SQLException {
        initCmbLocation(cmbToLocation);
        /*DepartmentDAO departmentDAO = new DepartmentDAO();
         Department department = departmentDAO.getDepartmentByID(employee.getDepartnameID());
         LocationDAO locationDAO = new LocationDAO();
         Location location = locationDAO.getLocationById(department.getLocationID());
         System.out.println(location.getLocationID() + ": " + location.getLocationName());
         cmbToLocation.setSelectedItem(
         new KeyValue(location.getLocationID(), location.getLocationName()));
         */
        cmbToLocation.setSelectedItem(
                new KeyValue(0, employee.getEmployeeLocation()));
    }

    private void loadData() throws ClassNotFoundException, SQLException {
        txtEmployeeNumber.setText(employee.getEmployeeNumber());
        txtEmployeeName.setText(employee.getEmployeeName());

        initCmbTransferType();

        initCmbFromProject();
        initCmbToProject();

        initCmbFromDepartment();
        initCmbToDepartment();

        initCmbFromLocation();
        initCmbToLocation();


    }

    private void initCmbTransferType() throws ClassNotFoundException, SQLException {
        cmbTransferType.removeAllItems();
        cmbTransferType.addItem(new KeyValue(-1, ""));
        TransferTypeBUS transferTypeBUS = new TransferTypeBUS();
        ArrayList<TransferType> arrTransferType = transferTypeBUS.getAllTransferType();
        for (TransferType transferType : arrTransferType) {
            cmbTransferType.addItem(new KeyValue(transferType.getTransferTypeID(), transferType.getTransferTypeName()));
        }
    }

    private String checkFieldAndReturnTransferType() {
        try {
            int fromProjectID = ((KeyValue) cmbFromProject.getSelectedItem()).getKey();
            int toProjectID = ((KeyValue) cmbToProject.getSelectedItem()).getKey();
            int fromDepartmentID = ((KeyValue) cmbFromDepartment.getSelectedItem()).getKey();
            int toDepartmentID = ((KeyValue) cmbToDepartment.getSelectedItem()).getKey();
            int fromLocationID = ((KeyValue) cmbFromLocation.getSelectedItem()).getKey();
            int toLocationID = ((KeyValue) cmbToLocation.getSelectedItem()).getKey();

            int[] check = {0, 0, 0};

            if (fromProjectID != toProjectID) {
                check[0] = 1;
            }
            if (fromDepartmentID != toDepartmentID) {
                check[1] = 1;
            }
            if (fromLocationID != toLocationID) {
                check[2] = 1;
            }

            int sum = 0;
            for (int i = 0; i < check.length; i++) {
                sum += check[i];
            }

            if (sum == 0) {
                //Error: No transfer ?
                return "";
            } else if (sum == 1) {
                //Transfer only one
                if (check[0] == 1) {
                    //Project
                    return "Project Transfer";
                }
                if (check[1] == 1) {
                    //Department
                    return "Department Transfer";
                }
                if (check[2] == 1) {
                    //Location
                    return "Location Transfer";
                }
                //Unexpected Error
                return "";
            } else {
                //Custom transfer
                return "Custom Transfer";
            }
        } catch (Exception ex) {
            return "";
        }
    }

    private void updateCmbTransferType() {        
        cmbTransferType.setSelectedItem(new KeyValue(0, checkFieldAndReturnTransferType()));
    }

    private void updateCmbLocationByCmbDepartment() {
        if (cmbToDepartment.getSelectedItem() != null) {
            int toDepartmentID = ((KeyValue) cmbToDepartment.getSelectedItem()).getKey();
            DepartmentDAO departmentDAO = new DepartmentDAO();
            Department department = departmentDAO.getDepartmentByID(toDepartmentID);
            LocationDAO locationDAO = new LocationDAO();
            Location location = locationDAO.getLocationById(department.getLocationID());
            cmbToLocation.setSelectedItem(new KeyValue(location.getLocationID(), location.getLocationName()));
        }
    }

    @Override
    public void validate() {
        try {
            super.validate();
            if (employee != null) {
                loadData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferRequest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
