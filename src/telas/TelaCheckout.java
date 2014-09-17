/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controle.BancoDeDados;
import enumerations.AcomodacaoEstado;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Estadia;


public class TelaCheckout extends javax.swing.JFrame {

    /**
     * Creates new form TelaCheckout
     */
    public TelaCheckout() {
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
        jComboBoxEstadia = new javax.swing.JComboBox();
        jButtonConfirmarCheckout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check-out");

        jLabel1.setText("Estadia:");

        jComboBoxEstadia.setModel(new javax.swing.DefaultComboBoxModel(BancoDeDados.getInstance().getEstadias().toArray()));

        jButtonConfirmarCheckout.setText("Confirmar");
        jButtonConfirmarCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCheckoutActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(jLabel1)
                        .add(18, 18, 18)
                        .add(jComboBoxEstadia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(78, 78, 78)
                        .add(jButtonConfirmarCheckout)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(57, 57, 57)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboBoxEstadia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(28, 28, 28)
                .add(jButtonConfirmarCheckout)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCheckoutActionPerformed
        // TODO add your handling code here:
        if (jComboBoxEstadia.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma estadia.");
            return;
        }

        Estadia estadia = (Estadia) jComboBoxEstadia.getSelectedItem();
        estadia.getAcomodacao().setEstado(AcomodacaoEstado.DESOCUPADO);

        double taxa = estadia.getTaxaDeHospedagem();

        // Data de entrada
        Calendar dataEntrada = Calendar.getInstance();
        dataEntrada.setTime(estadia.getDataDeEntrada());

        // Data de saída
        Calendar dataSaida = Calendar.getInstance();
        dataSaida.setTime(new Date());

        // Data prevista para a saída quando do check-in
        Calendar dataPrevista = Calendar.getInstance();
        dataPrevista.setTime(estadia.getDataDeEntrada());
        dataPrevista.add(Calendar.DATE, estadia.getQtdeDiasPrevisto());

        if (dataSaida.before(dataPrevista)) {
            int diasHospedagem = (int) ((dataSaida.getTimeInMillis() - dataEntrada.getTimeInMillis()) / 86400000);
            taxa = estadia.calculaTaxaHospedagem(diasHospedagem, true);
        } else if (dataSaida.after(dataPrevista.getTime())) {
            int diasHospedagem = (int) ((dataSaida.getTimeInMillis() - dataEntrada.getTimeInMillis()) / 86400000);
            taxa = estadia.calculaTaxaHospedagem(diasHospedagem, false);
        }

        BancoDeDados.getInstance().getEstadias().remove(estadia);

        JOptionPane.showMessageDialog(this, "Check-out realizado com sucesso.\n\n"
                + "------------------------------\n"
                + "Valor a pagar: " + NumberFormat.getCurrencyInstance().format(taxa)
                + "\n------------------------------");
    }//GEN-LAST:event_jButtonConfirmarCheckoutActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCheckout().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarCheckout;
    private javax.swing.JComboBox jComboBoxEstadia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
