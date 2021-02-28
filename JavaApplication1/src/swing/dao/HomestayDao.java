/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.rowset.serial.SerialBlob;
import swing.helpers.DatabaseHelper;
import swing.model.Homestay;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class HomestayDao {
    public boolean insertHomestay(Homestay home) throws Exception {
        
        String sql = "INSERT INTO [Homestay](Telephone,FirstName,LastName,Address,Country,Sex,Password,Picture)" +
                "VALUES(?,?,?,?,?,?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, home.getTelephone());
            pstmt.setString(2, home.getFirstName());
            pstmt.setString(3, home.getLastName());
            pstmt.setString(4, home.getAddress());
            pstmt.setString(5, home.getCountry());
            pstmt.setInt(6, home.getSex());
            pstmt.setString(7, home.getPassword());
            if (home.getPicture() != null) {
                Blob picture = new SerialBlob(home.getPicture());
                pstmt.setBlob(8, picture);
            } else{
                Blob picture = null;
                pstmt.setBlob(8, picture);
            }
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean updateUser(Homestay home) throws Exception {
        
        
        String sql = "UPDATE [Homestay]" +
                " SET FirstName = ?,LastName = ?,Address = ?,Country = ?,Sex = ?,Password = ?,Picture = ?" +
                " WHERE Telephone = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(8, home.getTelephone());
            pstmt.setString(1, home.getFirstName());
            pstmt.setString(2, home.getLastName());
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
