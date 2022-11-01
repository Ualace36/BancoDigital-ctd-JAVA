public class Endereco {
  private String bairro;
  private String rua;
  private String numero;
  private String cep;
  private String cidade;

    public Endereco() {
    }

    public Endereco(String bairro, String rua, String numero, String cep, String cidade) {
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return
                "Bairro: " + bairro +
                        ", Rua: " + rua +
                        ", Numero: " + numero + '\'' +
                        ", Cep: " + cep +
                        ", Cidade: " + cidade ;
    }
}
