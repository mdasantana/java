package RegistroJogo;
/**
 * @author Matheus Santana
 */
public abstract class Jogo {
  protected String nome;
  protected float precoUnitario;
  protected int clasEtaria;
  
  Jogo(String nome, float precoUnitario, int clasEtaria){
    this.nome = nome;
    this.precoUnitario = precoUnitario;
    this.clasEtaria = clasEtaria;
  }
  
  public String getInfoJogo(){
    String info = "Nome: "+nome+" | Preço Unitário: "+precoUnitario+" | Classificação: "+clasEtaria;
    return info;
  }
}
