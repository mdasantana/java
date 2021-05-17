package InstrumentosMusicais;
/**
 * @author Matheus Santana
 */
public class InstrumentoMain {
  public static void main(String[] args) {
    Violao v1 = new Violao();
    System.out.println(v1.afinar());
    System.out.println(v1.tocar("Gostava tanto de você - Tim Maia"));

    FlautaDoce f1 = new FlautaDoce();
    System.out.println(f1.afinar());
    System.out.println(f1.tocar("Asa branca - Luiz Gonzaga"));
  }
}
