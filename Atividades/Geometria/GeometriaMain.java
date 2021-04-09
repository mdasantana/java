package Geometria;
/**
 * @author Matheus Santana
 */
public class GeometriaMain {
  public static void main(String[] args){
  
    Quadrado.setDiag(1.41);
    Quadrado quadrado = new Quadrado(2.5);
    System.out.println(":::::::::::::::: Calculos do Quadrado ::::::::::::::::");
    System.out.printf("Área: %.3fcm²\n"
                    + "Perímetro: %.3fcm²\n"
                    + "Diagonal com 1.41: %.3fcm²\n",
                      quadrado.getArea(),
                      quadrado.getPerimetro(),
                      quadrado.getDiagonal());
    
    Quadrado.setDiag(Math.sqrt(2));
    System.out.printf("Diagonal com sqrt(2): %.3fcm²\n",quadrado.getDiagonal());
    System.out.println(":::::::::::::::::::::::: FIM :::::::::::::::::::::::::\n");
    //--------------------------------------------//
    Circulo.setPi(3.14);
    Circulo circulo = new Circulo(2.5);
    System.out.println(":::::::::::::::: Calculos do Circulo :::::::::::::::::");
    System.out.printf("Área: %.3fcm²\n"
                    + "Circunferencia com 3.14: %.3fcm²\n",
                      circulo.getArea(),
                      circulo.getCircunferencia());
    
    Circulo.setPi(Math.PI);
    System.out.printf("Área com PI: %.3fcm²\n"
                    + "Circunferencia com PI: %.3fcm²\n",
                      circulo.getArea(),
                      circulo.getCircunferencia());
    System.out.println(":::::::::::::::::::::::: FIM :::::::::::::::::::::::::\n");
  }
}