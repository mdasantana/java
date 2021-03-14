package javaapplication1;
import java.util.Scanner;
/**
 * @author Matheus Santana
*/
public class QuestaoTres {
  public static void main(String[] args){
    //Variaveis
    int camisas;
    String estado;
    double frete;
    Scanner sc = new Scanner(System.in);
    System.out.print("Goku, diga quantas camisas você quer \n");
    camisas = sc.nextInt();
    while(camisas < 1 || camisas > 5){
      System.out.print("Só dá pra levar 1 a 5 camisas \n");
      System.out.print("Quantas você vai realmente levar? \n");
      camisas = sc.nextInt();
    }
    System.out.println("Agora me diga qual o estado para envio (SIGLA)");
    estado = sc.next();
    if(estado.equalsIgnoreCase("BA")){
      frete = 0;
    }else{
      frete = 20.00;
    }
    System.out.println("O preço final da compra é: "+((30*camisas)+frete));
  }
}
