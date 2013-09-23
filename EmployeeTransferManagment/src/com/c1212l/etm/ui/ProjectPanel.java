/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.dto.Project;
import com.c1212l.etm.bll.ProjectBUS;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OLDPC
 */
public class ProjectPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProjectPanel
     */
    public ProjectPanel() {
        try {
            initComponents();
            initTable();
            lstProject = projectBUS.getAllProject();
            fillData(lstProject);
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

        lblProjectID = new javax.swing.JLabel();
        txtProjectID = new javax.swing.JTextField();
        txtProjectName = new javax.swing.JTextField();
        lblProjectName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProject = new javax.swing.JTable();
        lblCreateDate = new javax.swing.JLabel();
        txtCreateDate = new javax.swing.JTextField();
        lblEndDate = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Project Manager"));

        lblProjectID.setText("Project ID");

        txtProjectID.setEditable(false);

        txtProjectName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProjectNameKeyReleased(evt);
            }
        });

        lblProjectName.setText("Project Name");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblProject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Project ID", "Project Name", "Create Date", "End Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProject);

        lblCreateDate.setText("Created Date");

        txtCreateDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreateDateKeyReleased(evt);
            }
        });

        lblEndDate.setText("End Date");

        txtEndDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEndDateKeyReleased(evt);
            }
        });

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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblProjectID)
                            .addGap(72, 72, 72)
                            .addComponent(txtProjectID, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblProjectName)
                            .addGap(56, 56, 56)
                            .addComponent(txtProjectName))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCreateDate)
                            .addGap(55, 55, 55)
                            .addComponent(txtCreateDate))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEndDate)
                            .addGap(76, 76, 76)
                            .addComponent(txtEndDate)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProjectID)
                    .addComponent(txtProjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProjectName)
                    .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateDate)
                    .addComponent(txtCreateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndDate)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(btnReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtProjectName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter project name");
        } else {
            try {
                projectBUS.addProject(txtProjectName.getText(), txtCreateDate.getText(), txtEndDate.getText());
                reloadData();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (txtProjectID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select project");
        } else {
            try {
                projectBUS.updateProject(
                        txtProjectID.getText(),
                        txtProjectName.getText(),
                        txtCreateDate.getText(),
                        txtEndDate.getText());
                reloadData();
                JOptionPane.showMessageDialog(null, "Update Success !!!");
            }catch(SQLException ex){
                if(ex.getMessage().contains("UNIQUE KEY")){
                    JOptionPane.showMessageDialog(null, "Error: Duplicate name!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtProjectID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select project");
        } else {
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    projectBUS.deleteProject(txtProjectID.getText());
                    reloadData();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProjectMouseClicked
        int selectedRow = tblProject.getSelectedRow();
        txtProjectID.setText(tblProject.getValueAt(selectedRow, 0).toString());
        txtProjectName.setText(tblProject.getValueAt(selectedRow, 1).toString());
        txtCreateDate.setText(tblProject.getValueAt(selectedRow, 2) != null ? tblProject.getValueAt(selectedRow, 2).toString() : "");
        txtEndDate.setText(tblProject.getValueAt(selectedRow, 3) != null ? tblProject.getValueAt(selectedRow, 3).toString() : "");

    }//GEN-LAST:event_tblProjectMouseClicked

    private void txtEndDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndDateKeyReleased
        try {
            if (txtProjectID.getText().equals("")) {
                loadSearchData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtEndDateKeyReleased

    private void txtCreateDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreateDateKeyReleased
        try {
            if (txtProjectID.getText().equals("")) {
                loadSearchData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCreateDateKeyReleased

    private void txtProjectNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProjectNameKeyReleased
        try {
            if (txtProjectID.getText().equals("")) {
                loadSearchData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtProjectNameKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reloadData();
    }//GEN-LAST:event_btnResetActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateDate;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblProjectID;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JTable tblProject;
    private javax.swing.JTextField txtCreateDate;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtProjectID;
    private javax.swing.JTextField txtProjectName;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Project> lstProject;
    ProjectBUS projectBUS = new ProjectBUS();

    private void initTable() {
        Vector header = new Vector();
        header.add("Project ID");
        header.add("Project Name");
        header.add("Created Date");
        header.add("End Date");
        tblModel = new DefaultTableModel(header, 0);
        tblProject.setModel(tblModel);
    }

    private void fillData(ArrayList<Project> lst) {
        if (lst != null) {
            for (Project p : lst) {
                tblModel.addRow(p.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            fillData(projectBUS.getAllProject());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initTextField() {
        txtProjectID.setText("");
        txtProjectName.setText("");
        txtCreateDate.setText("");
        txtEndDate.setText("");
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
        if (!txtCreateDate.getText().equals("")) {
            if (conditon.contains("where")) {
                conditon += " and convert(varchar(25), createDate, 126) like '" + txtCreateDate.getText() + "%'";
            } else {
                conditon += " where convert(varchar(25), createDate, 126) like '" + txtCreateDate.getText() + "%'";
            }
        }
        if (!txtEndDate.getText().equals("")) {
            if (conditon.contains("where")) {
                conditon += " and convert(varchar(25), endDate, 126) like '" + txtEndDate.getText() + "%'";
            } else {
                conditon += " where convert(varchar(25), endDate, 126) like '" + txtEndDate.getText() + "%'";
            }
        }
        //JOptionPane.showMessageDialog(null, conditon);
        initTable();
        lstProject = projectBUS.searchProject(conditon);
        fillData(lstProject);
    }
}
