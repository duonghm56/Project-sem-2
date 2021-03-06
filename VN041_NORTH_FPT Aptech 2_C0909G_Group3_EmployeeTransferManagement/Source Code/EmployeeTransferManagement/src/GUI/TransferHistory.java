/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TransferDetails.java
 *
 * Created on Nov 14, 2010, 6:14:03 PM
 */
package GUI;

import DataAccess.DepartmentDAO;
import DataAccess.LocationDAO;
import DataAccess.ProjectDAO;
import Entity.Transfer;
import java.sql.SQLException;

/**
 *
 * @author Thanhnx
 */
public class TransferHistory extends javax.swing.JDialog {

    private int transferID;

    /** Creates new form TransferDetails */
    public TransferHistory() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTop = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTranferDateRequest = new javax.swing.JLabel();
        lblTransferDateRequestContent = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        lblFromLocation = new javax.swing.JLabel();
        lblToLocation = new javax.swing.JLabel();
        lblFromDepartment = new javax.swing.JLabel();
        lblToDepartment = new javax.swing.JLabel();
        lblFromProject = new javax.swing.JLabel();
        lblToProject = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaApprove = new javax.swing.JTextArea();
        lblEmployeeContent = new javax.swing.JLabel();
        lblFromLocationContent = new javax.swing.JLabel();
        lblToLocationContent = new javax.swing.JLabel();
        lblFromDepartmentContent = new javax.swing.JLabel();
        lblToDepartmentContent = new javax.swing.JLabel();
        lblFromProjectContent = new javax.swing.JLabel();
        lblToProjectContent = new javax.swing.JLabel();
        lblApproveDate = new javax.swing.JLabel();
        dateApprove = new com.toedter.calendar.JDateChooser();
        lblTransferRelievingDate = new javax.swing.JLabel();
        dateRelieving = new com.toedter.calendar.JDateChooser();
        lblTranferJoiningDate = new javax.swing.JLabel();
        dateJoining = new com.toedter.calendar.JDateChooser();
        lblTransferType = new javax.swing.JLabel();
        lblTransferTypeContent = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblApprove = new javax.swing.JLabel();
        lblApproveContent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transfer History Details");

        lblTop.setFont(new java.awt.Font("Arial", 1, 14));
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTop.setText("Transfer History Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTranferDateRequest.setText("Transfer Date Request");

        lblTransferDateRequestContent.setText(null);

        lblEmployee.setText("Employee");

        lblFromLocation.setText("From Location");

        lblToLocation.setText("To Location");

        lblFromDepartment.setText("From Department");

        lblToDepartment.setText("To Department");

        lblFromProject.setText("From Project");

        lblToProject.setText("To Project");

        lblReason.setText("Reason:");

        txaApprove.setColumns(20);
        txaApprove.setRows(5);
        txaApprove.setEnabled(false);
        jScrollPane1.setViewportView(txaApprove);

        lblEmployeeContent.setText(null);

        lblFromLocationContent.setText(null);

        lblToLocationContent.setText(null);

        lblFromDepartmentContent.setText(null);

        lblToDepartmentContent.setText(null);

        lblFromProjectContent.setText(null);

        lblToProjectContent.setText(null);

        lblApproveDate.setText("Approve Date");

        dateApprove.setEnabled(false);

        lblTransferRelievingDate.setText("Transfer Relieving Date");

        dateRelieving.setEnabled(false);

        lblTranferJoiningDate.setText("Transfer Joining Date");

        dateJoining.setEnabled(false);

        lblTransferType.setText("Transfer Type");

        lblTransferTypeContent.setText(null);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16x16/block.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblApprove.setText("Approve");

        lblApproveContent.setText(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTranferDateRequest)
                            .addComponent(lblEmployee)
                            .addComponent(lblFromLocation)
                            .addComponent(lblToLocation)
                            .addComponent(lblFromDepartment)
                            .addComponent(lblToDepartment)
                            .addComponent(lblFromProject)
                            .addComponent(lblToProject)
                            .addComponent(lblTransferRelievingDate)
                            .addComponent(lblTranferJoiningDate)
                            .addComponent(lblApproveDate)
                            .addComponent(lblReason)
                            .addComponent(lblApprove)
                            .addComponent(lblTransferType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTransferTypeContent)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateJoining, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateRelieving, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateApprove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblApproveContent)
                            .addComponent(lblToProjectContent)
                            .addComponent(lblFromProjectContent)
                            .addComponent(lblToDepartmentContent)
                            .addComponent(lblFromDepartmentContent)
                            .addComponent(lblToLocationContent)
                            .addComponent(lblFromLocationContent)
                            .addComponent(lblEmployeeContent)
                            .addComponent(lblTransferDateRequestContent)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnCancel)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTranferDateRequest)
                    .addComponent(lblTransferDateRequestContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(lblEmployeeContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFromLocation)
                    .addComponent(lblFromLocationContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToLocation)
                    .addComponent(lblToLocationContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFromDepartment)
                    .addComponent(lblFromDepartmentContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToDepartment)
                    .addComponent(lblToDepartmentContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFromProject)
                    .addComponent(lblFromProjectContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToProject)
                    .addComponent(lblToProjectContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApprove)
                    .addComponent(lblApproveContent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblReason)
                        .addGap(51, 51, 51)
                        .addComponent(lblApproveDate)
                        .addGap(13, 13, 13)
                        .addComponent(lblTransferRelievingDate)
                        .addGap(12, 12, 12)
                        .addComponent(lblTranferJoiningDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateApprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateRelieving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateJoining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransferType)
                    .addComponent(lblTransferTypeContent))
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCancelActionPerformed

    public void loadTransferHistoryDetails(Transfer objTransfer) throws SQLException {
        String fromLocation = LocationDAO.getLocationName(objTransfer.getFromLocationID());
        String fromDepartment = DepartmentDAO.getDepartmentName(objTransfer.getFromDepartmentID());
        String fromProject = ProjectDAO.getProjectName(objTransfer.getFromProjectID());
        String toLocation = LocationDAO.getLocationName(objTransfer.getToLocationID());
        String toDepartment = DepartmentDAO.getDepartmentName(objTransfer.getToDepartmentID());
        String toProject = ProjectDAO.getProjectName(objTransfer.getToProjectID());
        int transferTypeID = objTransfer.getTransferTypeID();
        transferID = objTransfer.getTransferID();
        lblTransferDateRequestContent.setText(objTransfer.getRequestDate().toString());
        lblEmployeeContent.setText(String.valueOf(objTransfer.getEmployeeID()));
        lblFromLocationContent.setText(fromLocation);
        lblToLocationContent.setText(toLocation);
        lblFromDepartmentContent.setText(fromDepartment);
        lblToDepartmentContent.setText(toDepartment);
        lblFromProjectContent.setText(fromProject);
        lblToProjectContent.setText(toProject);
        lblApproveContent.setText(objTransfer.getApprove());
        txaApprove.setText(objTransfer.getReason());
        dateApprove.setDate(objTransfer.getApproveDate());
        dateRelieving.setDate(objTransfer.getTransferRelievingDate());
        dateJoining.setDate(objTransfer.getTransferJoiningDate());
        if (transferTypeID == 1) {
            lblTransferTypeContent.setText("Administrator");
        } else {
            lblTransferTypeContent.setText("Employee");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TransferHistory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private com.toedter.calendar.JDateChooser dateApprove;
    private com.toedter.calendar.JDateChooser dateJoining;
    private com.toedter.calendar.JDateChooser dateRelieving;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApprove;
    private javax.swing.JLabel lblApproveContent;
    private javax.swing.JLabel lblApproveDate;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblEmployeeContent;
    private javax.swing.JLabel lblFromDepartment;
    private javax.swing.JLabel lblFromDepartmentContent;
    private javax.swing.JLabel lblFromLocation;
    private javax.swing.JLabel lblFromLocationContent;
    private javax.swing.JLabel lblFromProject;
    private javax.swing.JLabel lblFromProjectContent;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblToDepartment;
    private javax.swing.JLabel lblToDepartmentContent;
    private javax.swing.JLabel lblToLocation;
    private javax.swing.JLabel lblToLocationContent;
    private javax.swing.JLabel lblToProject;
    private javax.swing.JLabel lblToProjectContent;
    private javax.swing.JLabel lblTop;
    private javax.swing.JLabel lblTranferDateRequest;
    private javax.swing.JLabel lblTranferJoiningDate;
    private javax.swing.JLabel lblTransferDateRequestContent;
    private javax.swing.JLabel lblTransferRelievingDate;
    private javax.swing.JLabel lblTransferType;
    private javax.swing.JLabel lblTransferTypeContent;
    private javax.swing.JTextArea txaApprove;
    // End of variables declaration//GEN-END:variables
}
