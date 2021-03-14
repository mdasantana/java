package completandocpf;
/**
 * @author Matheus Santana
 */
import java.util.Scanner;

public class CPF {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os 9 primeiros dígitos do CPF (apenas números): ");
        String digitos = teclado.next();
        int[] cpf = converterStringParaVetorInt(digitos);
        int mult = 10, soma = 0;
        for (int i=0;i<cpf.length;i++){
          soma += cpf[i]*(mult--);
        }
        if((soma%11 == 0) || (soma%11 == 1)){
          cpf[9] = 0;
        }else{
          cpf[9] = (11-(soma%11));
        }
        soma = 0;mult = 10;
        for (int i=1;i<(cpf.length-1);i++){
          soma += cpf[i]*(mult--);
        }
        if((soma%11 == 0) || (soma%11 == 1)){
            cpf[10] = 0;
        }else{
          cpf[10] = (11-(soma%11));
        }
        // descobrir os dois últimos dígitos e colocá-los na variável cpf

          System.out.println("CPF completo: " + converterVetorIntParaString(cpf));
        }
    
    // Esta função converte o CPF (os 9 dígitos informados na entrada) de String para um vetor de int
    // Também insere dois 0 no fim, para completar os 11 dí­gitos de um CPF
    // Ex.: "963852741" vira [9, 6, 3, 8, 5, 2, 7, 4, 1, 0, 0]
    static int[] converterStringParaVetorInt(String cpfString) {
        int[] cpfNumerico = new int[11];
        for (int i = 0; i < cpfString.length(); i++) {
            cpfNumerico[i] = Character.getNumericValue(cpfString.charAt(i));
        }
        return cpfNumerico;
    }
    
    // Esta função converte o CPF de vetor de int (usado nos cálculos) para String
    // Ex.: [9, 6, 3, 8, 5, 2, 7, 4, 1, 2, 8] vira "96385274128"
    static String converterVetorIntParaString(int[] cpfNumerico) {
        String cpfString = "";
        for (int i = 0; i < cpfNumerico.length; i++) {
            cpfString += Integer.toString(cpfNumerico[i]);
        }
        return cpfString;
    }
}