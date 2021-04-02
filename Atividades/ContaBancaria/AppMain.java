package ContaBancaria;
import java.util.Scanner;
/**
 * @author Matheus Santana
 */
public class AppMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContaBancaria conta = new ContaBancaria("Inter","0015","168574","Robenilton Junior");
    conta.setTipoConta('C');
    String continuar;
    
    do{
      System.out.println("Qual a operação?\n ::Depósito (0)\n ::Saque (1)\n ::Saldo (2)\n ::Extrato (3)\n ::Consultar Dados (4)");
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
        case 2:{System.out.printf("Saldo atual: %.2f\n",conta.getSaldo()); break;}
        case 3: {conta.Extrato(); break;}
        case 4:{conta.Dados();break;}
        default: {System.out.println("Opção Inválida");break;}
      }
      System.out.print("Deseja fazer outra operação? (Sim/Nao) ");
      continuar = sc.next();
    }while(continuar.equalsIgnoreCase("Sim"));
  }
}
