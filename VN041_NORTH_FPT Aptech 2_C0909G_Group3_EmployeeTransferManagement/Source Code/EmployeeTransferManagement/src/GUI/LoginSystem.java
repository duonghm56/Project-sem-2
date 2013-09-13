/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginJDialog.java
 *
 * Created on Aug 17, 2010, 4:56:48 PM
 */
package GUI;

import DataAccess.AdminDAO;
import DataAccess.EmployeeDAO;
import DataAccess.connection;
import Entity.Admin;
import Entity.Employee;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Thanhnx
 */
public class LoginSystem extends javax.swing.JDialog {

    private Admin objAdmin = new Admin();
    private Employee objEmployee = new Employee();

    /** Creates new form LoginJDialog */
    public LoginSystem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public void Login() {
        String email = txtUsername.getText();
        String password = String.valueOf(jPassword.getPassword());
        Boolean b = false;

        if (rdEmployee.isSelected()) {
            //check connect to database
            if (connection.getConnectionUrl() != null) {
                objEmployee = EmployeeDAO.getEmployeeDB(email);
                if (objEmployee != null) {
                    if (objEmployee.getEmail().equals(email) && objEmployee.getPassword().equals(password)) {
                        b = true;
                        MainEmployee mainE = new MainEmployee();
                        this.dispose();
                        mainE.setLocationRelativeTo(mainE);
                        mainE.setVisible(true);
                        mainE.LoadEmployee(objEmployee);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password !");
                        jPassword.setText("");
                        jPassword.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Email !");
                    txtUsername.setText("");
                    jPassword.setText("");
                    txtUsername.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Can not connect to database");
            }

        }
        if (rdAdministrator.isSelected()) {
            //check connect to database
            if (connection.getConnectionUrl() != null) {
                objAdmin = AdminDAO.getAdminFromDB(email);
                if (objAdmin != null) {
                    if (objAdmin.getEmail().equals(email) && objAdmin.getPassWord().equals(password)) {
                        b = true;
                        MainAdministrator mainA = new MainAdministrator();
                        this.dispose();
                        mainA.setLocationRelativeTo(mainA);
                        mainA.setVisible(true);
                        mainA.loadAdmin(objAdmin);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password !");
                        jPassword.setText("");
                        jPassword.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Email !");
                    txtUsername.setText("");
                    jPassword.setText("");
                    txtUsername.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Can not connect to database");
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        rdEmployee = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        rdAdministrator = new javax.swing.JRadioButton();
        btnConfig = new javax.swing.JButton();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Employee Transfer Management System");
        setMinimumSize(new java.awt.Dimension(595, 355));
        setResizable(false);
        getContentPane().setLayout(null);

        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(170, 120, 180, 20);

        jPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(jPassword);
        jPassword.setBounds(170, 150, 180, 20);

        rdEmployee.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdEmployee);
        rdEmployee.setFont(new java.awt.Font("Tahoma", 1, 11));
        rdEmployee.setForeground(new java.awt.Color(0, 153, 153));
        rdEmployee.setText("Employee");
        getContentPane().add(rdEmployee);
        rdEmployee.setBounds(170, 190, 80, 23);

        btnLogin.setFont(new java.awt.Font(".VnCourier New", 1, 18));
        btnLogin.setForeground(new java.awt.Color(0, 153, 153));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16x16/accept.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnLoginKeyTyped(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(100, 230, 110, 25);

        btnReset.setFont(new java.awt.Font(".VnCourier New", 1, 18));
        btnReset.setForeground(new java.awt.Color(0, 153, 153));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16x16/refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setContentAreaFilled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(200, 230, 110, 25);

        btnExit.setFont(new java.awt.Font(".VnCourier New", 1, 18));
        btnExit.setForeground(new java.awt.Color(0, 153, 153));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16x16/block.png"))); // NOI18N
        btnExit.setText("Cancel");
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(290, 230, 120, 25);

        rdAdministrator.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdAdministrator);
        rdAdministrator.setFont(new java.awt.Font("Tahoma", 1, 11));
        rdAdministrator.setForeground(new java.awt.Color(0, 153, 153));
        rdAdministrator.setSelected(true);
        rdAdministrator.setText("Administrator");
        getContentPane().add(rdAdministrator);
        rdAdministrator.setBounds(250, 190, 110, 23);

        btnConfig.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnConfig.setForeground(new java.awt.Color(255, 255, 255));
        btnConfig.setText("Click here config server if  not connect database");
        btnConfig.setContentAreaFilled(false);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfig);
        btnConfig.setBounds(223, 290, 310, 23);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/loginBg.jpg"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(0, 0, 590, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUsername.setText("");
        jPassword.setText("");
        txtUsername.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
        configServer server = new configServer();
        server.setLocationRelativeTo(server);
        this.dispose();
        server.setVisible(true);

    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            Login();
        }
    }//GEN-LAST:event_btnLoginKeyTyped

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            Login();
        }
    }//GEN-LAST:event_jPasswordKeyTyped

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            Login();
        }
    }//GEN-LAST:event_txtUsernameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
                }
                LoginSystem dialog = new LoginSystem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel lblBg;
    private javax.swing.JRadioButton rdAdministrator;
    private javax.swing.JRadioButton rdEmployee;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
