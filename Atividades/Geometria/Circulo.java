package Geometria;
/**
 * @author Matheus Santana
 */
public class Circulo {
  
  private double raio;
  private static double pi;

  
  public Circulo(double raio){
    this.raio = raio;
  }
  public double getArea(){
    return (pi * (Math.pow(this.raio, 2)));
  }
  public double getCircunferencia(){
    return ((pi * 2) * this.raio);
  }
  public static void setPi(double valorPi){
    pi = valorPi;
  }
}
