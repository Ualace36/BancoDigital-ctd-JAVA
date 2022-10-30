public class Conta {
    private Cliente cliente;
    private int numeroConta;
    private Cliente titular;
    private double saldo;

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

    boolean transferePara(Conta destino, double valor){
        boolean retirar = this.saque(valor);
        if (retirar == false){
            return false;
        }else{
            destino.depositar(valor);
            System.out.println("A conta " + destino + "recebeu R$ " + valor);
            return true;
        }
    }

    private void depositar(double valor)   {
        if (valor > 0)
            this.saldo += valor;
    }


    public boolean saque(double valor) {
        if ((this.saldo < valor) && (valor > 0)) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
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
