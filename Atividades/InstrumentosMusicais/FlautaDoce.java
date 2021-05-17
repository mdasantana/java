package InstrumentosMusicais;
/**
 * @author Matheus Santana
 */
public class FlautaDoce extends InstrumentoMusical{

  FlautaDoce(){
  super("Flauta Doce", TipoInstrumento.SOPRO);
  };
  
  @Override
  String afinar() {
    String afinando = "Flauta Doce afinada!";
    return afinando;
  }

  @Override
  String tocar(String cancao) {
    String tocando = cancao+" novamente!";
    return tocando;
  }
  
}
