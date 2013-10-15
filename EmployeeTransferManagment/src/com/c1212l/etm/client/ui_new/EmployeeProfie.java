/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.client.ui_new;

import com.c1212l.etm.bll.EmployeeBUS;
import com.c1212l.etm.dao.EmployeeDAO;
import com.c1212l.etm.dto.Employee;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luu Bi
 */
public class EmployeeProfie extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeProfie
     */
    public EmployeeProfie() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        lblWorkExperience = new javax.swing.JLabel();
        lblTitle4 = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCurrentDepartment = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCurrentProject = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblCurrentLocation = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPhoto = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Profile"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Information"));

        jLabel1.setText("Employee Number");

        lblNumber.setForeground(new java.awt.Color(153, 0, 0));
        lblNumber.setText("jLabel2");

        lblFullName.setForeground(new java.awt.Color(153, 0, 0));
        lblFullName.setText("jLabel1");

        jLabel3.setText("Full Name:");

        jLabel6.setText("Email");

        lblEmail.setForeground(new java.awt.Color(153, 0, 0));
        lblEmail.setText("jLabel15");

        jLabel4.setText("Gender");

        lblGender.setForeground(new java.awt.Color(153, 0, 0));
        lblGender.setText("jLabel2");

        jLabel5.setText("Birthday");

        lblBirthday.setForeground(new java.awt.Color(153, 0, 0));
        lblBirthday.setText("jLabel14");

        jLabel7.setText("Address");

        lblAddress.setForeground(new java.awt.Color(153, 0, 0));
        lblAddress.setText("jLabel16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFullName)
                    .addComponent(lblNumber)
                    .addComponent(lblGender))
                .addGap(140, 140, 140)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblBirthday)
                            .addComponent(lblEmail))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNumber)
                    .addComponent(jLabel5)
                    .addComponent(lblBirthday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblFullName)
                    .addComponent(jLabel6)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblGender)
                    .addComponent(jLabel7)
                    .addComponent(lblAddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Work Information"));

        lblTitle2.setText("Role");

        lblRole.setForeground(new java.awt.Color(153, 0, 0));
        lblRole.setText("jLabel20");

        lblTitle3.setText("Work Experience");

        lblWorkExperience.setForeground(new java.awt.Color(153, 0, 0));
        lblWorkExperience.setText("jLabel21");

        lblTitle4.setText("Salary");

        lblSalary.setForeground(new java.awt.Color(153, 0, 0));
        lblSalary.setText("jLabel22");

        jLabel8.setText("Current Department");

        lblCurrentDepartment.setForeground(new java.awt.Color(153, 0, 0));
        lblCurrentDepartment.setText("jLabel17");

        jLabel9.setText("Current Project");

        lblCurrentProject.setForeground(new java.awt.Color(153, 0, 0));
        lblCurrentProject.setText("jLabel18");

        lblTitle1.setText("Current Location");

        lblCurrentLocation.setForeground(new java.awt.Color(153, 0, 0));
        lblCurrentLocation.setText("jLabel19");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle2)
                    .addComponent(lblTitle3)
                    .addComponent(lblTitle4))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalary)
                    .addComponent(lblRole)
                    .addComponent(lblWorkExperience))
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(lblTitle1))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrentDepartment)
                    .addComponent(lblCurrentProject)
                    .addComponent(lblCurrentLocation))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle2)
                            .addComponent(lblRole))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle3)
                            .addComponent(lblWorkExperience))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle4)
                            .addComponent(lblSalary)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblCurrentDepartment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblCurrentProject))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle1)
                            .addComponent(lblCurrentLocation))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCurrentDepartment;
    private javax.swing.JLabel lblCurrentLocation;
    private javax.swing.JLabel lblCurrentProject;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblTitle4;
    private javax.swing.JLabel lblWorkExperience;
    // End of variables declaration//GEN-END:variables
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        try {
            this.employee = employee;
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeProfie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeProfie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadData() throws SQLException, ClassNotFoundException {
        lblFullName.setText(employee.getEmployeeName());
        lblNumber.setText(employee.getEmployeeNumber());
        lblEmail.setText(employee.getEmail());
        lblSalary.setText(employee.getSalary() + "");
        lblBirthday.setText(employee.getBirthday() + "");
        lblAddress.setText(employee.getAddress());
        lblCurrentDepartment.setText(employee.getEmployeeDepartment());
        lblCurrentProject.setText(employee.getEmployeeProject());
        lblCurrentLocation.setText(employee.getEmployeeLocation());
        lblRole.setText(employee.getRole());
        lblWorkExperience.setText("" + employee.getWorkExperience());
        if (employee.getGender() == true) {
            lblGender.setText("Male");
            lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/319.png")));
        } else if (employee.getGender() == false) {
            lblGender.setText("Female");
            lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_new/Female_guestblogger1.png")));
        }
    }

    @Override
    public void validate() {
        try {
            super.validate();
            if(employee!=null){
                employee = new EmployeeDAO().getEmployeeByID(employee.getEmployeeID());
                loadData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeProfie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeProfie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
