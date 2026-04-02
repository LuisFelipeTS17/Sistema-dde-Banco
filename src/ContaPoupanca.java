public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor * 0.99;
    }
}
