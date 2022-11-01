public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente, int numeroConta, Cliente titular, double saldo) {
        super(cliente, numeroConta, titular, saldo);

    }

    @Override
    public boolean transferePara(Conta destino, double valor) {
       boolean retirou = this.saque(valor);
       if (retirou == false) {
           return false;
       }else {
           destino.depositar(valor);
           System.out.println("A conta " + destino + "recebeu R$ " + valor);
           return true;
       }

    }

    @Override
    public boolean depositar(double valor) {
       if (valor > 0) {
           this.saldo += valor * 0.02;
           System.out.println("Saldo com rendimento da poupança: " + saldo);
           return true;
       }else {
           System.out.println("Por favor, deposite um valor positivo.");
           return false;
       }
    }

    @Override
    public boolean saque(double valor) {
        if ((this.saldo < valor) || (valor < 0) ){
        return false;
        }else {
            this.saldo -= valor;
            return true;
        }
    }
}
