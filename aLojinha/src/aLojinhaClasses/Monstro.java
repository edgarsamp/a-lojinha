package aLojinhaClasses;

import java.util.Random;
// import java.lang.Math;

public class Monstro extends Combatente{
    private String tipo;
    private int dinheiro;
    
    Random rand = new Random();
    
    public Monstro(int difi) { // gera um monstro aleatorio a partir da dificuldade dada
        String []tipos = {"esqueleto", "orc", "slime"};
        tipo = tipos[rand.nextInt(tipos.length)];
        
        this.forca = difi;
        this.dinheiro = 1*difi/2 + 5*(rand.nextInt(difi+1) + difi+1)/4;
        this.armadura = 3*difi/2;
        
        if(difi == 1) // muda a dificuldade para tentar balancear a conta da vida
            difi = 2;
        this.vida = Integer.max(difi + 5*(difi+rand.nextInt(difi+1)), difi + 5*(difi+rand.nextInt(difi+1))); // sorteia duas vezes e pega o maior
        
        
        this.vivo = true;
    }

    public Monstro(String tipo, int vida, int forca, int dinheiro, int armadura) {
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.dinheiro = dinheiro;
        this.armadura = armadura;
        this.vivo = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getforca() {
        return forca;
    }

    public void setforca(int forca) {
        this.forca = forca;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public boolean isVivo(){
        return vivo;
    }
    
    @Override
    public int atacar(){
        return forca + rand.nextInt(5) + rand.nextInt(5) + 1;
    }

    
}
