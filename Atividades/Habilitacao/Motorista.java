package Habilitacao;
/**
 * @author Matheus Santana
 */
public class Motorista {
  private String nome;
  private int anoNascimento;
  private char tipoCNH;
  
  public Motorista(String nome, int anoNascimento){
    this.nome = nome;
    this.anoNascimento = anoNascimento;
    this.tipoCNH = '-';
  }
  public String getNome(){
    return nome;
  }
  public int getanoNascimento(){
    return anoNascimento;
  }
  public char getTipoCNH(){
    return tipoCNH;
  }
  public boolean setTipoCNH(char tipoCNH){
    if(tipoCNH == 'A' || tipoCNH == 'B' || tipoCNH == 'Z'){
      this.tipoCNH = tipoCNH;
      return true;
    }else{
      return false;
    }
  }
}
