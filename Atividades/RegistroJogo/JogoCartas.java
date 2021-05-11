package RegistroJogo;
/**
 * @author Matheus Santana
 */
public class JogoCartas extends Jogo{
 private int qtdJogadores;

  JogoCartas(String nome, float precoUnitario, int clasEtaria, int qtdJogadores){
    super(nome, precoUnitario, clasEtaria);
    this.qtdJogadores = qtdJogadores;
  }
  
  @Override
  public String getInfoJogo(){
    String infoJogoCartas = "Nome: "+nome+" | Preço Unitário: "+precoUnitario
                        +" | Classificação: "+clasEtaria+" | Quantidade Jogadores: "+qtdJogadores;
    return infoJogoCartas;
  }
}
