package Adocao;
import java.util.ArrayList;

/**
 * @author Matheus Santana
 */

public class Pessoa {
  
  private String nome;
  private String cpf;
  private int anoNascimento;
  private ArrayList<Pet> petsAdotados;
  private static final int MAXIMO_PETS = 2;
  
  Pessoa(String nome, String cpf, int anoNascimento){
    this.nome = nome;
    this.cpf = cpf;
    this.anoNascimento = anoNascimento;
    this.petsAdotados = new ArrayList<>();
  }
  
  public boolean adotarPet(Pet pet){
    boolean statusAdocao = (anoNascimento < 2003) && (petsAdotados.size() < MAXIMO_PETS);
    
    if(statusAdocao){
      petsAdotados.add(pet);
    }
    
    return statusAdocao;
  }
  
  public String listarPets(){
    String dadosPet = "";
    
    for(Pet pet : petsAdotados){
      dadosPet += pet.getInfoPet();
    }
    
    return dadosPet;
  }
  
}
