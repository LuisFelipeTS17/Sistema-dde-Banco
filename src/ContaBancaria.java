public abstract class ContaBancaria implements Conta{
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public abstract void depositar(double valor);
}
