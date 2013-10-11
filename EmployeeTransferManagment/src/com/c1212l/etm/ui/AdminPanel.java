/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.bll.AdminBUS;
import com.c1212l.etm.dto.Admin;
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
public class AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
            initComponents();
            initTextField();
            initTable();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAdminData = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel7.setText("jLabel7");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("ID:");

        jLabel4.setText("Email:");

        jLabel5.setText("Password:");

        jLabel6.setText("Role");

        txtID.setEnabled(false);

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Admin Manager");

        btnAdd.setBackground(new java.awt.Color(102, 255, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634218_001_01.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634415_gtk-refresh.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380632326_dialog-close.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tbAdminData.setModel(new javax.swing.table.DefaultTableModel(
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
        tbAdminData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAdminData);

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380633043_gtk-cancel.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here
         try {
             if (txtEmail.getText().equals("")) {
                 throw new Exception("Please enter email");
             }
             if (txtPassword.getText().equals("")) {
                throw new Exception("Please enter Password");
             }
             if (txtRole.getText().equals("")) {
                throw new Exception("Please enter role");
             }
              Pattern ptemail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,4}$");
              Matcher mcemail = ptemail.matcher(txtEmail.getText());
              if (!mcemail.find()) {
                throw new Exception("Email is not valid");
              }
               Pattern ptRole = Pattern.compile("^[\\d]{1}$");
               Matcher mcRole = ptRole.matcher(txtRole.getText());
               if (!mcRole.find()) {
                   throw new Exception("Role is not valid");
               }
             if (LoginFrame.role<Integer.parseInt(txtRole.getText())) {
                  String email = txtEmail.getText();
                  String password = new String(txtPassword.getPassword());
                  int role = Integer.parseInt(txtRole.getText());
                  adminBUS.addAdmin(email, password, role);
                  reloadData();
             }
             else{
                 JOptionPane.showMessageDialog(null, "Add fail");
             }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            try {
               if (txtID.getText().equals("")) {
                 throw new Exception("Please select admin");
               }
               if (txtEmail.getText().equals("")) {
                 throw new Exception("Please enter email");
               }
               if (txtPassword.getText().equals("")) {
                  throw new Exception("Please enter Password");
               }
               if (txtRole.getText().equals("")) {
                  throw new Exception("Please enter role");
               }
               Pattern ptemail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,4}$");
               Matcher mcemail = ptemail.matcher(txtEmail.getText());
               if (!mcemail.find()) {
                 throw new Exception("Email is not valid");
               }
                Pattern ptRole = Pattern.compile("^[\\d]{1}$");
                Matcher mcRole = ptRole.matcher(txtRole.getText());
                if (!mcRole.find()) {
                  throw new Exception("Role is not valid");
                }
                if (Integer.parseInt(txtRole.getText())> LoginFrame.role ) {
                    int id = Integer.parseInt(txtID.getText());
                    String email = txtEmail.getText();
                    String password = new String(txtPassword.getPassword());
                    int role = Integer.parseInt(txtRole.getText());
                    adminBUS.updateAdmin(id, email, password, role);
                    reloadData();
                }
                else if(Integer.parseInt(txtRole.getText())== LoginFrame.role && txtEmail.getText().equals(LoginFrame.email)){
                    int id = Integer.parseInt(txtID.getText());
                    String email = txtEmail.getText();
                    String password = new String(txtPassword.getPassword());
                    int role = Integer.parseInt(txtRole.getText());
                    adminBUS.updateAdmin(id, email, password, role);
                    reloadData();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Update fail!");
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
          try {
            if (txtID.getText().equals("")) {
                 throw new Exception("Please select admin");
            }
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                 if (Integer.parseInt(txtRole.getText())> LoginFrame.role) {
                    int id = Integer.parseInt(txtID.getText());
                    adminBUS.deleteAdmin(id);
                    reloadData(); 
               }
            else{
                JOptionPane.showMessageDialog(null, "Delete fail!");
            }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
          try {
            loadSearchAdminEmail();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void tbAdminDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdminDataMouseClicked
        // TODO add your handling code here:
        int row = tbAdminData.rowAtPoint(evt.getPoint());
        txtID.setText(tbAdminData.getValueAt(row, 0).toString());
        txtEmail.setText(tbAdminData.getValueAt(row, 1).toString());
        txtPassword.setText(tbAdminData.getValueAt(row, 2).toString());
        txtRole.setText(tbAdminData.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tbAdminDataMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtEmail.setText("");
        txtPassword.setText("");
        txtRole.setText("");
        txtID.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbAdminData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Admin> lstAdmin;
    AdminBUS adminBUS = new AdminBUS();

    private void initTable() {
        Vector header = new Vector();
        header.add("Admin ID");
        header.add("Email");
        header.add("Password");
        header.add("Role");
        tblModel = new DefaultTableModel(header, 0);
        tbAdminData.setModel(tblModel);
    }

    private void fillData(ArrayList<Admin> lst) {
        if (lst != null) {
            for (Admin l : lst) {
                tblModel.addRow(l.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            fillData(adminBUS.getAllAdmin());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initTextField() {
        txtID.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtRole.setText("");
    }

    private void loadSearchAdminEmail() throws ClassNotFoundException, SQLException {
        String email = "";
        if (!txtEmail.getText().equals("")) {
            if (!email.contains("where")) {
                email += " where email like '%" + txtEmail.getText() + "%'";
            } else {
                email += " and email like '%" + txtEmail.getText() + "%'";
            }
        }
        initTable();
        lstAdmin = adminBUS.searchAdminEmail(email);
        fillData(lstAdmin);
    }
}
