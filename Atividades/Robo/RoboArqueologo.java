package Robo;
/**
 * @author Matheus Santana
 */
public class RoboArqueologo implements Robo{

  @Override
  public String ativar() {
    return "Liguei viu!! Bora que hoje a pá vai cantar nas Dinossauras";
  }

  @Override
  public String recarregar() {
    return "Matando a larica";
  }
  
  public String cavar(float profundidade){
    String info = "Cavando os "+profundidade+" metros pra achar a Dinossaura";
    return info;
  }
  
}
