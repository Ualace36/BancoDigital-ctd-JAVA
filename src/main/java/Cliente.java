public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return
                nome +
                        " " + sobrenome  +
                        ", CPF: " + cpf + " "
                        + ", End: " + endereco;
    }
}
