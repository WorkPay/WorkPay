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
public class GestionTrabajadores {

    private static final String INSERT = "INSERT INTO trabajador (Nombre, Rut, Telefono, Tipo, Comentarios, Asistencia, Anticipo) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT = "SELECT * FROM trabajador";
    private static final String SELECTFILTRO = "SELECT * FROM trabajador WHERE Nombre LIKE ?";
    private static final String UPDATE = "UPDATE trabajador SET Nombre=?, Rut=?, Telefono=?, Tipo=?, Comentarios=?, Asistencia=?, Anticipo=? WHERE Rut=?";
    private conexion conex = new conexion();
    
    
    public void editar(trabajador trab, String rut) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(UPDATE);
            st.setString(1, trab.getNombre());
            st.setString(2, trab.getRut());
            st.setInt(3, trab.getTelefono());
            st.setInt(4, trab.getTipo());
            st.setString(5, trab.getComentarios());
            st.setDouble(6, trab.getAsistencia());
            st.setInt(7, trab.getAnticipo());
            //traer RUT            
            st.setString(8, rut);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos de Trabajador editados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

    public void insertar(trabajador trab) {
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(INSERT);
            st.setString(1, trab.getNombre());
            st.setString(2, trab.getRut());
            st.setInt(3, trab.getTelefono());
            st.setInt(4, trab.getTipo());
            st.setString(5, trab.getComentarios());
            st.setDouble(6, trab.getAsistencia());
            st.setInt(7, trab.getAnticipo());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Trabajador ingresado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        conex.desconectar();
    }

    public ArrayList<trabajador> seleccionar() {
        ArrayList<trabajador> lista = new ArrayList<>();
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                trabajador trab = new trabajador();
                trab.setNombre(rs.getString(1));
                trab.setRut(rs.getString(2));
                trab.setTelefono(rs.getInt(3));
                trab.setTipo(rs.getInt(4));
                trab.setComentarios(rs.getString(5));
                trab.setAsistencia(rs.getDouble(6));
                trab.setAnticipo(rs.getInt(7));
                lista.add(trab);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conex.desconectar();
        return lista;
    }

    public ArrayList<trabajador> seleccionarFiltro(String nombre) {
        ArrayList<trabajador> lista = new ArrayList<>();
        conex.conectar();
        String name = "%"+nombre+"%";
        try {
            PreparedStatement st = conex.getConector().prepareStatement(SELECTFILTRO);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                trabajador trab = new trabajador();
                trab.setNombre(rs.getString(1));
                trab.setRut(rs.getString(2));
                trab.setTelefono(rs.getInt(3));
                trab.setTipo(rs.getInt(4));
                trab.setComentarios(rs.getString(5));
                trab.setAsistencia(rs.getDouble(6));
                trab.setAnticipo(rs.getInt(7));
                lista.add(trab);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conex.desconectar();
        return lista;
    }
//        public static boolean validarRut(String rut) {
//        boolean validacion = false;
//        try {
//            rut = rut.toUpperCase();
//            rut = rut.replace(".", "");
//            rut = rut.replace("-", "");
//            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
//
//            char dv = rut.charAt(rut.length() - 1);
//
//            int m = 0, s = 1;
//            for (; rutAux != 0; rutAux /= 10) {
//                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
//            }
//            if (dv == (char) (s != 0 ? s + 47 : 75)) {
//                validacion = true;
//            }
//
//        } catch (java.lang.NumberFormatException e) {
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return validacion;
//    }
}
