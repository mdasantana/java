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
    return super.getInfoJogo()+" | Tamanho(GB): "+tamanhoGB;
  }
  
}
