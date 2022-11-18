package Atividade.dominio;

public abstract class Pedido {
    private Cliente cliente;
    private double valorDoPedido;
    private String dataDoPedido;
    private String horarioPedidoRealizado;


    public Pedido(Cliente cliente, double valorDoPedido, String dataDoPedido, String horarioPedidoRealizado) {

        this.cliente = cliente;
        this.valorDoPedido = valorDoPedido;
        this.dataDoPedido = dataDoPedido;
        this.horarioPedidoRealizado = horarioPedidoRealizado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    public String getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(String dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public String getHorarioPedidoRealizado() {
        return horarioPedidoRealizado;
    }

    public void setHorarioPedidoRealizado(String horarioPedidoRealizado) {
        this.horarioPedidoRealizado = horarioPedidoRealizado;
    }

    public String toString(){
        return String.format("Dados do Pedido: %nNome do Cliente: %s%nNumero de Telefone: %s%nEndereço: Rua %s - nº %s - Bairro %s - " +
                "Referencia: %s%nValor do Pedido: %.2f%nData do pedido: %s%nHorario que foi realizado o pedido: %s%n",
                getCliente().getNome(), getCliente().getNumTelefone(), getCliente().getEndereco().getRua(),
                getCliente().getEndereco().getNumDaResidencia(), getCliente().getEndereco().getBairro(),
                getCliente().getEndereco().getLocalDeReferencia(), this.valorDoPedido, this.dataDoPedido, this.horarioPedidoRealizado);
    }
}
