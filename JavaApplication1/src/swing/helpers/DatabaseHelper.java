/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Emi Tiramis
 */
public class DatabaseHelper {
    public static Connection openConnection()throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-B080SGM:1433;databaseName=FormLogin;";
        String dbusername = "sa";
        String password = "123456";
        Connection con = DriverManager.getConnection(connectionURL, dbusername, password);
        return con;
    }
}
