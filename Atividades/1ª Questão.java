package javaapplication1;

/**
 * @author Matheus Santana
 * Um programa que mostre apenas os números ímpares entre 1 e 19. No fim, deve mostrar uma mensagem de fim de programa.
*/
public class QuestaoUm {
  public static void main(String[] args) {
    System.out.println("Numeros ímpares:");
    for(int i = 0; i<20 ; i++){
      if(i%2 != 0){
        System.out.print(" "+i+" ");
      }
    }
    System.out.println("\nFIM DO PROGRAMA");
  }
}