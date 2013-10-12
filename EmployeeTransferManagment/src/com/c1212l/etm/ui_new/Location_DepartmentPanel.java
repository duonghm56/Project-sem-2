/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui_new;

import com.c1212l.etm.bll.DepartmentBUS;
import com.c1212l.etm.bll.LocationBUS;
import com.c1212l.etm.dto.Department;
import com.c1212l.etm.dto.Location;
import com.c1212l.etm.ui.DepartmentPanel;
import com.c1212l.etm.ui.ProjectPanel;
import com.c1212l.etm.util.KeyValue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luu Bi
 */
public class Location_DepartmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form Location_DepartmentPanel
     */
    public Location_DepartmentPanel() {
        initComponents();
        reloadData();
        reloadDataList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLocation = new javax.swing.JList();
        jToolBar3 = new javax.swing.JToolBar();
        btnAddLocation = new javax.swing.JButton();
        btnUpdateLocation = new javax.swing.JButton();
        btnDeleteLocation = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        cmbLocation = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        btnAddDepartment = new javax.swing.JButton();
        btnUpdateDepartment = new javax.swing.JButton();
        btnDeleteDepartment = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDepartment = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("List Department"));

        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane2.setDividerLocation(100);

        lstLocation.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstLocation);

        jScrollPane1.setBounds(0, 0, 100, 360);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar3.setRollover(true);

        btnAddLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/add.gif"))); // NOI18N
        btnAddLocation.setFocusable(false);
        btnAddLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddLocation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLocationActionPerformed(evt);
            }
        });
        jToolBar3.add(btnAddLocation);

        btnUpdateLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/edit.png"))); // NOI18N
        btnUpdateLocation.setFocusable(false);
        btnUpdateLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateLocation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btnUpdateLocation);

        btnDeleteLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/delete1.png"))); // NOI18N
        btnDeleteLocation.setFocusable(false);
        btnDeleteLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteLocation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btnDeleteLocation);

        jToolBar3.setBounds(0, 360, 130, 40);
        jLayeredPane1.add(jToolBar3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSplitPane2.setLeftComponent(jLayeredPane1);

        jLayeredPane2.setAlignmentX(0.0F);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Infor"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Department Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("Location:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(txtDepartmentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 130, -1));

        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));

        jPanel1.setBounds(20, 80, 450, 160);
        jLayeredPane2.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setRollover(true);
        jToolBar1.setBounds(20, 10, 13, 2);
        jLayeredPane2.add(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar2.setRollover(true);

        btnAddDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/mail_new.png"))); // NOI18N
        btnAddDepartment.setText("Add");
        btnAddDepartment.setFocusable(false);
        btnAddDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAddDepartment.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddDepartment.setMaximumSize(new java.awt.Dimension(61, 39));
        btnAddDepartment.setMinimumSize(new java.awt.Dimension(61, 39));
        btnAddDepartment.setPreferredSize(new java.awt.Dimension(61, 39));
        btnAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepartmentActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAddDepartment);

        btnUpdateDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/save_32.png"))); // NOI18N
        btnUpdateDepartment.setText("Update");
        btnUpdateDepartment.setFocusable(false);
        btnUpdateDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnUpdateDepartment.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdateDepartment.setMaximumSize(new java.awt.Dimension(77, 39));
        btnUpdateDepartment.setMinimumSize(new java.awt.Dimension(77, 39));
        btnUpdateDepartment.setPreferredSize(new java.awt.Dimension(77, 39));
        btnUpdateDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDepartmentActionPerformed(evt);
            }
        });
        jToolBar2.add(btnUpdateDepartment);

        btnDeleteDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/delete1.png"))); // NOI18N
        btnDeleteDepartment.setText("Delete");
        btnDeleteDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDeleteDepartment.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDeleteDepartment.setMaximumSize(new java.awt.Dimension(65, 39));
        btnDeleteDepartment.setMinimumSize(new java.awt.Dimension(65, 39));
        btnDeleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDepartmentActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDeleteDepartment);

        jToolBar2.setBounds(30, 10, 210, 30);
        jLayeredPane2.add(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("List Department"));

        tbDepartment.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepartmentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDepartment);

        jPanel3.add(jScrollPane2);

        jPanel3.setBounds(20, 260, 460, 230);
        jLayeredPane2.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSplitPane2.setRightComponent(jLayeredPane2);

        add(jSplitPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 663, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddLocationActionPerformed

    private void btnAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepartmentActionPerformed
        // TODO add your handling code here:
           try {
             if (txtDepartmentName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter department name");
                return;
            }
            Pattern ptDepartName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
            Matcher mcDepartName = ptDepartName.matcher(txtDepartmentName.getText());
            if (!mcDepartName.find()) {
                 throw new Exception("Department name is not valid");
            }
            departmentBUS.addDepartment(txtDepartmentName.getText(), ((KeyValue) cmbLocation.getSelectedItem()).getKey());
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddDepartmentActionPerformed

    private void btnUpdateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDepartmentActionPerformed
        // TODO add your handling code here:
            try {
            if (txtDepartmentName.getText().equals("")) {
                throw new Exception("Please enter department name");
            }
            Pattern ptDepartName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
            Matcher mcDepartName = ptDepartName.matcher(txtDepartmentName.getText());
            if (!mcDepartName.find()) {
                 throw new Exception("Department name is not valid");
            }
            if (departmentID!=0) {
                int locationID = ((KeyValue) cmbLocation.getSelectedItem()).getKey();
                departmentBUS.updateDepartment(departmentID, txtDepartmentName.getText(), locationID);
                reloadData();
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select department");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateDepartmentActionPerformed

    private void tbDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepartmentMouseClicked
        // TODO add your handling code here:
        int row = tbDepartment.rowAtPoint(evt.getPoint());
         departmentID = Integer.parseInt(tbDepartment.getValueAt(row, 0).toString());
        txtDepartmentName.setText(tbDepartment.getValueAt(row, 1).toString());
        cmbLocation.setSelectedItem(new KeyValue(0, tbDepartment.getValueAt(row, 2).toString()));
    }//GEN-LAST:event_tbDepartmentMouseClicked

    private void btnDeleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDepartmentActionPerformed
        // TODO add your handling code here:

            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (departmentID!=0){
                        departmentBUS.deleteDepartment(departmentID);
                        reloadData();
                    }
                    else{
                         JOptionPane.showMessageDialog(null, "Please select department");
                    }
                }
            } catch (Exception ex) {
                if(ex.getMessage().contains("UNIQUE KEY")){
                    JOptionPane.showMessageDialog(null, "Error: Duplicate value", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);                    
                    ex.printStackTrace();
                }
            }
    }//GEN-LAST:event_btnDeleteDepartmentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDepartment;
    private javax.swing.JButton btnAddLocation;
    private javax.swing.JButton btnDeleteDepartment;
    private javax.swing.JButton btnDeleteLocation;
    private javax.swing.JButton btnUpdateDepartment;
    private javax.swing.JButton btnUpdateLocation;
    private javax.swing.JComboBox cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JList lstLocation;
    private javax.swing.JTable tbDepartment;
    private javax.swing.JTextField txtDepartmentName;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    DefaultListModel lstModel;
    ArrayList<Department> lstDepartment;
    ArrayList<Location> listLocation;
    DepartmentBUS departmentBUS = new DepartmentBUS();
    LocationBUS locationBUS = new LocationBUS();
    
    
    private int  departmentID;
    private void initTable() {
        Vector header = new Vector();
        header.add("Department ID");
        header.add("Department Name");
        header.add("Location Name");
        tblModel = new DefaultTableModel(header, 0);
        tbDepartment.setModel(tblModel);
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
            initCmbLocation();
            fillData(departmentBUS.getAllDepartment());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void fillDataList(ArrayList<Location> lst)
    {
        if (lst != null) {
            lstModel = new DefaultListModel();
            for(Location location:lst){
                lstModel.addElement(location.getLocationName());
            }
            lstLocation.setModel(lstModel);
        }
    }
    private void reloadDataList(){
        try {
            fillDataList(locationBUS.getAllLocation());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Location_DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Location_DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTextField() {
        txtDepartmentName.setText("");
    }

    private void initCmbLocation() {
        try {
            cmbLocation.removeAllItems();
            LocationBUS locationBUS = new LocationBUS();
            ArrayList<Location> arrLocation = locationBUS.getAllLocation();
            for (Location location : arrLocation) {
                cmbLocation.addItem(new KeyValue(location.getLocationID(), location.getLocationName()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    private void searchDepartmentName() throws ClassNotFoundException, SQLException {
        String departmentName = "";
        if (!txtDepartmentName.getText().equals("")) {
            if (!departmentName.contains("where")) {
                departmentName += " where departmentName like '%" + txtDepartmentName.getText() + "%'";
            } else {
                departmentName += " and departmentName like '%" + txtDepartmentName.getText() + "%'";
            }
        }
        initTable();
        lstDepartment = departmentBUS.searchDepartmentName(departmentName);
        fillData(lstDepartment);
    }

    @Override
    public void validate() {
        super.validate();
        try {
            initCmbLocation();
            initTable();
            lstDepartment = departmentBUS.getAllDepartment();
            fillData(lstDepartment);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
