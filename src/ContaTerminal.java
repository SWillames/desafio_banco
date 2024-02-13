public class ContaTerminal {
  int number;
  String bankAgency;
  String owner;
  double balance;

  public ContaTerminal(int number, String bankAgency, String owner, double balance) {
    this.number = number;
    this.bankAgency = bankAgency;
    this.owner = owner;
    this.balance = balance;
  }

  public void informations() {
    System.out.println("Olá "+ this.owner+", obrigado por criar uma conta em nosso banco, sua agência é "+bankAgency+", conta "+ number +" e seu saldo "+ balance +" já está disponível para saque");
  }
}
