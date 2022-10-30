public class ContaPoupanca extends Conta{
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

    public ContaPoupanca(Cliente cliente, int numeroConta, Cliente titular, double saldo) {
        super(cliente, numeroConta, titular, saldo);

    }
}
