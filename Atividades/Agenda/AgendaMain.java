package Agenda;
import Agenda.escritaTXT.Escrita;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Matheus Santana
 */
public class AgendaMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String caminho = "C:\\Users\\Matheus Santana\\Desktop\\Conta\\src\\Agenda\\Agenda.txt";
    int qndContatos = 2;
    Escrita.abrirArquivo(caminho);
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
    LinkedList<String> contatosTXT = new LinkedList<>();
    for(Contato cont: agenda.getContatos()){
      contatosTXT.add("Nome do Contato: "+cont.getNome()+"\n"
      +"Telefone: "+cont.getTelefone()+"\n"
      +"E-mail do Contato: "+cont.getEmail()+"\n"
      +"/--------------------------------------/\n");
    }
    for(String txt: contatosTXT){
      Escrita.adicionarDados(txt);
    }
    Escrita.fecharArquivo();
  }
}