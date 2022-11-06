import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteConta {

    Cliente cliente;

    @Test
    public void Deposito_deve_passar_se_saldo_sofrer_acrescimo_de_valor_depositado() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Conta cc = new ContaCorrente(clienteOne, 45754, 200);
        cc.depositar(60);
        Assertions.assertEquals(260,cc.getSaldo());
    }

    @Test
    public void Deposito_deve_falhar_se_saldo_sofrer_acrescimo_de_valor_depositado() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Conta cc = new ContaCorrente(clienteOne, 45754, 200);
        cc.depositar(60);
        Assertions.assertNotEquals(260,cc.getSaldo());
    }
    @Test
    void saldo_deve_pegar_o_saldo_atual() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Conta cc = new ContaCorrente(clienteOne, 45754, 0);
        cc.depositar(250);
        Assertions.assertEquals(250, cc.getSaldo());
    }


    @Test
    public void transferir_deve_passar_se_saldo_sofrer_acrescimo_de_valor_transferido() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Cliente clienteTwo = new Cliente("Uálace", "Santos", "027754578-41", enderecoOne);
        Conta cp = new ContaPoupanca(clienteOne, 45454, 4000);
        Conta cp2 = new ContaPoupanca(clienteTwo, 45565, 1000);
        cp.tranferir(3000, cp2);
        Assertions.assertEquals(4000, cp2.getSaldo());
    }
    @Test
    public void transferir_deve_falhar_se_saldo_da_conta_origem_nao_sofrer_decrescimo_de_valor_transferido() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Cliente clienteTwo = new Cliente("Uálace", "Santos", "027754578-41", enderecoOne);
        Conta cp = new ContaPoupanca(clienteOne, 45454, 4000);
        Conta cp2 = new ContaPoupanca(clienteTwo, 45565, 1000);
        cp.tranferir(3000, cp2);
        Assertions.assertEquals(4000, cp.getSaldo());
    }
    @Test
    public void transferir_deve_passar_se_saldo_da_conta_origem_sofrer_decrescimo_de_valor_transferido() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Cliente clienteTwo = new Cliente("Uálace", "Santos", "027754578-41", enderecoOne);
        Conta cp = new ContaPoupanca(clienteOne, 45454, 4000);
        Conta cp2 = new ContaPoupanca(clienteTwo, 45565, 1000);
        cp.tranferir(3000, cp2);
        Assertions.assertEquals(1000, cp.getSaldo());
    }
    @Test
    public void transferir_deve_falhar_se_saldo_acrescentar_valor_tranferido() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);
        Cliente clienteTwo = new Cliente("Uálace", "Santos", "027754578-41", enderecoOne);
        Conta cp = new ContaPoupanca(clienteOne, 45454, 4000);
        Conta cp2 = new ContaPoupanca(clienteTwo, 45565, 0);
        cp.tranferir(3000, cp2);
        Assertions.assertNotEquals(3000, cp2.getSaldo());
    }
    @Test
    void saque_deve_passar_se_devolver_saldo_correto() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);

        Conta cc = new ContaCorrente(clienteOne, 4512, 200);
        cc.sacar(50);
        Assertions.assertEquals(150,cc.getSaldo());


    }

    @Test
    void saque_deve_falhar_se_devolver_saldo_correto() {
        Endereco enderecoOne = new Endereco("Bela VIsta", "56b", "São Francisco", "Apartament 02", "Ilhéus", "Ba");
        Cliente clienteOne = new Cliente("Helena", "Ito", "027751852-41", enderecoOne);

        Conta cc = new ContaCorrente(clienteOne, 4512, 200);
        cc.sacar(50);
        Assertions.assertNotEquals(150,cc.getSaldo());


    }


}