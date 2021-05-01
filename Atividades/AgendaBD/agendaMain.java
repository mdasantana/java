package AgendaBD;
import java.util.Scanner;

/**
 * @author Matheus Santana
 */
public class agendaMain {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Agenda agenda = new Agenda();
    System.out.println("::::::::: BEM-VINDO À SUA AGENDA :::::::::");
    menu(sc, agenda);
  }
  
  public static void menu(Scanner sc, Agenda agenda){
    System.out.println("Qual serviço deseja fazer?");
    System.out.println(" :: 1 - Ver os contatos\n"
            + " :: 2 - Cadastrar contato\n"
            + " :: 3 - Consultar contato\n"
            + " :: 4 - Atualizar contato\n"
            + " :: 5 - Apagar contato\n"
            + " :: 6 - Sair");
    
    int servico = sc.nextInt();
    switch(servico){
      case 1: 
        System.out.println(":::::::: MEUS CONTATOS ::::::::");
        todosContatos(sc, agenda);
        break;
      case 2:
        System.out.println(":::::::: CADASTRO DE CONTATOS ::::::::");
        cadastroContato(sc);
        menu(sc, agenda);
        break;
      case 3:
        System.out.println(":::::::: CONSULTA DE CONTATOS ::::::::");
        consultarContato(sc);
        break;
      case 4:
        System.out.println(":::::::: ATUALIZAÇÃO DE CONTATOS ::::::::");
        atualizarContato(sc, agenda);
        break;
      case 5:
        System.out.println(":::::::: DELEÇÃO DE CONTATOS ::::::::");
        deleteContato(sc);
        break;
      case 6:
        sc.close();break;
      default: System.out.println("Opção Inválida"); menu(sc, agenda);break;
    }
  }
  
  public static void todosContatos(Scanner sc, Agenda agenda){
    for(Contato cont: AgendaDAO.listaContatos()){
      System.out.println("Id: "+cont.getId());
      System.out.println("Nome: "+cont.getNome());
      System.out.println("Telefone: "+cont.getTelefone());
      System.out.println("E-mail: "+cont.getEmail());
      System.out.println("Tipo: "+cont.getTipoContato());
      System.out.println("/---------------------/");
    }
    menu(sc, agenda);
  }
  
  public static void cadastroContato(Scanner sc){
    System.out.println("Qual o tipo de contato?\n :: 1 - Pessoal\n :: 2 - Trabalho\n :: 3 - Contatinho");
    int tipoAgenda = sc.nextInt();
    String tipoContato = "";
    switch(tipoAgenda){
      case 1: tipoContato = "Pessoal";break;
      case 2: tipoContato = "Trabalho";break;
      case 3: tipoContato = "Contatinho";break;
      default: System.out.println("Opção inválida!"); cadastroContato(sc);break;
    }
    Agenda agenda = new Agenda();
    System.out.println("Qual o NOME do contato?");
    String nomeContato = sc.next();
    System.out.println("Qual o TELEFONE do contato?");
    String telefoneContato = sc.next();
    System.out.println("Qual o E-MAIL do contato?");
    String emailContato = sc.next();
    Contato contatos = new Contato(nomeContato, telefoneContato, emailContato, tipoContato);
    agenda.setContatos(contatos);
    if(AgendaDAO.InsertContato(agenda)){
      System.out.println("Contato cadastrado com sucesso!");
    }else{
      System.out.println("OPS!!! Erro inesperado. Tente mais tarde");
      menu(sc, agenda);
    }
  }
  
  public static void consultarContato(Scanner sc){
    System.out.println("Como deseja consultar o contato?\n :: 1 - Id\n :: 2 - Nome\n :: 3 - Telefone");
    int tipoConsulta = sc.nextInt();
    String busca;
    Agenda agenda = new Agenda();
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
      System.out.println("/---------------------/");
      System.out.println("Nome: "+cont.getNome());
      System.out.println("Telefone: "+cont.getTelefone());
      System.out.println("E-mail: "+cont.getEmail());
      System.out.println("Tipo: "+cont.getTipoContato());
      System.out.println("/---------------------/");
    }
    menu(sc, agenda);
  }
  
  public static void atualizarContato(Scanner sc, Agenda agenda){
    int id, tipoConsulta;
    boolean status = true;
    String novoValor="";
    System.out.print("Digite o ID do contato: ");
    id = sc.nextInt();
    System.out.println("O que deseja atualizar no contato?\n"
            + " :: 1 - Nome\n"
            + " :: 2 - Telefone\n"
            + " :: 3 - E-mail\n"
            + " :: 4 - Tipo do contato\n"
            + " :: 5 - Todos os campos");
    tipoConsulta = sc.nextInt();
    switch(tipoConsulta){
      case 1:
        System.out.println("Qual o novo nome: ");
        novoValor = sc.next();
        status = AgendaDAO.UpdateNome(novoValor, id);
      break;
      case 2:
        System.out.println("Qual o novo telefone: ");
        novoValor = sc.next();
        status = AgendaDAO.UpdateTelefone(novoValor, id );
      break;
      case 3:
        System.out.println("Qual o novo e-mail: ");
        novoValor = sc.next();
        status = AgendaDAO.UpdateEmail(novoValor, id );
      break;
      case 4:
        System.out.println("Qual o tipo de contato?\n"
                + " :: 1 - Pessoal\n"
                + " :: 2 - Trabalho\n"
                + " :: 3 - Contatinho");
        int tipoAgenda = sc.nextInt();
        switch(tipoAgenda){
          case 1: novoValor = "Pessoal";break;
          case 2: novoValor = "Trabalho";break;
          case 3: novoValor = "Contatinho";break;
          default: System.out.println("Opção inválida!");break;
        }
        status = AgendaDAO.UpdateClassificacao(novoValor, id );
      break;
      case 5:
        System.out.println("Qual o novo nome?: ");
        String novoNome = sc.next();
        System.out.println("Qual o novo telefone? ");
        String novoTelefone = sc.next();
        System.out.println("Qual o novo e-mail? ");
        String novoEmail = sc.next();
        System.out.println("Qual a nova classificação? ");
        String novaClassif = sc.next();
        status = AgendaDAO.UpdateContato(novoNome, novoTelefone, novoEmail, novaClassif, id );
      break;
    }
    if(status){
      agenda.setContatos(AgendaDAO.getPorId(id));
      for(Contato cont: agenda.getContatos()){
        System.out.println("/---------------------/");
        System.out.println("Nome: "+cont.getNome());
        System.out.println("Telefone: "+cont.getTelefone());
        System.out.println("E-mail: "+cont.getEmail());
        System.out.println("Tipo: "+cont.getTipoContato());
        System.out.println("/---------------------/");
      }
    }else{
      System.out.println("Desculpe!! Erro inesperado.\nTente novamente!");
      atualizarContato(sc, agenda);
      }
    menu(sc, agenda);
  }

  public static void deleteContato(Scanner sc){
    System.out.print("Digite o ID do contato: ");
    int id = sc.nextInt();
    Agenda agenda = new Agenda();
    agenda.setContatos(AgendaDAO.getPorId(id));
    for(Contato cont: agenda.getContatos()){
      System.out.println("/---------------------/");
      System.out.println("Nome: "+cont.getNome());
      System.out.println("Telefone: "+cont.getTelefone());
      System.out.println("E-mail: "+cont.getEmail());
      System.out.println("Tipo: "+cont.getTipoContato());
      System.out.println("/---------------------/");
    }
    System.out.println("Deseja deletar o contato acima? ( 0 -> SIM / 1 -> NÃO) ");
    int resp = sc.nextInt();
    if(resp == 0){
      if(AgendaDAO.deleteContato(id)){
        System.out.println("Contato apagado!!");
      }else{
        System.out.println("Erro ao apagar o contato!");
      }
    }else{
      deleteContato(sc);
    }
    menu(sc, agenda);
  }
}