/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.bll.DepartmentBUS;
import com.c1212l.etm.bll.EmployeeBUS;
import com.c1212l.etm.bll.LocationBUS;
import com.c1212l.etm.bll.ProjectBUS;
import com.c1212l.etm.bll.TransferBUS;
import com.c1212l.etm.bll.TransferTypeBUS;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dto.Transfer;
import com.c1212l.etm.dto.TransferType;
import com.c1212l.etm.util.KeyValue;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luu Bi
 */
public class TransferPanel extends javax.swing.JPanel {

    public TransferPanel() {
        try {
            initComponents();
            reloadData();
            initCmbTransferType();
            initCmbFromProject();
            initCmbToProject();
            initCmbFromDepartment();
            initCmbToDepartment();
            initCmbFromLocation();
            initCmbToLocation();
            initCmbApprove();
            convertDate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTransferID = new javax.swing.JTextField();
        dcTranJoinDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        cmbFromDepartment = new javax.swing.JComboBox();
        cmbToProject = new javax.swing.JComboBox();
        cmbToDepartment = new javax.swing.JComboBox();
        cmbTransferType = new javax.swing.JComboBox();
        cmbFromProject = new javax.swing.JComboBox();
        cmbFromLocation = new javax.swing.JComboBox();
        cmbToLocation = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTransferData = new javax.swing.JTable();
        cmbApprove = new javax.swing.JComboBox();
        txtEmployeeName = new javax.swing.JTextField();
        txtRequestDate = new javax.swing.JTextField();
        dcTranReDate = new com.toedter.calendar.JDateChooser();
        txtApproveDate = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtEmployeeNumber = new javax.swing.JTextField();

        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Transfer ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setText("Employee Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setText("Transfer Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 10));

        jLabel4.setText("Relieving Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel5.setText("Joining Date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel6.setText("Request Date");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel7.setText("Reason");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel8.setText("Approve");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel9.setText("Approve Date");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel10.setText("From Project");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel11.setText("To Project");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel12.setText("From Department");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel13.setText("To Department ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel14.setText("From Location");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel15.setText("To Location");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        txtTransferID.setEnabled(false);
        txtTransferID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferIDActionPerformed(evt);
            }
        });
        add(txtTransferID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 120, -1));
        add(dcTranJoinDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 220, 30));

        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        txtReason.setColumns(20);
        txtReason.setRows(5);
        txtReason.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtReason.setEnabled(false);
        jScrollPane1.setViewportView(txtReason);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 620, 80));

        add(cmbFromDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 220, -1));

        add(cmbToProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, -1));

        add(cmbToDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 220, -1));

        add(cmbTransferType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 200, 20));

        add(cmbFromProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 200, -1));

        add(cmbFromLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, -1));

        add(cmbToLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(300, 200));

        tbTransferData.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTransferData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTransferDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTransferData);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 888, 120));

        add(cmbApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 220, -1));

        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, 30));

        txtRequestDate.setEnabled(false);
        txtRequestDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequestDateActionPerformed(evt);
            }
        });
        add(txtRequestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 220, -1));
        add(dcTranReDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 220, 30));

        txtApproveDate.setEnabled(false);
        add(txtApproveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 220, 22));

        btnReset.setText("Reset");
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 70, -1));

        jLabel16.setText("Employee Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));
        add(txtEmployeeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tbTransferDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTransferDataMouseClicked
        updateFieldWhenSelectTransfer();
        /*
         int row = tbTransferData.rowAtPoint(evt.getPoint());
        
         txtTransferID.setText(tbTransferData.getValueAt(row, 0).toString());
         cmbTransferType.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 1).toString()));
         txtEmployeeName.setText(tbTransferData.getValueAt(row, 2).toString());
         //            dcTranJoinDate.setDate(transferJoiningDate);
         txtRequestDate.setText(tbTransferData.getValueAt(row, 5).toString());
         txtReason.setText(tbTransferData.getValueAt(row, 6).toString());
         cmbApprove.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 7).toString()));
         cmbFromProject.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 9).toString()));
         cmbToProject.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 10).toString()));
         cmbFromDepartment.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 11).toString()));
         cmbToDepartment.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 12).toString()));
         cmbFromLocation.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 13).toString()));
         cmbToLocation.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 14).toString()));
         */
    }//GEN-LAST:event_tbTransferDataMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (txtTransferID.getText().equals("")) {
                throw new Exception("Please select Transfer ID");
            }
            int transferID = Integer.parseInt(txtTransferID.getText());
            int transferTypeID = ((KeyValue) cmbTransferType.getSelectedItem()).getKey();
            Date requestDate = Date.valueOf(txtRequestDate.getText());
            String reason = txtReason.getText();
            Date approveDate = Date.valueOf(txtApproveDate.getText());
            int approve = ((KeyValue) cmbApprove.getSelectedItem()).getKey();
            int fromProjectID = ((KeyValue) cmbFromProject.getSelectedItem()).getKey();
            int toProjectID = ((KeyValue) cmbToProject.getSelectedItem()).getKey();
            int fromDepartmentID = ((KeyValue) cmbFromDepartment.getSelectedItem()).getKey();
            int toDepartmentID = ((KeyValue) cmbToDepartment.getSelectedItem()).getKey();
            int formLocationID = ((KeyValue) cmbFromLocation.getSelectedItem()).getKey();
            int toLocationID = ((KeyValue) cmbToLocation.getSelectedItem()).getKey();
            transferBUS.updateTransfer(transferID, transferTypeID, employeeID, tranReDate, tranJoinDate, requestDate, reason, true, approveDate, fromProjectID, toProjectID, fromDepartmentID, toDepartmentID, formLocationID, toLocationID);
            transferBUS.updateEmployeeTransfer(employeeID, toDepartmentID, toProjectID);
            JOptionPane.showMessageDialog(null, "Update success");
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtTransferID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select Transfer ID");
        } else {
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    transferBUS.deleteTransfer(Integer.parseInt(txtTransferID.getText()));
                    JOptionPane.showMessageDialog(null, "Delete success!");
                    reloadData();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtTransferIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransferIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransferIDActionPerformed

    private void txtRequestDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequestDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequestDateActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbApprove;
    private javax.swing.JComboBox cmbFromDepartment;
    private javax.swing.JComboBox cmbFromLocation;
    private javax.swing.JComboBox cmbFromProject;
    private javax.swing.JComboBox cmbToDepartment;
    private javax.swing.JComboBox cmbToLocation;
    private javax.swing.JComboBox cmbToProject;
    private javax.swing.JComboBox cmbTransferType;
    private com.toedter.calendar.JDateChooser dcTranJoinDate;
    private com.toedter.calendar.JDateChooser dcTranReDate;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbTransferData;
    private javax.swing.JTextField txtApproveDate;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEmployeeNumber;
    private javax.swing.JTextArea txtReason;
    private javax.swing.JTextField txtRequestDate;
    private javax.swing.JTextField txtTransferID;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Transfer> lstTransfer;
    TransferBUS transferBUS = new TransferBUS();
<<<<<<< HEAD
    private Date tranReDate,tranJoinDate;
    private int employeeID;
=======
    private Date tranReDate, tranJoinDate;

>>>>>>> 0fdbd88ed8b314ddecafbb22e6d332c8f933b230
    private void initTable() {
        Vector header = new Vector();
        //---Ko hien thi
        header.add("ID");
        header.add("Type");
        //------------------------------------
        header.add("Employee Number");
        header.add("Name");
        //---Ko hien thi
        header.add("Request Date");
        header.add("Relieving Date");
        header.add("Joining Date");
        header.add("Request Date");
        header.add("Reason");
        //------------------------------------
        header.add("Approve Date");
        header.add("From Project");
        header.add("To Project");
        header.add("From Department");
        header.add("To Department");
        header.add("From Location");
        header.add("To Location");
        header.add("Appove");
        tblModel = new DefaultTableModel(header, 0);
        tbTransferData.setModel(tblModel);

        makeInvisibleColumn(0);
        makeInvisibleColumn(1);
        makeInvisibleColumn(4);
        makeInvisibleColumn(5);
        makeInvisibleColumn(6);
        makeInvisibleColumn(7);

    }

    private void makeInvisibleColumn(int col) {
        tbTransferData.getColumnModel().getColumn(col).setMaxWidth(0);
        tbTransferData.getColumnModel().getColumn(col).setMinWidth(0);
        tbTransferData.getColumnModel().getColumn(col).setPreferredWidth(0);
        tbTransferData.getColumnModel().getColumn(col).setResizable(false);
    }

    private void fillData(ArrayList<Transfer> lst) {
        if (lst != null) {
            for (Transfer transfer : lst) {
                tblModel.addRow(transfer.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            fillData(transferBUS.getAllTransfer());
//            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransferPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void initCmbFromProject() throws ClassNotFoundException, SQLException {
        cmbFromProject.removeAllItems();
        cmbFromProject.addItem(new KeyValue(-1, ""));
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arrProject = projectBUS.getAllProject();
        for (Project p : arrProject) {
            cmbFromProject.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
    }

    private void initCmbToProject() throws ClassNotFoundException, SQLException {
        cmbToProject.removeAllItems();
        cmbToProject.addItem(new KeyValue(-1, ""));
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arrProject = projectBUS.getAllProject();
        for (Project p : arrProject) {
            cmbToProject.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
    }

    private void initCmbFromLocation() throws ClassNotFoundException, SQLException {
        cmbFromLocation.removeAllItems();
        cmbFromLocation.addItem(new KeyValue(-1, ""));
        LocationBUS locationBUS = new LocationBUS();
        ArrayList<Location> arrLocation = locationBUS.getAllLocation();
        for (Location location : arrLocation) {
            cmbFromLocation.addItem(new KeyValue(location.getLocationID(), location.getLocationName()));
        }
    }

    private void initCmbToLocation() throws ClassNotFoundException, SQLException {
        cmbToLocation.removeAllItems();
        cmbToLocation.addItem(new KeyValue(-1, ""));
        LocationBUS locationBUS = new LocationBUS();
        ArrayList<Location> arrLocation = locationBUS.getAllLocation();
        for (Location location : arrLocation) {
            cmbToLocation.addItem(new KeyValue(location.getLocationID(), location.getLocationName()));
        }
    }

    private void initCmbFromDepartment() throws ClassNotFoundException, SQLException {
        cmbFromDepartment.removeAllItems();
        cmbFromDepartment.addItem(new KeyValue(-1, ""));
        DepartmentBUS departmentBUS = new DepartmentBUS();
        ArrayList<Department> arrDepartment = departmentBUS.getAllDepartment();
        for (Department department : arrDepartment) {
            cmbFromDepartment.addItem(new KeyValue(department.getDepartmentID(), department.getDepartmentName()));
        }
    }

    private void initCmbToDepartment() throws ClassNotFoundException, SQLException {
        cmbToDepartment.removeAllItems();
        cmbToDepartment.addItem(new KeyValue(-1, ""));
        DepartmentBUS departmentBUS = new DepartmentBUS();
        ArrayList<Department> arrDepartment = departmentBUS.getAllDepartment();
        for (Department department : arrDepartment) {
            cmbToDepartment.addItem(new KeyValue(department.getDepartmentID(), department.getDepartmentName()));
        }
    }

    private void initCmbApprove() {
        cmbApprove.removeAllItems();
        cmbToDepartment.addItem(new KeyValue(-1, ""));
        cmbApprove.addItem(new KeyValue(1, "Approve"));
        cmbApprove.addItem(new KeyValue(0, "Disapprove"));
    }

    private void convertDate() {
        int tranReDateYear = dcTranReDate.getDate().getYear() + 1900;
        String temptranReDate = tranReDateYear + "-" + dcTranReDate.getDate().getMonth() + "-" + dcTranReDate.getDate().getDate();
        tranReDate = Date.valueOf(temptranReDate);

        int tranJoinDateYear = dcTranJoinDate.getDate().getYear() + 1900;
        String temptranJoinDate = tranJoinDateYear + "-" + dcTranJoinDate.getDate().getMonth() + "-" + dcTranJoinDate.getDate().getDate();
        tranJoinDate = Date.valueOf(temptranReDate);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        String string = dateFormat.format(date);
        txtApproveDate.setText(string);
    }

    private void loadSearchData() throws ClassNotFoundException, SQLException {
        String condition = "";

        if (!txtEmployeeNumber.getText().equals("")) {
            if (condition.contains("where")) {
                condition += " where employeeNumber like '%" + txtEmployeeNumber.getText() + "%'";
            } else {
                condition += " and employeeNumber like '%" + txtEmployeeNumber.getText() + "%'";
            }
        }

        if (!txtEmployeeName.getText().equals("")) {
            if (condition.contains("where")) {
                condition += " where employeeName like '%" + txtEmployeeName.getText() + "%'";
            } else {
                condition += " and employeeName like '%" + txtEmployeeName.getText() + "%'";
            }
        }

        KeyValue fromProject = (KeyValue) cmbFromProject.getSelectedItem();
        if (!fromProject.getValue().equals("")) {
            if (condition.contains("where")) {
                condition += " where fromProjectID = " + fromProject.getKey() + "";
            } else {
                condition += " and fromProjectID = " + fromProject.getKey() + "";
            }
        }

<<<<<<< HEAD
         private void getEmployeeID()throws ClassNotFoundException, SQLException
    {
        EmployeeBUS employeeBUS = new EmployeeBUS();
        ArrayList<Employee> arrEmployee = employeeBUS.getAllEmployees();
        for (Employee employee : arrEmployee) {
            if (employee.getEmployeeName().equals(txtEmployeeName.getText())) {
                employeeID = employee.getEmployeeID();
            }
        }
    }
        private void convertDate()
        {
            int tranReDateYear = dcTranReDate.getDate().getYear()+1900;
            String temptranReDate = tranReDateYear+"-"+dcTranReDate.getDate().getMonth()+"-"+dcTranReDate.getDate().getDate();
            tranReDate = Date.valueOf(temptranReDate);
            
            int tranJoinDateYear = dcTranJoinDate.getDate().getYear()+1900;
            String temptranJoinDate = tranJoinDateYear+"-"+dcTranJoinDate.getDate().getMonth()+"-"+dcTranJoinDate.getDate().getDate();
            tranJoinDate = Date.valueOf(temptranReDate);
            
            DateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
            java.util.Date date = new java.util.Date();
            String string = dateFormat.format(date);
            txtApproveDate.setText(string);
=======
        KeyValue toProject = (KeyValue) cmbToProject.getSelectedItem();
        if (!toProject.getValue().equals("")) {
            if (condition.contains("where")) {
                condition += " where toProjectID = " + toProject.getKey() + "";
            } else {
                condition += " and toProjectID = " + toProject.getKey() + "";
            }
        }

        KeyValue fromDepartment = (KeyValue) cmbFromDepartment.getSelectedItem();
        if (!fromDepartment.getValue().equals("")) {
            if (condition.contains("where")) {
                condition += " where fromDepartmentID = " + fromDepartment.getKey() + "";
            } else {
                condition += " and fromDepartmentID = " + fromDepartment.getKey() + "";
            }
        }

        KeyValue toDepartment = (KeyValue) cmbToDepartment.getSelectedItem();
        if (!toDepartment.getValue().equals("")) {
            if (condition.contains("where")) {
                condition += " where toDepartmentID = " + toDepartment.getKey() + "";
            } else {
                condition += " and toDepartmentID = " + toDepartment.getKey() + "";
            }
        }

        KeyValue fromLocation = (KeyValue) cmbFromLocation.getSelectedItem();
        if (!fromLocation.getValue().equals("")) {
            if (condition.contains("where")) {
                condition += " where fromLocationID = " + fromLocation.getKey() + "";
            } else {
                condition += " and fromLocationID = " + fromLocation.getKey() + "";
            }
>>>>>>> 0fdbd88ed8b314ddecafbb22e6d332c8f933b230
        }

        KeyValue toLocation = (KeyValue) cmbToLocation.getSelectedItem();
        if (!toLocation.getValue().equals("")) {
            if (condition.contains("where")) {
                condition += " where toLocationID = " + toLocation.getKey() + "";
            } else {
                condition += " and toLocationID = " + toLocation.getKey() + "";
            }
        }

        initTable();
        lstTransfer = transferBUS.searchTransfer(condition);
        fillData(lstTransfer);
    }

    private void updateFieldWhenSelectTransfer() {
        int row = tbTransferData.getSelectedRow();

        txtTransferID.setText(tbTransferData.getValueAt(row, 0).toString());
        cmbTransferType.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 1).toString()));
        txtEmployeeNumber.setText(tbTransferData.getValueAt(row, 2).toString());
        txtEmployeeName.setText(tbTransferData.getValueAt(row, 3).toString());                
        
        dcTranReDate.setDate(Date.valueOf(tbTransferData.getValueAt(row, 4).toString()));
        dcTranJoinDate.setDate(Date.valueOf(tbTransferData.getValueAt(row, 5).toString()));
        txtRequestDate.setText(tbTransferData.getValueAt(row, 6).toString());
        txtReason.setText(tbTransferData.getValueAt(row, 7).toString());       
        txtApproveDate.setText(tbTransferData.getValueAt(row, 8).toString());
        
        cmbFromProject.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 9).toString()));
        cmbToProject.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 10).toString()));
        cmbFromDepartment.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 11).toString()));
        cmbToDepartment.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 12).toString()));
        cmbFromLocation.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 13).toString()));
        cmbToLocation.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 14).toString()));
        cmbApprove.setSelectedItem(new KeyValue(0, tbTransferData.getValueAt(row, 15).toString()));
    }
//    private void initTextField() {
//        txtProjectID.setText("");
//        txtProjectName.setText("");
//        txtCreateDate.setText("");
//        txtEndDate.setText("");
//    }
//    private void loadSearchTransferName() throws ClassNotFoundException, SQLException {
//        String TransferName = "";
//        if (!txtTransferName.getText().equals("")) {
//            if (!conditon.contains("where")) {
//                conditon += " where projectName like '%" + txtProjectName.getText() + "%'";
//            } else {
//                conditon += " and projectName like '%" + txtProjectName.getText() + "%'";
//            }
//        }
//        }
//        initTable();
//        lstProject = projectBUS.searchProject(conditon);
//        fillData(lstProject);        
//    }
}
