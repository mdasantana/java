package AgendaBD;

/**
 * @author Matheus Santana
 */
public class Contato {
  
  private int id;
  private String nome;
  private String telefone;
  private String email;
  private String tipoContato;
  
  Contato(int id, String nome, String telefone, String email, String tipoContato){
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.tipoContato = tipoContato;
  }
  Contato(String nome, String telefone, String email, String tipoContato){
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.tipoContato = tipoContato;
  }
  Contato(){
    
  }

  public int getId(){
    return id;
  }
  
  public String getNome() {
    return nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }
  
  public String getTipoContato(){
    return tipoContato;
  }
}
