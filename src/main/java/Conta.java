public class Conta{
    protected Cliente cliente;
    protected int numeroConta;
    protected Cliente titular;
    protected double saldo;

    public Conta(Cliente cliente, int numeroConta, Cliente titular, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean transferePara(Conta destino, double valor) {
        return false;
    }


    public void depositar(double valor) {

    }


    public boolean saque(double valor) {
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", numeroConta=" + numeroConta +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
