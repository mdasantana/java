package javaapplication1;
import java.util.Scanner;

/**
  @author Matheus Santana
*/

public class QuestaoQuatro{
  
  static double somar(double numeroUm, double numeroDois){
    return numeroUm + numeroDois;
  }
  static double subtrair(double numeroUm, double numeroDois){
    return numeroUm - numeroDois;
  }
  static double dividir(double numeroUm, double numeroDois){
    return numeroUm / numeroDois;
  }
  static double multiplicar(double numeroUm, double numeroDois){
    return numeroUm * numeroDois;
  }
  static void calcular(char operacao, double numeroUm, double numeroDois){
    switch(operacao){
      case '+':  System.out.print("O resultado da Soma é: "+somar(numeroUm, numeroDois)); break;
      case '-':  System.out.print("O resultado da Subtração é: "+subtrair(numeroUm, numeroDois)); break;
      case '/':  System.out.print("O resultado da Divisão é: "+dividir(numeroUm, numeroDois)); break;
      case '*':  System.out.print("O resultado da Multiplicação é: "+multiplicar(numeroUm, numeroDois)); break;
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double numeroUm, numeroDois;
    char operacao = '+';
    String continua = new String();
    System.out.print("::::: BEM VINDO A CALCULADORA :::::\n");
    do{
      System.out.print("\nQual calculo deseja fazer?\n  Digite + para soma\n  Digite - para Subtração\n  Digite / para Divisão\n  Digite * para Multiplicação\n");
      System.out.print("Operação: ");
      operacao = (char)System.in.read();
      System.out.print("\nAgora diga o primeiro número: ");
      numeroUm = sc.nextDouble();
      System.out.print("Agora diga o segundo número: ");
      numeroDois = sc.nextDouble();
      calcular(operacao, numeroUm, numeroDois);
      System.out.print("\nDeseja fazer outro cálculo? (Sim/Nao) ");
      continua = sc.next();
    }while(continua.equalsIgnoreCase("Sim"));
  }
}