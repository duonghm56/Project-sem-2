/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Bussiness.TableModelTransfer;
import Bussiness.TableModelTransferHistory;
import Entity.Transfer;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanhnx
 */
public class TransferDAO {

    private static Connection conn;
    private static CallableStatement cs = null;
    private static ResultSet rs = null;
    private static Transfer objTransfer = null;

    public static int countTotalRequest() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalRequest}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static int countTotalApprove() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalApprove}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static int countTotalNotApprove() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalNotApprove}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static int countTotalWaiting() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spTotalTransferWaiting}");
        rs = cs.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
        }
        conn.close();
        return count;
    }

    public static int countTransferByToDepartmentID(int ID) {
        int count = 0;
        try {

            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetTransferByToDepartmentID(?)}");
            cs.setInt(1, ID);
            rs = cs.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public static int countTransferByEmployeeID(int ID) {
        int count = 0;
        try {

            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spGetTransferByEmployeeID(?)}");
            cs.setInt(1, ID);
            rs = cs.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public static void loadTransferToTable() throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetTransfer}");
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void loadToTableHistory(int employeeID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spSearchTransferByEmployeeID(?)}");
            cs.setInt(1, employeeID);
            rs = cs.executeQuery();
            while (rs.next()) {
                objTransfer = new Transfer();
                objTransfer.setTransferID(rs.getInt(1));
                objTransfer.setTransferTypeID(rs.getInt(2));
                objTransfer.setEmployeeID(rs.getInt(3));
                objTransfer.setFromProjectID(rs.getInt(4));
                objTransfer.setToProjectID(rs.getInt(5));
                objTransfer.setFromDepartmentID(rs.getInt(6));
                objTransfer.setToDepartmentID(rs.getInt(7));
                objTransfer.setFromLocationID(rs.getInt(8));
                objTransfer.setToLocationID(rs.getInt(9));
                objTransfer.setTransferRelievingDate(rs.getDate(10));
                objTransfer.setTransferJoiningDate(rs.getDate(11));
                objTransfer.setRequestDate(rs.getDate(12));
                objTransfer.setReason(rs.getString(13));
                objTransfer.setApprove(rs.getString(14));
                objTransfer.setApproveDate(rs.getDate(15));
                TableModelTransferHistory.addTransfer(objTransfer);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TransferDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadToTableHistoryByDateTime(java.util.Date start, java.util.Date end) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spSearchTransferByDate(?,?)}");
            cs.setDate(1, new Date(start.getTime()));
            cs.setDate(2, new Date(end.getTime()));
            rs = cs.executeQuery();
            while (rs.next()) {
                objTransfer = new Transfer();
                objTransfer.setTransferID(rs.getInt(1));
                objTransfer.setTransferTypeID(rs.getInt(2));
                objTransfer.setEmployeeID(rs.getInt(3));
                objTransfer.setFromProjectID(rs.getInt(4));
                objTransfer.setToProjectID(rs.getInt(5));
                objTransfer.setFromDepartmentID(rs.getInt(6));
                objTransfer.setToDepartmentID(rs.getInt(7));
                objTransfer.setFromLocationID(rs.getInt(8));
                objTransfer.setToLocationID(rs.getInt(9));
                objTransfer.setTransferRelievingDate(rs.getDate(10));
                objTransfer.setTransferJoiningDate(rs.getDate(11));
                objTransfer.setRequestDate(rs.getDate(12));
                objTransfer.setReason(rs.getString(13));
                objTransfer.setApprove(rs.getString(14));
                objTransfer.setApproveDate(rs.getDate(15));
                TableModelTransfer.addTransfer(objTransfer);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TransferDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Transfer getTransferByID(int TransferID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spGetTransferByID(?)}");
        cs.setInt(1, TransferID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
        }
        return objTransfer;
    }

    public static void insertTransfer(Transfer objTransfer) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spInsertTransfer(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cs.setInt(1, objTransfer.getTransferTypeID());
        cs.setInt(2, objTransfer.getEmployeeID());
        cs.setInt(3, objTransfer.getFromProjectID());
        cs.setInt(4, objTransfer.getToProjectID());
        cs.setInt(5, objTransfer.getFromDepartmentID());
        cs.setInt(6, objTransfer.getToDepartmentID());
        cs.setInt(7, objTransfer.getFromLocationID());
        cs.setInt(8, objTransfer.getToLocationID());
        cs.setDate(9, new Date(objTransfer.getTransferRelievingDate().getTime()));
        cs.setDate(10, new Date(objTransfer.getTransferJoiningDate().getTime()));
        cs.setDate(11, new Date(objTransfer.getRequestDate().getTime()));
        cs.setString(12, objTransfer.getReason());
        cs.setString(13, objTransfer.getApprove());
        cs.setDate(14, new Date(objTransfer.getApproveDate().getTime()));
        cs.executeUpdate();
    }

    public static void insertRequestTransfer(Transfer objTransfer) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spInsertRequestTransfer(?,?,?,?,?,?,?,?,?,?,?)}");
        cs.setInt(1, objTransfer.getTransferTypeID());
        cs.setInt(2, objTransfer.getEmployeeID());
        cs.setInt(3, objTransfer.getFromProjectID());
        cs.setInt(4, objTransfer.getToProjectID());
        cs.setInt(5, objTransfer.getFromDepartmentID());
        cs.setInt(6, objTransfer.getToDepartmentID());
        cs.setInt(7, objTransfer.getFromLocationID());
        cs.setInt(8, objTransfer.getToLocationID());
        cs.setDate(9, new Date(objTransfer.getRequestDate().getTime()));
        cs.setString(10, objTransfer.getReason());
        cs.setString(11, objTransfer.getApprove());
        cs.executeUpdate();
    }

    public static void approveTransfer(Transfer objTransfer) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spApprove(?,?,?,?,?)}");
            cs.setInt(1, objTransfer.getTransferID());
            cs.setDate(2, new Date(objTransfer.getTransferRelievingDate().getTime()));
            cs.setDate(3, new Date(objTransfer.getTransferJoiningDate().getTime()));
            cs.setString(4, objTransfer.getApprove());
            cs.setDate(5, new Date(objTransfer.getApproveDate().getTime()));
            cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TransferDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void notApproveTransfer(Transfer objTransfer) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spNotApprove(?,?)}");
            cs.setInt(1, objTransfer.getTransferID());
            cs.setString(2, objTransfer.getApprove());
            cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TransferDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void searchTransferByEmployeeID(int employeeID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByEmployeeID(?)}");
        cs.setInt(1, employeeID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByFromLocation(int locationID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByFromLocationID(?)}");
        cs.setInt(1, locationID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByFromDepartment(int departmentID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByFromDepartmentID(?)}");
        cs.setInt(1, departmentID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByFromProject(int projectID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByFromProjectID(?)}");
        cs.setInt(1, projectID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByToLocation(int locationID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByToLocationID(?)}");
        cs.setInt(1, locationID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByToDepartment(int departmentID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByToDepartmentID(?)}");
        cs.setInt(1, departmentID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByToProject(int projectID) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByToProjectID(?)}");
        cs.setInt(1, projectID);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void searchTransferByApprove(String approve) throws SQLException {
        conn = connection.getConnectionUrl();
        cs = conn.prepareCall("{call spSearchTransferByStatus(?)}");
        cs.setString(1, approve);
        rs = cs.executeQuery();
        while (rs.next()) {
            objTransfer = new Transfer();
            objTransfer.setTransferID(rs.getInt(1));
            objTransfer.setTransferTypeID(rs.getInt(2));
            objTransfer.setEmployeeID(rs.getInt(3));
            objTransfer.setFromProjectID(rs.getInt(4));
            objTransfer.setToProjectID(rs.getInt(5));
            objTransfer.setFromDepartmentID(rs.getInt(6));
            objTransfer.setToDepartmentID(rs.getInt(7));
            objTransfer.setFromLocationID(rs.getInt(8));
            objTransfer.setToLocationID(rs.getInt(9));
            objTransfer.setTransferRelievingDate(rs.getDate(10));
            objTransfer.setTransferJoiningDate(rs.getDate(11));
            objTransfer.setRequestDate(rs.getDate(12));
            objTransfer.setReason(rs.getString(13));
            objTransfer.setApprove(rs.getString(14));
            objTransfer.setApproveDate(rs.getDate(15));
            TableModelTransfer.addTransfer(objTransfer);
        }
        conn.close();
    }

    public static void deleteTransfer(int transferID) {
        try {
            conn = connection.getConnectionUrl();
            cs = conn.prepareCall("{call spDeleteTransfer(?)}");
            cs.setInt(1, transferID);
            cs.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
