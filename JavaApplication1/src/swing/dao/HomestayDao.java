/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.dao;

import java.util.List;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import swing.helpers.DatabaseHelper;
import swing.helpers.SharedData;
import swing.model.Homestay;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class HomestayDao {
    
    public User u = SharedData.u;
    
    public boolean insertHomestay(Homestay home) throws Exception {
        String sql = "INSERT INTO [Homestay](Telephone,Name,Address,Price,Picture,Amenities)" +
                "VALUES(?,?,?,?,?,?)";
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
            pstmt.setString(6, home.getAmenities());
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean updateHomestay(Homestay home) throws Exception {
        
        
        String sql = "UPDATE [Homestay]" +
                " SET Name = ?,Address = ?,Price = ?,Picture = ?,Amenities = ?" +
                " WHERE ID = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ) {
            pstmt.setString(6, home.getID());
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
            pstmt.setString(5, home.getAmenities());
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteHomestay(JTextField jText) throws Exception{
        String sql = "delete from [Homestay]" + 
                " where Name = ?";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, jText.getText());           
            return pstmt.executeUpdate() > 0;
        }
    }

    public List<Homestay> showOwnerHomestay() throws Exception{
        String sql = "select * from [Homestay]" + 
                " where telephone = ?";
        Connection con = DatabaseHelper.openConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, u.getTelephone());
        try(ResultSet rs = pstmt.executeQuery();){
            List<Homestay> list = new ArrayList<>();
            while (rs.next()){
                Homestay home = new Homestay();
                home.setAddress(rs.getString("Address"));
                home.setName(rs.getString("Name"));
                home.setPrice(Double.parseDouble(rs.getString("Price").substring(0,rs.getString("Price").length() - 4)));
                home.setTelephone(rs.getString("Telephone"));
                home.setAmenities(rs.getString("Amenities"));
                home.setID(rs.getString("ID"));
                Blob blob = rs.getBlob("Picture");
                if (blob != null) {
                    home.setPicture(blob.getBytes(1, (int) blob.length()));
                }
                list.add(home);
            }
            return list;
        }
    }
    
    public List<Homestay> findPlaceByCity(JTextField jt) throws Exception{
        String sql = "select * from [Homestay]" +
                " where Address = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, jt.getText());
            try (ResultSet rs = pstmt.executeQuery();) {
                List<Homestay> list = new ArrayList<>();
                while (rs.next()){
                    Homestay home = new Homestay();
                    home.setAddress(rs.getString("Address"));
                    home.setName(rs.getString("Name"));
                    home.setPrice(Double.parseDouble(rs.getString("Price").substring(0,rs.getString("Price").length() - 4)));
                    home.setTelephone(rs.getString("Telephone"));
                    home.setAmenities(rs.getString("Amenities"));
                    home.setID(rs.getString("ID"));
                    Blob blob = rs.getBlob("Picture");
                    if (blob != null) {
                        home.setPicture(blob.getBytes(1, (int) blob.length()));
                    }
                    list.add(home);
                }
                return list;
            }
        }
    }
    public List<Homestay> findPlaceByName(JTextField jt) throws Exception{
        String sql = "select * from [Homestay]" +
                " where Name = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, jt.getText());
            try (ResultSet rs = pstmt.executeQuery();) {
                List<Homestay> list = new ArrayList<>();
                while (rs.next()){
                    Homestay home = new Homestay();
                    home.setAddress(rs.getString("Address"));
                    home.setName(rs.getString("Name"));
                    home.setPrice(Double.parseDouble(rs.getString("Price").substring(0, rs.getString("Price").length() - 4)));
                    home.setTelephone(rs.getString("Telephone"));
                    home.setAmenities(rs.getString("Amenities"));
                    home.setID(rs.getString("ID"));
                    Blob blob = rs.getBlob("Picture");
                    if (blob != null) {
                        home.setPicture(blob.getBytes(1, (int) blob.length()));
                    }
                    list.add(home);
                }
                return list;
            }
        }
    }
    public Homestay findPlaceID(String id) throws Exception{
        String sql = "select * from [Homestay]" +
                " where ID = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()){
                    Homestay home = new Homestay();
                    home.setAddress(rs.getString("Address"));
                    home.setName(rs.getString("Name"));
                    home.setPrice(Double.parseDouble(rs.getString("Price").substring(0, rs.getString("Price").length() - 4)));
                    home.setTelephone(rs.getString("Telephone"));
                    home.setAmenities(rs.getString("Amenities"));
                    home.setID(rs.getString("ID"));
                    Blob blob = rs.getBlob("Picture");
                    if (blob != null) {
                        home.setPicture(blob.getBytes(1, (int) blob.length()));
                    }
                    return home;
                }
            }
        }
        return null;
    }
}
