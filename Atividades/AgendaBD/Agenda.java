package AgendaBD;
import java.util.LinkedList;

/**
 * @author Matheus Santana
 */
public class Agenda {
  private LinkedList<Contato> contatos = new LinkedList<>();
  
  public LinkedList<Contato> getContatos() {
    return contatos;
  }

  public void setContatos(Contato contatos) {
    this.contatos.add(contatos);
  }
}