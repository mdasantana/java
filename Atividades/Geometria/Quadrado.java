package Geometria;
/**
 * @author Matheus Santana
 */
public class Quadrado {
  private double lado;
  private static double diag;
  
  public Quadrado(double lado){
    this.lado = lado;
  }
  
  public double getArea(){
    return this.lado * this.lado;
  }
  public double getPerimetro(){
    return this.lado * 4;
  }
  public double getDiagonal(){
    return this.lado * diag;
  }
  public static void setDiag(double diagonal){
    diag = diagonal;
  }

  static class setDiag {

    public setDiag() {
    }
  }
}
