/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.bll.LocationBUS;
import com.c1212l.etm.dto.Location;
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
public class LocationPanel extends javax.swing.JPanel {

    /**
     * Creates new form Location
     */
    public LocationPanel() {
        try {
        initComponents();
              initTable();
            lstLocation = locationBUS.getAllLocation();
            fillData(lstLocation);
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

        jLabel1 = new javax.swing.JLabel();
        txtLocationID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLocationName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLocationData = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Location Manager"));

        jLabel1.setText("Location ID:");

        txtLocationID.setEnabled(false);

        jLabel2.setText("Location Name:");

        txtLocationName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationNameKeyReleased(evt);
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

        jScrollPane3.setPreferredSize(new java.awt.Dimension(300, 200));

        tbLocationData.setModel(new javax.swing.table.DefaultTableModel(
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
        tbLocationData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLocationDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbLocationData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(txtLocationName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(txtLocationID)))
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLocationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationNameKeyReleased
        // TODO add your handling code here:
        try {
            loadSearchLocationName();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtLocationNameKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            //            int locationID;
            //            locationID = Integer.parseInt(txtLocationID.getText());
            String locationName = txtLocationName.getText();
            int record = locationBUS.addLocation(locationName);
            if (record>0) {
                JOptionPane.showMessageDialog(this, "Add success");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Add fail");
            }
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LocationPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LocationPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int locationID = Integer.parseInt(txtLocationID.getText());
            String locationName = txtLocationName.getText();
            int record = locationBUS.updateLocation(locationID, locationName);
            if (record>0) {
                JOptionPane.showMessageDialog(this, "Update success");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Update fail");
            }
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LocationPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LocationPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int locationID = Integer.parseInt(txtLocationID.getText());
            int record = locationBUS.deleteLocation(locationID);
            if (record>0) {
                JOptionPane.showMessageDialog(this, "Delete success");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Delete fail");
            }
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LocationPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LocationPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbLocationDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLocationDataMouseClicked
        // TODO add your handling code here:
        int row = tbLocationData.rowAtPoint(evt.getPoint());
        txtLocationID.setText(tbLocationData.getValueAt(row, 0).toString());
        txtLocationName.setText(tbLocationData.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tbLocationDataMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbLocationData;
    private javax.swing.JTextField txtLocationID;
    private javax.swing.JTextField txtLocationName;
    // End of variables declaration//GEN-END:variables
   DefaultTableModel tblModel;
    ArrayList<Location> lstLocation;
    LocationBUS locationBUS = new LocationBUS();

    private void initTable() {
        Vector header = new Vector();
        header.add("Location ID");
        header.add("Location Name");
        tblModel = new DefaultTableModel(header, 0);
        tbLocationData.setModel(tblModel);
    }

    private void fillData(ArrayList<Location> lst) {
        if (lst != null) {
            for (Location l : lst) {
                tblModel.addRow(l.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            fillData(locationBUS.getAllLocation());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initTextField() {
        txtLocationID.setText("");
        txtLocationName.setText("");
    }

    private void loadSearchLocationName() throws ClassNotFoundException, SQLException {
        String locationName = "";
        if (!txtLocationName.getText().equals("")) {
            if (!locationName.contains("where")) {
                locationName += " where projectName like '%" + txtLocationName.getText() + "%'";
            } else {
                locationName += " and projectName like '%" + txtLocationName.getText() + "%'";
            }
        }
        initTable();
        lstLocation = locationBUS.searchLocation(locationName);
        fillData(lstLocation);        
    }
}
