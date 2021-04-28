package Adocao;
/**
 * @author Matheus Santana
 */
public class Pet {
  private String nome;
  private String raca;
  private int anoNascimento;
  private char sexo;
  
  Pet(String nome, String raca, int anoNascimento, char sexo){
    this.nome = nome;
    this.raca = raca;
    this.anoNascimento = anoNascimento;
    this.sexo = sexo;
  }
  
  public String getInfoPet(){
    StringBuilder dados = new StringBuilder("\nNome: ").append(nome)
                                    .append("\nRaça: ").append(raca)
                                    .append("\nAno Nascimento: ").append(anoNascimento)
                                    .append("\nSexo: ").append(sexo);
    String infoPet = dados.toString();
    return infoPet;
  }
  
}
