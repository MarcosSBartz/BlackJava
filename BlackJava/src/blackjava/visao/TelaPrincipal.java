/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjava.visao;

import javax.swing.JTextField;
import blackjava.Deck;

/**
 *
 * @author marcos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    String aux;
    Deck deck = new Deck();

    /**
     * Creates new form NewJFrame
     */
    public TelaPrincipal() {

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
        jButtonDeal = new javax.swing.JButton();
        jButtonHit = new javax.swing.JButton();
        jButtonStand = new javax.swing.JButton();
        jLabelCaixa = new javax.swing.JLabel();
        jLabelAposta = new javax.swing.JLabel();
        jTextFieldAposta = new javax.swing.JTextField();
        jTextFieldCaixa = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ProfessorDealer2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 510);

        jButtonDeal.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDeal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonDeal.setText("DEAL");
        jButtonDeal.setFocusable(false);
        jButtonDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDealActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeal);
        jButtonDeal.setBounds(10, 550, 80, 30);

        jButtonHit.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonHit.setForeground(new java.awt.Color(51, 51, 51));
        jButtonHit.setText("HIT");
        jButtonHit.setEnabled(false);
        jButtonHit.setFocusable(false);
        jButtonHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHit);
        jButtonHit.setBounds(100, 550, 70, 30);

        jButtonStand.setBackground(new java.awt.Color(204, 204, 204));
        jButtonStand.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonStand.setForeground(new java.awt.Color(51, 51, 51));
        jButtonStand.setText("STAND");
        jButtonStand.setEnabled(false);
        jButtonStand.setFocusable(false);
        jButtonStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStandActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStand);
        jButtonStand.setBounds(180, 550, 100, 30);

        jLabelCaixa.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelCaixa.setText("CAIXA");
        getContentPane().add(jLabelCaixa);
        jLabelCaixa.setBounds(420, 510, 80, 30);

        jLabelAposta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelAposta.setText("APOSTA");
        getContentPane().add(jLabelAposta);
        jLabelAposta.setBounds(300, 510, 80, 30);

        jTextFieldAposta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextFieldAposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAposta.setText("10");
        jTextFieldAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApostaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAposta);
        jTextFieldAposta.setBounds(290, 540, 90, 30);

        jTextFieldCaixa.setEditable(false);
        jTextFieldCaixa.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextFieldCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCaixa.setText("10000");
        jTextFieldCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCaixa);
        jTextFieldCaixa.setBounds(400, 540, 90, 30);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 510, 190, 20);

        jLabel2.setText("SAIDA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 510, 40, 20);

        setSize(new java.awt.Dimension(518, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDealActionPerformed
        int caixa = Integer.parseInt(jTextFieldCaixa.getText());
        int aposta = Integer.parseInt(jTextFieldAposta.getText());
        if (aposta > caixa) {
            System.out.println("Aposta maior do que em caixa");
        } else {
            jButtonDeal.setEnabled(false);
            jTextFieldCaixa.setText(Integer.toString(caixa - aposta));
            deck.shuffleDeck();
            deck.displayDeck();
        }
    }//GEN-LAST:event_jButtonDealActionPerformed

    private void jButtonHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHitActionPerformed

    private void jButtonStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStandActionPerformed

    private void jTextFieldCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaixaActionPerformed

    private void jTextFieldApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApostaActionPerformed

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
        //</editor-fold>

        /* Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeal;
    private javax.swing.JButton jButtonHit;
    private javax.swing.JButton jButtonStand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAposta;
    private javax.swing.JLabel jLabelCaixa;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAposta;
    private javax.swing.JTextField jTextFieldCaixa;
    // End of variables declaration//GEN-END:variables
}
