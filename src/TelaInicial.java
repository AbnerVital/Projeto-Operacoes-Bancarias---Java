public class TelaInicial {
    public static void main(String[] args) {
        String nomeCliente = "Abner Vital Gomes Chaves";
        String tipoConta = "Corrente";
        Double saldoInicial = 2500.00;
        System.out.printf("""
                ***********************************************
                Dados Iniciais do Cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo Inicial: %.2f
                ***********************************************
                """,nomeCliente,tipoConta,saldoInicial);
    }
}
