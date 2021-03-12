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
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.JTextArea;
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
public class ReviewDao {
    public User u = SharedData.u;
    public Review reviewS = SharedData.review;
    public List<Review> getAllTrip() throws Exception{
        String sql = "Select [User].Telephone, [Homestay].Name,[Invoice].Review,[Invoice].Days,[Invoice].ID" +
                " FROM [Invoice]" +
                " Inner join [User] on [User].Telephone = [Invoice].User_telephone" +
                " inner join [Homestay] on [Homestay].ID = [Invoice].Homestay_id" + 
                " WHERE [User].Telephone = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, u.getTelephone());
            try (ResultSet rs = pstmt.executeQuery();){
                List<Review> list = new ArrayList<>();
                while (rs.next()){
                    Review review = new Review();
                    review.setName(rs.getString("Name"));
                    review.setReview(rs.getString("Review"));
                    review.setTelephone(rs.getString("Telephone"));
                    review.setDay(rs.getString("Days"));
                    review.setId(rs.getString("ID"));
                    list.add(review);
                }
                return list;
            }
        }
    }
    
    public Review findReviewByID(String id) throws Exception{
        String sql = "Select [User].Telephone, [Homestay].Name,[Invoice].Review,[Invoice].Days,[Invoice].ID" +
                " FROM [Invoice]" +
                " Inner join [User] on [User].Telephone = [Invoice].User_telephone" +
                " inner join [Homestay] on [Homestay].ID = [Invoice].Homestay_id" + 
                " WHERE [User].Telephone = ? " +
                " AND [Invoice].ID = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, u.getTelephone());
            pstmt.setString(2, id);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()){
                    Review review = new Review();
                    review.setName(rs.getString("Name"));
                    review.setDay(rs.getString("Days"));
                    review.setReview(rs.getString("Review"));
                    
                    return review;
                }
            }
        }
        return null;
    }
    
    public boolean updateReview(JTextArea jt,String id) throws Exception{
      
        String sql = "  UPDATE [Invoice]" +
            " SET Review = ?" +
            " WHERE ID = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(1, jt.getText());
            pstmt.setString(2, id);
           
            return pstmt.executeUpdate() > 0;
        }
    }
}
