package jogo;

import aLojinhaClasses.Jogador;

public class Ganhou extends javax.swing.JFrame {
    static Jogador jogador;

    public Ganhou() {
        // deleta o save do jogo
        manipulaArquivos.deletaJogo();
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

        jPanel1 = new javax.swing.JPanel();
        lblNomeJogador = new javax.swing.JLabel();
        lblBotaoJogarNovamente = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        lblNomeJogador.setFont(new java.awt.Font("ThaleahFat", 0, 120)); // NOI18N
        lblNomeJogador.setForeground(new java.awt.Color(1, 1, 1));
        lblNomeJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeJogador.setText(Inicial.jogador.getNome());
        jPanel1.add(lblNomeJogador);
        lblNomeJogador.setBounds(80, 140, 860, 80);

        lblBotaoJogarNovamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnJogarNovamente.png"))); // NOI18N
        lblBotaoJogarNovamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoJogarNovamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoJogarNovamenteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoJogarNovamenteMouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoJogarNovamente);
        lblBotaoJogarNovamente.setBounds(250, 630, 550, 80);

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ganhouFundo.png"))); // NOI18N
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

    private void lblBotaoJogarNovamenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoJogarNovamenteMousePressed

        lblBotaoJogarNovamente.setBounds(250, 625, 550, 80);
    }//GEN-LAST:event_lblBotaoJogarNovamenteMousePressed

    private void lblBotaoJogarNovamenteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoJogarNovamenteMouseReleased

        lblBotaoJogarNovamente.setBounds(250, 620, 550, 80);
        setVisible(false);
        new Inicial().setVisible(true);
    }//GEN-LAST:event_lblBotaoJogarNovamenteMouseReleased

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
            java.util.logging.Logger.getLogger(Ganhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganhou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Ganhou().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBotaoJogarNovamente;
    private javax.swing.JLabel lblNomeJogador;
    // End of variables declaration//GEN-END:variables
}
