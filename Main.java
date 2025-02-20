import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Qual é seu nome?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Informe seu tipo de conta:");
        String tipoConta = scanner.nextLine();
        System.out.println("E valor inicial da conta bancária:");
        double saldo = scanner.nextDouble();

        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("**********************************************");

        String menu;
        menu = """
                Operações
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo é R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor que quer receber:");
                saldo = saldo + scanner.nextDouble();
                System.out.println("O saldo atualizado é R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que quer transferir:");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Impossível transferir, valor maior que seu saldo em conta.");
                } else if (valorTransferir <= saldo) {
                    saldo = saldo - valorTransferir;
                    System.out.println("O saldo atualizado é R$" + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida, tente novamente.");
            }
        } // fecha o loop das opções

    }
}