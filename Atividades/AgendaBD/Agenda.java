package AgendaBD;
import java.util.LinkedList;

/**
 * @author Matheus Santana
 */
public class Agenda {
  private String nome;
  private LinkedList<Contato> contatos = new LinkedList<>();
  
  Agenda(String nome){
    this.nome = nome;
  }
  Agenda(){
    
  }

  public String getNome() {
    return this.nome;
  }

  public LinkedList<Contato> getContatos() {
    return contatos;
  }

  public void setContatos(Contato contatos) {
    this.contatos.add(contatos);
  }
}