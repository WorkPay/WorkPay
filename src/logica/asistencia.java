/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;

/**
 *
 * @author Alexi
 */
public class asistencia {

    private Date fecha;
    private String trabajador;
    private Double dia;
    private int sueldo_historico;

    public Double getDia() {
        return dia;
    }

    public void setDia(Double dia) {
        this.dia = dia;
    }

    public int getSueldo_historico() {
        return sueldo_historico;
    }

    public void setSueldo_historico(int sueldo_historico) {
        this.sueldo_historico = sueldo_historico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }
}
