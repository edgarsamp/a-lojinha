package aLojinhaClasses;

import java.util.Random;

public class Loja {
    String nome;
    Item[] estoque = new Item[6];

    public Loja(int dif) { // gera uma lojinha a partir da dificuldade
        Random rand = new Random();
        String []nomes = {"Alfredo,mate os monstros que dao medo",
                            "Juvenal,compra ae namoral",
                            "Edgar,me da uns ponto pra eu passar",
                            "Creuza,pode vim que o estoque ta uma beleza"};
        this.nome = nomes[rand.nextInt(nomes.length)];
        
        for (int i = 0; i < 6; i++) 
            estoque[i] = new Item(dif);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Item[] getEstoque() {
        return estoque;
    }

    public void setEstoque(Item[] estoque) {
        this.estoque = estoque;
    }
    
    public void gerarNome(){
        Random rand = new Random();
        String[] nomes = {"Alfredo,mate os monstros que dao medo",
            "Juvenal,compra ae namoral",
            "Edgar,me da uns ponto pra eu passar",
            "Creuza,pode vim que o estoque ta uma beleza"};
        this.nome = nomes[rand.nextInt(nomes.length)];
    }
    
    public void gerarEstoque(int dif){
        for (int i = 0; i < 6; i++) 
            estoque[i] = new Item(dif);
    }

}
