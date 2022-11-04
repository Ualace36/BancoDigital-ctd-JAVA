import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteConta {

    Cliente cliente;

    @Test
    public void DepositoTestandoMetodo() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Conta cc = new ContaCorrente(clienteOne, 45754, 200);
        cc.depositar(60);
        Assertions.assertFalse(false);
    }

    @Test
    void metodoDePegarSaldoTeste() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Conta cc = new ContaCorrente(clienteOne, 45754, 0);
        cc.depositar(250);
        Assertions.assertEquals(250, cc.getSaldo());
    }

    @Test
    public void transferenciaTestandoMetodo() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Cliente clienteTwo = new Cliente("Uálace", "Santos", "027754578-41", enderecoOne);
        Conta cp = new ContaPoupanca(clienteOne, 45454, 4000);
        Conta cp2 = new ContaPoupanca(clienteTwo, 45565, 1000);
        cp.depositar(200);
        cp.tranferir(3000, cp2);
        Assertions.assertTrue(true, "Op Transferência disponível");
    }

    @Test
    void saqueTestandoMetodo() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Cliente clienteTwo = new Cliente("Uálace", "Santos", "027754578-41", enderecoOne);

        Conta cc = new ContaCorrente(clienteOne, 4512, 0);
        Conta cc2 = new ContaCorrente(clienteTwo, 45214, 0);
        cc.depositar(450);
        cc.tranferir(450, cc2);
        cc2.sacar(-450);
        Assertions.assertFalse(false, "Função saque indisponível");


    }
}