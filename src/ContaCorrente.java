public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldoInicial){
       super(saldoInicial);
     }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void consultarSaldo(){
        System.out.println();
    }
}
