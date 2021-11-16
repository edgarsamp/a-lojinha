package aLojinhaClasses;

import java.util.Random;

public class Personagem extends Combatente{
    private String nome, classe, tipoItem, desPoder;
    private int poder, vidaMax, mana;
    
    public Personagem() {
        this.nome = "";
        this.vivo = true;
        this.mana = 3;
    }

    public Personagem(String nome, String classe, int forca, int poder, int vida, int armadura, int mana) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.armadura = armadura;
        this.poder = poder;
        this.forca = forca;
        this.vivo = true;
        this.vidaMax = vida+10;
        this.mana = mana;
        
        switch (classe) { // seta o tipo de item e a descrição do poder de acordo com a classe
            case "mago":
                tipoItem = "varinha";
                desPoder = "Cura o personagem aliado caso ele esteja vivo.";
                break;
            case "guerreiro":
                tipoItem = "espada";
                desPoder = "Realiza um ataque carregado causando 1.3x o dano de um ataque normal.";
                break;
            case "arqueiro":
                tipoItem = "arco";
                desPoder = "Realiza um segundo ataque com a metade da força de um ataque normal.";
                break;
            default:
                break;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }
    
    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
        
        switch (classe) {
            case "mago":
                tipoItem = "varinha";
                desPoder = "Cura o personagem aliado caso ele esteja vivo.";
                break;
            case "guerreiro":
                tipoItem = "espada";
                desPoder = "Realiza um ataque carregado causando 1.3x o dano de um ataque normal.";
                break;
            case "arqueiro":
                tipoItem = "arco";
                desPoder = "Realiza um segundo ataque com a metade da força de um ataque normal.";
                break;
            default:
                break;
        }
    }

    public boolean isVivo(){
        return vivo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getDesPoder() {
        return desPoder;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public void gastarMana() {
        this.mana--;
    }
    
    public void ganharMana(int qnt) {
        this.mana = Integer.min(3, this.mana+qnt); // nunca tera mais que 3 de mana
    }

    public boolean usarHabilidade(Personagem personagem){// habilidade do mago, curar
        if(this.mana > 0){
            personagem.curar(this.poder);
            
            this.gastarMana();
            return true;
        }
        return false;
    }

    public boolean usarHabilidade(Monstro monstro){// habilidade do arqueiro e do guerreiro, dar dois ataques ou um ataque carregado
        if(this.mana > 0){
            if(this.classe.equals("arqueiro"))
                monstro.receberAtaque(this.atacar() + (this.poder+this.atacar())/2);
            else
                monstro.receberAtaque(poder+4*this.atacar()/3);
            this.gastarMana();
            return true;
        }
        return false;
    }    
    
    @Override
    public int atacar(){
        Random rand = new Random();
        int ataque = rand.nextInt(5) + rand.nextInt(5) + 2 + forca; // dois numeros aleatorios entre 1 e 6 + forca
        return ataque;
    }

    public void curar(int cura){
        this.vida = Integer.min(this.vida+cura, this.vidaMax); // nunca cura mais que a vida max do personagem
    }
    
    public void recebeItem(int atributo){ // item da forca e poder ao personagem
        this.forca += atributo;
        this.poder += atributo;
    }
}
