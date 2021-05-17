package InstrumentosMusicais;
/**
 * @author Matheus Santana
 */
public class Violao extends InstrumentoMusical{

  Violao(){
  super("Violão", TipoInstrumento.CORDA);
  };
  
  @Override
  String afinar() {
    String afinando = "Violão sendo afinado!";
    return afinando;
  }

  @Override
  String tocar(String cancao) {
    String tocando = "Se liga nesse som! "+cancao+" é super bom!";
    return tocando;
  }
  
}
