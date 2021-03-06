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

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLocation = new javax.swing.JList();
        jToolBar3 = new javax.swing.JToolBar();
        btnAddLocation = new javax.swing.JButton();
        btnUpdateLocation = new javax.swing.JButton();
        btnDeleteLocation = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        panelBasicInfor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        cmbLocation = new javax.swing.JComboBox();
        toolBar = new javax.swing.JToolBar();
        btnAddDepartment = new javax.swing.JButton();
        btnUpdateDepartment = new javax.swing.JButton();
        btnDeleteDepartment = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDepartment = new javax.swing.JTable();

        leftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Location"));

        lstLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstLocationMouseReleased(evt);
            }
        });
        lstLocation.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstLocationValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstLocation);

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
        btnUpdateLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLocationActionPerformed(evt);
            }
        });
        jToolBar3.add(btnUpdateLocation);

        btnDeleteLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/delete1.png"))); // NOI18N
        btnDeleteLocation.setFocusable(false);
        btnDeleteLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteLocation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeleteLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLocationActionPerformed(evt);
            }
        });
        jToolBar3.add(btnDeleteLocation);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Department"));

        panelBasicInfor.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Infor"));

        jLabel1.setText("Department Name");

        jLabel2.setText("Location");

        javax.swing.GroupLayout panelBasicInforLayout = new javax.swing.GroupLayout(panelBasicInfor);
        panelBasicInfor.setLayout(panelBasicInforLayout);
        panelBasicInforLayout.setHorizontalGroup(
            panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInforLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBasicInforLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBasicInforLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBasicInforLayout.setVerticalGroup(
            panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInforLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        toolBar.setRollover(true);

        btnAddDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/mail_new.png"))); // NOI18N
        btnAddDepartment.setText("Add");
        btnAddDepartment.setFocusable(false);
        btnAddDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAddDepartment.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddDepartment.setMaximumSize(new java.awt.Dimension(61, 39));
        btnAddDepartment.setMinimumSize(new java.awt.Dimension(61, 39));
        btnAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepartmentActionPerformed(evt);
            }
        });
        toolBar.add(btnAddDepartment);

        btnUpdateDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/save_32.png"))); // NOI18N
        btnUpdateDepartment.setText("Update");
        btnUpdateDepartment.setFocusable(false);
        btnUpdateDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnUpdateDepartment.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdateDepartment.setMaximumSize(new java.awt.Dimension(77, 39));
        btnUpdateDepartment.setMinimumSize(new java.awt.Dimension(77, 39));
        btnUpdateDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDepartmentActionPerformed(evt);
            }
        });
        toolBar.add(btnUpdateDepartment);

        btnDeleteDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/delete_32.png"))); // NOI18N
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
        toolBar.add(btnDeleteDepartment);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/find.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        toolBar.add(btnSearch);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1380633043_gtk-cancel.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        toolBar.add(btnRefresh);

        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder("List Department"));

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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDepartmentMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepartmentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDepartment);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBasicInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBasicInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLocationActionPerformed
        DialogAddLocation dlg = new DialogAddLocation(null, true);
        dlg.setPanelLC(this);
        dlg.setVisible(true);
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
            if (departmentID != 0) {
                int locationID = ((KeyValue) cmbLocation.getSelectedItem()).getKey();
                departmentBUS.updateDepartment(departmentID, txtDepartmentName.getText(), locationID);
                reloadData();
            } else {
                JOptionPane.showMessageDialog(null, "Please select department");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateDepartmentActionPerformed

    private void tbDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepartmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDepartmentMouseClicked

    private void btnDeleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDepartmentActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (departmentID != 0) {
                    departmentBUS.deleteDepartment(departmentID);
                    reloadData();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select department");
                }
            }
        } catch (Exception ex) {
            if (ex.getMessage().contains("UNIQUE KEY")) {
                JOptionPane.showMessageDialog(null, "Error: Duplicate value", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteDepartmentActionPerformed

    private void lstLocationValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstLocationValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lstLocationValueChanged

    private void lstLocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstLocationMouseReleased
        try {
            KeyValue selectedItem = (KeyValue) lstLocation.getSelectedValue();
            if (selectedItem.getKey() != 0) {
                lstDepartment = departmentBUS.getDepartmentByLocationID(selectedItem.getKey());
                initTable();
                fillData(lstDepartment);
            } else {
                reloadData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Location_DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Location_DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lstLocationMouseReleased

    private void btnUpdateLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLocationActionPerformed
        try {
            KeyValue selectedItem = (KeyValue) lstLocation.getSelectedValue();
            if (selectedItem == null || selectedItem.getKey() == 0) {
                throw new Exception("Please select location");
            }
            int locationID = selectedItem.getKey();
            DialogEditLocation dlg = new DialogEditLocation(null, false);
            dlg.setPanelDC(this);
            dlg.setLocationID(locationID);
            dlg.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateLocationActionPerformed

    private void btnDeleteLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLocationActionPerformed
        try {
            KeyValue selectedItem = (KeyValue) lstLocation.getSelectedValue();
            if (selectedItem == null || selectedItem.getKey() == 0) {
                throw new Exception("Please select location");
            }
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                int locationID = selectedItem.getKey();
                locationBUS.deleteLocation(locationID);
                reloadDataList();
                initCmbLocation();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteLocationActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            loadSearchData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Location_DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Location_DepartmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        reloadData();
        reloadDataList();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tbDepartmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepartmentMouseReleased
        int row = tbDepartment.rowAtPoint(evt.getPoint());
        departmentID = Integer.parseInt(tbDepartment.getValueAt(row, 0).toString());
        txtDepartmentName.setText(tbDepartment.getValueAt(row, 1).toString());
        cmbLocation.setSelectedItem(new KeyValue(0, tbDepartment.getValueAt(row, 2).toString()));
    }//GEN-LAST:event_tbDepartmentMouseReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDepartment;
    private javax.swing.JButton btnAddLocation;
    private javax.swing.JButton btnDeleteDepartment;
    private javax.swing.JButton btnDeleteLocation;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateDepartment;
    private javax.swing.JButton btnUpdateLocation;
    private javax.swing.JComboBox cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JList lstLocation;
    private javax.swing.JPanel panelBasicInfor;
    private javax.swing.JPanel panelTable;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTable tbDepartment;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JTextField txtDepartmentName;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    DefaultListModel lstModel;
    ArrayList<Department> lstDepartment;
    ArrayList<Location> listLocation;
    DepartmentBUS departmentBUS = new DepartmentBUS();
    LocationBUS locationBUS = new LocationBUS();
    private int departmentID;

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

    private void fillDataList(ArrayList<Location> lst) {
        if (lst != null) {
            lstModel = new DefaultListModel();
            lstModel.addElement(new KeyValue(0, "All Location"));
            for (Location location : lst) {
                lstModel.addElement(new KeyValue(location.getLocationID(), location.getLocationName()));
            }
            lstLocation.setModel(lstModel);
        }
    }

    void reloadDataList() {
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

    void initCmbLocation() {
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

    private void loadSearchData() throws ClassNotFoundException, SQLException {
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
}
