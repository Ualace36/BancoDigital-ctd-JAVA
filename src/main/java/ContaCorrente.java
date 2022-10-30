public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, int numeroConta, Cliente titular, double saldo) {
        super(cliente, numeroConta, titular, saldo);
    }

    @Override
    public boolean transferePara(Conta destino, double valor) {
        return super.transferePara(destino, valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public boolean saque(double valor) {
        return super.saque(valor);
    }
}
