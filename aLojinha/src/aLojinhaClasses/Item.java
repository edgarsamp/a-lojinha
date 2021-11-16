package aLojinhaClasses;

import java.util.Random;

public class Item {
    int valor, raridade, atributo;
    boolean noCarrinho;
    String tipo;
    
    
    public Item(int raridade) { // gera um item aleatorio a partir da raridade
        Random rand = new Random();
        String []tipos = {"varinha", "espada", "arco"};
        
        valor = 2*(rand.nextInt(raridade) + raridade) + 1;
        tipo = tipos[rand.nextInt(tipos.length)];
        this.raridade = raridade;
        this.atributo = (raridade < 3 ? rand.nextInt(raridade+1) +1: rand.nextInt(3) + (raridade+1)/2); // tentativa de balanceamento
        this.noCarrinho = false;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getRaridade() {
        return raridade;
    }

    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtributo() {
        return atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }

    public boolean isNoCarrinho() {
        return noCarrinho;
    }

    public void setNoCarrinho(boolean noCarrinho) {
        this.noCarrinho = noCarrinho;
    }
    
}
