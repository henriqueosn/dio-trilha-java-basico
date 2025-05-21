import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Limpando o buffer

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o seu saldo: ");
        double saldoConta = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu " +
                "saldo %.2f já está disponível para saque.\n", nomeCliente, numeroAgencia, numeroConta, saldoConta);

        sc.close();
    }

}