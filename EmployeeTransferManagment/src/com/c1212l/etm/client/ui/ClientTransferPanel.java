/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.client.ui;

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
 * @author OLDPC
 */
public class ClientTransferPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientTransferPanel
     */
    public ClientTransferPanel() {
        initComponents();
        try {
            employee = employeeBUS.getAllEmployees().get(0);
            loadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientTransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientTransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        cmbToLocation = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmbToDepartment = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTransferLetter = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbFromDepartment = new javax.swing.JComboBox();
        cmbTransferType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmployeeNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        cmbToProject = new javax.swing.JComboBox();
        cmbFromProject = new javax.swing.JComboBox();
        cmbFromLocation = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Reason");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        cmbToLocation.setEnabled(false);
        cmbToLocation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbToLocationItemStateChanged(evt);
            }
        });
        add(cmbToLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 220, 30));

        jLabel6.setText("To Location");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        cmbToDepartment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbToDepartmentItemStateChanged(evt);
            }
        });
        add(cmbToDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 220, 30));

        txtTransferLetter.setColumns(20);
        txtTransferLetter.setRows(5);
        jScrollPane2.setViewportView(txtTransferLetter);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 390, 470));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Transfer Letter");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 120, 30));

        jLabel8.setText("From Department");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel4.setText("To Department");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel5.setText("From Location");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNameKeyReleased(evt);
            }
        });
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Transfer Request");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        cmbFromDepartment.setEnabled(false);
        add(cmbFromDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 220, 30));

        cmbTransferType.setEnabled(false);
        add(cmbTransferType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 30));

        jLabel3.setText("To Project");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel2.setText("From Project");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel1.setText("Employee Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtReason.setColumns(20);
        txtReason.setRows(5);
        jScrollPane1.setViewportView(txtReason);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 220, 87));

        btnSend.setText("Send Request");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, 40));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 90, 40));

        jLabel11.setText("Transfer Type:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtEmployeeNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNumberKeyReleased(evt);
            }
        });
        add(txtEmployeeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 220, 28));

        jLabel13.setText("Employee Number");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btnGenerate.setText("Generate");
        add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 80, 40));

        cmbToProject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbToProjectItemStateChanged(evt);
            }
        });
        add(cmbToProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 220, 30));

        cmbFromProject.setEnabled(false);
        add(cmbFromProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, 30));

        cmbFromLocation.setEnabled(false);
        add(cmbFromLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyReleased
    }//GEN-LAST:event_txtEmployeeNameKeyReleased

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
            if (transferTypeID == -1) {
                throw new Exception("You didn't choose to transfer");
            } else {
                transferBUS.addTransfer(employeeID, transferTypeID, reason, fromProjectID, toProjectID, fromDepartmentID, toDepartmentID, fromLocationID, toLocationID);
                JOptionPane.showMessageDialog(null, "Your request has been sent", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtEmployeeNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNumberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNumberKeyReleased

    private void cmbToProjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbToProjectItemStateChanged
        updateCmbTransferType();
    }//GEN-LAST:event_cmbToProjectItemStateChanged

    private void cmbToDepartmentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbToDepartmentItemStateChanged
        updateCmbTransferType();
        updateCmbLocationByCmbDepartment();
    }//GEN-LAST:event_cmbToDepartmentItemStateChanged

    private void cmbToLocationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbToLocationItemStateChanged
        updateCmbTransferType();
    }//GEN-LAST:event_cmbToLocationItemStateChanged
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEmployeeNumber;
    private javax.swing.JTextArea txtReason;
    private javax.swing.JTextArea txtTransferLetter;
    // End of variables declaration//GEN-END:variables
    Employee employee;
    EmployeeBUS employeeBUS = new EmployeeBUS();

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
        DepartmentDAO departmentDAO = new DepartmentDAO();
        cmbFromProject.setSelectedItem(
                new KeyValue(employee.getDepartnameID(),
                departmentDAO.getDepartmentByID(employee.getDepartnameID()).getDepartmentName()));
    }

    private void initCmbToDepartment() throws ClassNotFoundException, SQLException {
        initCmbDepartment(cmbToDepartment);
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
        DepartmentDAO departmentDAO = new DepartmentDAO();
        Department department = departmentDAO.getDepartmentByID(employee.getDepartnameID());
        LocationDAO locationDAO = new LocationDAO();
        Location location = locationDAO.getLocationById(department.getLocationID());
        cmbFromProject.setSelectedItem(
                new KeyValue(location.getLocationID(), location.getLocationName()));
    }

    private void initCmbToLocation() throws ClassNotFoundException, SQLException {
        initCmbLocation(cmbToLocation);
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
        //System.out.println("Check field : " + checkFieldAndReturnTransferType());
        cmbTransferType.setSelectedItem(new KeyValue(0, checkFieldAndReturnTransferType()));
    }

    private void updateCmbLocationByCmbDepartment(){
        if(cmbToDepartment.getSelectedItem() != null){
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
            loadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientTransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientTransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
