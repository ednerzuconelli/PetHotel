/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Dimension;
import java.awt.Toolkit;

public class TelaPrincipal extends javax.swing.JFrame {

  
    public TelaPrincipal() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCheckin = new javax.swing.JButton();
        jButtonCheckout = new javax.swing.JButton();
        jButtonAnimais = new javax.swing.JButton();
        jButtonAcomodacoes = new javax.swing.JButton();
        jButtonDonos = new javax.swing.JButton();
        jButtonFaixasDePorte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonDonos2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetHotel");
        setResizable(false);

        jButtonCheckin.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButtonCheckin.setText("Check-in");
        jButtonCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckinActionPerformed(evt);
            }
        });

        jButtonCheckout.setText("Check-out");
        jButtonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        jButtonAnimais.setText("Animais");
        jButtonAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnimaisActionPerformed(evt);
            }
        });

        jButtonAcomodacoes.setText("Acomodações");
        jButtonAcomodacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcomodacoesActionPerformed(evt);
            }
        });

        jButtonDonos.setText("Donos");
        jButtonDonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonosActionPerformed(evt);
            }
        });

        jButtonFaixasDePorte.setText("Faixas de porte");
        jButtonFaixasDePorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFaixasDePorteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Cadastros básicos");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Operações");

        jButtonDonos2.setLabel("Serviços");
        jButtonDonos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonos2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(111, 111, 111)
                        .add(jLabel1))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(31, 31, 31)
                                .add(jButtonCheckin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonCheckout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(224, 224, 224)
                                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 267, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(31, 31, 31)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jButtonAcomodacoes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jButtonDonos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jButtonDonos2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(27, 27, 27)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jButtonFaixasDePorte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jButtonAnimais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(159, 159, 159)))
                    .add(layout.createSequentialGroup()
                        .add(109, 109, 109)
                        .add(jLabel2)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonAcomodacoes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonFaixasDePorte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonDonos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonAnimais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonDonos2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonCheckout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonCheckin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcomodacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcomodacoesActionPerformed
        // TODO add your handling code here:
        TelaCadastroAcomodacao telaCadastroAcomodacao = new TelaCadastroAcomodacao();
        telaCadastroAcomodacao.setLocationRelativeTo(null);
        telaCadastroAcomodacao.setVisible(true);
    }//GEN-LAST:event_jButtonAcomodacoesActionPerformed

    private void jButtonDonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonosActionPerformed
        // TODO add your handling code here:
        TelaCadastroDono telaCadastroDono = new TelaCadastroDono();
        telaCadastroDono.setLocationRelativeTo(null);
        telaCadastroDono.setVisible(true);
    }//GEN-LAST:event_jButtonDonosActionPerformed

    private void jButtonAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnimaisActionPerformed
        // TODO add your handling code here:
        TelaCadastroAnimal telaCadastroAnimal = new TelaCadastroAnimal();
        telaCadastroAnimal.setLocationRelativeTo(null);
        telaCadastroAnimal.setVisible(true);
    }//GEN-LAST:event_jButtonAnimaisActionPerformed

    private void jButtonCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckinActionPerformed
        // TODO add your handling code here:
        TelaCheckin telaCheckin = new TelaCheckin();
        telaCheckin.setLocationRelativeTo(null);
        telaCheckin.setVisible(true);
    }//GEN-LAST:event_jButtonCheckinActionPerformed

    private void jButtonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckoutActionPerformed
        // TODO add your handling code here:
        TelaCheckout telaCheckout = new TelaCheckout();
        telaCheckout.setLocationRelativeTo(null);
        telaCheckout.setVisible(true);
    }//GEN-LAST:event_jButtonCheckoutActionPerformed

    private void jButtonFaixasDePorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFaixasDePorteActionPerformed
        // TODO add your handling code here:
        TelaCadastroPorteFaixa telaCadastroPorteFaixa = new TelaCadastroPorteFaixa();
        telaCadastroPorteFaixa.setLocationRelativeTo(null);
        telaCadastroPorteFaixa.setVisible(true);
    }//GEN-LAST:event_jButtonFaixasDePorteActionPerformed

    private void jButtonDonos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonos2ActionPerformed
        // TODO add your handling code here:
        TelaCadastroServico telaCadastroServico = new TelaCadastroServico();
        telaCadastroServico.setLocationRelativeTo(null);
        telaCadastroServico.setVisible(true);
    }//GEN-LAST:event_jButtonDonos2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                
                telaPrincipal.setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcomodacoes;
    private javax.swing.JButton jButtonAnimais;
    private javax.swing.JButton jButtonCheckin;
    private javax.swing.JButton jButtonCheckout;
    private javax.swing.JButton jButtonDonos;
    private javax.swing.JButton jButtonDonos2;
    private javax.swing.JButton jButtonFaixasDePorte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
