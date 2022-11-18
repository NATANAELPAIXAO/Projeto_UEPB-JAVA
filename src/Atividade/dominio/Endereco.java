package Atividade.dominio;

public class Endereco {
    private String rua;
    private String numDaResidencia;
    private String bairro;
    private String localDeReferencia;

    public Endereco(String rua, String numDaResidencia, String bairro, String localDeReferencia) {
        this.rua = rua;
        this.numDaResidencia = numDaResidencia;
        this.bairro = bairro;
        this.localDeReferencia = localDeReferencia;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumDaResidencia() {
        return numDaResidencia;
    }

    public void setNumDaResidencia(String numDaResidencia) {
        this.numDaResidencia = numDaResidencia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalDeReferencia() {
        return localDeReferencia;
    }

    public void setLocalDeReferencia(String localDeReferencia) {
        this.localDeReferencia = localDeReferencia;
    }

    public String toString(){
        return String.format("Endereço:%nRua: %s%nBairro: %s%nNumero da Residencia: %s%nLocal de Referencia: %s%n",
                this.rua, this.bairro, this.numDaResidencia, this.localDeReferencia);
    }
}
