package ContaBancaria;
public class ContaBancaria {
  String nomeBanco;
  String numeroAgencia;
  String numeroConta;
  String nomeTitular;
  char tipoConta;
  double saldo;
  double Sacar(double valor){
    if(saldo <= 0 || saldo < valor){
      System.out.println("Saldo insuficiente!");
    }else{
      saldo -= valor;
    }
    return saldo;
  }
  double Depositar(double valor){
    return saldo += valor;
  }
  void imprimirDados(ContaBancaria conta){
    System.out.printf("Banco: %s | Agência: %s | Conta: %s\n",conta.nomeBanco, conta.numeroAgencia, conta.numeroConta);           System.out.printf("Cliente: %s | Tipo da Conta: %c | Saldo: %.2f\n",conta.nomeTitular, conta.tipoConta, conta.saldo);
  }
}
