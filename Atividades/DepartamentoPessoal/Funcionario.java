package DepartamentoPessoal;
/**
 * @author Matheus Santana
 */
public class Funcionario {
  private String nome;
  private String cargo;
  
  Funcionario(String nome, String cargo){
    this.nome = nome;
    this.cargo = cargo;
  }
  public String getNome(){
    return this.nome;
  }
  public String getCargo(){
    return this.cargo;
  }
}
