/**
 * @author Matheus Santana
 */

package sinxtaxejava;
import java.util.Scanner;
public class QuestaoCinco {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double notas[] = new double[3];
    double media = 0;
    String conceito = new String();
    for(int i=0 ;i<notas.length; i++){
      System.out.print("Digite a "+(i+1)+"ª nota: ");
      notas[i] = sc.nextDouble();
      media = ((notas[0]+notas[1]+notas[2])/notas.length);
      if(media>=9){
        conceito = "Conceito A";
      }else if( (media>=8) && (media<=8.9) ){
        conceito = "Conceito B";
      }
      else if( (media>=7) && (media<=7.9) ){
        conceito = "Conceito C";
      }
      else if( (media>=6) && (media<=6.9) ){
        conceito = "Conceito D";
      }else{
        conceito = "Conceito E";
      }
    }
    System.out.printf("A média foi: %.2f - %s\n", media, conceito);
  }
}
