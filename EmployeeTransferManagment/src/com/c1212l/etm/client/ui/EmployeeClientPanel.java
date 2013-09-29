/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.client.ui;

import com.c1212l.etm.dal.EmployeeClientDAO;
import com.c1212l.etm.dto.Employee;
import com.c1212l.etm.dto.EmployeeClient;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luu Bi
 */
public class EmployeeClientPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeClientPanel
     */
    public EmployeeClientPanel() {
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

        txtCurrentDepartment = new javax.swing.JTextField();
        txtWorkExperience = new javax.swing.JTextField();
        txtCurrentLocation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCurrentProject = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("User Profile"));

        txtCurrentDepartment.setEnabled(false);

        txtWorkExperience.setEnabled(false);

        txtCurrentLocation.setEnabled(false);

        jLabel6.setText("Email");

        jLabel7.setText("Address");

        jLabel5.setText("Birthday");

        txtSalary.setEnabled(false);

        txtEmail.setEnabled(false);

        jLabel13.setText("Salary");

        txtBirthday.setEnabled(false);

        txtGender.setEnabled(false);

        txtFullName.setEnabled(false);

        jLabel12.setText("Work Experience");

        jLabel10.setText("Current Location");

        jLabel11.setText("Role");

        jLabel9.setText("Current Project");

        txtCurrentProject.setEnabled(false);

        jLabel4.setText("Gender");

        jLabel8.setText("Current Department");

        txtRole.setEnabled(false);

        jLabel3.setText("Full Name:");

        txtAddress.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFullName)
                    .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtBirthday)
                    .addComponent(txtEmail)
                    .addComponent(txtAddress))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCurrentDepartment)
                    .addComponent(txtWorkExperience)
                    .addComponent(txtCurrentLocation, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary)
                    .addComponent(txtCurrentProject))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCurrentDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCurrentProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtCurrentLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtWorkExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtCurrentDepartment;
    private javax.swing.JTextField txtCurrentLocation;
    private javax.swing.JTextField txtCurrentProject;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtWorkExperience;
    // End of variables declaration//GEN-END:variables
   private EmployeeClientDAO emplClientDAO = new EmployeeClientDAO();
    private Vector<EmployeeClient> vctList = new Vector<EmployeeClient>();
    private Employee employee= new Employee();
    private void loadData()
    {
        try {
            vctList = emplClientDAO.getEmployeeClient();
            for (int i = 0; i < vctList.size(); i++) {
                EmployeeClient employeeClient  = vctList.elementAt(i);
                txtFullName.setText(employeeClient.getFullName());
                txtEmail.setText(employeeClient.getEmail());
                txtSalary.setText(employeeClient.getSalary()+"");
                txtBirthday.setText(employeeClient.getBirthday()+"");
                txtAddress.setText(employeeClient.getAddress());
                txtCurrentDepartment.setText(employeeClient.getCurrentDepartment());
                txtCurrentProject.setText(employeeClient.getCurrentProject());
                txtCurrentLocation.setText(employeeClient.getCurrentLocation());
                txtRole.setText(employeeClient.getRole());
                txtWorkExperience.setText(employeeClient.getWorkExperience());
                if (employee.getGender() == true) {
                    txtGender.setText("Male");
                }
                else if(employee.getGender() == false)
                {
                    txtGender.setText("Female");
                }               
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeClientUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeClientUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
