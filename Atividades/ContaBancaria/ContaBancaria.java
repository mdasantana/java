package ContaBancaria;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ContaBancaria {
  
  private Map<String,String> Extrato = new HashMap<>();
  private String nomeBanco;
  private String numeroAgencia;
  private String numeroConta;
  private String nomeTitular;
  private char tipoConta;
  private double saldo;
  
  public ContaBancaria(String nomeBanco, String numeroAgencia, String numeroConta, String nomeTitular){
    this.nomeBanco = nomeBanco;
    this.numeroAgencia = numeroAgencia;
    this.numeroConta = numeroConta;
    this.nomeTitular = nomeTitular;
    this.saldo = 0.0f;
  }
  
  public String getNumeroAgencia(){
    return numeroAgencia;
  }
  
  public String getNumeroConta(){
    return numeroConta;
  }
  
  public String getNomeTitular(){
    return nomeTitular;
  }
  
  public Double getSaldo(){
    return saldo;
  }
  
  public char getTipoConta(){
    return tipoConta;
  }
  
  public char setTipoConta(char tipoConta){
    if(tipoConta == 'C' || tipoConta == 'P'){
      this.tipoConta = tipoConta;
    }else{
      System.out.println("Tipo de conta inválido");
    }
    return this.tipoConta;
  }
  
  public String DataTransacao(){
    Date dataTransacao;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return dateFormat.format(dataTransacao = new Date());
  }
  
  public double Sacar(double saldo){
    if(this.saldo <= 0 || this.saldo < saldo){
      System.out.println("Saldo insuficiente!");
    }else{
      this.saldo -= saldo;
      Extrato.put(DataTransacao(), (" Saque de "+saldo));
    }
    return this.saldo;
  }
  
  public double Depositar(double saldo){
    if(saldo <= 0){
      System.out.println("Valor inválido");
    }else{
      this.saldo += saldo;
      Extrato.put(DataTransacao(), (" Depósito de "+saldo));
    }
    return this.saldo;
  }
  
  public void Extrato(){
    if(Extrato.isEmpty()){
      System.out.println("Sem dados para o extrato por período");
    }else{
      System.out.println("::::::::::::::DATA = TRANSAÇÃO::::::::::::::");
      for(Map.Entry<String,String> extrato: Extrato.entrySet()){
        System.out.println("::::: "+extrato);
      }
      System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
    }
  }
  
  public void Dados(){
    System.out.printf("Banco: %s\n"
                    + "Agência: %s\n"
                    + "Conta: %s\n"
                    + "Cliente: %s\n"
                    + "Tipo da Conta: %c\n"
                    + "Saldo: %.2f\n",
                      nomeBanco,
                      getNumeroAgencia(),
                      getNumeroConta(),
                      getNomeTitular(),
                      getTipoConta(),
                      getSaldo());
  }
}