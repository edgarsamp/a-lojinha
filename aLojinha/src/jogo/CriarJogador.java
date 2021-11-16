package jogo;

import aLojinhaClasses.Personagem;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CriarJogador extends javax.swing.JFrame {
    static int personagemDaVez = -1;
    static ArrayList<Personagem> perso;

    public CriarJogador() {
        perso = Inicial.jogador.getPersonagens();
        initComponents();

        if(perso.get(0).getNome().equals("")) //Se nao tiver personagem 1 criado, mostra o botao de criar
            botaoCriar1();
        else                                  // se nao mostra o personagem
            mostrarPersonagem1();
        
        if (perso.get(1).getNome().equals("")) //Se nao tiver personagem 2 criado, mostra o botao de criar
            botaoCriar2();
        else
            mostrarPersonagem2();   // se nao mostra o personagem

        
        // Coloca a imagem de fundo por baixo de tudo
        pnlCriarJogador.setComponentZOrder(imageBackground, pnlCriarJogador.getComponents().length-1);
    }
    
    private void botaoCriar1() { // coloca na tela o botao que cria o personagem 1
        lblBotaoCriar1 = new javax.swing.JLabel();

        lblBotaoCriar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoCriar.png")));
        lblBotaoCriar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoCriar1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoCriar1.setBounds(50, 355, 380, 80);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                personagemDaVez = 0; // diz que o personagem 1 que deve ser criado
                lblBotaoCriar1.setBounds(50, 350, 380, 80);
                setVisible(false);
                new CriarPersonagem().setVisible(true); // pagina de criação de personagem
            }
        });
        pnlCriarJogador.add(lblBotaoCriar1);
        lblBotaoCriar1.setBounds(50, 350, 380, 80);

        
    }
    private void botaoCriar2() { // coloca na tela o botao que cria o personagem 1
    
        lblBotaoCriar2 = new javax.swing.JLabel();
        
        lblBotaoCriar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoCriar.png"))); // NOI18N
        lblBotaoCriar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoCriar2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoCriar2.setBounds(580, 355, 380, 80);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                personagemDaVez = 1; // diz que o personagem 1 que deve ser criado
                lblBotaoCriar2.setBounds(580, 350, 380, 80);
                setVisible(false);
                new CriarPersonagem().setVisible(true); // pagina de criação de personagem
            }
        });
        pnlCriarJogador.add(lblBotaoCriar2);
        lblBotaoCriar2.setBounds(580, 350, 380, 80);
     
    }
    
    private void mostrarPersonagem1(){ // mostra na tela os dados do personagem 1
        lblPersonagem1 = new javax.swing.JLabel();
        lblPersonagem1Nome = new javax.swing.JLabel();
        lblVida1 = new javax.swing.JLabel();
        lblAtributos1 = new javax.swing.JLabel();
        lblArmadura1 = new javax.swing.JLabel();
        lblPoder1 = new javax.swing.JLabel();
        lblForca1 = new javax.swing.JLabel();

        lblPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + perso.get(0).getClasse() + ".png")));
        pnlCriarJogador.add(lblPersonagem1);
        lblPersonagem1.setBounds(190, 250, 140, 170);

        lblPersonagem1Nome.setFont(new java.awt.Font("ThaleahFat", 0, 50));
        lblPersonagem1Nome.setForeground(new java.awt.Color(1, 1, 1));
        lblPersonagem1Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonagem1Nome.setText(perso.get(0).getNome());
        pnlCriarJogador.add(lblPersonagem1Nome);
        lblPersonagem1Nome.setBounds(90, 215, 330, 40);
        
        lblAtributos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atributos.png"))); 
        lblAtributos1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCriarJogador.add(lblAtributos1);
        lblAtributos1.setBounds(50, 420, 220, 170);

        lblVida1.setFont(new java.awt.Font("ThaleahFat", 0, 50));
        lblVida1.setForeground(new java.awt.Color(1, 1, 1));
        lblVida1.setText(perso.get(0).getVida() + "");
        pnlCriarJogador.add(lblVida1);
        lblVida1.setBounds(270, 425, 90, 40);

        lblArmadura1.setFont(new java.awt.Font("ThaleahFat", 0, 50)); 
        lblArmadura1.setForeground(new java.awt.Color(1, 1, 1));
        lblArmadura1.setText(perso.get(0).getArmadura()+ "");
        pnlCriarJogador.add(lblArmadura1);
        lblArmadura1.setBounds(270, 470, 90, 40);

        lblPoder1.setFont(new java.awt.Font("ThaleahFat", 0, 50)); 
        lblPoder1.setForeground(new java.awt.Color(1, 1, 1));
        lblPoder1.setText(perso.get(0).getPoder()+ "");
        pnlCriarJogador.add(lblPoder1);
        lblPoder1.setBounds(270, 510, 90, 40);
        
        lblForca1.setFont(new java.awt.Font("ThaleahFat", 0, 50));
        lblForca1.setForeground(new java.awt.Color(1, 1, 1));
        lblForca1.setText(perso.get(0).getForca()+ "");
        pnlCriarJogador.add(lblForca1);
        lblForca1.setBounds(270, 550, 90, 40);

    }
    private void mostrarPersonagem2(){ // mostra na tela os dados do personagem 2
        lblPersonagem2Nome = new javax.swing.JLabel();
        lblPersonagem2 = new javax.swing.JLabel();
        lblAtributos2 = new javax.swing.JLabel();
        lblVida2 = new javax.swing.JLabel();
        lblArmadura2 = new javax.swing.JLabel();
        lblPoder2 = new javax.swing.JLabel();
        lblForca2 = new javax.swing.JLabel();

        pnlCriarJogador.setMaximumSize(new java.awt.Dimension(1024, 720));
        pnlCriarJogador.setMinimumSize(new java.awt.Dimension(1024, 720));
        pnlCriarJogador.setLayout(null);

        lblPersonagem2Nome.setFont(new java.awt.Font("ThaleahFat", 0, 50)); // NOI18N
        lblPersonagem2Nome.setForeground(new java.awt.Color(1, 1, 1));
        lblPersonagem2Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonagem2Nome.setText(perso.get(1).getNome());
        pnlCriarJogador.add(lblPersonagem2Nome);
        lblPersonagem2Nome.setBounds(610, 220, 330, 40);

        lblPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + perso.get(1).getClasse() + ".png"))); // NOI18N
        lblPersonagem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCriarJogador.add(lblPersonagem2);
        lblPersonagem2.setBounds(710, 260, 140, 170);

        lblAtributos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atributos.png"))); // NOI18N
        lblAtributos2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCriarJogador.add(lblAtributos2);
        lblAtributos2.setBounds(570, 430, 220, 170);

        lblVida2.setFont(new java.awt.Font("ThaleahFat", 0, 50)); // NOI18N
        lblVida2.setForeground(new java.awt.Color(1, 1, 1));
        lblVida2.setText(perso.get(1).getVida() + "");
        pnlCriarJogador.add(lblVida2);
        lblVida2.setBounds(790, 440, 90, 40);

        lblArmadura2.setFont(new java.awt.Font("ThaleahFat", 0, 50)); // NOI18N
        lblArmadura2.setForeground(new java.awt.Color(1, 1, 1));
        lblArmadura2.setText(perso.get(1).getArmadura()+ "");
        pnlCriarJogador.add(lblArmadura2);
        lblArmadura2.setBounds(790, 480, 90, 40);

        lblPoder2.setFont(new java.awt.Font("ThaleahFat", 0, 50)); // NOI18N
        lblPoder2.setForeground(new java.awt.Color(1, 1, 1));
        lblPoder2.setText(perso.get(1).getPoder()+ "");
        pnlCriarJogador.add(lblPoder2);
        lblPoder2.setBounds(790, 520, 90, 40);

        lblForca2.setFont(new java.awt.Font("ThaleahFat", 0, 50)); // NOI18N
        lblForca2.setForeground(new java.awt.Color(1, 1, 1));
        lblForca2.setText(perso.get(1).getForca()+ "");
        pnlCriarJogador.add(lblForca2);
        lblForca2.setBounds(790, 560, 90, 40);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCriarJogador = new javax.swing.JPanel();
        lblBotaoProximo = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);

        pnlCriarJogador.setMaximumSize(new java.awt.Dimension(1024, 720));
        pnlCriarJogador.setMinimumSize(new java.awt.Dimension(1024, 720));
        pnlCriarJogador.setLayout(null);

        lblBotaoProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoProximo.png"))); // NOI18N
        lblBotaoProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotaoProximoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoProximoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoProximoMouseReleased(evt);
            }
        });
        pnlCriarJogador.add(lblBotaoProximo);
        lblBotaoProximo.setBounds(940, 630, 70, 70);

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroJogadorFundo.png"))); // NOI18N
        pnlCriarJogador.add(imageBackground);
        imageBackground.setBounds(0, 0, 1030, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCriarJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCriarJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotaoProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoProximoMouseClicked

        if(perso.get(0).getNome().equals("") || perso.get(1).getNome().equals("") ) // checa de os dois personagens foram criados
            JOptionPane.showMessageDialog(null, "Para começar voce deve criar os dois personagens!");
        else{ // se foram vai para a proxima fase
            Inicial.jogador.setPersonagens(perso);
            setVisible(false);
            manipulaArquivos.salvaJogo(Inicial.jogador);
            new Combate().setVisible(true);
        }

    }//GEN-LAST:event_lblBotaoProximoMouseClicked

    private void lblBotaoProximoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoProximoMousePressed
        // TODO add your handling code here:
        lblBotaoProximo.setBounds(940, 635, 70, 70);
        
    }//GEN-LAST:event_lblBotaoProximoMousePressed

    private void lblBotaoProximoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoProximoMouseReleased
        // TODO add your handling code here:
        lblBotaoProximo.setBounds(940, 630, 70, 70);
    }//GEN-LAST:event_lblBotaoProximoMouseReleased

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
            java.util.logging.Logger.getLogger(CriarJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarJogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel lblBotaoProximo;
    private javax.swing.JPanel pnlCriarJogador;
    // End of variables declaration//GEN-END:variables
    
    
    private javax.swing.JLabel lblBotaoCriar1;
    private javax.swing.JLabel lblBotaoCriar2;
    
    private javax.swing.JLabel lblArmadura1;
    private javax.swing.JLabel lblAtributos1;
    private javax.swing.JLabel lblForca1;
    private javax.swing.JLabel lblPersonagem1;
    private javax.swing.JLabel lblPersonagem1Nome;
    private javax.swing.JLabel lblPoder1;
    private javax.swing.JLabel lblVida1;
    
    private javax.swing.JLabel lblArmadura2;
    private javax.swing.JLabel lblAtributos2;
    private javax.swing.JLabel lblForca2;
    private javax.swing.JLabel lblPersonagem2;
    private javax.swing.JLabel lblPersonagem2Nome;
    private javax.swing.JLabel lblPoder2;
    private javax.swing.JLabel lblVida2;


}
