/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import swing.helpers.DatabaseHelper;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class UserDao {

    public User checkLogin(String telephone, String password) throws Exception {
        String sql = "select telephone, password from User where "
                + " telephone telephone=? and password=?";
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
}
