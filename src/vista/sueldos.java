/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import logica.GestionAsistencia;
import logica.GestionSueldo;
import logica.GestionTrabajadores;
import logica.trabajador;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author Alexi
 */
public class sueldos extends javax.swing.JInternalFrame {

    /**
     * Creates new form sueldos
     */
    public sueldos() {
        initComponents();

        PromptSupport.setPrompt("Buscar trabajador...", txtbuscartrabajador);

        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionar();
        DefaultListModel model = new DefaultListModel();
        for (logica.trabajador aux : lista) {
            model.addElement(aux.getNombre());
        }
        listatrabajadores.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listatrabajadores = new javax.swing.JList();
        btcalcularsueldo = new javax.swing.JButton();
        txtbuscartrabajador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltrabajador = new javax.swing.JLabel();
        lbldiastrabajados = new javax.swing.JLabel();
        lblanticipo = new javax.swing.JLabel();
        lblsueldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btanticipo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbltrabajador1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtanticipo = new javax.swing.JTextField();
        btdaranticipo = new javax.swing.JButton();
        btpagarsueldo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Xperia", 0, 18)); // NOI18N
        jLabel1.setText("pago de sueldos");

        listatrabajadores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Pedro Machuca Pereira", "Marcos Wena Loco", "Juan Gabriel Canante", "Diego Juan y Pedro", "Florencio Flores del Campo", "Mario Martinez Mata", "Miguel Segura Dias" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listatrabajadores);

        btcalcularsueldo.setText("Calcular Sueldo");
        btcalcularsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcularsueldoActionPerformed(evt);
            }
        });

        txtbuscartrabajador.setToolTipText("Buscar Trabajador...");
        txtbuscartrabajador.setName(""); // NOI18N
        txtbuscartrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscartrabajadorKeyTyped(evt);
            }
        });

        jLabel2.setText("Trabajador:");

        jLabel3.setText("Días Trabajados:");

        jLabel4.setText("Anticipo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sueldo Total:");

        lbltrabajador.setText("Nombre...");

        lbldiastrabajados.setText("0");

        lblanticipo.setText("0");

        lblsueldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsueldo.setText("0");
        lblsueldo.setToolTipText("");

        jLabel6.setText("$");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("$");

        btanticipo.setText("Anticipo");
        btanticipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanticipoActionPerformed(evt);
            }
        });

        jLabel8.setText("Trabajador:");

        lbltrabajador1.setText("Nombre...");

        jLabel9.setText("Anticipo:");

        jLabel10.setText("$");

        btdaranticipo.setText("Dar Anticipo");
        btdaranticipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdaranticipoActionPerformed(evt);
            }
        });

        btpagarsueldo.setText("Pagar Sueldo");
        btpagarsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpagarsueldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbuscartrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcalcularsueldo)
                    .addComponent(btanticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btpagarsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(lbltrabajador)
                    .addComponent(lbldiastrabajados)
                    .addComponent(lblanticipo)
                    .addComponent(lblsueldo)
                    .addComponent(lbltrabajador1)
                    .addComponent(txtanticipo)
                    .addComponent(btdaranticipo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtbuscartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbltrabajador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbldiastrabajados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblanticipo)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblsueldo)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btpagarsueldo)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbltrabajador1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtanticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btdaranticipo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btcalcularsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(btanticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcalcularsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcularsueldoActionPerformed
        // TODO add your handling code here:
        btdaranticipo.setEnabled(false);
        btpagarsueldo.setEnabled(true);
        if (listatrabajadores.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un trabajador de la lista para poder calcular su sueldo");
        } else {
            String nombreEditar = listatrabajadores.getSelectedValue().toString();
            ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionarFiltro(nombreEditar);
            for (logica.trabajador aux : lista) {
                lbltrabajador.setText(aux.getNombre());
                lbldiastrabajados.setText(Double.toString(aux.getAsistencia()));
                lblanticipo.setText(Integer.toString(aux.getAnticipo()));
                //TRAER EL SUELDO
//                int sueldo = 1;
//                double asistencia = aux.getAsistencia();
//                ArrayList<logica.tipo_trabajador> listatipo = new GestionSueldo().seleccionar(aux.getTipo());
//                for (logica.tipo_trabajador aux1 : listatipo) {
//                    sueldo = aux1.getSueldo();
//                }
//                double sueldototal = (sueldo * asistencia) - aux.getAnticipo();
                lblsueldo.setText(Integer.toString(aux.getSueldo() - aux.getAnticipo()));
            }
        }

    }//GEN-LAST:event_btcalcularsueldoActionPerformed

    private void btpagarsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpagarsueldoActionPerformed
        // TODO add your handling code here:
        double i = 0;
        if (Double.parseDouble(lblsueldo.getText().toString()) > i) {
            //volver la asistencia a 0
            if (JOptionPane.showConfirmDialog(null, "¿Desea pagar $" + lblsueldo.getText().toString() + " de sueldo, correspondiente al trabajador " + lbltrabajador.getText().toString() + "?") == JOptionPane.YES_OPTION) {
                new GestionAsistencia().asistenciaCero(lbltrabajador.getText().toString());
                lbltrabajador.setText("Nombre...");
                lbldiastrabajados.setText("0");
                lblanticipo.setText("0");
                lblsueldo.setText("0");
            }
        } else {
            if (Double.parseDouble(lblsueldo.getText().toString()) == i) {
                JOptionPane.showMessageDialog(null, "El trabajador "+lbltrabajador.getText().toString()+" no posee sueldo acomulado");
            } else {
                JOptionPane.showMessageDialog(null, "No se puede pagar el sueldo a este trabajador ya que posee una deuda por Anticipo");
            }
        }
    }//GEN-LAST:event_btpagarsueldoActionPerformed

    private void txtbuscartrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscartrabajadorKeyTyped
        // TODO add your handling code here:
        String nombre = txtbuscartrabajador.getText().toUpperCase();
        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionarFiltro(nombre);
        DefaultListModel model = new DefaultListModel();
        for (logica.trabajador aux : lista) {
            model.addElement(aux.getNombre());
        }
        listatrabajadores.setModel(model);
    }//GEN-LAST:event_txtbuscartrabajadorKeyTyped

    private void btanticipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanticipoActionPerformed
        // TODO add your handling code here:
        btpagarsueldo.setEnabled(false);
        btdaranticipo.setEnabled(true);
        if (listatrabajadores.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un trabajador de la lista para poder darle un anticipo");
        } else {
            String nombreEditar = listatrabajadores.getSelectedValue().toString();
            ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionarFiltro(nombreEditar);
            for (logica.trabajador aux : lista) {
                if (aux.getAnticipo() == 0) {
                    lbltrabajador1.setText(aux.getNombre());
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Este trabajador ya posee un anticipo, ¿desea editar el anticipo?") == JOptionPane.YES_OPTION) {
                        lbltrabajador1.setText(aux.getNombre());
                        txtanticipo.setText(Integer.toString(aux.getAnticipo()));
                    }
                }

            }
        }
    }//GEN-LAST:event_btanticipoActionPerformed

    private void btdaranticipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdaranticipoActionPerformed
        // TODO add your handling code here:
        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionarFiltro(lbltrabajador1.getText().toString());
        for (logica.trabajador aux : lista) {
            trabajador trab = new trabajador();
            trab.setNombre(aux.getNombre());
            trab.setRut(aux.getRut());
            trab.setTelefono(aux.getTelefono());
            trab.setTipo(aux.getTipo());
            trab.setComentarios(aux.getComentarios());
            trab.setAsistencia(aux.getAsistencia());
            trab.setAnticipo(Integer.parseInt(txtanticipo.getText().toString()));
            trab.setSueldo(aux.getSueldo());
            if (JOptionPane.showConfirmDialog(null, "Desea dar $" + txtanticipo.getText().toString() + " de anticipo al trabajador: " + aux.getNombre()) == JOptionPane.YES_OPTION) {
                new GestionTrabajadores().editar(trab, aux.getRut());
                txtanticipo.setText("");
                lbltrabajador1.setText("Nombre...");
            }
        }
    }//GEN-LAST:event_btdaranticipoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btanticipo;
    private javax.swing.JButton btcalcularsueldo;
    private javax.swing.JButton btdaranticipo;
    private javax.swing.JButton btpagarsueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblanticipo;
    private javax.swing.JLabel lbldiastrabajados;
    private javax.swing.JLabel lblsueldo;
    private javax.swing.JLabel lbltrabajador;
    private javax.swing.JLabel lbltrabajador1;
    private javax.swing.JList listatrabajadores;
    private javax.swing.JTextField txtanticipo;
    private javax.swing.JTextField txtbuscartrabajador;
    // End of variables declaration//GEN-END:variables
}
