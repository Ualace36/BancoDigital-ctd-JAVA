import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02","Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Conta cc = new ContaCorrente(clienteOne,4575,2002);
        Conta pp = new ContaPoupanca(clienteOne,45214, 100);
        System.out.println("****************************************************************************************************************************");
        cc.depositar(2500);
        System.out.println("****************************************************************************************************************************");
        cc.tranferir(125,pp);
        System.out.println("****************************************************************************************************************************");
        cc.imprimirExtrato();
        System.out.println("****************************************************************************************************************************");
        pp.imprimirExtrato();
        System.out.println("****************************************************************************************************************************");
        System.out.println(cc.sacar(120));
        System.out.println("****************************************************************************************************************************");
      List<Cliente> contas = new ArrayList<>();
       contas.add(cc.getCliente());
       contas.add(pp.getCliente());
        System.out.println("****************************************************************************************************************************");
       System.out.println("Lista de Contas de Clientes: " + contas.stream().toList());
    }
}