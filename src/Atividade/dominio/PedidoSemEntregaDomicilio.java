package Atividade.dominio;

public class PedidoSemEntregaDomicilio extends Pedido {

    public PedidoSemEntregaDomicilio(Cliente cliente, double valorDoPedido, String dataDoPedido, String horarioPedidoRealizado) {
        super(cliente, valorDoPedido, dataDoPedido, horarioPedidoRealizado);
    }

    @Override
    public String toString(){
        return String.format("%s", super.toString());
    }
}
