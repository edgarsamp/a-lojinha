package jogo;

import aLojinhaClasses.Monstro;
import aLojinhaClasses.Personagem;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Combate extends javax.swing.JFrame {
    
    ArrayList<Personagem> personagens = new ArrayList<>();
    Monstro monstro;
    int contadorMonstros;
    int []acoes = {0,0}; // guarda as ações dos personagens
    boolean proximaFase;
    
    public Combate() {
        
        proximaFase = false;
        personagens = Inicial.jogador.getPersonagens();
        monstro = new Monstro(Inicial.jogador.getLevelAtual());
        
        contadorMonstros = 1;

        initComponents();
        
        lblBotaoPoder1.setEnabled(false);
        lblBotaoPoder2.setEnabled(false);

        atualizaHud();
        atualizaPersonagens();
        atualizaMonstro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBarraMana23 = new javax.swing.JLabel();
        lblBarraMana22 = new javax.swing.JLabel();
        lblBarraMana21 = new javax.swing.JLabel();
        lblBarraMana11 = new javax.swing.JLabel();
        lblBarraMana12 = new javax.swing.JLabel();
        lblBarraMana13 = new javax.swing.JLabel();
        lblJogadorNome = new javax.swing.JLabel();
        lblJogadorDinheiro = new javax.swing.JLabel();
        lblJogadorLevel = new javax.swing.JLabel();
        lblMonstroNome = new javax.swing.JLabel();
        lblMonstroVida = new javax.swing.JLabel();
        lblMonstroMoedaImg = new javax.swing.JLabel();
        lblMonstroLoot = new javax.swing.JLabel();
        lblMonstroImg = new javax.swing.JLabel();
        lblForca1 = new javax.swing.JLabel();
        lblArmadura1 = new javax.swing.JLabel();
        lblVida1 = new javax.swing.JLabel();
        lblVidaImg1 = new javax.swing.JLabel();
        lblForcaImg1 = new javax.swing.JLabel();
        lblArmaduraImg1 = new javax.swing.JLabel();
        lblBotaoAtacar1 = new javax.swing.JLabel();
        lblBotaoPoder1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblPersonagem1 = new javax.swing.JLabel();
        lblForca2 = new javax.swing.JLabel();
        lblArmadura2 = new javax.swing.JLabel();
        lblVida2 = new javax.swing.JLabel();
        lblVidaImg2 = new javax.swing.JLabel();
        lblForcaImg2 = new javax.swing.JLabel();
        lblArmaduraImg2 = new javax.swing.JLabel();
        lblBotaoAtacar2 = new javax.swing.JLabel();
        lblBotaoPoder2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblPersonagem2 = new javax.swing.JLabel();
        lblBotaoEnviar = new javax.swing.JLabel();
        lblMonstroVidaImg = new javax.swing.JLabel();
        lblBotaoAjuda = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        lblBarraMana23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barraPoder.png"))); // NOI18N
        lblBarraMana23.setToolTipText("Descrição poder 1");
        lblBarraMana23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBarraMana23);
        lblBarraMana23.setBounds(480, 540, 40, 10);

        lblBarraMana22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barraPoder.png"))); // NOI18N
        lblBarraMana22.setToolTipText("Descrição poder 1");
        lblBarraMana22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBarraMana22);
        lblBarraMana22.setBounds(420, 540, 40, 10);

        lblBarraMana21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barraPoder.png"))); // NOI18N
        lblBarraMana21.setToolTipText("Descrição poder 1");
        lblBarraMana21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBarraMana21);
        lblBarraMana21.setBounds(360, 540, 40, 10);

        lblBarraMana11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barraPoder.png"))); // NOI18N
        lblBarraMana11.setToolTipText("Descrição poder 1");
        lblBarraMana11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBarraMana11);
        lblBarraMana11.setBounds(350, 278, 40, 10);

        lblBarraMana12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barraPoder.png"))); // NOI18N
        lblBarraMana12.setToolTipText("Descrição poder 1");
        lblBarraMana12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBarraMana12);
        lblBarraMana12.setBounds(410, 278, 40, 10);

        lblBarraMana13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barraPoder.png"))); // NOI18N
        lblBarraMana13.setToolTipText("Descrição poder 1");
        lblBarraMana13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBarraMana13);
        lblBarraMana13.setBounds(470, 278, 40, 10);

        lblJogadorNome.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblJogadorNome.setForeground(new java.awt.Color(1, 1, 1));
        lblJogadorNome.setText("Edgar");
        jPanel1.add(lblJogadorNome);
        lblJogadorNome.setBounds(50, 70, 470, 40);

        lblJogadorDinheiro.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblJogadorDinheiro.setForeground(new java.awt.Color(1, 1, 1));
        lblJogadorDinheiro.setText("$999");
        jPanel1.add(lblJogadorDinheiro);
        lblJogadorDinheiro.setBounds(750, 60, 180, 40);

        lblJogadorLevel.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblJogadorLevel.setForeground(new java.awt.Color(217, 55, 36));
        lblJogadorLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogadorLevel.setText("Level 10-10");
        jPanel1.add(lblJogadorLevel);
        lblJogadorLevel.setBounds(310, 20, 390, 40);

        lblMonstroNome.setFont(new java.awt.Font("ThaleahFat", 0, 60)); // NOI18N
        lblMonstroNome.setForeground(new java.awt.Color(1, 1, 1));
        lblMonstroNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonstroNome.setText("Esqueleto");
        jPanel1.add(lblMonstroNome);
        lblMonstroNome.setBounds(670, 180, 280, 40);

        lblMonstroVida.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblMonstroVida.setForeground(new java.awt.Color(1, 1, 1));
        lblMonstroVida.setText("30");
        jPanel1.add(lblMonstroVida);
        lblMonstroVida.setBounds(790, 430, 150, 40);

        lblMonstroMoedaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moeda.png"))); // NOI18N
        jPanel1.add(lblMonstroMoedaImg);
        lblMonstroMoedaImg.setBounds(710, 520, 70, 70);

        lblMonstroLoot.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblMonstroLoot.setForeground(new java.awt.Color(1, 1, 1));
        lblMonstroLoot.setText("30");
        jPanel1.add(lblMonstroLoot);
        lblMonstroLoot.setBounds(790, 540, 150, 40);

        lblMonstroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esqueleto.png"))); // NOI18N
        lblMonstroImg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblMonstroImg);
        lblMonstroImg.setBounds(740, 220, 130, 140);

        lblForca1.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblForca1.setForeground(new java.awt.Color(1, 1, 1));
        lblForca1.setText("30");
        jPanel1.add(lblForca1);
        lblForca1.setBounds(490, 190, 100, 40);

        lblArmadura1.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblArmadura1.setForeground(new java.awt.Color(1, 1, 1));
        lblArmadura1.setText("30");
        jPanel1.add(lblArmadura1);
        lblArmadura1.setBounds(320, 230, 100, 40);

        lblVida1.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblVida1.setForeground(new java.awt.Color(1, 1, 1));
        lblVida1.setText("30");
        jPanel1.add(lblVida1);
        lblVida1.setBounds(320, 150, 100, 40);

        lblVidaImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vida.png"))); // NOI18N
        jPanel1.add(lblVidaImg1);
        lblVidaImg1.setBounds(240, 130, 70, 70);

        lblForcaImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ataque.png"))); // NOI18N
        jPanel1.add(lblForcaImg1);
        lblForcaImg1.setBounds(420, 170, 70, 70);

        lblArmaduraImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/armadura.png"))); // NOI18N
        jPanel1.add(lblArmaduraImg1);
        lblArmaduraImg1.setBounds(240, 210, 70, 70);

        lblBotaoAtacar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtacar.png"))); // NOI18N
        lblBotaoAtacar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoAtacar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoAtacar1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoAtacar1MouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoAtacar1);
        lblBotaoAtacar1.setBounds(100, 290, 190, 50);
        lblBotaoAtacar1.getAccessibleContext().setAccessibleDescription("D");

        lblBotaoPoder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnPoder.png"))); // NOI18N
        lblBotaoPoder1.setToolTipText("Descrição poder 1");
        lblBotaoPoder1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoPoder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoPoder1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoPoder1MouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoPoder1);
        lblBotaoPoder1.setBounds(340, 290, 190, 50);
        lblBotaoPoder1.getAccessibleContext().setAccessibleName("teste1");
        lblBotaoPoder1.getAccessibleContext().setAccessibleDescription("Descricao do poder 1");

        lblNome1.setFont(new java.awt.Font("ThaleahFat", 0, 38)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(1, 1, 1));
        lblNome1.setText("Gustavo");
        jPanel1.add(lblNome1);
        lblNome1.setBounds(60, 260, 150, 39);

        lblPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arqueiro.png"))); // NOI18N
        lblPersonagem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPersonagem1);
        lblPersonagem1.setBounds(70, 130, 130, 140);

        lblForca2.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblForca2.setForeground(new java.awt.Color(1, 1, 1));
        lblForca2.setText("30");
        jPanel1.add(lblForca2);
        lblForca2.setBounds(500, 450, 100, 40);

        lblArmadura2.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblArmadura2.setForeground(new java.awt.Color(1, 1, 1));
        lblArmadura2.setText("30");
        jPanel1.add(lblArmadura2);
        lblArmadura2.setBounds(330, 490, 100, 40);

        lblVida2.setFont(new java.awt.Font("ThaleahFat", 0, 80)); // NOI18N
        lblVida2.setForeground(new java.awt.Color(1, 1, 1));
        lblVida2.setText("30");
        jPanel1.add(lblVida2);
        lblVida2.setBounds(330, 410, 100, 40);

        lblVidaImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vida.png"))); // NOI18N
        jPanel1.add(lblVidaImg2);
        lblVidaImg2.setBounds(250, 390, 70, 70);

        lblForcaImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ataque.png"))); // NOI18N
        jPanel1.add(lblForcaImg2);
        lblForcaImg2.setBounds(430, 430, 70, 70);

        lblArmaduraImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/armadura.png"))); // NOI18N
        jPanel1.add(lblArmaduraImg2);
        lblArmaduraImg2.setBounds(250, 470, 70, 70);

        lblBotaoAtacar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtacar.png"))); // NOI18N
        lblBotaoAtacar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoAtacar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoAtacar2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoAtacar2MouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoAtacar2);
        lblBotaoAtacar2.setBounds(110, 550, 190, 50);

        lblBotaoPoder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnPoder.png"))); // NOI18N
        lblBotaoPoder2.setToolTipText("Descrição poder 2");
        lblBotaoPoder2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoPoder2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoPoder2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoPoder2MouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoPoder2);
        lblBotaoPoder2.setBounds(350, 550, 190, 50);

        lblNome2.setFont(new java.awt.Font("ThaleahFat", 0, 38)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(1, 1, 1));
        lblNome2.setText("Augusto");
        jPanel1.add(lblNome2);
        lblNome2.setBounds(70, 520, 150, 39);

        lblPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guerreiro.png"))); // NOI18N
        lblPersonagem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPersonagem2);
        lblPersonagem2.setBounds(70, 380, 130, 140);

        lblBotaoEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEnviar.png"))); // NOI18N
        lblBotaoEnviar.setToolTipText("a");
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
        lblBotaoEnviar.setBounds(180, 630, 280, 80);

        lblMonstroVidaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vida.png"))); // NOI18N
        jPanel1.add(lblMonstroVidaImg);
        lblMonstroVidaImg.setBounds(710, 410, 70, 70);

        lblBotaoAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoAjuda.png"))); // NOI18N
        lblBotaoAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotaoAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBotaoAjudaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBotaoAjudaMouseReleased(evt);
            }
        });
        jPanel1.add(lblBotaoAjuda);
        lblBotaoAjuda.setBounds(940, 640, 70, 70);

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combateFundo.png"))); // NOI18N
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

    private void lblBotaoAtacar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoAtacar1MousePressed
        // efeito visual de apertar o botao
        lblBotaoAtacar1.setBounds(100, 295, 190, 50);
    }//GEN-LAST:event_lblBotaoAtacar1MousePressed

    private void lblBotaoAtacar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoAtacar1MouseReleased

        lblBotaoAtacar1.setBounds(100, 290, 190, 50);
        
        lblBotaoAtacar1.setEnabled(true);
        lblBotaoPoder1.setEnabled(false);
        
        
        acoes[0] = 0;
        atualizaHud();
    }//GEN-LAST:event_lblBotaoAtacar1MouseReleased

    private void lblBotaoPoder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoPoder1MousePressed
        // efeito visual de apertar o botao
        lblBotaoPoder1.setBounds(340, 295, 190, 50);
    }//GEN-LAST:event_lblBotaoPoder1MousePressed

    private void lblBotaoPoder1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoPoder1MouseReleased
        lblBotaoPoder1.setBounds(340, 290, 190, 50);
        
        lblBotaoAtacar1.setEnabled(false);
        lblBotaoPoder1.setEnabled(true);
        
        acoes[0] = 1;
        atualizaHud();
    }//GEN-LAST:event_lblBotaoPoder1MouseReleased

    private void lblBotaoAtacar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoAtacar2MousePressed
        // efeito visual de apertar o botao
        lblBotaoAtacar2.setBounds(110, 555, 190, 50);
    }//GEN-LAST:event_lblBotaoAtacar2MousePressed

    private void lblBotaoAtacar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoAtacar2MouseReleased
        lblBotaoAtacar2.setBounds(110, 550, 190, 50);
        
        lblBotaoAtacar2.setEnabled(true);
        lblBotaoPoder2.setEnabled(false);

        acoes[1] = 0;
        atualizaHud();
    }//GEN-LAST:event_lblBotaoAtacar2MouseReleased

    private void lblBotaoPoder2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoPoder2MousePressed
        // efeito visual de apertar o botao
        lblBotaoPoder2.setBounds(350, 555, 190, 50);
    }//GEN-LAST:event_lblBotaoPoder2MousePressed

    private void lblBotaoPoder2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoPoder2MouseReleased
        lblBotaoPoder2.setBounds(350, 550, 190, 50);
        lblBotaoAtacar2.setEnabled(false);
        lblBotaoPoder2.setEnabled(true);
        
        acoes[1] = 1;
        atualizaHud();
    }//GEN-LAST:event_lblBotaoPoder2MouseReleased

    private void lblBotaoEnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoEnviarMousePressed
        // efeito visual de apertar o botao
        lblBotaoEnviar.setBounds(180, 625, 280, 80);
    }//GEN-LAST:event_lblBotaoEnviarMousePressed

    private void lblBotaoEnviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoEnviarMouseReleased

        lblBotaoEnviar.setBounds(180, 620, 280, 80);
        
        if(personagens.get(0).isVivo()){ // Se o personagem 1 esta vivo ele age
            if (acoes[0] == 0) // se a ação é atacar ele ataca
                monstro.receberAtaque(personagens.get(0).atacar());
            else if(personagens.get(0).getMana() > 0) // se a ação é poder, checa se tem mana
                if (personagens.get(0).getClasse().equals("mago")) // usa a habilidade
                    if(personagens.get(1).isVivo()) // se o outro personagem ta vivo usa a habilidade nele
                            personagens.get(0).usarHabilidade(personagens.get(1));
                    else // se nao usa no outro 
                            personagens.get(0).usarHabilidade(personagens.get(0));
                else
                    personagens.get(0).usarHabilidade(monstro);
            else // se nao tem mana aparece a mensagem e o personagem perde a vez
                JOptionPane.showMessageDialog(null, "O personagem " + personagens.get(0).getNome() + " não conseguiu usar sua habilidade!");
                
        }
        
        checkMonstro();
        
        if(!proximaFase){   // Se nao acabou os monstros desta fase o monstro age e depois o jogador 2
            if (personagens.get(0).isVivo()) // ataca o primeiro personagem vivo
                personagens.get(0).receberAtaque(monstro.atacar());
            else 
                personagens.get(1).receberAtaque(monstro.atacar());
            

            checkPersonagens();

            if (personagens.get(1).isVivo()) {  // Se o personagem 2 esta vivo ele age
                if (acoes[1] == 0) // se a ação é atacar ele ataca
                    monstro.receberAtaque(personagens.get(1).atacar());
                else if(personagens.get(1).getMana() > 0)// se a ação é poder, checa se tem mana
                    if(personagens.get(1).getClasse().equals("mago"))// usa a habilidade
                        if(personagens.get(0).isVivo()) // se o outro personagem ta vivo usa a habilidade nele
                            personagens.get(1).usarHabilidade(personagens.get(0));
                        else// se nao usa no outro 
                            personagens.get(1).usarHabilidade(personagens.get(1));
                    else
                        personagens.get(1).usarHabilidade(monstro);
                else
                    JOptionPane.showMessageDialog(null, "O personagem " + personagens.get(1).getNome() + " não conseguiu usar sua habilidade!");
            }

            checkMonstro();
        }
        
        atualizaPersonagens();
        atualizaMonstro();
        atualizaHud();
    }//GEN-LAST:event_lblBotaoEnviarMouseReleased

    private void lblBotaoAjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoAjudaMousePressed
        // TODO add your handling code here:
        lblBotaoAjuda.setBounds(940, 645, 70, 70);
    }//GEN-LAST:event_lblBotaoAjudaMousePressed

    private void lblBotaoAjudaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotaoAjudaMouseReleased
        // TODO add your handling code here:
        lblBotaoAjuda.setBounds(940, 640, 70, 70);
        
        new Ajuda().setVisible(true);
    }//GEN-LAST:event_lblBotaoAjudaMouseReleased

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
            java.util.logging.Logger.getLogger(Combate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArmadura1;
    private javax.swing.JLabel lblArmadura2;
    private javax.swing.JLabel lblArmaduraImg1;
    private javax.swing.JLabel lblArmaduraImg2;
    private javax.swing.JLabel lblBarraMana11;
    private javax.swing.JLabel lblBarraMana12;
    private javax.swing.JLabel lblBarraMana13;
    private javax.swing.JLabel lblBarraMana21;
    private javax.swing.JLabel lblBarraMana22;
    private javax.swing.JLabel lblBarraMana23;
    private javax.swing.JLabel lblBotaoAjuda;
    private javax.swing.JLabel lblBotaoAtacar1;
    private javax.swing.JLabel lblBotaoAtacar2;
    private javax.swing.JLabel lblBotaoEnviar;
    private javax.swing.JLabel lblBotaoPoder1;
    private javax.swing.JLabel lblBotaoPoder2;
    private javax.swing.JLabel lblForca1;
    private javax.swing.JLabel lblForca2;
    private javax.swing.JLabel lblForcaImg1;
    private javax.swing.JLabel lblForcaImg2;
    private javax.swing.JLabel lblJogadorDinheiro;
    private javax.swing.JLabel lblJogadorLevel;
    private javax.swing.JLabel lblJogadorNome;
    private javax.swing.JLabel lblMonstroImg;
    private javax.swing.JLabel lblMonstroLoot;
    private javax.swing.JLabel lblMonstroMoedaImg;
    private javax.swing.JLabel lblMonstroNome;
    private javax.swing.JLabel lblMonstroVida;
    private javax.swing.JLabel lblMonstroVidaImg;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblPersonagem1;
    private javax.swing.JLabel lblPersonagem2;
    private javax.swing.JLabel lblVida1;
    private javax.swing.JLabel lblVida2;
    private javax.swing.JLabel lblVidaImg1;
    private javax.swing.JLabel lblVidaImg2;
    // End of variables declaration//GEN-END:variables

    private void atualizaHud() { // atualiza informações visuais do hud da tela
        lblJogadorNome.setText(Inicial.jogador.getNome());
        lblJogadorLevel.setText("Level " + Inicial.jogador.getLevelAtual() + "-10");
        lblJogadorDinheiro.setText("$" + Inicial.jogador.getDinheiro());
        
        lblBotaoEnviar.setToolTipText(atualizaAcoes());
        
        lblBotaoPoder1.setToolTipText(personagens.get(0).getDesPoder());
        lblBotaoPoder2.setToolTipText(personagens.get(1).getDesPoder());
        
        switch(personagens.get(0).getMana()){ // Atualiza a mana do personagem 1
            case 0:
                lblBarraMana13.setVisible(false);
                lblBarraMana12.setVisible(false);
                lblBarraMana11.setVisible(false);
                break;
              case 1:
                lblBarraMana13.setVisible(false);
                lblBarraMana12.setVisible(false);
                lblBarraMana11.setVisible(true);
                break;
              case 2:
                lblBarraMana13.setVisible(false);
                lblBarraMana12.setVisible(true);
                lblBarraMana11.setVisible(true);
                break;
              case 3:
                lblBarraMana13.setVisible(true);
                lblBarraMana12.setVisible(true);
                lblBarraMana11.setVisible(true);
                break;
        }
        
        switch(personagens.get(1).getMana()){ // Atualiza a mana do personagem 2
            case 0:
                lblBarraMana23.setVisible(false);
                lblBarraMana22.setVisible(false);
                lblBarraMana21.setVisible(false);
                break;
              case 1:
                lblBarraMana23.setVisible(false);
                lblBarraMana22.setVisible(false);
                lblBarraMana21.setVisible(true);
                break;
              case 2:
                lblBarraMana23.setVisible(false);
                lblBarraMana22.setVisible(true);
                lblBarraMana21.setVisible(true);
                break;
              case 3:
                lblBarraMana23.setVisible(true);
                lblBarraMana22.setVisible(true);
                lblBarraMana21.setVisible(true);
                break;
        }
    }

    private void atualizaPersonagens() { // Atualiza dados dos personagens na tela
        lblVida1.setText(personagens.get(0).getVida() + "");
        lblArmadura1.setText(personagens.get(0).getArmadura() + "");
        lblForca1.setText(personagens.get(0).getForca()+ "");
        lblNome1.setText(personagens.get(0).getNome() + "");
        
        if(personagens.get(0).isVivo()){
            lblPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + personagens.get(0).getClasse()+ ".png")));
            lblVida1.setText(personagens.get(0).getVida() + "");
            
            lblBarraMana13.setEnabled(true);
            lblBarraMana12.setEnabled(true);
            lblBarraMana11.setEnabled(true);
        }
        else{
            lblVida1.setText("0");  
            lblPersonagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + personagens.get(0).getClasse() + "MortoComb.png")));
            
            lblBarraMana13.setEnabled(false);
            lblBarraMana12.setEnabled(false);
            lblBarraMana11.setEnabled(false);
        }

        
        lblArmadura2.setText(personagens.get(1).getArmadura() + "");
        lblForca2.setText(personagens.get(1).getForca() + "");
        lblNome2.setText(personagens.get(1).getNome() + "");
        if(personagens.get(1).isVivo()){
            lblPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + personagens.get(1).getClasse()+ ".png")));
            lblVida2.setText(personagens.get(1).getVida() + "");
            
            lblBarraMana23.setEnabled(true);
            lblBarraMana22.setEnabled(true);
            lblBarraMana21.setEnabled(true);
        }
        else{
            lblVida2.setText("0");  
            lblPersonagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + personagens.get(1).getClasse() + "MortoComb.png")));
            
            lblBarraMana23.setEnabled(false);
            lblBarraMana22.setEnabled(false);
            lblBarraMana21.setEnabled(false);
        }
    }

    private void atualizaMonstro() { // atualiza os dados visuais do monstro
        lblMonstroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + monstro.getTipo()+ ".png")));
        lblMonstroLoot.setText(monstro.getDinheiro() + "");
        lblMonstroNome.setText(monstro.getTipo());
        lblMonstroVida.setText(monstro.getVida() + "");
    }

    private void checkPersonagens() { // checa se os persoangens estao vivos
                
        if(!personagens.get(0).isVivo() && !personagens.get(1).isVivo()){ // se os dois morreram acaba o jogo
            new Perdeu().setVisible(true);
            setVisible(false);
        }else{
            if (!personagens.get(0).isVivo()) {
                lblVida1.setText("0");
                lblVida1.setEnabled(false);
                lblArmadura1.setEnabled(false);
                lblForca1.setEnabled(false);
                lblNome1.setEnabled(false);
                lblPersonagem1.setEnabled(false);
                
                lblVidaImg1.setEnabled(false);
                lblArmaduraImg1.setEnabled(false);
                lblForcaImg1.setEnabled(false);
                
                lblBarraMana13.setEnabled(false);
                lblBarraMana12.setEnabled(false);
                lblBarraMana11.setEnabled(false);
            }

            if (!personagens.get(1).isVivo()) {
                lblVida2.setText("0");
                lblVida2.setEnabled(false);
                lblArmadura2.setEnabled(false);
                lblForca2.setEnabled(false);
                lblNome2.setEnabled(false);
                lblPersonagem2.setEnabled(false);
                
                lblVidaImg2.setEnabled(false);
                lblArmaduraImg2.setEnabled(false);
                lblForcaImg2.setEnabled(false);

            }
        }
              

    }

    private void checkMonstro() { // checa os estado do monstro
        if (!monstro.isVivo()){ // se elemorreu
            Inicial.jogador.recebeDinheiro(monstro.getDinheiro()); // da o dinheiro para o jogador

            if (contadorMonstros < 3) { //se nao acabou os monstros da fase
                monstro = new Monstro(Inicial.jogador.getLevelAtual()); // cria um novo e incrementa o contador
                contadorMonstros++;
                
                // atualiza os dados visuais
                atualizaMonstro(); 
                atualizaHud();
            }else{ // se ja matou os 3 monstros da fase
                setVisible(false);
                if (Inicial.jogador.getLevelAtual() >= 10) { // se tiver na fase 10 acaba o jogo
                    setVisible(false);
                    new Ganhou().setVisible(true);
                }else { // se nao tiver sobe o jogador de nivel e abre a lojinha
                    proximaFase = true;
                    Inicial.jogador.levelUp();
                    setVisible(false);
                    new Lojinha().setVisible(true);
                }
            }
        }
    }
    
    private String atualizaAcoes(){ // atualiza as ações que os personagens querem realizar
        String temp = "";
        temp +=  personagens.get(0).getNome() +(acoes[0] == 0 ? " irá atacar" : " irá usar sua habilidade" ) + "  -  ";
        temp +=  personagens.get(1).getNome() +(acoes[1] == 0 ? " irá atacar" : " irá usar sua habilidade" );
                
        return temp;
    }
}
