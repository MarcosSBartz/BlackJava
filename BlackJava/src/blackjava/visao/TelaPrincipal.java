/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjava.visao;

import blackjava.Card;
import javax.swing.JTextField;
import blackjava.Deck;
import blackjava.Player;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author marcos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    String aux;
    int i = 3;
    Deck deck = new Deck();
    Player player = new Player();
    Player banca = new Player();
    int caixa;
    int aposta;

    /**
     * Creates new form NewJFrame
     */
    public TelaPrincipal() {
        initComponents();
        jTextFieldSaida.setText("Digite um valor de aposta e aperte DEAL para começar");

    }

    // TROCAR IMAGEM DO ICONE, SWITCH BUGANDO ENTAO FOI COM IF
    public void mudaImg(JLabel icone, Card card) {
        ImageIcon img;
        if (card.face.equals("A")) {
            img = new ImageIcon("D://cartas/as.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("2")) {
            img = new ImageIcon("D://cartas/dois.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("3")) {
            img = new ImageIcon("D://cartas/tres.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("4")) {
            img = new ImageIcon("D://cartas/quatro.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("5")) {
            img = new ImageIcon("D://cartas/cinco.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("6")) {
            img = new ImageIcon("D://cartas/seis.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("7")) {
            img = new ImageIcon("D://cartas/sete.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("8")) {
            img = new ImageIcon("D://cartas/oito.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("9")) {
            img = new ImageIcon("D://cartas/nove.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("T")) {
            img = new ImageIcon("D://cartas/dez.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("J")) {
            img = new ImageIcon("D://cartas/valete.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("Q")) {
            img = new ImageIcon("D://cartas/dama.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else if (card.face.equals("K")) {
            img = new ImageIcon("D://cartas/rei.png");
            img.getImage().flush();
            icone.setIcon(img);
        } else {
            icone.setIcon(null);
        }

        /*
        switch (card.face) {
            case "A":
                img = new ImageIcon("D://cartas/as.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "2":
                img = new ImageIcon("D://cartas/dois.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "3":
                img = new ImageIcon("D://cartas/tres.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "4":
                img = new ImageIcon("D://cartas/quatro.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "5":
                img = new ImageIcon("D://cartas/cinco.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "6":
                img = new ImageIcon("D://cartas/seis.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "7":
                img = new ImageIcon("D://cartas/sete.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "8":
                img = new ImageIcon("D://cartas/oito.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "9":
                img = new ImageIcon("D://cartas/nove.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "T":
                img = new ImageIcon("D://cartas/dez.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "J":
                img = new ImageIcon("D://cartas/valete.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "Q":
                img = new ImageIcon("D://cartas/dama.png");
                img.getImage().flush();
                icone.setIcon(img);
            case "K":
                img = new ImageIcon("D://cartas/rei.png");
                img.getImage().flush();
                icone.setIcon(img);
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCarta10 = new javax.swing.JLabel();
        jLabelCarta9 = new javax.swing.JLabel();
        jLabelCarta8 = new javax.swing.JLabel();
        jLabelCarta7 = new javax.swing.JLabel();
        jLabelCarta6 = new javax.swing.JLabel();
        jLabelCarta5 = new javax.swing.JLabel();
        jLabelCarta4 = new javax.swing.JLabel();
        jLabelCarta3 = new javax.swing.JLabel();
        jLabelCarta2 = new javax.swing.JLabel();
        jLabelCarta1 = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jButtonDeal = new javax.swing.JButton();
        jButtonHit = new javax.swing.JButton();
        jButtonStand = new javax.swing.JButton();
        jLabelCaixa = new javax.swing.JLabel();
        jLabelAposta = new javax.swing.JLabel();
        jTextFieldAposta = new javax.swing.JTextField();
        jTextFieldCaixa = new javax.swing.JTextField();
        jTextFieldSaida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabelCarta10);
        jLabelCarta10.setBounds(410, 360, 50, 70);
        getContentPane().add(jLabelCarta9);
        jLabelCarta9.setBounds(390, 360, 50, 70);
        getContentPane().add(jLabelCarta8);
        jLabelCarta8.setBounds(370, 360, 50, 70);
        getContentPane().add(jLabelCarta7);
        jLabelCarta7.setBounds(350, 360, 50, 70);
        getContentPane().add(jLabelCarta6);
        jLabelCarta6.setBounds(330, 360, 50, 70);
        getContentPane().add(jLabelCarta5);
        jLabelCarta5.setBounds(110, 360, 50, 70);
        getContentPane().add(jLabelCarta4);
        jLabelCarta4.setBounds(90, 360, 50, 70);
        getContentPane().add(jLabelCarta3);
        jLabelCarta3.setBounds(70, 360, 50, 70);
        getContentPane().add(jLabelCarta2);
        jLabelCarta2.setBounds(50, 360, 50, 70);
        getContentPane().add(jLabelCarta1);
        jLabelCarta1.setBounds(30, 360, 50, 70);

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ProfessorDealer2.png"))); // NOI18N
        getContentPane().add(jLabelImagem);
        jLabelImagem.setBounds(0, 0, 490, 510);

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
        jButtonDeal.setBounds(10, 560, 80, 30);

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
        jButtonHit.setBounds(100, 560, 70, 30);

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
        jButtonStand.setBounds(180, 560, 100, 30);

        jLabelCaixa.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelCaixa.setText("CAIXA");
        getContentPane().add(jLabelCaixa);
        jLabelCaixa.setBounds(420, 530, 60, 30);

        jLabelAposta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelAposta.setText("APOSTA");
        getContentPane().add(jLabelAposta);
        jLabelAposta.setBounds(300, 530, 80, 30);

        jTextFieldAposta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextFieldAposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAposta.setText("10");
        jTextFieldAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApostaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAposta);
        jTextFieldAposta.setBounds(290, 560, 90, 30);

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
        jTextFieldCaixa.setBounds(400, 560, 90, 30);

        jTextFieldSaida.setEditable(false);
        jTextFieldSaida.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jTextFieldSaida.setText("Digite um valor de aposta e aperte DEAL para começar");
        getContentPane().add(jTextFieldSaida);
        jTextFieldSaida.setBounds(20, 510, 460, 23);

        setSize(new java.awt.Dimension(518, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDealActionPerformed

        // INICIO DE UMA NOVA RODADA
        jTextFieldAposta.setEditable(false);
        player.clearHand();
        banca.clearHand();
        banca.setPoints(0);
        player.setPoints(0);
        player.setHandSize(0);
        banca.setHandSize(0);
        deck.shuffleDeck();
        jLabelCarta1.setIcon(null);
        jLabelCarta2.setIcon(null);
        jLabelCarta3.setIcon(null);
        jLabelCarta4.setIcon(null);
        jLabelCarta5.setIcon(null);
        jLabelCarta6.setIcon(null);
        jLabelCarta7.setIcon(null);
        jLabelCarta8.setIcon(null);
        jLabelCarta9.setIcon(null);
        jLabelCarta10.setIcon(null);

        caixa = Integer.parseInt(jTextFieldCaixa.getText());
        aposta = Integer.parseInt(jTextFieldAposta.getText());
        if (aposta > caixa) {
            jTextFieldSaida.setText("Aposta maior do que caixa");
        } else {
            jButtonDeal.setEnabled(false);
            jTextFieldCaixa.setText(Integer.toString(caixa - aposta));
            player.addCard(deck.dealCard(0));
            mudaImg(jLabelCarta1, deck.dealCard(0));
            player.addCard(deck.dealCard(1));
            mudaImg(jLabelCarta2, deck.dealCard(1));
            player.setHandSize(2);
            banca.addCard(deck.dealCard(2));
            mudaImg(jLabelCarta6, deck.dealCard(2));
            banca.setHandSize(1);
            if (player.getPoints() == 21) {
                jTextFieldSaida.setText("Parabens voce fez BlackJack!!!");
                jTextFieldCaixa.setText(Integer.toString(caixa + (aposta) * 3));
                jButtonDeal.setEnabled(true);
                jTextFieldAposta.setEditable(true);
            } else {
                //player.getHand().indexOf(A);
                System.out.println(player.getHand());
                jTextFieldSaida.setText(
                        "Voce tem " + player.getPoints() + " pontos e a banca tem " + banca.getPoints() + " pontos.");
                jButtonHit.setEnabled(
                        true);
                jButtonStand.setEnabled(
                        true);

                //deck.displayDeck();
            }
        }
    }//GEN-LAST:event_jButtonDealActionPerformed

    private void jButtonHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitActionPerformed
        player.addCard(deck.dealCard(i));
        player.setHandSize(player.getHandSize() + 1);
        if (player.getHandSize() == 3) {
            mudaImg(jLabelCarta3, deck.dealCard(i));
        } else if (player.getHandSize() == 4) {
            mudaImg(jLabelCarta4, deck.dealCard(i));
        } else if (player.getHandSize() == 5) {
            mudaImg(jLabelCarta5, deck.dealCard(i));
        }
        i++;
        if (player.getPoints() > 21) {
            jTextFieldSaida.setText("Voce perdeu, passou dos 21.");
            jButtonHit.setEnabled(false);
            jTextFieldAposta.setEditable(true);
            jButtonStand.setEnabled(false);
            jButtonDeal.setEnabled(true);
        } else {
            jTextFieldSaida.setText("Voce tem " + player.getPoints() + " pontos e a banca tem " + banca.getPoints() + " pontos.");
        }
    }//GEN-LAST:event_jButtonHitActionPerformed

    private void jButtonStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStandActionPerformed
        jTextFieldAposta.setEditable(true);
        caixa = Integer.parseInt(jTextFieldCaixa.getText());
        aposta = Integer.parseInt(jTextFieldAposta.getText());
        jButtonHit.setEnabled(false);
        jButtonStand.setEnabled(false);
        while (banca.getPoints() < 17) {
            banca.addCard(deck.dealCard(i));
            banca.setHandSize(banca.getHandSize() + 1);
            if (banca.getHandSize() == 2) {
                mudaImg(jLabelCarta7, deck.dealCard(i));
            } else if (banca.getHandSize() == 3) {
                mudaImg(jLabelCarta8, deck.dealCard(i));
            } else if (banca.getHandSize() == 4) {
                mudaImg(jLabelCarta9, deck.dealCard(i));
            } else if (banca.getHandSize() == 5) {
                mudaImg(jLabelCarta10, deck.dealCard(i));
            }
            i++;
        }
        if (banca.getPoints() > 21) {
            jTextFieldSaida.setText("Voce ganhou, a banca passou dos 21.");
            jTextFieldCaixa.setText(Integer.toString(caixa + (aposta * 2)));
        } else if (player.getPoints() > banca.getPoints()) {
            jTextFieldSaida.setText("Voce ganhou, fez " + player.getPoints() + " pontos e a banca fez " + banca.getPoints() + " pontos.");
            jTextFieldCaixa.setText(Integer.toString(caixa + (aposta) * 2));
        } else if (player.getPoints() < banca.getPoints()) {
            jTextFieldSaida.setText("Voce perdeu, fez " + player.getPoints() + " pontos e a banca fez " + banca.getPoints() + " pontos.");
        } else {
            jTextFieldSaida.setText("Voce e a banca empataram com " + player.getPoints());
            jTextFieldCaixa.setText(Integer.toString(caixa + aposta));
        }
        jButtonDeal.setEnabled(true);
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabelAposta;
    private javax.swing.JLabel jLabelCaixa;
    private javax.swing.JLabel jLabelCarta1;
    private javax.swing.JLabel jLabelCarta10;
    private javax.swing.JLabel jLabelCarta2;
    private javax.swing.JLabel jLabelCarta3;
    private javax.swing.JLabel jLabelCarta4;
    private javax.swing.JLabel jLabelCarta5;
    private javax.swing.JLabel jLabelCarta6;
    private javax.swing.JLabel jLabelCarta7;
    private javax.swing.JLabel jLabelCarta8;
    private javax.swing.JLabel jLabelCarta9;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JTextField jTextFieldAposta;
    private javax.swing.JTextField jTextFieldCaixa;
    private javax.swing.JTextField jTextFieldSaida;
    // End of variables declaration//GEN-END:variables

}
