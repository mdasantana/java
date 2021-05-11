package RegistroJogo;

import java.util.Scanner;

/**
* @author Matheus Santana
*/
public class JogoMain {
public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
      System.out.println("----- LOJA DE JOGOS -----");
      byte opcao = 0;
      while (opcao != 1 && opcao != 2) {
          System.out.println("Qual tipo de jogo você deseja incluir?"
                  + "\n1) Jogo de cartas\n2) Jogo eletrônico");
          opcao = entrada.nextByte();
      }
      entrada.nextLine();

      System.out.println("Informe o nome do jogo:");
      String nomeJogo = entrada.nextLine();
      System.out.println("Informe o preço do jogo (em R$):");
      float precoJogo = entrada.nextFloat();
      System.out.println("Informe a classificação etária:");
      byte clasJogo = entrada.nextByte();

      Jogo jogo = criarJogo(entrada, nomeJogo, precoJogo, clasJogo, opcao);
      System.out.println(jogo.getInfoJogo());

  }

  private static Jogo criarJogo(Scanner entrada, String nome, float preco, byte clasEtaria, byte opcao) {
    if(opcao == 1){
      System.out.println("Qual a quantidade de jogadores do jogo de cartas?");
      byte qntdJogadores = entrada.nextByte();
      JogoCartas jogoCartas = new JogoCartas(nome, preco, clasEtaria, qntdJogadores);
      return jogoCartas;
    }else{
      System.out.println("Qual o tamanho do jogo eletrônico (em GB)?");
      float tamanhoJogo = entrada.nextFloat();
      JogoEletronico jogoEletronico = new JogoEletronico(nome, preco, clasEtaria, tamanhoJogo);
      return jogoEletronico;
    }
  }
}
