/**
 * @author Matheus Santana
 */
package sinxtaxejava;
import java.util.Scanner;
public class QuestaoSeis {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeros[] = new int[5];
    int menor = Integer.MAX_VALUE;
    posicao = 0;
    for(int i=0;i<numeros.length;i++){
      numeros[i] = sc.nextInt();
      if(numeros[i] < menor ){
        menor = numeros[i];
        posicao = i;
      }
    }
    System.out.printf("O menor número está na %dª posição e seu valor é: %d\n", (posicao+1), menor);
  }
}