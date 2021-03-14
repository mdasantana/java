package javaapplication1;
import java.util.Scanner;
/**
 * @author Matheus Santana
*/
public class QuestaoDois {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int resposta;
    System.out.print("Você vai passar em DS1? \n");
    resposta = sc.nextInt();
    switch(resposta){
      case 1: System.out.println("Parabéns"); break;
      case 0: System.out.println("Nunca deixe ninguém dizer que você não consegue.\nDiga você mesmo: EU NÃO CONSIGO"); break;
      default: System.out.println("É 0 ou 1. Esse número aí é inválido"); break;
    }
  }
}
