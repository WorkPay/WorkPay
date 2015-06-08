/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
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
    //COMPLETAR INSERT
    private static final String INSERT = "INSERT INTO admin";
    private conexion conex = new conexion();

    public ArrayList<admin> seleccionar() {
        ArrayList<admin> lista = new ArrayList<>();
        conex.conectar();
        try {
            PreparedStatement st = conex.getConector().prepareStatement(SELECT);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
            admin adm = new admin();
            adm.setUsuario(rs.getString(2));
            adm.setPass(rs.getString(3));
            lista.add(adm);
            
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error base");
        }
        conex.desconectar();
        return lista;
    }
}
