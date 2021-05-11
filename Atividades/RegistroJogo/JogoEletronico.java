package RegistroJogo;
/**
 * @author Matheus Santana
 */
public class JogoEletronico extends Jogo{
  private float tamanhoGB;
  
  JogoEletronico(String nome, float precoUnitario, int clasEtaria, float tamanhoGB){
    super(nome, precoUnitario, clasEtaria);
    this.tamanhoGB = tamanhoGB;
  }
  @Override
  public String getInfoJogo(){
    String infoJogoCartas = "Nome: "+nome+" | Preço Unitário: "+precoUnitario
                        +" | Classificação: "+clasEtaria+" | Tamanho(GB): "+tamanhoGB;
    return infoJogoCartas;
  }
  
}
