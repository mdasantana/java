package Agenda.escritaTXT;
//https://www.mballem.com/post/manipulando-arquivo-txt-com-java/#:~:text=Primeiro%20vamos%20usar%20o%20m%C3%A9todo,ou%20local%20do%20que%20procuramos.
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

/**
 * Código font retirado do site Boson Treinamentos <http://www.bosontreinamentos.com.br/java/como-criar-e-editar-arquivos-de-texto-de-acesso-sequencial-em-java/>
 * Adaptado por: Matheus Santana
 */

public class Escrita {
  private static Formatter saida; // envia texto para um arquivo

    // Método para abrir (ou criar) o arquivo arquivo.txt
    public static void abrirArquivo(String caminho) {
      try {
        saida = new Formatter(caminho);
      }
      catch (SecurityException securityException) {
        System.err.println("Não é possível escrever no arquivo. Finalizando.");
        System.exit(1); // terminar o programa
      }
      catch (FileNotFoundException fileNotFoundException) {
        System.err.println("Erro ao abrir o arquivo. Finalizando.");
        System.exit(1); // Finalizar o programa
      }
   }
    // Método para adicionar registros ao arquivo
    public static void adicionarDados(String valor) {
        try {
          saida.format(valor);
        }
        catch (FormatterClosedException formatterClosedException) {
          System.err.println("Erro ao escrever no arquivo. Finalizando.");
        }
        catch (NoSuchElementException elementException) {
          System.err.println("Entrada inválida.");
        }
    }
    public static void fecharArquivo() {
      if (saida != null)
        saida.close();
    }
}