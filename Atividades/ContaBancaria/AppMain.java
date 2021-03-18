package ContaBancaria;
import java.util.Scanner;
/**
 * @author Matheus Santana
 */
public class AppMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContaBancaria conta = new ContaBancaria();
    conta.nomeBanco = "Inter";
    conta.numeroAgencia = "0015";
    conta.numeroConta = "168574";
    conta.nomeTitular = "Robenilton Junior";
    conta.tipoConta = 'C';
    conta.saldo = 0;
    String continuar = new String();
    do{
      System.out.println("Qual a operação?\n Depósito (0)\n Saque (1)\n Ver Saldo (2)");
      int operacao = sc.nextInt();
      switch(operacao){
        case 0:{
          System.out.println("Qual o valor deseja depositar?");
          double deposito = sc.nextDouble();
          conta.Depositar(deposito);
          break;
        }
        case 1:{
          System.out.println("Qual o valor deseja sacar?");
          double saque = sc.nextDouble();
          conta.Sacar(saque);
          break;
        }
        case 2:{System.out.printf("Saldo atual: %.2f\n",conta.saldo); break;}
      }
      System.out.print("Deseja fazer outra operação? (Sim/Nao) ");
      continuar = sc.next();
    }while(continuar.equalsIgnoreCase("Sim"));
    conta.imprimirDados(conta);
  }
}
