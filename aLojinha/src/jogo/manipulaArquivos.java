package jogo;

import aLojinhaClasses.Jogador;
import aLojinhaClasses.Personagem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class manipulaArquivos {
    static void salvaJogo(Jogador jog){
        // cria um arquivo com os dados para salvar o jogo
        try {
            File file = new File("src/save/save.dat");
            FileWriter escritor = new FileWriter(file);
            
            escritor.write(jog.getNome() + "\n");
            escritor.write(jog.getDinheiro() + "\n");
            escritor.write(jog.getLevelAtual() + "\n");

            // Salva os personagens
            for (Personagem perso : jog.getPersonagens()) {
                escritor.write(perso.getNome() + "\n");
                escritor.write(perso.getClasse() + "\n");
                escritor.write(perso.getVida() + "\n");
                escritor.write(perso.getPoder() + "\n");
                escritor.write(perso.getArmadura() + "\n");
                escritor.write(perso.getForca() + "\n");
                escritor.write(perso.getVidaMax() + "\n");
                escritor.write(perso.getTipoItem() + "\n");
                escritor.write(perso.isVivo() + "\n");
            }
            
            
            escritor.close();
        } catch (IOException e){}
    }
    
    static void deletaJogo(){
        //deleta o arquivo de save do jogo
        File file = new File("src/save/save.dat");
        if(file.exists())
            file.delete();
    }
    
    static Jogador carregaJogo(){
        // cria um objeto jogador com base nos dados do arquivo de save
        try {
            File myObj = new File("src/save/save.dat");
            Scanner scanner = new Scanner(myObj);
            Jogador jog = new Jogador();
            
            ArrayList<Personagem> personagens = new ArrayList<>();
            Personagem temp;
            
            String nome = scanner.nextLine();
            
            jog.setNome(nome);
            jog.setDinheiro(Integer.parseInt(scanner.nextLine()));
            jog.setLevelAtual(Integer.parseInt(scanner.nextLine()));

            for (int i = 0; i < 2; i++) {
                temp = new Personagem();
                temp.setNome(scanner.nextLine());
                temp.setClasse(scanner.nextLine());
                temp.setVida(Integer.parseInt(scanner.nextLine()));
                temp.setPoder(Integer.parseInt(scanner.nextLine()));
                temp.setArmadura(Integer.parseInt(scanner.nextLine()));
                temp.setForca(Integer.parseInt(scanner.nextLine()));
                temp.setVidaMax(Integer.parseInt(scanner.nextLine()));
                temp.setTipoItem(scanner.nextLine());
                temp.setVivo(Boolean.parseBoolean(scanner.nextLine()));
                personagens.add(temp);
            }
            jog.setPersonagens(personagens);
            scanner.close();
            
            return jog;
        } catch (FileNotFoundException e) {
            return new Jogador();
        }
    }
}
