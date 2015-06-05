package conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {

    private String Driver = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/workpay";
    private String user = "root";
    private String pass = "";
    private Connection conn;

    public void conectar() {
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(URL, user, pass);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "1");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "2");
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "3");
        }
    }

    public Connection getConector() {
        return conn;
    }
}
