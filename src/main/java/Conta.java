import java.util.logging.Logger;

public abstract class Conta implements IConta{
    private static  final Logger LOGGER = Logger.getLogger(Conta.class.getName());
    private static final int AGENCIA_PADRAO = 001;
    private static  int SEQUENCIAL = 001;
    protected  Cliente Cliente;
    protected int agencia;
    protected double saldo;

    public Conta(Cliente cliente) {
        Cliente = cliente;
    }

    public Conta(Cliente cliente, int agencia, double saldo) {
        Cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public int getAgencia() {
        return agencia;
    }



    public double getSaldo() {
     LOGGER.info("O MÉTODO getSaldo() foi acionado");
     return saldo;
    }
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            System.out.println("Saque em andamento...");
            LOGGER.info("O MÉTODO SACAR() FOI ACIANADO");
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso.");
            System.out.println("Saldo após o saque: R$ " + this.saldo);
            return true;
        } else {
            System.out.println("Operação saque indisponínel para esse valor");
            return false;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {

            LOGGER.info("O MÉTODO DEPOSITAR() FOI ACIONADO");
            saldo += valor;
            System.out.println("Depósito efetuado com sucesso");
            System.out.println("Saldo Após o depósito: R$ " +this.saldo);
            return true;
        }else{
            System.out.println("Por favor, deposite um valor maior que zero.");
            return false;
        }
    }

    @Override
    public boolean tranferir(double valor, Conta contaDestino) {
     if (valor <= saldo && valor >0){

        LOGGER.info("O MÉTODO TRANSFERIR() FOI ACIONADO");
        this.sacar(valor);
         contaDestino.depositar(valor);
         System.out.println("Transferência efetuada com sucesso.");
         System.out.println("Saldo após a transferência: R$ " + this.saldo);
         return true;
     }
        System.out.println("Transferência indisponível para esse valor. Por favor, verifique seu saldo.");
        return false;
    }

    protected void atributosComunsDeImpressao() {
        System.out.println(String.format("Titular: %s", this.Cliente ));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
