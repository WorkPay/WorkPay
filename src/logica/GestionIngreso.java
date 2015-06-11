/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Alexi
 */
public class GestionIngreso {

    private static final String SELECT = "SELECT * FROM admin";
    private static final String UPDATE = "UPDATE admin SET Usuario=?, Pass=? WHERE ID=1";
    private conexion conex = new conexion();

    public ArrayList<admin> seleccionar() {
        ArrayList<admin> lista = new ArrayList<>();
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                admin adm = new admin();
                adm.setUsuario(rs.getString(2));
                adm.setPass(rs.getString(3));
                lista.add(adm);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error base");
        }
        conex.desconectar();
        return lista;
    }

    public void updateAdmin(admin adm) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(UPDATE);
            st.setString(1, adm.getUsuario());
            st.setString(2, adm.getPass());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nombre de Usuario y Contraseña editados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }
}
