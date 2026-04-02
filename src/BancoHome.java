public class BancoHome {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);

        contaPoupanca.depositar(500);
        contaPoupanca.depositar(500);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
    }
}
