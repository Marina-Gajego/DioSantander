package desafios.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = scanner.nextDouble();

        System.out.println("Sua conta foi criada com sucesso! \n");

        System.out.printf("Numero da conta: %d \nNumero da agencia: %s \nNome do cliente: %s \nSaldo da conta: %f", numConta, agencia, nomeCliente, saldo);
    }
}