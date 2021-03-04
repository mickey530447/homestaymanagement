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
        String sql = "INSERT INTO [Homestay](Telephone,Name,Address,Price,Picture)" +
                "VALUES(?,?,?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, home.getTelephone());
            pstmt.setString(2, home.getName());
            pstmt.setString(3, home.getAddress());
            pstmt.setDouble(4, home.getPrice());
            if (home.getPicture() != null) {
                Blob picture = new SerialBlob(home.getPicture());
                pstmt.setBlob(5, picture);
            } else{
                Blob picture = null;
                pstmt.setBlob(5, picture);
            }
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean updateUser(Homestay home) throws Exception {
        
        
        String sql = "UPDATE [Homestay]" +
                " SET Name = ?,Address = ?,Price = ?,Picture = ?" +
                " WHERE Telephone = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(5, home.getTelephone());
            pstmt.setString(1, home.getName());
            pstmt.setString(2, home.getAddress());
            pstmt.setDouble(3, home.getPrice());
            if (home.getPicture() != null) {
                Blob picture = new SerialBlob(home.getPicture());
                pstmt.setBlob(4, picture);
            } else{
                Blob picture = null;
                pstmt.setBlob(4, picture);
            }
            return pstmt.executeUpdate() > 0;
        }
    }
}
