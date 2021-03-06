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

    private static final String INSERTasis = "INSERT INTO asistencia (Trabajador, Asistencia, Sueldo_historico) VALUES (?, ?, ?)";
    private static final String UPDATEasis = "UPDATE asistencia SET Asistencia = Asistencia + ?, Sueldo_historico = Sueldo_historico + ? WHERE Trabajador = ?";
    private static final String SELECTasis = "SELECT * FROM asistencia WHERE Trabajador = ?";
    private static final String UPDATE = "UPDATE trabajador SET Asistencia = Asistencia + ? WHERE Nombre = ?";
    private static final String UPDATEsueledo = "UPDATE trabajador SET Sueldo = ? WHERE Nombre = ?";
    private static final String asistencia0 = "UPDATE trabajador SET Asistencia = 0, Sueldo = 0, Anticipo = 0 WHERE Nombre = ?";
    private static final String updateFECHA = "UPDATE fecha SET fecha = ? WHERE 1";
    private static final String fecha0 = "UPDATE fecha SET fecha = '1111-11-11' WHERE 1";
    private static final String selectFECHA = "SELECT * FROM fecha";
    private conexion conex = new conexion();

    public void insertAsistenciaHisto(asistencia asis) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(INSERTasis);
            st.setString(1, asis.getTrabajador());
            st.setString(2, Double.toString(asis.getAsistencia()));
            st.setString(3, Integer.toString(asis.getSueldo_historico()));
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

    public void updateAsistenciaHisto(String asis, String sueldo, String trabajador) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(UPDATEasis);
            st.setString(1, asis);
            st.setString(2, sueldo);
            st.setString(3, trabajador);
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

    public ArrayList<asistencia> traerAsistenciaHisto(String rut) {
        ArrayList<asistencia> lista = new ArrayList<>();
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(SELECTasis);
            st.setString(1, rut);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                asistencia asis = new asistencia();
                asis.setTrabajador(rs.getString(1));
                asis.setAsistencia(rs.getDouble(2));
                asis.setSueldo_historico(rs.getInt(3));
                lista.add(asis);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conex.desconectar();
        return lista;
    }

    public void asistenciaCero(String nombre) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(asistencia0);
            st.setString(1, nombre);
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

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
            Calendar actual = Calendar.getInstance();
            int ano = 2015;
            int mes = actual.get(Calendar.MONTH);
            int dia = actual.get(Calendar.DAY_OF_MONTH);
            Date fecha = new Date(ano, mes, dia);
            st.setString(1, fecha.toString());
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

    public void fechaCero() {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(fecha0);
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

    public void actualizarSueldo(String nombre, String sueldo) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(UPDATEsueledo);
            st.setString(1, sueldo);
            st.setString(2, nombre);
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }
}
