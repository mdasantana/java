package DepartamentoPessoal;
import java.util.LinkedList;
/**
 * @author Matheus Santana
 */
public class Departamento {
  private String nome;
  private LinkedList<Funcionario> funcionarios = new LinkedList<>();
  
  Departamento(String nome){
    this.nome = nome;
    //this.funcionarios.add(funcionarios);
    //Possui um construtor que inicializa os dois atributos acima:
    //nome recebe o parâmetro, e funcionarios é instanciada como uma nova ArrayList.
    
    //Não entendi essa parte "funcionarios é instanciada como uma nova ArrayList.".
  }
  public String getNome(){
    return this.nome;
  }
  public void incluirFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
  }
  public String getListaFuncionarios(){
    String funcionario="";
    for(Funcionario func: this.funcionarios){
      
     funcionario += "\nNome: "+func.getNome()+" Cargo: "+func.getCargo()+"\n";
    }
    return funcionario;
  }
}