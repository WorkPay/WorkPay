/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.GestionIngreso;

/**
 *
 * @author Alexi
 */
public class admin extends javax.swing.JInternalFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        
        ArrayList<logica.admin> lista = new GestionIngreso().seleccionar();
        String user = "";
        String pass = "";
        for (logica.admin aux : lista) {
            String[] log = {aux.getUsuario(), aux.getPass()};
            user = log[0];
            pass = log[1];
        }
        txtusuarioactual.setText(user);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusuarioactual = new javax.swing.JTextField();
        btguardaradmin = new javax.swing.JButton();
        txtpassactual = new javax.swing.JPasswordField();
        txtnewpass = new javax.swing.JPasswordField();
        txtnewpass2 = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Xperia", 0, 18)); // NOI18N
        jLabel1.setText("configuracion de administrador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Editar Datos de Administrador");

        jLabel3.setText("Nombre de usuario");

        jLabel4.setText("Contraseña actual");

        jLabel5.setText("Nueva contraseña");

        jLabel6.setText("Repetir contraseña");

        btguardaradmin.setText("Guardar Datos");
        btguardaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardaradminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btguardaradmin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtusuarioactual)
                                        .addComponent(txtpassactual, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                        .addComponent(txtnewpass)
                                        .addComponent(txtnewpass2)))))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusuarioactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpassactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnewpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btguardaradmin)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardaradminActionPerformed
        // TODO add your handling code here:
        ArrayList<logica.admin> lista = new GestionIngreso().seleccionar();
        String user = "";
        String pass = "";
        for (logica.admin aux : lista) {
            String[] log = {aux.getUsuario(), aux.getPass()};
            user = log[0];
            pass = log[1];
        }
        if((txtpassactual.getText().equals(pass))){
            if (txtnewpass2.getText().equals(txtnewpass.getText())) {
                //Crear insert para admin
            }else{
                JOptionPane.showMessageDialog(null, "Las nuevas contraseñas no coinciden");
                txtnewpass.setText("");
                txtnewpass2.setText("");
            }
         }else{
          JOptionPane.showMessageDialog(null, "Contraseña actual incorrecta");
          txtpassactual.setText("");
      }
    }//GEN-LAST:event_btguardaradminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btguardaradmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JPasswordField txtnewpass2;
    private javax.swing.JPasswordField txtpassactual;
    private javax.swing.JTextField txtusuarioactual;
    // End of variables declaration//GEN-END:variables
}
