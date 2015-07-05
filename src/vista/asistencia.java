/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.itextpdf.text.pdf.ColumnText;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import logica.GestionAsistencia;
import logica.GestionTrabajadores;

/**
 *
 * @author Alexi
 */
public class asistencia extends javax.swing.JInternalFrame {

    public boolean bandera = false;
    public Date fechita = new Date();

    /**
     * Creates new form workpay
     */
    public asistencia() {
        initComponents();

        bteditarasistencia.setEnabled(false);

        ArrayList<logica.fecha> listafecha = new GestionAsistencia().traerfecha();
        for (logica.fecha aux : listafecha) {
            fechita = aux.getFecha();
        }

        ArrayList<logica.trabajador> lista = new GestionTrabajadores().seleccionar();
        DefaultTableModel model = (DefaultTableModel) TBasistenciatrabajadores.getModel();
        int i = -1;
        int j = 0;
        for (logica.trabajador aux : lista) {
            i++;
            j++;
            TBasistenciatrabajadores.setValueAt(aux.getNombre(), i, 2);
        }
        model.setRowCount(j);
        TBasistenciatrabajadores.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBasistenciatrabajadores = new javax.swing.JTable();
        btguardarasistencia = new javax.swing.JButton();
        bteditarasistencia = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Xperia", 0, 18)); // NOI18N
        jLabel1.setText("gestion de asistencia");

        TBasistenciatrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mañana", "Tarde", "Nombre Trabajador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBasistenciatrabajadores.setToolTipText("");
        TBasistenciatrabajadores.setRowHeight(20);
        jScrollPane1.setViewportView(TBasistenciatrabajadores);
        TBasistenciatrabajadores.getColumnModel().getColumn(0).setMaxWidth(60);
        TBasistenciatrabajadores.getColumnModel().getColumn(1).setMaxWidth(60);
        TBasistenciatrabajadores.getColumnModel().getColumn(2).setPreferredWidth(50);

        btguardarasistencia.setText("Registrar Asistencia");
        btguardarasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarasistenciaActionPerformed(evt);
            }
        });

        bteditarasistencia.setText("Editar Asistencia");
        bteditarasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarasistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btguardarasistencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bteditarasistencia)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btguardarasistencia)
                    .addComponent(bteditarasistencia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardarasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarasistenciaActionPerformed
        // TODO add your handling code here
        ArrayList<logica.fecha> listafecha = new GestionAsistencia().traerfecha();
        for (logica.fecha aux : listafecha) {
            fechita = aux.getFecha();
        }
        Calendar actual = Calendar.getInstance();
        int ano = 2015;
        int mes = actual.get(Calendar.MONTH);
        int dia = actual.get(Calendar.DAY_OF_MONTH);
        java.sql.Date fechahoy = new java.sql.Date(ano, mes, dia);
        if (fechita.toString().equals(fechahoy.toString())) {
            JOptionPane.showMessageDialog(null, "La asistencia ya se registró hoy, para editar la asistencia de los trabjadores pulse el botón 'Editar Asistencia'");
        } else {
            for (int i = 0; i < TBasistenciatrabajadores.getRowCount(); i++) {
                double asis = 0;
                if (TBasistenciatrabajadores.getValueAt(i, 2) != null) {
                    if (TBasistenciatrabajadores.getValueAt(i, 0) == true) {
                        asis += 0.5;
                    }
                    if (TBasistenciatrabajadores.getValueAt(i, 1) == true) {
                        asis += 0.5;
                    }
                    //Registrar asistencia
                    try {
                        new GestionAsistencia().sumarAsistencia(Double.toString(asis), TBasistenciatrabajadores.getValueAt(i, 2).toString());
                        bandera = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            }
            if (bandera == true) {
                JOptionPane.showMessageDialog(null, "Asistencia del dia registrada correctamente");
                new GestionAsistencia().fecha();
                btguardarasistencia.setEnabled(false);
                TBasistenciatrabajadores.enable(false);
                bteditarasistencia.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btguardarasistenciaActionPerformed

    private void bteditarasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarasistenciaActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea editar la asistencia de hoy?") == JOptionPane.YES_OPTION) {
            bteditarasistencia.setEnabled(false);
            btguardarasistencia.setEnabled(true);
            TBasistenciatrabajadores.enable(true);
            new GestionAsistencia().fechaCero();
            for (int i = 0; i < TBasistenciatrabajadores.getRowCount(); i++) {
                double asis = 0;
                if (TBasistenciatrabajadores.getValueAt(i, 2) != null) {
                    if (TBasistenciatrabajadores.getValueAt(i, 0) == true) {
                        asis -= 0.5;
                    }
                    if (TBasistenciatrabajadores.getValueAt(i, 1) == true) {
                        asis -= 0.5;
                    }
                    //Registrar asistencia
                    try {
                        new GestionAsistencia().sumarAsistencia(Double.toString(asis), TBasistenciatrabajadores.getValueAt(i, 2).toString());
                        bandera = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            }

        }
    }//GEN-LAST:event_bteditarasistenciaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBasistenciatrabajadores;
    private javax.swing.JButton bteditarasistencia;
    private javax.swing.JButton btguardarasistencia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
