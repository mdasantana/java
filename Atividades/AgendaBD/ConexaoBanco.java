package AgendaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Matheus Santana
 */
public class ConexaoBanco {
  
  public static Connection getConexao() {
    
    Connection conexao = null;
    
    String driver = "mysql";
    String dataBaseAdress = "localhost";
    String dataBaseName = "agenda";
    String user = "root";
    String password = "senha123";
    
    StringBuilder sb = new StringBuilder("jdbc:")
            .append(driver).append("://")
            .append(dataBaseAdress).append("/")
            .append(dataBaseName);
    String urlConnection = sb.toString();
    
    try{
      conexao = DriverManager.getConnection(urlConnection, user, password);
    }catch(SQLException e){
      System.out.println("Falha na Conexão com o Armazenamento");
    }
    
    return conexao;
  }
  
}
