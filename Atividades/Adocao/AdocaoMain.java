package Adocao;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Matheus Santana
 * 
 * No método main, instancie 4 objetos Pet, passando informações coerentes de nome, raça, ano de nascimento e sexo (M ou F) em cada objeto. Em seguida, crie uma ArrayList de Pet chamada petsAdocao e adicione os 4 objetos instanciados acima.
 * 
 * 
 * Instancie um objeto Pessoa, passando informações adequadas sobre a pessoa (nome, cpf e ano de nascimento).
 * E também crie um objeto Scanner para fazer a leitura dos dados a seguir.

 * 
 */
public class AdocaoMain {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);

      Pet petA = new Pet("Belinha", "Chihuahua", 2015, 'F');
      Pet petB = new Pet("Dama", "Cocker Spaniel", 2016, 'M');
      Pet petC = new Pet("Caramelo", "Vira-lata", 2017, 'M');
      Pet petD = new Pet("Frank", "Pug", 1997, 'F');

      ArrayList<Pet> petsAdocao = new ArrayList<>();

      petsAdocao.add(petA);
      petsAdocao.add(petB);
      petsAdocao.add(petC);
      petsAdocao.add(petD);

      Pessoa pessoa = new Pessoa("Matheus Santana", "19446240077", 1996);

      System.out.println("::::::::: CENTRAL DE ADOÇÃO DE PETS :::::::::");
      menu(pessoa, petsAdocao, sc);
    }
    
    
    private static void menu(Pessoa pessoa, ArrayList<Pet> petsAdocao, Scanner sc){
      System.out.println("\n:::: Qual serviço deseja?\n :: 1 - Adotar um pet\n :: 2 - Listar os pets adotados\n"
                        + " :: 3 - Listar os pets restantes\n :: 4 - Sair");
      int opcao = sc.nextInt();
      switch(opcao){
        case 1: 
          realizarAdocao(pessoa, petsAdocao, sc);
          menu(pessoa, petsAdocao, sc);
          break;
        case 2: 
          listarPetsAdotados(pessoa);
          menu(pessoa, petsAdocao, sc);
          break;
        case 3:
          listarPetsRestantes(petsAdocao);
          menu(pessoa, petsAdocao, sc);
          break;
        case 4:
          System.out.println("::::::::: FIM DA ADOÇÃO DE PETS :::::::::");
          sc.close();
          break;
        default: 
          System.out.println("Opção inválida");
          menu(pessoa, petsAdocao, sc);
          break;
      }
    }
    
    private static void realizarAdocao(Pessoa pessoa, ArrayList<Pet> petsAdocao, Scanner entrada) {
        System.out.println("Informe qual pet deseja adotar: ");
        for (int i = 0; i < petsAdocao.size(); i++) {
            System.out.println(i + " - " + petsAdocao.get(i).getInfoPet());
        }
        int numeroPet = entrada.nextInt();
        Pet candidato = petsAdocao.get(numeroPet);
        if (pessoa.adotarPet(candidato) == true) {
            System.out.println("Pet " + numeroPet + " adotado com sucesso!\n");
            petsAdocao.remove(candidato);
        } else {
            System.out.println("Você já adotou o máximo de pets permitidos!\n");
        }
    }
    
    private static void listarPetsAdotados(Pessoa pessoa) {
        System.out.println("\nPets adotados até o momento: ");
        System.out.println(pessoa.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsAdocao) {
        System.out.println("\nPets restantes para adoção: ");
        for (Pet p : petsAdocao) {
            System.out.println(p.getInfoPet());
        }
    }

}