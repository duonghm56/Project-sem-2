/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.ui;

/**
 *
 * @author Luu Bi
 */
public class FrameTest extends javax.swing.JFrame {

    /**
     * Creates new form FrameTest
     */
    public FrameTest() {
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

        adminPanel1 = new com.c1212l.etm.ui.AdminPanel();
        locationPanel1 = new com.c1212l.etm.ui.LocationPanel();
        locationPanel2 = new com.c1212l.etm.ui.LocationPanel();
        employeePanel1 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel2 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel3 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel5 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel6 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel7 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel8 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel4 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel9 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel10 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel11 = new com.c1212l.etm.ui.EmployeePanel();
        employeePanel12 = new com.c1212l.etm.ui.EmployeePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeePanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeePanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.c1212l.etm.ui.AdminPanel adminPanel1;
    private com.c1212l.etm.ui.EmployeePanel employeePanel1;
    private com.c1212l.etm.ui.EmployeePanel employeePanel10;
    private com.c1212l.etm.ui.EmployeePanel employeePanel11;
    private com.c1212l.etm.ui.EmployeePanel employeePanel12;
    private com.c1212l.etm.ui.EmployeePanel employeePanel2;
    private com.c1212l.etm.ui.EmployeePanel employeePanel3;
    private com.c1212l.etm.ui.EmployeePanel employeePanel4;
    private com.c1212l.etm.ui.EmployeePanel employeePanel5;
    private com.c1212l.etm.ui.EmployeePanel employeePanel6;
    private com.c1212l.etm.ui.EmployeePanel employeePanel7;
    private com.c1212l.etm.ui.EmployeePanel employeePanel8;
    private com.c1212l.etm.ui.EmployeePanel employeePanel9;
    private com.c1212l.etm.ui.LocationPanel locationPanel1;
    private com.c1212l.etm.ui.LocationPanel locationPanel2;
    // End of variables declaration//GEN-END:variables
}
