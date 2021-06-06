package CadastrodePessoas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoMain {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
      File pessoasTXT = ControladorArquivo.criarArquivo("pessoas.txt");
      menu(sc, pessoasTXT);
    }catch(FileNotFoundException e){
      System.out.println("Arquivo não localizado!");
    }catch(IOException e){
      System.out.println("Erro ao carregar o arquivo!");
    }
  }
  
  public static void menu(Scanner sc, File file) throws FileNotFoundException, IOException{
    System.out.println("Qual serviço deseja?\n :: 1 - Listar Pessoas\n :: 2 - Cadastrar Pessoas\n :: 3 - Fechar programa");
    int servico = sc.nextInt();
    switch(servico){
      case 1:
        ControladorArquivo.lerArquivo(file);
        menu(sc, file);
        break;
      case 2:
        ControladorArquivo.escreverArquivo(file);
        menu(sc, file);
        break;
      case 3:
        System.out.println("Até mais!!");
        sc.close();
        break;
      default:
        System.out.println("Opção inválida");
        break;
    }
  }
}
