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
import com.c1212l.etm.dal.TransferDAO;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.dto.Transfer;
import com.c1212l.etm.dto.TransferType;
import com.c1212l.etm.util.KeyValue;
import java.sql.Date;
import java.sql.SQLException;
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
public class TestTransfer extends javax.swing.JFrame {
    /**
     * Creates new form TestTransfer
     */
    public TestTransfer() {
             try {
                initComponents();
                initCmbTransferType();
                initCmbEmployee();
                initCmbFromProject();
                initCmbToProject();
                initCmbFromDepartment();
                initCmbToDepartment();
                initCmbFromLocation();
                initCmbToLocation();
                initCmbApprove();
                reloadData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TransferPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TransferPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


//     *This method is called from swithin the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dcRequestDate = new com.toedter.calendar.JDateChooser();
        dcTranJoinDate = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTransferData = new javax.swing.JTable();
        dcApproveDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtTransferID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbTransferType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbFromProject = new javax.swing.JComboBox();
        cmbFromLocation = new javax.swing.JComboBox();
        cmbToLocation = new javax.swing.JComboBox();
        cmbToProject = new javax.swing.JComboBox();
        dcTranReDate = new com.toedter.calendar.JDateChooser();
        cmbToDepartment = new javax.swing.JComboBox();
        cmbEmployee = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        cmbFromDepartment = new javax.swing.JComboBox();
        cmbApprove = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel15.setText("To Location:");

        jLabel13.setText("To Department :");

        jLabel14.setText("From Location:");

        txtReason.setColumns(20);
        txtReason.setRows(5);
        jScrollPane1.setViewportView(txtReason);

        jLabel12.setText("From Department:");

        jLabel11.setText("To Project :");

        jLabel10.setText("From Project ID:");

        jLabel9.setText("Approve Date:");

        jLabel8.setText("Approve:");

        jLabel7.setText("Reason:");

        jLabel6.setText("Request Date:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Transfer Joining Date:");

        jLabel2.setText("Employee:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Transfer Relieving Date:");

        jLabel3.setText("Transfer Type:");

        jLabel1.setText("Transfer ID:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cmbApprove.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Approve", "Unapprove" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtTransferID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcTranReDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcTranJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcRequestDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbEmployee, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE)
                                        .addComponent(cmbTransferType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(109, 109, 109)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcApproveDate, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbFromProject, 0, 98, Short.MAX_VALUE)
                                    .addComponent(cmbToProject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbFromDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbToDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbFromLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbToLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAdd)
                        .addGap(139, 139, 139)
                        .addComponent(btnUpdate)
                        .addGap(127, 127, 127)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTransferID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbTransferType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(cmbToProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(dcTranReDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcTranJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(cmbFromDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cmbApprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcApproveDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFromProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cmbToDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dcRequestDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbFromLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbToLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTransferDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTransferDataMouseClicked
        // TODO add your handling code here:
        int row = tbTransferData.rowAtPoint(evt.getPoint());
        Date transferRelievingDate = (Date)tbTransferData.getValueAt(row, 3);
        Date transferJoiningDate = (Date)tbTransferData.getValueAt(row, 4);
        Date requestDate = (Date)tbTransferData.getValueAt(row, 5);
        Date approveDate = (Date)tbTransferData.getValueAt(row,8);
        txtTransferID.setText(tbTransferData.getValueAt(row, 0).toString());
        cmbTransferType.setSelectedItem(tbTransferData.getValueAt(row, 1));
        cmbEmployee.setSelectedItem(tbTransferData.getValueAt(row, 2));
        dcTranReDate.setDate(transferRelievingDate);
        dcTranJoinDate.setDate(transferJoiningDate);
        dcRequestDate.setDate(requestDate);
        txtReason.setText(tbTransferData.getValueAt(row,6).toString());
        cmbApprove.setSelectedItem(tbTransferData.getValueAt(row,7));
        dcApproveDate.setDate(approveDate);
        cmbFromProject.setSelectedItem(tbTransferData.getValueAt(row,9));
        cmbToProject.setSelectedItem(tbTransferData.getValueAt(row,10));
        cmbFromDepartment.setSelectedItem(tbTransferData.getValueAt(row, 11));
        cmbToDepartment.setSelectedItem(tbTransferData.getValueAt(row, 12));
        cmbFromLocation.setSelectedItem(tbTransferData.getValueAt(row, 13));
        cmbToLocation.setSelectedItem(tbTransferData.getValueAt(row, 14));
    }//GEN-LAST:event_tbTransferDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(txtTransferID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select Transfer ID");
        }else{
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    transferBUS.deleteTransfer(Integer.parseInt(txtTransferID.getText()));
                    reloadData();
                }
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Delete fail");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
              try {
            if (txtTransferID.getText().equals("")) {
                throw new Exception("Please select Transfer ID");
            }
            convertDate();
            int transferTypeID = ((KeyValue) cmbTransferType.getSelectedItem()).getKey();
            int employeeID = ((KeyValue) cmbEmployee.getSelectedItem()).getKey();
            String reason = txtReason.getText();
            boolean approve = ((KeyValue) cmbApprove.getSelectedItem()).getKey()== 1 ? true : false;
            int fromProjectID = ((KeyValue) cmbFromProject.getSelectedItem()).getKey();
            int toProjectID = ((KeyValue) cmbToProject.getSelectedItem()).getKey();
            int fromDepartmentID = ((KeyValue) cmbFromDepartment.getSelectedItem()).getKey();
            int toDepartmentID = ((KeyValue) cmbToDepartment.getSelectedItem()).getKey();
            int formLocationID = ((KeyValue) cmbFromLocation.getSelectedItem()).getKey();
            int toLocationID = ((KeyValue) cmbToLocation.getSelectedItem()).getKey();
            transferBUS.updateTransfer(transferTypeID, transferTypeID, employeeID, tranReDate, tranJoinDate, requestDate, reason, approve, approveDate, fromProjectID, toProjectID, fromDepartmentID, toDepartmentID, formLocationID, toLocationID);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
                 try {
            if (txtReason.getText().equals("")) {
                throw new Exception("Please enter Reason");
            }
            convertDate();
            int transferTypeID = ((KeyValue) cmbTransferType.getSelectedItem()).getKey();
            int employeeID = ((KeyValue) cmbEmployee.getSelectedItem()).getKey();
            String reason = txtReason.getText();
            boolean approve = ((KeyValue) cmbApprove.getSelectedItem()).getKey()== 1 ? true : false;
            int fromProjectID = ((KeyValue) cmbFromProject.getSelectedItem()).getKey();
            int toProjectID = ((KeyValue) cmbToProject.getSelectedItem()).getKey();
            int fromDepartmentID = ((KeyValue) cmbFromDepartment.getSelectedItem()).getKey();
            int toDepartmentID = ((KeyValue) cmbToDepartment.getSelectedItem()).getKey();
            int fromLocationID = ((KeyValue) cmbFromLocation.getSelectedItem()).getKey();
            int toLocationID = ((KeyValue) cmbToLocation.getSelectedItem()).getKey();
            transferBUS.addTransfer(transferTypeID, employeeID, tranReDate, tranJoinDate, requestDate, reason, approve, approveDate, fromProjectID, toProjectID, fromDepartmentID, toDepartmentID, fromLocationID, toLocationID);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestTransfer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbApprove;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbFromDepartment;
    private javax.swing.JComboBox cmbFromLocation;
    private javax.swing.JComboBox cmbFromProject;
    private javax.swing.JComboBox cmbToDepartment;
    private javax.swing.JComboBox cmbToLocation;
    private javax.swing.JComboBox cmbToProject;
    private javax.swing.JComboBox cmbTransferType;
    private com.toedter.calendar.JDateChooser dcApproveDate;
    private com.toedter.calendar.JDateChooser dcRequestDate;
    private com.toedter.calendar.JDateChooser dcTranJoinDate;
    private com.toedter.calendar.JDateChooser dcTranReDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextArea txtReason;
    private javax.swing.JTextField txtTransferID;
    // End of variables declaration//GEN-END:variables
   DefaultTableModel tblModel;
    ArrayList<Transfer> lstTransfer;
    TransferBUS transferBUS = new TransferBUS();
    private Date  tranReDate,tranJoinDate,requestDate,approveDate;
    private void initTable() {
        Vector header = new Vector();
        header.add("Transfer ID:");
        header.add("Transfer Type");
        header.add("Employee");
        header.add("Transfer Relieving Date");
        header.add("Transfer Joining Date");
        header.add("Request Date");
        header.add("Reason");
        header.add("Appove");
        header.add("Approve Date");
        header.add("From Project");
        header.add("To Project");
        header.add("From Department");
        header.add("To Department");
        header.add("From Location");
        header.add("To Location");
        tblModel = new DefaultTableModel(header, 0);
        tbTransferData.setModel(tblModel);
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
        TransferTypeBUS transferTypeBUS = new TransferTypeBUS();
        ArrayList<TransferType> arrTransferType = transferTypeBUS.getAllTransferType();
        for (TransferType transferType : arrTransferType) {
            cmbTransferType.addItem(new KeyValue(transferType.getTransferTypeID(), transferType.getTransferTypeName()));
        }
    }
     
  private void initCmbEmployee() throws ClassNotFoundException, SQLException {
        cmbEmployee.removeAllItems();
        EmployeeBUS employeeBUS = new EmployeeBUS();
        ArrayList<Employee> arrEmployee = employeeBUS.getAllEmployees();
        for (Employee employee: arrEmployee) {
            cmbEmployee.addItem(new KeyValue(employee.getEmployeeID(), employee.getEmployeeName()));
        }
    }
    private void initCmbFromProject() throws ClassNotFoundException, SQLException {
        cmbFromProject.removeAllItems();
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arrProject = projectBUS.getAllProject();
        for (Project p : arrProject) {
            cmbFromProject.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
    }
        private void initCmbToProject() throws ClassNotFoundException, SQLException {
        cmbToProject.removeAllItems();
        ProjectBUS projectBUS = new ProjectBUS();
        ArrayList<Project> arrProject = projectBUS.getAllProject();
        for (Project p : arrProject) {
            cmbToProject.addItem(new KeyValue(p.getProjectID(), p.getProjectName()));
        }
 }
           private void initCmbFromLocation() throws ClassNotFoundException, SQLException{
            cmbFromLocation.removeAllItems();
            LocationBUS locationBUS = new LocationBUS();
            ArrayList<Location> arrLocation = locationBUS.getAllLocation();
            for (Location location : arrLocation) {
                 cmbFromLocation.addItem(new KeyValue(location.getLocationID(),location.getLocationName()));
            }
    }
           private void initCmbToLocation() throws ClassNotFoundException, SQLException{
            cmbToLocation.removeAllItems();
            LocationBUS locationBUS = new LocationBUS();
            ArrayList<Location> arrLocation = locationBUS.getAllLocation();
            for (Location location : arrLocation) {
                 cmbToLocation.addItem(new KeyValue(location.getLocationID(),location.getLocationName()));
            }
    }   
     private void initCmbFromDepartment() throws ClassNotFoundException, SQLException{
            cmbFromDepartment.removeAllItems();
            DepartmentBUS departmentBUS = new DepartmentBUS();
            ArrayList<Department> arrDepartment = departmentBUS.getAllDepartment();
            for (Department department : arrDepartment) {
                cmbFromDepartment.addItem(new KeyValue(department.getDepartmentID(), department.getDepartmentName()));
            }
    } 
        private void initCmbToDepartment() throws ClassNotFoundException, SQLException{
            cmbToDepartment.removeAllItems();
            DepartmentBUS departmentBUS = new DepartmentBUS();
            ArrayList<Department> arrDepartment = departmentBUS.getAllDepartment();
            for (Department department : arrDepartment) {
                cmbToDepartment.addItem(new KeyValue(department.getDepartmentID(), department.getDepartmentName()));
            }
    }
        private void initCmbApprove() {
            cmbApprove.removeAllItems();
            cmbApprove.addItem(new KeyValue(1, "Approve"));
            cmbApprove.addItem(new KeyValue(0, "UnApprove"));
    }

         private void convertDate()
        {
            int tranReDateYear = dcTranReDate.getDate().getYear()+1900;
            String temptranReDate = tranReDateYear+"-"+dcTranReDate.getDate().getMonth()+"-"+dcTranReDate.getDate().getDate();
            tranReDate = Date.valueOf(temptranReDate);
            System.out.println(tranReDate);
            
            int tranJoinDateYear = dcTranJoinDate.getDate().getYear()+1900;
            String temptranJoinDate = tranJoinDateYear+"-"+dcTranJoinDate.getDate().getMonth()+"-"+dcTranJoinDate.getDate().getDate();
            tranJoinDate = Date.valueOf(temptranReDate);
            
            int requestDateYear = dcRequestDate.getDate().getYear()+1900;
            String tempRequestDate = requestDateYear+"-"+dcRequestDate.getDate().getMonth()+"-"+dcRequestDate.getDate().getDate();
             requestDate = Date.valueOf(tempRequestDate);
            
            int approveDateYear = dcApproveDate.getDate().getYear()+1900;
            String tempApproveDate = approveDateYear+"-"+dcApproveDate.getDate().getMonth()+"-"+dcApproveDate.getDate().getDate();
             approveDate = Date.valueOf(tempApproveDate);
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
