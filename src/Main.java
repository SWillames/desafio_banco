import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, digite o número da Conta!");
    int numberOfCount = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Por favor, digite o número da Agência!");
    String bankAgency = scanner.nextLine();
    System.out.println("Por favor, digite o nome do titular da Conta!");
    String owner = scanner.nextLine();
    System.out.println("Por favor, digite o Saldo!");
    double balance = scanner.nextDouble();

    ContaTerminal contaTerminal = new ContaTerminal(numberOfCount, bankAgency, owner, balance);

    contaTerminal.informations();
  }
}