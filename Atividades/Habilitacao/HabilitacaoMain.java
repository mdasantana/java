package Habilitacao;
import java.util.Scanner;
/**
 * @author Matheus Santana
 */
public class HabilitacaoMain {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(":::::::::: HABILITAÇÃO NACIONAL ::::::::::");
    System.out.println("Qual o seu nome?");
    String nome = sc.nextLine();
    System.out.println("Qual a sua data de nascimento? dd/mm/aaaa");
    String dataNascimento = sc.nextLine();
    int anoNascimento = Integer.parseInt(dataNascimento.substring(6,10));
    if(anoNascimento >= 2003){
      System.out.println("Você não tem idade para tirar a CNH");
    }else{
      Motorista novoMotorista = new Motorista(nome,anoNascimento);
      boolean invalidoCNH = false;
      do{
        System.out.println("Qual o tipo de habilitação você quer?\n::A - MOTO\n::B - CARRO\n::Z - MOTO e CARRO");
        String opcaoCNH = sc.next();
        char tipoCNH = opcaoCNH.charAt(0);
        if(!novoMotorista.setTipoCNH(tipoCNH)){
          System.out.println("Tipo de CNH inválido");
          invalidoCNH = true;
        }else{
          invalidoCNH = false;
        }
      }while(invalidoCNH);
      System.out.printf("Motorista: %s\n"
                        +"Ano Nascimento: %d\n"
                        +"Tipo CNH: %c\n",
                        novoMotorista.getNome(),
                        novoMotorista.getanoNascimento(),
                        novoMotorista.getTipoCNH());
    }
  }
}