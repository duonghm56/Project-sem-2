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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
            initComponents();
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
        txtLocationID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLocationName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLocationData = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Location Manager"));
        setPreferredSize(new java.awt.Dimension(970, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Location ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        txtLocationID.setEnabled(false);
        add(txtLocationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 340, 30));

        jLabel2.setText("Location Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        txtLocationName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationNameKeyReleased(evt);
            }
        });
        add(txtLocationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 340, 30));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634218_001_01.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setMaximumSize(new java.awt.Dimension(71, 33));
        btnAdd.setMinimumSize(new java.awt.Dimension(71, 33));
        btnAdd.setPreferredSize(new java.awt.Dimension(75, 33));
        btnAdd.setSelected(true);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, 35));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634415_gtk-refresh.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 90, 35));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380634772_001_05.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 85, 35));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 950, 280));
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
            if (txtLocationName.getText().equals("")) {
                throw new Exception("Please enter Location Name");
            }
             Pattern ptLocationName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
             Matcher mcLocationName = ptLocationName.matcher(txtLocationName.getText());
             if (!mcLocationName.find()) {
                     throw new Exception("Location Name is not valid");
             }
            String locationName = txtLocationName.getText();
            //locationBUS.addLocation(locationName);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (txtLocationID.getText().equals("")) {
                throw new Exception("Please select location");
            }
             if (txtLocationName.getText().equals("")) {
                throw new Exception("Please enter Location Name");
            }
             Pattern ptLocationName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
             Matcher mcLocationName = ptLocationName.matcher(txtLocationName.getText());
             if (!mcLocationName.find()) {
                     throw new Exception("Location Name is not valid");
             }
            int locationID = Integer.parseInt(txtLocationID.getText());
            String locationName = txtLocationName.getText();
            //locationBUS.updateLocation(locationID, locationName);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (txtLocationID.getText().equals("")) {
                throw new Exception("Please select location");
            }
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                int locationID = Integer.parseInt(txtLocationID.getText());
                locationBUS.deleteLocation(locationID);
                reloadData();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

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
                locationName += " where locationName like '%" + txtLocationName.getText() + "%'";
            } else {
                locationName += " and locationName like '%" + txtLocationName.getText() + "%'";
            }
        }
        initTable();
        lstLocation = locationBUS.searchLocation(locationName);
        fillData(lstLocation);
    }
}
