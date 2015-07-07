/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Alexi
 */
public class tipo_trabajador {

    private int id;
    private String tipo;
    private int sueldo;
    private int sueldo_historico;

    public int getSueldo_historico() {
        return sueldo_historico;
    }

    public void setSueldo_historico(int sueldo_historico) {
        this.sueldo_historico = sueldo_historico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
