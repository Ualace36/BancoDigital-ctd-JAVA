public interface IConta {
    boolean sacar(double valor);
    boolean depositar(double valor);
    boolean tranferir(double valor, Conta contaDestino);
    void  imprimirExtrato();
}
