package Robo;
/**
 * @author Matheus Santana
 */
public class RoboMain {
  public static void main(String[] args) {
    RoboMedico rm = new RoboMedico();
    System.out.println(rm.ativar());
    System.out.println(rm.recarregar());
    System.out.println(rm.cortar(2.5f, 0.5f));

    RoboArqueologo ra = new RoboArqueologo();
    System.out.println(ra.ativar());
    System.out.println(ra.recarregar());
    System.out.println(ra.cavar(5f));
  }
}
