package Agenda;
import java.util.Scanner;

/**
 * @author Matheus Santana
 */
public class AgendaMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o nome da sua Agenda?");
    String nome = sc.nextLine();
    Agenda agenda = new Agenda(nome);
    for(int i=0;i<2;i++){
      System.out.println("Digite o Nome do "+(i+1)+"º contato");
      nome = sc.nextLine();
      System.out.println("Digite o E-mail do "+(i+1)+"º contato");
      String email = sc.nextLine();
      System.out.println("Digite o Telefone do "+(i+1)+"º contato");
      String telefone = sc.nextLine();
      Contato contato = new Contato(nome, telefone, email);
      agenda.setContatos(contato);
    }
    
    for(Contato cont: agenda.getContatos()){
      System.out.println("\n/--------------------------------------/");
      System.out.println("Nome do Contato: "+cont.getNome());
      System.out.println("Telefone: "+cont.getTelefone());
      System.out.println("E-mail do Contato: "+cont.getEmail());
      System.out.println("/--------------------------------------/");
    }
  }
}