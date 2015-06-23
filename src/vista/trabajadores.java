/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import logica.GestionTrabajadores;
import logica.trabajador;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author Alexi
 */
public class trabajadores extends javax.swing.JInternalFrame {

    /**
     * Creates new form trabajadores
     */
    public trabajadores() {
        initComponents();
        
        PromptSupport.setPrompt("Buscar trabajador...", txtbuscartrabajador);

        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionar();
        DefaultListModel model = new DefaultListModel();
        for (logica.trabajador aux : lista) {
            model.addElement(aux.getNombre());
        }
        listatrabajadores.setModel(model);
    }

    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombretrabajador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcomentarios = new javax.swing.JEditorPane();
        txtruttrabajador = new javax.swing.JTextField();
        txtfonotrabajador = new javax.swing.JTextField();
        btguardartrabajador = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbtipotrabajador = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listatrabajadores = new javax.swing.JList();
        bteditartrabajador = new javax.swing.JButton();
        txtbuscartrabajador = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Xperia", 0, 18)); // NOI18N
        jLabel1.setText("administracion de trabajadores");

        jLabel2.setText("Nombre:");

        jLabel3.setText("RUT:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Comentarios:");

        jScrollPane2.setViewportView(txtcomentarios);

        txtfonotrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfonotrabajadorKeyTyped(evt);
            }
        });

        btguardartrabajador.setText("Guardar Trabajador");
        btguardartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardartrabajadorActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo Trabajador:");

        cbtipotrabajador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Maestro", "Ayudante", "Principiante" }));

        jScrollPane1.setViewportView(listatrabajadores);

        bteditartrabajador.setText("Editar Información");

        txtbuscartrabajador.setToolTipText("Buscar Trabajador...");
        txtbuscartrabajador.setName(""); // NOI18N
        txtbuscartrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscartrabajadorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscartrabajadorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbtipotrabajador, 0, 172, Short.MAX_VALUE)
                                        .addComponent(txtfonotrabajador))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtruttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombretrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btguardartrabajador, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtbuscartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bteditartrabajador)
                        .addContainerGap(84, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnombretrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtruttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfonotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbtipotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btguardartrabajador))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbuscartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bteditartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        txtbuscartrabajador.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardartrabajadorActionPerformed
        // TODO add your handling code here:
        if (txtnombretrabajador.getText().isEmpty() || txtruttrabajador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
        } else {
            if (cbtipotrabajador.getSelectedItem().toString().equals("Seleccione...")) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el tipo de trabajador");
            } else {
                //insert
                String nombre = txtnombretrabajador.getText().toString().toUpperCase();
                String rut = txtruttrabajador.getText().toString();
                int telefono = Integer.parseInt(txtfonotrabajador.getText().toString());
                int tipo;
                if (cbtipotrabajador.getSelectedItem().toString().equals("Maestro")) {
                    tipo = 1;
                } else {
                    if (cbtipotrabajador.getSelectedItem().toString().equals("Ayudante")) {
                        tipo = 2;
                    } else {
                        tipo = 3;
                    }
                }
                String comentario = txtcomentarios.getText().toString();
                double asistencia = 0;
                int anticipo = 0;
                boolean r = validarRut(rut);
                if (r == true) {
                    try {
                        trabajador trab = new trabajador();
                        trab.setNombre(nombre);
                        trab.setRut(rut);
                        trab.setTelefono(telefono);
                        trab.setTipo(tipo);
                        trab.setComentarios(comentario);
                        trab.setAsistencia(asistencia);
                        trab.setAnticipo(anticipo);
                        new GestionTrabajadores().insertar(trab);
                        txtnombretrabajador.setText("");
                        txtnombretrabajador.requestFocus();
                        txtruttrabajador.setText("");
                        txtfonotrabajador.setText("");
                        txtcomentarios.setText("");
                        cbtipotrabajador.setSelectedIndex(0);
                        //Recargar lista
                        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionar();
                        DefaultListModel model = new DefaultListModel();
                        for (logica.trabajador aux : lista) {
                            model.addElement(aux.getNombre());
                        }
                        listatrabajadores.setModel(model);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al ingresar los datos!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El RUT no es válido!");
                }

            }
        }
    }//GEN-LAST:event_btguardartrabajadorActionPerformed

    private void txtfonotrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfonotrabajadorKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (txtfonotrabajador.getText().length() >= 8) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfonotrabajadorKeyTyped

    private void txtbuscartrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscartrabajadorKeyTyped
        // TODO add your handling code here:
        String nombre =  txtbuscartrabajador.getText().toUpperCase();
        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionarFiltro(nombre);
        DefaultListModel model = new DefaultListModel();
        for (logica.trabajador aux : lista) {
            model.addElement(aux.getNombre());
        }
        listatrabajadores.setModel(model);
    }//GEN-LAST:event_txtbuscartrabajadorKeyTyped

    private void txtbuscartrabajadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscartrabajadorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscartrabajadorKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteditartrabajador;
    private javax.swing.JButton btguardartrabajador;
    private javax.swing.JComboBox cbtipotrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JList listatrabajadores;
    private javax.swing.JTextField txtbuscartrabajador;
    private javax.swing.JEditorPane txtcomentarios;
    private javax.swing.JTextField txtfonotrabajador;
    private javax.swing.JTextField txtnombretrabajador;
    private javax.swing.JTextField txtruttrabajador;
    // End of variables declaration//GEN-END:variables
}
