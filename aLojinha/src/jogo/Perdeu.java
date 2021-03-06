package jogo;

import java.time.Year;


public class Perdeu extends javax.swing.JFrame {
    public Perdeu() {
        // deleta o save do jogo
        manipulaArquivos.deletaJogo();
        initComponents();
        
        // personaliza a tela com os dados dos personagens
        int ano = Year.now().getValue();
        
        lblData1.setText(ano + " - " + ano);
        lblData2.setText(ano + " - " + ano);
        
        lblPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + Inicial.jogador.getPersonagens().get(0).getClasse()+ "Morto.png")));
        lblPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + Inicial.jogador.getPersonagens().get(1).getClasse()+ "Morto.png")));
        
        lblNome1.setText(Inicial.jogador.getPersonagens().get(0).getNome() + "");
        lblNome2.setText(Inicial.jogador.getPersonagens().get(1).getNome() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBotaoEnviar = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblPersonagem1 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        lblPersonagem2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblData2 = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        lblBotaoEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnJogarNovamente.png"))); // NOI18N
        lblBotaoEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoEnviarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoEnviarMouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoEnviar);
        lblBotaoEnviar.setBounds(250, 630, 550, 80);

        lblNome1.setFont(new java.awt.Font("ThaleahFat", 0, 65)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(1, 1, 1));
        lblNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome1.setText("Augusto");
        jPanel1.add(lblNome1);
        lblNome1.setBounds(90, 520, 400, 60);

        lblPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guerreiroMorto.png"))); // NOI18N
        lblPersonagem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPersonagem1);
        lblPersonagem1.setBounds(150, 300, 280, 220);

        lblData1.setFont(new java.awt.Font("ThaleahFat", 0, 55)); // NOI18N
        lblData1.setForeground(new java.awt.Color(1, 1, 1));
        lblData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData1.setText("2021 - 2021");
        jPanel1.add(lblData1);
        lblData1.setBounds(155, 260, 280, 60);

        lblPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guerreiroMorto.png"))); // NOI18N
        lblPersonagem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPersonagem2);
        lblPersonagem2.setBounds(620, 300, 280, 220);

        lblNome2.setFont(new java.awt.Font("ThaleahFat", 0, 65)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(1, 1, 1));
        lblNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome2.setText("Augusto");
        jPanel1.add(lblNome2);
        lblNome2.setBounds(560, 520, 400, 60);

        lblData2.setFont(new java.awt.Font("ThaleahFat", 0, 55)); // NOI18N
        lblData2.setForeground(new java.awt.Color(1, 1, 1));
        lblData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData2.setText("2021 - 2021");
        jPanel1.add(lblData2);
        lblData2.setBounds(630, 260, 280, 60);

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fimDeJogoFundo.png"))); // NOI18N
        jPanel1.add(imageBackground);
        imageBackground.setBounds(0, 0, 1030, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotaoEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoEnviarMousePressed

        lblBotaoEnviar.setBounds(250, 625, 550, 80);
    }//GEN-LAST:event_lblBotaoEnviarMousePressed

    private void lblBotaoEnviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoEnviarMouseReleased

        lblBotaoEnviar.setBounds(250, 620, 550, 80);
        setVisible(false);
        new Inicial().setVisible(true);
    }//GEN-LAST:event_lblBotaoEnviarMouseReleased

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
            java.util.logging.Logger.getLogger(Perdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perdeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBotaoEnviar;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblPersonagem1;
    private javax.swing.JLabel lblPersonagem2;
    // End of variables declaration//GEN-END:variables
}
