package Atividade.dominio;

public class Cliente {
    private String nome;
    private String numTelefone;
    private Endereco endereco;

    public Cliente(String nome, String numTelefone, Endereco endereco) {
        this.nome = nome;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return String.format("Dados do Cliente:%nNome: %s%nNumero de Telefone: %s%nEndereço: Rua %s - nº %s - Bairro %s - Referencia: %s",
                this.nome, this.numTelefone, getEndereco().getRua(),
                getEndereco().getNumDaResidencia(), getEndereco().getBairro(), getEndereco().getLocalDeReferencia());
    }
}
