
package DAO;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public ConexaoDAO() {
    }

    public Connection conectaBD() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage());
        }

        return conn;
    }
}
