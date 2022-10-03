package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
    public Connection conectaBD() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoteste?user=root&password=");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "conexaoDAO " + erro.getMessage());
        }
        return conn;
    }
}
