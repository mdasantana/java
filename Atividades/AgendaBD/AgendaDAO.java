package AgendaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Matheus Santana
 */
public class AgendaDAO {
  
  public static List<Contato> listaContatos(){
    
    List<Contato> contatos = new ArrayList<>();
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "SELECT * FROM `contatos`";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      
      ResultSet resultadoConsulta = stmt.executeQuery();
      
      while(resultadoConsulta.next()){
        int id = resultadoConsulta.getInt("id");
        String nome = resultadoConsulta.getString("nome");
        String telefone = resultadoConsulta.getString("telefone");
        String email = resultadoConsulta.getString("email");
        String tipoContato = resultadoConsulta.getString("tipo_contato");

        contatos.add(new Contato(
          id,
          nome,
          telefone,
          email,
          tipoContato
        ));
      }
    }catch (SQLException e){
      System.out.println("Listagem de alunos FALHOU!");
      e.printStackTrace();
    }
    
    return contatos;
  }
  
  public static Contato getPorId(int id){
    Contato contato = null;
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "SELECT * FROM `contatos` WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setInt(1, id);
      ResultSet resultadoConsulta = stmt.executeQuery();
      
      if(resultadoConsulta.next()){
        contato = new Contato(
                              resultadoConsulta.getInt("id"),
                              resultadoConsulta.getString("nome"),
                              resultadoConsulta.getString("telefone"),
                              resultadoConsulta.getString("email"),
                              resultadoConsulta.getString("tipo_contato"));
      }
    }catch (SQLException e){
      
    }
    
    return contato;
  }
  
  public static Contato getPorNome(String nome){
    Contato contato = null;
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "SELECT * FROM `contatos` WHERE nome LIKE ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1, "%"+nome+"%");
      ResultSet resultadoConsulta = stmt.executeQuery();
      
      if(resultadoConsulta.next()){
        contato = new Contato(
                              resultadoConsulta.getInt("id"),
                              resultadoConsulta.getString("nome"),
                              resultadoConsulta.getString("telefone"),
                              resultadoConsulta.getString("email"),
                              resultadoConsulta.getString("tipo_contato"));
      }
    }catch (SQLException e){
      return contato;
    }
    
    return contato;
  }
  
  public static Contato getPorTelefone(String telefone){
    Contato contato = null;
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "SELECT * FROM `contatos` WHERE telefone LIKE ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1, "%"+telefone+"%");
      ResultSet resultadoConsulta = stmt.executeQuery();
      
      if(resultadoConsulta.next()){
        contato = new Contato(
                              resultadoConsulta.getInt("id"),
                              resultadoConsulta.getString("nome"),
                              resultadoConsulta.getString("telefone"),
                              resultadoConsulta.getString("email"),
                              resultadoConsulta.getString("tipo_contato"));
      }
    }catch (SQLException e){
      //return contato;
    }
    
    return contato;
  }
  
  public static boolean InsertContato(Agenda agenda){
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "INSERT INTO `contatos`(`nome`, `telefone`, `email`, `tipo_contato`) VALUES (?,?,?,?)";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      
      for(Contato cont : agenda.getContatos()){
        stmt.setString(1 , cont.getNome());
        stmt.setString(2, cont.getTelefone());
        stmt.setString(3 , cont.getEmail());
        stmt.setString(4 , cont.getTipoContato());
        stmt.executeUpdate();
      }
      
      return true;
      
    }catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  
  public static boolean UpdateNome(String valor, int id){
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "UPDATE `contatos` SET nome = ? WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1 , valor);
      stmt.setInt(2 , id);
      
      stmt.executeUpdate();
      
      return true;
      
    }catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  
  public static boolean UpdateTelefone(String valor, int id){
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "UPDATE `contatos` SET telefone = ? WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1 , valor);
      stmt.setInt(2 , id);
      
      stmt.executeUpdate();
      
      return true;
      
    }catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  
  public static boolean UpdateEmail(String valor, int id){
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "UPDATE `contatos` SET email = ? WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1 , valor);
      stmt.setInt(2 , id);
      
      stmt.executeUpdate();
      
      return true;
      
    }catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  
  public static boolean UpdateClassificacao(String valor, int id){
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "UPDATE `contatos` SET tipo_contato = ? WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1 , valor);
      stmt.setInt(2 , id);
      
      stmt.executeUpdate();
      
      return true;
      
    }catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  
  public static boolean UpdateContato(String nome, String telefone, String email, String nomeAgenda, int id){
    
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "UPDATE `contatos` SET `nome`= ? ,`telefone`= ? ,`email`= ? ,`tipo_contato`= ? WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setString(1 , nome);
      stmt.setString(2 , telefone);
      stmt.setString(3 , email);
      stmt.setString(4 , nomeAgenda);
      stmt.setInt(5 , id);
      
      stmt.executeUpdate();
      
      return true;
      
    }catch (SQLException e){
      e.printStackTrace();
      return false;
    }
  }
  
  public static boolean deleteContato(int id){
    try(Connection conexao = ConexaoBanco.getConexao()){
      
      String querySQL = "DELETE FROM `contatos` WHERE id = ?";
      
      PreparedStatement stmt = conexao.prepareStatement(querySQL);
      stmt.setInt(1 , id);
      stmt.executeUpdate();
      return true;
      
    }catch (SQLException e){
      return false;
    }
  }
  
}