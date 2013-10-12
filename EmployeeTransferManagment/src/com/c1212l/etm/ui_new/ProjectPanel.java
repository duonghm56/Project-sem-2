/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui_new;

import com.c1212l.etm.bll.ProjectBUS;
import com.c1212l.etm.dal.EmployeeDAO;
import com.c1212l.etm.dal.ProjectDAO;
import com.c1212l.etm.dto.Project;
import com.c1212l.etm.util.MyUtil;
import java.sql.Date;
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
public class ProjectPanel extends javax.swing.JPanel {

    /**
     * Creates new form Project
     */
    public ProjectPanel() {
        initComponents();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblFinished = new javax.swing.JLabel();
        lblUnfinished = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTotalEmpl = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        panelBasicInfor = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        dcCreateDate = new com.toedter.calendar.JDateChooser();
        dcEndDate = new com.toedter.calendar.JDateChooser();
        chkCreateDateUnknow = new javax.swing.JCheckBox();
        chkEndDateUnknow = new javax.swing.JCheckBox();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProject = new javax.swing.JTable();
        toolBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Project Infor"));

        jLabel2.setText("Total Project");

        jLabel4.setText("Finished");

        jLabel6.setText("Unfinished");

        lblTotal.setText("jLabel8");

        lblFinished.setText("jLabel12");

        lblUnfinished.setText("jLabel13");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUnfinished)
                    .addComponent(lblFinished)
                    .addComponent(lblTotal))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFinished))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblUnfinished))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Project  Infor"));

        jLabel1.setText("Name");

        jLabel3.setText("Start Date");

        jLabel5.setText("End Date");

        jLabel7.setText("Total Empl");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStartDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEndDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalEmpl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblStartDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEndDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTotalEmpl))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftPanel);

        panelBasicInfor.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Infor"));

        jLabel9.setText("Project Name:");

        jLabel10.setText("Create Date:");

        jLabel11.setText("End Date");

        chkCreateDateUnknow.setText("Unknow");

        chkEndDateUnknow.setText("Unknow");

        javax.swing.GroupLayout panelBasicInforLayout = new javax.swing.GroupLayout(panelBasicInfor);
        panelBasicInfor.setLayout(panelBasicInforLayout);
        panelBasicInforLayout.setHorizontalGroup(
            panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInforLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(40, 40, 40)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProjectName)
                    .addComponent(dcEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(dcCreateDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCreateDateUnknow, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkEndDateUnknow, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53))
        );
        panelBasicInforLayout.setVerticalGroup(
            panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBasicInforLayout.createSequentialGroup()
                        .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcCreateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkCreateDateUnknow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBasicInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkEndDateUnknow))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(panelBasicInforLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder("List Project"));

        tbProject.setModel(new javax.swing.table.DefaultTableModel(
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
        tbProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProject);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
            .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        toolBar.setRollover(true);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/mail_new.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.setInheritsPopupMenu(true);
        btnAdd.setMaximumSize(new java.awt.Dimension(61, 39));
        btnAdd.setMinimumSize(new java.awt.Dimension(61, 39));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        toolBar.add(btnAdd);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/save_32.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setFocusable(false);
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.setMaximumSize(new java.awt.Dimension(77, 39));
        btnUpdate.setMinimumSize(new java.awt.Dimension(77, 39));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        toolBar.add(btnUpdate);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/delete_32.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.setMaximumSize(new java.awt.Dimension(65, 39));
        btnDelete.setMinimumSize(new java.awt.Dimension(65, 39));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        toolBar.add(btnDelete);

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

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBasicInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBasicInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if (txtProjectName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter project name");
                return;
            }
            String endDate = MyUtil.getDateStr(dcEndDate, chkEndDateUnknow);
            String createDate = MyUtil.getDateStr(dcCreateDate, chkCreateDateUnknow);
            projectBUS.addProject(txtProjectName.getText(), createDate, endDate);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProjectMouseClicked
        updateFieldData();
    }//GEN-LAST:event_tbProjectMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (projectID == null) {
                JOptionPane.showMessageDialog(null, "Please select project");
                return;
            }
            if (txtProjectName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Project name is not null");
                return;
            }
            String endDate = MyUtil.getDateStr(dcEndDate, chkEndDateUnknow);
            String createDate = MyUtil.getDateStr(dcCreateDate, chkCreateDateUnknow);
            projectBUS.updateProject(projectID, txtProjectName.getText(), createDate, endDate);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            if (projectID == null) {
                JOptionPane.showMessageDialog(null, "Please select project");
                return;
            }
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                if (Integer.parseInt(projectID) != 0) {
                    projectBUS.deleteProject(projectID);
                    reloadData();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        reloadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            loadSearchData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkCreateDateUnknow;
    private javax.swing.JCheckBox chkEndDateUnknow;
    private com.toedter.calendar.JDateChooser dcCreateDate;
    private com.toedter.calendar.JDateChooser dcEndDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblFinished;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalEmpl;
    private javax.swing.JLabel lblUnfinished;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel panelBasicInfor;
    private javax.swing.JPanel panelTable;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTable tbProject;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JTextField txtProjectName;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Project> lstProject;
    ProjectBUS projectBUS = new ProjectBUS();
    private String projectID;

    private void updateFieldData() {
        int row = tbProject.getSelectedRow();
        projectID = tbProject.getValueAt(row, 0).toString();
        txtProjectName.setText(tbProject.getValueAt(row, 1).toString());
        
        if(tbProject.getValueAt(row, 2) == null){
            chkCreateDateUnknow.setSelected(true);
        }else{
            chkCreateDateUnknow.setSelected(false);
            dcCreateDate.setDate(Date.valueOf(tbProject.getValueAt(row, 2).toString()));
        }
        
        if(tbProject.getValueAt(row, 3) == null){
            chkEndDateUnknow.setSelected(true);
        }else{
            chkEndDateUnknow.setSelected(false);
            dcEndDate.setDate(Date.valueOf(tbProject.getValueAt(row, 3).toString()));
        } 
        
        lblName.setText(tbProject.getValueAt(row, 1).toString());
        lblStartDate.setText(tbProject.getValueAt(row, 2)==null?"Unknown":tbProject.getValueAt(row, 2).toString());
        lblEndDate.setText(tbProject.getValueAt(row, 3)==null?"Unknown":tbProject.getValueAt(row, 3).toString());
        ProjectDAO projectDAO = new ProjectDAO();
        lblTotalEmpl.setText(""+projectDAO.getTotalEmplByProjectID(Integer.parseInt(projectID)));
    }

    private void initTable() {
        Vector header = new Vector();
        header.add("Project ID");
        header.add("Project Name");
        header.add("Created Date");
        header.add("End Date");
        tblModel = new DefaultTableModel(header, 0);
        tbProject.setModel(tblModel);
    }
    
    private void initLabel(){
        ProjectDAO projectDAO = new ProjectDAO();
        lblTotal.setText(""+projectDAO.getTotalProject());
        lblFinished.setText(""+projectDAO.getTotalFinishedProject());
        lblUnfinished.setText(""+projectDAO.getTotalUnfinishedProject());
    }
    
    private void fillData(ArrayList<Project> lst) {
        if (lst != null) {
            for (Project p : lst) {
                tblModel.addRow(p.getVector());
            }
        }
    }
    
    private void initTextField() {
        txtProjectName.setText("");
    }
    
    private void initDc(){
        dcCreateDate.setDate(new java.util.Date());
        chkCreateDateUnknow.setSelected(false);
        dcEndDate.setDate(new java.util.Date());
        chkEndDateUnknow.setSelected(false);
    }

    

    private void reloadData() {
        try {
            initTable();
            fillData(projectBUS.getAllProject());
            initTextField();
            initLabel();
            initDc();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(com.c1212l.etm.ui.ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(com.c1212l.etm.ui.ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadSearchData() throws ClassNotFoundException, SQLException {
        String conditon = "";
        if (!txtProjectName.getText().equals("")) {
            if (!conditon.contains("where")) {
                conditon += " where projectName like '%" + txtProjectName.getText() + "%'";
            } else {
                conditon += " and projectName like '%" + txtProjectName.getText() + "%'";
            }
        }
        if (!chkCreateDateUnknow.isSelected()) {
            if (conditon.contains("where")) {
                conditon += " and convert(varchar(25), createDate, 126) like '" + MyUtil.getDateStr(dcCreateDate) + "%'";
            } else {
                conditon += " where convert(varchar(25), createDate, 126) like '" + MyUtil.getDateStr(dcCreateDate) + "%'";
            }
        }
        if (!chkEndDateUnknow.isSelected()) {
            if (conditon.contains("where")) {
                conditon += " and convert(varchar(25), endDate, 126) like '" + MyUtil.getDateStr(dcEndDate) + "%'";
            } else {
                conditon += " where convert(varchar(25), endDate, 126) like '" + MyUtil.getDateStr(dcEndDate) + "%'";
            }
        }
        //JOptionPane.showMessageDialog(null, conditon);
        initTable();
        lstProject = projectBUS.searchProject(conditon);
        fillData(lstProject);
    }
}
