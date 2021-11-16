package jogo;

public class Ajuda extends javax.swing.JFrame {
    public Ajuda() { // pagina de explicação do jogo
        initComponents();
        
        lblBotaoVolta.setVisible(false);
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
        lblBotaoVolta = new javax.swing.JLabel();
        lblBotaoProximo = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        setMaximumSize(new java.awt.Dimension(495, 720));
        setMinimumSize(new java.awt.Dimension(495, 720));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(495, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(495, 720));
        jPanel1.setLayout(null);

        lblBotaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoVoltar.png"))); // NOI18N
        lblBotaoVolta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoVolta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoVoltaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoVoltaMouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoVolta);
        lblBotaoVolta.setBounds(10, 0, 70, 70);

        lblBotaoProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoProximo.png"))); // NOI18N
        lblBotaoProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoProximoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoProximoMouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoProximo);
        lblBotaoProximo.setBounds(420, 0, 70, 70);

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajudaFundo1.png"))); // NOI18N
        jPanel1.add(imageBackground);
        imageBackground.setBounds(0, 0, 495, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotaoProximoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoProximoMousePressed
        // TODO add your handling code here:
        lblBotaoProximo.setBounds(420, 5, 70, 70);
    }//GEN-LAST:event_lblBotaoProximoMousePressed

    private void lblBotaoProximoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoProximoMouseReleased
        // TODO add your handling code here:
        lblBotaoProximo.setBounds(420, 0, 70, 70);
        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajudaFundo2.png"))); 
        lblBotaoProximo.setVisible(false);
        lblBotaoVolta.setVisible(true);
        
    }//GEN-LAST:event_lblBotaoProximoMouseReleased

    private void lblBotaoVoltaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoVoltaMousePressed
        // TODO add your handling code here:
        lblBotaoVolta.setBounds(10, 5, 70, 70);
    }//GEN-LAST:event_lblBotaoVoltaMousePressed

    private void lblBotaoVoltaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoVoltaMouseReleased
        // TODO add your handling code here:
        lblBotaoVolta.setBounds(10, 0, 70, 70);
        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajudaFundo1.png"))); // NOI18N
        lblBotaoProximo.setVisible(true);
        lblBotaoVolta.setVisible(false);
        
        
    }//GEN-LAST:event_lblBotaoVoltaMouseReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBotaoProximo;
    private javax.swing.JLabel lblBotaoVolta;
    // End of variables declaration//GEN-END:variables
}
