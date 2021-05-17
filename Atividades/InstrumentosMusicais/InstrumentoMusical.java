package InstrumentosMusicais;
/**
 * @author Matheus Santana
 */
public abstract class InstrumentoMusical {
  private String nome;
  private TipoInstrumento tipo;
  
  InstrumentoMusical(String nome, TipoInstrumento tipo){
    this.nome = nome;
    this.tipo = tipo;
  }
  
  abstract String afinar();
  
  abstract String tocar(String cancao);
  
}
