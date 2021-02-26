/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.rowset.serial.SerialBlob;
import swing.helpers.DatabaseHelper;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class UserDao {

    public User checkLogin(String telephone, String password) throws Exception {
        String sql = "select telephone, password from User where "
                + " telephone=? and password=?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, telephone);
            pstmt.setString(2, password);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()) {
                    User u = new User();
                    u.setTelephone(telephone);
                    return u;
                }
            }
        }
        return null;
    }
    public boolean insertUser(User u) throws Exception {
        
        String sql = "INSERT INTO dbo.User(Telephone,FirstName,LastName,Address,Country,Sex,Password,Picture)" +
                "VALUES(?,?,?,?,?,?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, u.getTelephone());
            pstmt.setString(2, u.getFirstName());
            pstmt.setString(3, u.getLastName());
            pstmt.setString(4, u.getAddress());
            pstmt.setString(5, u.getCountry());
            pstmt.setInt(6, u.getSex());
            pstmt.setString(7, u.getPassword());
            if (u.getPicture() != null) {
                Blob picture = new SerialBlob(u.getPicture());
                pstmt.setBlob(8, picture);
            } else{
                Blob picture = null;
                pstmt.setBlob(8, picture);
            }
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean updateUser(User u) throws Exception {
        
        
        String sql = "UPDATE dbo.User" +
                " SET FirstName = ?,LastName = ?,Address = ?,Country = ?,Sex = ?,Password = ?,Picture = ?" +
                " WHERE Telephone = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(8, u.getTelephone());
            pstmt.setString(1, u.getFirstName());
            pstmt.setString(2, u.getLastName());
            pstmt.setString(3, u.getAddress());
            pstmt.setString(4, u.getCountry());
            pstmt.setInt(5, u.getSex());
            pstmt.setString(6, u.getPassword());
            if (u.getPicture() != null) {
                Blob picture = new SerialBlob(u.getPicture());
                pstmt.setBlob(7, picture);
            } else{
                Blob picture = null;
                pstmt.setBlob(7, picture);
            }
            return pstmt.executeUpdate() > 0;
        }
    }
}
