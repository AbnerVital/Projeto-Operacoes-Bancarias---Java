import java.util.Scanner;

public class TelaInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "Abner Vital Gomes Chaves";
        String tipoConta = "Corrente";
        double saldoAtual = 2500.00;
        int opcao = 0;
        System.out.printf("""
                ***********************************************
                Dados Iniciais do Cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo Inicial: %.2f
                ***********************************************
                """, nomeCliente, tipoConta, saldoAtual);

        String menu = """
                                                  \s
                     Operações
                    \s
                     1- Consultar saldo
                     2- Receber Valor
                     3- Transferir
                     4 - Sair
                    \s
                     Digite a opção desejada:
                \s""";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é R$ " + saldoAtual);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                double valoraReceber = scanner.nextDouble();
                saldoAtual += valoraReceber;
                System.out.println("Saldo atualizado R$ " + saldoAtual);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double valoraTransferir = scanner.nextDouble();
                if (saldoAtual < valoraTransferir) {
                    System.out.println("Não a saldo suficiente para fazer essa transferência.");
                } else {
                    saldoAtual -= valoraTransferir;
                    System.out.println("Saldo atualizado R$ " + saldoAtual);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}