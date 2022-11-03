public class Endereco {

    protected String rua;
    protected String numero;
    protected   String bairro;
    protected String complemento;
    protected String cidade;
    protected String estado;

    public Endereco(String rua, String numero, String bairro, String complemento, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return
                "rua: " + rua +" --"+
                " NÚMERO: " + numero +" --"+
                " BAIRRO: " + bairro +" --"+
                " COMPLEMENTO: " + complemento +" --"+
                " CIDADE: " + cidade +" --"+
                " ESTADO: " + estado+".";
    }
}
