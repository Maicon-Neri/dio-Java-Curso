package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args){
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("Usuario: ");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Para consumir a nova linha após o número da agência.

        System.out.println("Por favor, digite o número da sua conta!");
        System.out.print("Usuario: ");
        String conta = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        System.out.print("Usuario: ");
        String cliente = scanner.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque.%n", cliente, agencia, conta, saldo);

        // Fechando o scanner
        scanner.close();
    }
}
