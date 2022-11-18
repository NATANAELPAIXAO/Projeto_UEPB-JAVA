package Atividade.dominio;

public class PedidoComEntregaDomicilio extends Pedido{

    private static final double taxaEntrega = 10.00;

    public PedidoComEntregaDomicilio(Cliente cliente, double valorDoPedido, String dataDoPedido, String horarioPedidoRealizado) {
        super(cliente, valorDoPedido, dataDoPedido, horarioPedidoRealizado);
    }

    public double valorFinalPedido(){
        setValorDoPedido(getValorDoPedido()+taxaEntrega);
        return getValorDoPedido();
    }

    @Override
    public String toString(){
        System.out.println(" -- Pedido com Entrega a Domicilio --");
        return String.format("%sValor do Pedido + Taxa de Entrega: %.2f%n", super.toString(), valorFinalPedido());
    }
}
