/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexi
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        asistencia a = new asistencia();
        jDesktopPane1.add(a);
        a.setVisible(true);
        try {
            a.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btabrirasistencia = new javax.swing.JButton();
        btabrirtrabajadores = new javax.swing.JButton();
        btabrirsueldos = new javax.swing.JButton();
        btabririnformes = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        btadmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setToolTipText("");

        btabrirasistencia.setText("Asistencia");
        btabrirasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabrirasistenciaActionPerformed(evt);
            }
        });

        btabrirtrabajadores.setText("Trabajadores");
        btabrirtrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabrirtrabajadoresActionPerformed(evt);
            }
        });

        btabrirsueldos.setText("Sueldos");
        btabrirsueldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabrirsueldosActionPerformed(evt);
            }
        });

        btabririnformes.setText("Informes");
        btabririnformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabririnformesActionPerformed(evt);
            }
        });

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        btadmin.setText("Administrador");
        btadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btabrirasistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btabrirtrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btabrirsueldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btabririnformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btabrirasistencia)
                .addGap(18, 18, 18)
                .addComponent(btabrirtrabajadores)
                .addGap(18, 18, 18)
                .addComponent(btabrirsueldos)
                .addGap(18, 18, 18)
                .addComponent(btabririnformes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(btadmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btsalir)
                .addContainerGap())
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btabrirasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabrirasistenciaActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        asistencia a = new asistencia();
        jDesktopPane1.add(a);
        a.setVisible(true);
        try {
            a.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btabrirasistenciaActionPerformed

    private void btabrirtrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabrirtrabajadoresActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        trabajadores t = new trabajadores();
        jDesktopPane1.add(t);
        t.setVisible(true);
        try {
            t.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btabrirtrabajadoresActionPerformed

    private void btabrirsueldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabrirsueldosActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        sueldos s = new sueldos();
        jDesktopPane1.add(s);
        s.setVisible(true);
        try {
            s.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btabrirsueldosActionPerformed

    private void btabririnformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabririnformesActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        informes i = new informes();
        jDesktopPane1.add(i);
        i.setVisible(true);
        try {
            i.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btabririnformesActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadminActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        vadmin a = new vadmin();
        jDesktopPane1.add(a);
        a.setVisible(true);
        try {
            a.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btadminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btabrirasistencia;
    private javax.swing.JButton btabririnformes;
    private javax.swing.JButton btabrirsueldos;
    private javax.swing.JButton btabrirtrabajadores;
    private javax.swing.JButton btadmin;
    private javax.swing.JButton btsalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
