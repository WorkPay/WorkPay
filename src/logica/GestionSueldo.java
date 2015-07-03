/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexi
 */
public class GestionSueldo {
    private static final String SELECT = "SELECT * FROM tipo_trabajador WHERE ID = ?";
    private conexion conex = new conexion();
    
       public ArrayList<tipo_trabajador> seleccionar(int id) {
        ArrayList<tipo_trabajador> lista = new ArrayList<>();
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(SELECT);
            st.setString(1, Integer.toString(id));
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                tipo_trabajador tipo = new tipo_trabajador();
                tipo.setId(rs.getInt(1));
                tipo.setTipo(rs.getString(2));
                tipo.setSueldo(rs.getInt(3));                
                lista.add(tipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conex.desconectar();
        return lista;
    }
}
