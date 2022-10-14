package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
    public Connection conectaBD() {
         
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoteste?user=root&password=");
            return conn;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "conexaoDAO " + erro.getMessage());
        }
        return null;
        
    }
}
