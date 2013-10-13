/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.client.ui_new;

import com.c1212l.etm.bll.TransferBUS;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.Transfer;
import com.c1212l.etm.ui.ProjectPanel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luu Bi
 */
public class TransferHistoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransferHistoryPanel
     */
    public TransferHistoryPanel() {
        initComponents();                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransferHistory = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Transfer History"));

        tbTransferHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbTransferHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTransferHistory;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tblModel;
    ArrayList<Transfer> lstTransfer;
    Employee employee;
    TransferBUS transferBUS = new TransferBUS();
    Vector header = new Vector();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
        reloadData();
        initTable();
    }

    private void initTable() {
        header = new Vector();
        //---Ko hien thi
        header.add("ID");
        header.add("Type");
        //------------------------------------
        header.add("Employee Number");
        header.add("Name");
        //---Ko hien thi        
        header.add("Relieving Date");
        header.add("Joining Date");
        header.add("Request Date");
        header.add("Reason");
        header.add("Approve Date");
        //------------------------------------        
        header.add("From Project");
        header.add("To Project");
        header.add("From Department");
        header.add("To Department");
        header.add("From Location");
        header.add("To Location");
        header.add("Appove");
        tblModel = new DefaultTableModel(header, 0);
        tbTransferHistory.setModel(tblModel);
        
        makeInvisibleColumn(1);
        makeInvisibleColumn(2);
        makeInvisibleColumn(3);        
        makeInvisibleColumn(6);
        makeInvisibleColumn(7);
        makeInvisibleColumn(13);
        makeInvisibleColumn(14);

    }

    private void makeInvisibleColumn(int col) {
        tbTransferHistory.getColumnModel().getColumn(col).setMaxWidth(0);
        tbTransferHistory.getColumnModel().getColumn(col).setMinWidth(0);
        tbTransferHistory.getColumnModel().getColumn(col).setPreferredWidth(0);
        tbTransferHistory.getColumnModel().getColumn(col).setResizable(false);
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
            if(employee != null){
                fillData(transferBUS.getAllTransferByEmplID(employee.getEmployeeID()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void validate() {        
        reloadData();
    }
    
    
}
