/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Alexi
 */
public class GestionAsistencia {

    private static final String UPDATE = "UPDATE trabajador SET Asistencia = Asistencia + ? WHERE Nombre = ?";
    private static final String updateFECHA = "UPDATE fecha SET fecha = ? WHERE 1";
    private static final String selectFECHA = "SELECT * FROM fecha";
    private conexion conex = new conexion();

    
    public ArrayList<fecha> traerfecha() {
        ArrayList<fecha> lista = new ArrayList<>();
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(selectFECHA);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                fecha date = new fecha();
                date.setFecha(rs.getDate("fecha"));
                lista.add(date);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conex.desconectar();
        return lista;
    }
    
    public void fecha() {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(updateFECHA);
            int año = Calendar.YEAR;
            int mes = Calendar.MONTH;
            int dia = Calendar.DAY_OF_MONTH;
            Date fecha = new Date(año, mes, dia);
            st.setString(1, fecha.toString());
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

    public void sumarAsistencia(String asis, String nombre) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(UPDATE);
            st.setString(1, asis);
            st.setString(2, nombre);
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }
}
