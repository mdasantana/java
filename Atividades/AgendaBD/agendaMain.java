package AgendaBD;

import java.util.Scanner;

/**
 * @author Matheus Santana
 */
public class agendaMain {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
//    AgendaDAO agendaDAO = new AgendaDAO();
    
    Agenda agenda = new Agenda();
    
    System.out.println("::::::::: BEM-VINDO À SUA AGENDA :::::::::");
    
    menu(sc);
    
    /*
    for(Contato contato : AgendaDAO.listaContatos()){
      agenda.setContatos(contato);
    }
    
    for(Contato cont : agenda.getContatos()){
      System.out.println("Id: "+cont.getIdContato());
      System.out.println("Nome: "+cont.getNome());
      System.out.println("Telefone: "+cont.getTelefone());
      System.out.println("E-mail: "+cont.getEmail());
      System.out.println("/--------------------------/");
    }
    
    
    System.out.println("Nome: "+AgendaDAO.getPorId(2).getNome());
    System.out.println("Telefone: "+AgendaDAO.getPorId(2).getTelefone());
    System.out.println("E-mail: "+AgendaDAO.getPorId(2).getEmail());
    
    System.out.println("/-----------------------------/");

    System.out.println("Nome: "+AgendaDAO.getPorTelefone("75981905975").getNome());
    System.out.println("Telefone: "+AgendaDAO.getPorTelefone("75981905975").getTelefone());
    System.out.println("E-mail: "+AgendaDAO.getPorTelefone("75981905975").getEmail());
    
    System.out.println("/-----------------------------/");

    System.out.println("Nome: "+AgendaDAO.getPorNome("erson").getNome());
    System.out.println("Telefone: "+AgendaDAO.getPorNome("erson").getTelefone());
    System.out.println("E-mail: "+AgendaDAO.getPorNome("erson").getEmail());
    
    System.out.println("Status Insert: "+AgendaDAO.setInsertContato("Nomacy Silva", "7530245001", "normacy.silva@gmail.com.br", "Pessoal"));
    */
    //System.out.println("Status Update: "+AgendaDAO.setUpdateNome("Normacy Silva dos Anjos", 3));
    
  }
  
  public static void menu(Scanner sc){
    System.out.println("Qual serviço deseja fazer?");
    System.out.println(" :: 1 - Ver os contatos\n :: 2 - Cadastrar contato\n :: 3 - Consultar contato\n :: 4 - Atualizar contato\n :: 5 - Apagar contato\n :: 6 - Sair");
    
    int servico = sc.nextInt();
   
    switch(servico){
      case 1: 
        System.out.println(":::::::: LISTA DE CONTATOS ::::::::");break;
      case 2:
        System.out.println(":::::::: CADASTRO DE CONTATOS ::::::::");
        cadastroContato(sc);
        menu(sc);
        break;
      case 3:
        System.out.println(":::::::: CONSULTA DE CONTATOS ::::::::");
        consultarContato(sc);
        break;
      case 4:
        System.out.println(":::::::: ATUALIZAÇÃO DE CONTATOS ::::::::");break;
      case 5:
        System.out.println(":::::::: DELEÇÃO DE CONTATOS ::::::::");break;
      case 6:
        sc.close();break;
      default: System.out.println("Opção Inválida"); menu(sc);break;
    }
  }
  
  public static void todosContatos(){
    
  }
  
  public static void cadastroContato(Scanner sc){
    
    System.out.println("Qual o tipo de contato?\n :: 1 - Pessoal\n :: 2 - Trabalho\n :: 3 - Contatinho");
    int tipoAgenda = sc.nextInt();
    String nomeAgenda = "";
    switch(tipoAgenda){
      case 1: nomeAgenda = "Pessoal";break;
      case 2: nomeAgenda = "Trabalho";break;
      case 3: nomeAgenda = "Contatinho";break;
      default: System.out.println("Opção inválida!"); cadastroContato(sc);break;
    }
    Agenda agenda = new Agenda(nomeAgenda);
    
    System.out.println("Qual o NOME do contato?");
    String nomeContato = sc.next();
    
    System.out.println("Qual o TELEFONE do contato?");
    String telefoneContato = sc.next();
    
    System.out.println("Qual o E-MAIL do contato?");
    String emailContato = sc.next();
    
    Contato contatos = new Contato(nomeContato, telefoneContato, emailContato);
    agenda.setContatos(contatos);
    if(AgendaDAO.InsertContato(agenda)){
      System.out.println("Contato cadastrado com sucesso!");
    }else{
      System.out.println("OPS!!! Erro inesperado. Tente mais tarde");
      menu(sc);
    }
    
  }
  
  public static void consultarContato(Scanner sc){
    
    System.out.println("Como deseja consultar o contato?\n :: 1 - Id\n :: 2 - Nome\n :: 3 - Telefone");
    int tipoConsulta = sc.nextInt();
    Agenda agenda = new Agenda();
    String busca;
    switch(tipoConsulta){
      case 1: System.out.print("Digite o ID do contato: ");
        busca = sc.next();
        agenda.setContatos(AgendaDAO.getPorId(Integer.parseInt(busca)));
      break;
      case 2:
        System.out.print("Digite o Nome do contato: ");
        busca = sc.next();
        agenda.setContatos(AgendaDAO.getPorNome(busca));
      break;
      case 3:
        System.out.print("Digite o Telefone do contato: ");
        busca = sc.next();
        agenda.setContatos(AgendaDAO.getPorTelefone(busca));
      break;
    }
    for(Contato cont: agenda.getContatos()){
      System.out.println("Nome: "+cont.getNome());
      System.out.println("Telefone: "+cont.getTelefone());
      System.out.println("E-mail: "+cont.getEmail());
    }
    menu(sc);
  }
  
public static void atualizarContato(Scanner sc){
    System.out.println("Qual o nome do contato deseja atualizar?");
    String nome = sc.next();
    
    
  }
  
}
