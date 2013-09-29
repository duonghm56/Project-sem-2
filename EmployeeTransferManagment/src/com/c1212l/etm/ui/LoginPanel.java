/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

import com.c1212l.etm.client.ui.ClientUI1;
import com.c1212l.etm.client.ui.FrameTestTransferHistory;
import com.c1212l.etm.dal.LoginDAO;
import com.c1212l.etm.dto.Login;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luu Bi
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLoginPanel
     */
    public LoginPanel() {
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

        btnExit2 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnExit2.setText("Exit");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblPassword.setText("Password");

        lblUserName.setText("Email:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("         Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(46, 46, 46)
                        .addComponent(btnExit2))
                    .addComponent(txtEmail)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit2))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        try{
            int n = JOptionPane.showConfirmDialog(
                this, "Do you want Exit?",
                "Message Dialog",
                JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                //                this.dispose();
            } else if (n == JOptionPane.NO_OPTION) {

            } else {

            }
        }
        catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
     int count =0;
        try{
            vctListAdmin = loginDAO.getAdmin();
            vctListEmployee = loginDAO.getEmployee();
            if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter all field");
                return;
            }
            if (txtPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter all field");
                return;
            }
            for (int i = 0; i < vctListAdmin.size(); i++) {
                Login login = vctListAdmin.elementAt(i);
                if (txtEmail.getText().equals(login.getEmail()) && txtPassword.getText().equals(login.getPassword()) ) {
                    email = login.getEmail();
                    AdminUI adminUI = new AdminUI();
                    adminUI.show();
                    return;
                }
            }
            int i,j;
            for(i = 0;i<vctListEmployee.size()-1 ; i++)
            {
                for(j = i+1 ; j < vctListEmployee.size()-1 ; j++)
                {
                    Login temp;
                    Login login = vctListEmployee.elementAt(i);
                    Login login1 = vctListEmployee.elementAt(j);
                    if(login1.getEmail().compareTo(login.getEmail())>0)
                    {
                        temp = vctListEmployee.elementAt(j);
                        vctListEmployee.remove(j);
                        vctListEmployee.add(j,login);
                        vctListEmployee.remove(i);
                        vctListEmployee.add(i,temp);
                    }
                }
            }
                int left=0,right=vctListEmployee.size()-1,mid;
                do{
                    mid=(left+right)/2;
                    Login login = vctListEmployee.elementAt(mid);
                    if(login.getEmail().equals(txtEmail.getText())&& login.getPassword().equals(txtPassword.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "Login success!");
                        this.hide();
                        email=login.getEmail();
                         ClientUI1 clientUI = new ClientUI1();
                         clientUI.show();
                        return;
                    }
                    else if(login.getEmail().compareTo(txtEmail.getText())<0)
                    right=mid-1;
                    else if(login.getEmail().compareTo(txtEmail.getText())>0)
                    left=mid+1;
                }while(left<=right);
                JOptionPane.showMessageDialog(null, "Login fail!");
        }catch(Exception ex){
            ex.printStackTrace();
        }


        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    public static String  email;
    private LoginDAO loginDAO = new LoginDAO();
   private Vector<Login> vctListEmployee = new Vector<Login>();
   private Vector<Login> vctListAdmin = new Vector<Login>();
}
