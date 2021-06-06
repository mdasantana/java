package CadastrodePessoas;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ControladorArquivo {
  public static File criarArquivo(String caminho) throws FileNotFoundException, IOException{
    File file = new File(caminho);
    file.createNewFile();
    return file;
  }
  
  public static void escreverArquivo(File file) throws FileNotFoundException, IOException{
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o nome da Pessoa");
    String nome = sc.nextLine();
    System.out.println("Qual a cidade que ela mora?");
    String cidade = sc.nextLine();
    System.out.println("Qual a idade da Pessoa");
    int idade = sc.nextInt();
    
    FileWriter fw = new FileWriter(file.getName(), true);
    
    StringBuilder sb = new StringBuilder();
    sb.append("Nome: ").append(nome)
      .append("\nIdade: ").append(idade)
      .append("\nCidade: ").append(cidade)
      .append("\n/--------------------/\n");
    
    fw.write(sb.toString());
    fw.close();
  }
  
  public static void lerArquivo(File file) throws FileNotFoundException{
    Scanner sc = new Scanner(file);
    
    while(sc.hasNextLine()){
      System.out.println(sc.nextLine());
    }
    
  }
}