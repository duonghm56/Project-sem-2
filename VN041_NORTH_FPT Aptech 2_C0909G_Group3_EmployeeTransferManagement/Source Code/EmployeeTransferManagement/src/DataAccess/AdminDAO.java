/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entity.Admin;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PROXUANTHI
 */
public class AdminDAO {

    private static Connection conn = null;
    private static CallableStatement cs = null;
    private static ResultSet rs = null;
    private static Admin objAdmin = null;

    public AdminDAO() {
    }

    public static Admin getAdminFromDB(String email) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetAdmin(?)}");
            cs.setString(1, email);
            rs = cs.executeQuery();
            while (rs.next()) {
                objAdmin = new Admin();
                objAdmin.setAdminID(rs.getInt(1));
                objAdmin.setEmail(rs.getString(2));
                objAdmin.setPassWord(rs.getString(3));
                objAdmin.setFullName(rs.getString(4));
            }
        } catch (SQLException ex) {
        }
        return objAdmin;
    }

    public static void ChangePassWord(String oldPass, String newPass) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spChangePasswordAdmin(?,?)}");
            cs.setString(1, oldPass);
            cs.setString(2, newPass);
            cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
