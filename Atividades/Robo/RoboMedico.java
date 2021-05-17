package Robo;
/**
 * @author Matheus Santana
 */
public class RoboMedico implements Robo{

  @Override
  public String ativar() {
    return "Robô pronto para operar!!";
  }

  @Override
  public String recarregar() {
    return "Robô carregando!";
  }
  
  public String cortar(float diametro, float profundidade){
    String corte = "Efetuando corte de "+diametro+"cm"+" com produndidade de "+profundidade+"cm";
    return corte;
  }
  
}
