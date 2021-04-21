package DepartamentoPessoal;
import java.util.LinkedList;

/**
 * @author Matheus Santana
 */
public class Empresa {
  private String nome;
  private double CNPJ;
  private int anoFundacao;
  private LinkedList<Departamento> departamentos = new LinkedList<>();
  
  Empresa(String nome, double CNPJ, int anoFundacao){
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.anoFundacao = anoFundacao;
  }
  public void criarDepartamento(Departamento departamento){
    this.departamentos.add(departamento);
  }
  public Departamento buscarDepartamento(int indice){
    return this.departamentos.get(indice);
  }
  public String getListaDepartamentos(){
    String departamentos="";
    for(Departamento dep: this.departamentos){
      
     departamentos += "Nome: "+dep.getNome()+" Funcionários: "+dep.getListaFuncionarios()+"\n";
    }
    return departamentos;
  }
  public String getDados(){
    return "Nome: "+this.nome
            +"\nCNPJ: "+this.CNPJ
            +"\nAno Fundação: "+this.anoFundacao
            +"\nDepartamentos: "+getListaDepartamentos();
  }
}