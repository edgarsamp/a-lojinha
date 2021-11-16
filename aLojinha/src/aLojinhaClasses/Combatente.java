package aLojinhaClasses;

abstract class Combatente {
    protected int vida, forca, armadura;
    protected boolean vivo;
    
    public abstract int atacar();
    
    public void receberAtaque(int dano){
        if (dano > armadura/2) // se o dano for maior que metade da armadura ele recebe o dano
            this.vida -= dano-armadura/2;
        
        if(this.vida <= 0){ // checa se o personagem ta vivo depois do dano
            this.vivo = false;
            this.vida = 0;
        }
    }
}
