package aLojinhaClasses;

import java.util.ArrayList;

public class Jogador {

    private String nome;
    private ArrayList<Personagem> personagens = new ArrayList<>();
    private int dinheiro, levelAtual;

    public Jogador() {
        Personagem temp = new Personagem();
        personagens.add(temp);
        personagens.add(temp);
        levelAtual = 1;
        this.dinheiro = 0;
    }

    public Jogador(String nome) {
        Personagem temp = new Personagem();
        personagens.add(temp);
        personagens.add(temp);
        this.nome = nome;
        levelAtual = 1;
        this.dinheiro = 0;
    }

    public Jogador(String nome, int dinheiro, int levelAtual) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.levelAtual = levelAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevelAtual() {
        return levelAtual;
    }

    public void setLevelAtual(int levelAtual) {
        this.levelAtual = levelAtual;
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void levelUp() {
        this.levelAtual++;
        for (Personagem personagem : personagens) { // atualiza os atributos dos personagens
            personagem.setVivo(true);
            personagem.setVidaMax(personagem.getVidaMax() + 5);
            personagem.curar(5);
            personagem.ganharMana(1);
        }

    }

    public void pagarCompra(int valor) {
        this.dinheiro -= valor;
    }

    public void recebeDinheiro(int dinheiro) {
        this.dinheiro += dinheiro;
    }

}
