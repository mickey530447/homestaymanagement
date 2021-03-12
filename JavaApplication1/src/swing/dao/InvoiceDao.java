/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JTextField;
import swing.helpers.DatabaseHelper;
import swing.helpers.SharedData;
import swing.model.Homestay;
import swing.model.Review;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class InvoiceDao {
    public User u = SharedData.u;
    public Homestay bHome = SharedData.bookingHome;
    
    public boolean bookHomestay(JTextField jt) throws Exception{

        String sql = "INSERT INTO [Invoice](User_telephone,Homestay_id,Days)" +
            " VALUES(?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, u.getTelephone());
            pstmt.setString(2, bHome.getID());
            pstmt.setString(3, jt.getText());
            return pstmt.executeUpdate() > 0;
        }
    }
}
