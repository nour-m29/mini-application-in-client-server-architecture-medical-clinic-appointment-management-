package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system"; 
    private static final String PASSWORD = "nour"; 

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // --- CETTE LIGNE EST LA SOLUTION ---
            if (con != null) {
                con.setAutoCommit(true); 
            }
            // ------------------------------------
            
            return con;
        } catch (Exception e) {
            System.err.println("Erreur de connexion : " + e.getMessage());
            return null;
        }
    }
}