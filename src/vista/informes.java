/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexi
 */
public class informes extends javax.swing.JInternalFrame {

    /**
     * Creates new form informes
     */
    public informes() {
        initComponents();
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
        txtbuscartrabajador = new javax.swing.JTextField();
        btpdf = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Xperia", 0, 18)); // NOI18N
        jLabel1.setText("generacion de informes");

        listatrabajadores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Pedro Machuca Pereira", "Marcos Wena Loco", "Juan Gabriel Canante", "Diego Juan y Pedro", "Florencio Flores del Campo", "Mario Martinez Mata", "Miguel Segura Dias" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listatrabajadores);

        txtbuscartrabajador.setToolTipText("Buscar Trabajador...");
        txtbuscartrabajador.setName(""); // NOI18N

        btpdf.setText("Generar PDF");
        btpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btpdf))
                    .addComponent(txtbuscartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpdfActionPerformed
        // TODO add your handling code here:
        FileOutputStream archivo;
        try {
            archivo = new FileOutputStream("C:/Informes/Informe.pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            documento.add(new Paragraph("Hola Mundo!"));
            documento.add(new Paragraph("He creado un documento en pdf"));
            documento.add(new Paragraph("El cual debería llenar con información relevante..."));
            documento.add(new Paragraph("Pero no :)"));
            documento.close();
            JOptionPane.showMessageDialog(null, "Informe creado exitosamente");
            Process p = Runtime.getRuntime().exec("explorer.exe C:\\Informes");
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(informes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al generar el Informe PDF!");
        } catch (IOException ex) {
            Logger.getLogger(informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btpdfActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listatrabajadores;
    private javax.swing.JTextField txtbuscartrabajador;
    // End of variables declaration//GEN-END:variables
}
