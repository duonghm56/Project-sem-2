/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.bll.DepartmentBUS;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.util.KeyValue;
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
public class DepartmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentPanel
     */
    public DepartmentPanel() {
        try{
            initComponents();
            initCmbLocationID();
            initTable();
            lstDepartment = departmentBUS.getAllDepartment();
            fillData(lstDepartment);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDepartmentID = new javax.swing.JTextField();
        txtDepartmentName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDepartmentData = new javax.swing.JTable();
        cmbLocationID = new javax.swing.JComboBox();

        jTextField2.setText("jTextField2");

        setBorder(javax.swing.BorderFactory.createTitledBorder("Department Manager"));

        jLabel1.setText("Department ID:");

        jLabel2.setText("Department Name:");

        jLabel3.setText("Location ID:");

        txtDepartmentID.setEnabled(false);

        txtDepartmentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentNameActionPerformed(evt);
            }
        });
        txtDepartmentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDepartmentNameKeyReleased(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tbDepartmentData.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDepartmentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepartmentDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDepartmentData);

        cmbLocationID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ha Noi", "TP.Ho Chi Minh", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(31, 31, 31)
                        .addComponent(btnUpdate)
                        .addGap(29, 29, 29)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDepartmentID, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtDepartmentName)
                            .addComponent(cmbLocationID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDepartmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbLocationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartmentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (txtDepartmentName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter department name");
            return;
        }
            try {
                departmentBUS.addDepartment(txtDepartmentName.getText(),((KeyValue)cmbLocationID.getSelectedItem()).getKey());
                JOptionPane.showMessageDialog(null, "Insert Success!!!");
                System.out.println(cmbLocationID.getSelectedIndex());
                reloadData();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Insert Fail !!!");
                ex.printStackTrace();
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                 try {
            if (txtDepartmentName.getText().equals("")) {
                throw new Exception("Please enter Employee Number");
            }
            else
            {
            int locationID= ((KeyValue) cmbLocationID.getSelectedItem()).getKey();
            departmentBUS.updateDepartment(Integer.parseInt(txtDepartmentID.getText()), txtDepartmentName.getText(), locationID);
                  reloadData();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
           if(txtDepartmentID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select department");
        }else{
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    departmentBUS.deleteDepartment(Integer.parseInt(txtDepartmentID.getText()));
                    reloadData();
                }
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Delete fail");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbDepartmentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepartmentDataMouseClicked
        // TODO add your handling code here:
            int row = tbDepartmentData.rowAtPoint(evt.getPoint());
           txtDepartmentID.setText(tbDepartmentData.getValueAt(row, 0).toString());
           txtDepartmentName.setText(tbDepartmentData.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tbDepartmentDataMouseClicked

    private void txtDepartmentNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartmentNameKeyReleased
        // TODO add your handling code here:
         try {
            searchDepartmentName();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDepartmentNameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbLocationID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbDepartmentData;
    private javax.swing.JTextField txtDepartmentID;
    private javax.swing.JTextField txtDepartmentName;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Department> lstDepartment;
    DepartmentBUS departmentBUS = new DepartmentBUS();

    private void initTable() {
        Vector header = new Vector();
        header.add("Department ID");
        header.add("Department Name");
        header.add("Location ID");
        tblModel = new DefaultTableModel(header, 0);
        tbDepartmentData.setModel(tblModel);
    }

    private void fillData(ArrayList<Department> lst) {
        if (lst != null) {
            for (Department d : lst) {
                tblModel.addRow(d.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            fillData(departmentBUS.getAllDepartment());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initTextField() {
        txtDepartmentID.setText("");
        txtDepartmentName.setText("");
    }
    private void initCmbLocationID() {
        cmbLocationID.removeAllItems();
        cmbLocationID.addItem(new KeyValue(10, "Ha Noi"));
        cmbLocationID.addItem(new KeyValue(11, "TP.Ho Chi Minh"));
    }
    private void searchDepartmentName() throws ClassNotFoundException, SQLException {
        String departmentName = "";
        if (!txtDepartmentName.getText().equals("")) {
            if (!departmentName.contains("where")) {
                departmentName += " where projectName like '%" + txtDepartmentName.getText() + "%'";
            } else {
                departmentName += " and projectName like '%" + txtDepartmentName.getText() + "%'";
            }
        }
            initTable();
            lstDepartment = departmentBUS.searchDepartmentName(departmentName);
            fillData(lstDepartment);  
        }  
    
}
