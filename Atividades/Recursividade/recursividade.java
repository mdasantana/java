package Recursividade;
/**
 * @author Matheus Santana
 */
public class recursividade {
  
  public static void main(String[] args){
    System.out.println("O 7º elemento da sequência de Fibonacci: "+fibonacci(7));
    System.out.println("A Soma do fatorial de 5: "+somarNumeros(5));
  }
  
  public static int fibonacci(int num){
    if(num <2){
      return 1;
    }
    return fibonacci(num-1) + fibonacci(num-2);
  }
  
  public static int somarNumeros(int num){
    if(num == 1){
      return 1;
    }
    return num + somarNumeros(num-1);
  }
  
}
