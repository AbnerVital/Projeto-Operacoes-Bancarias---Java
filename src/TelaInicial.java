import java.util.Scanner;

public class TelaInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "Abner Vital Gomes Chaves";
        String tipoConta = "Corrente";
        Double saldoInicial = 2500.00;
        int opcao = 0;
        System.out.printf("""
                ***********************************************
                Dados Iniciais do Cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo Inicial: %.2f
                ***********************************************
                """,nomeCliente,tipoConta,saldoInicial);

        while (opcao != 4){
            System.out.printf("""
                    Operações
                    
                    1- Consultar saldo
                    2- Receber Valor
                    3- Transferir
                    4 - Sair
                    """);
            opcao = scanner.nextInt();
        }
    }
}
