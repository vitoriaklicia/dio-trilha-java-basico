import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // A fazer:Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem final, da conta criada

        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        // Solicita o número da agência
        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Constrói a mensagem final com formatação correta
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é %s, conta %d e seu saldo é de R$ %.2f.",
                nomeCliente, agencia, numeroConta, saldo);

        // Exibe a mensagem final
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
