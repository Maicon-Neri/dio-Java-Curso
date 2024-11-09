package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args){

        if (args.length < 4){
            return;
        }

        String numeroConta = args[0];
        int numeroAgencia = Integer.parseInt(args[1]);
        String cliente = args[2];
        double saldo = Double.parseDouble(args[3]);



        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("Usuario: ");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Para consumir a nova linha após o número da agência.

        System.out.println("Por favor, digite o número da sua conta!");
        System.out.print("Usuario: ");
        String conta = scanner.nextLine();

        if(agencia == numeroAgencia && conta.equals(numeroConta)){
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque.%n", cliente, agencia, conta, saldo);
        } else {
            System.out.printf("Erro: Agência ou conta não coincidem. Verifique os dados e tente novamente.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
