package Atividade.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPedidos {
    static Scanner input = new Scanner(System.in);
    static List<Pedido> pedidos;

    public static void pedidos(){
        pedidos = new ArrayList<>();
        int contador = 1;
        System.out.println("---- Cadastro do Pedido ----");
        while(contador!=0){

            System.out.print("Informe a rua: ");
            String rua = input.nextLine();
            System.out.print("Informe o numero da residencia: ");
            String numResidencia = input.nextLine();
            System.out.print("Informe o bairro: ");
            String bairro = input.nextLine();
            System.out.print("Informe um ponto de referencia: ");
            String localReferencia = input.nextLine();
            Endereco endereco = new Endereco(rua, numResidencia, bairro, localReferencia);

            System.out.println();

            System.out.print("Informe o nome do cliente: ");
            String nome = input.nextLine();
            System.out.print("Informe o numero de telefone do cliente: ");
            String numTelefone = input.nextLine();
            Cliente cliente = new Cliente(nome, numTelefone, endereco);

            System.out.println();

            System.out.print("Informe o valor do pedido: ");
            double valorPedido = input.nextDouble();

            input.nextLine();

            System.out.print("Informe a data do pedido: ");
            String dataPedido = input.nextLine();
            System.out.print("Informe o horário do pedido: ");
            String horarioPedido = input.nextLine();

            System.out.println();

            System.out.println("--Digite 1 Para pedidos com Entrega | 2 para pedidos sem entrega--");
            int num = input.nextInt();
            if(num == 1){
                pedidos.add(new PedidoComEntregaDomicilio(cliente, valorPedido, dataPedido,horarioPedido));
                System.out.println("Pedido com Entrega a domicilio adicionado a lista");
            }
            else if(num ==2){
                pedidos.add(new PedidoSemEntregaDomicilio(cliente, valorPedido,dataPedido,horarioPedido));
                System.out.println("Pedido sem Entrega a domicilio adicionado a lista");
            }

            else{
                System.out.println("Numero inválido, nenhum pedido adicionado a lista");
            }

            System.out.println("Digite 0 para sair ou qualquer outro numero para continuar!");
            contador = input.nextInt();

            input.nextLine();
        }


        System.out.println("---- Lista dos Pedidos ----");

        for(Pedido pedido : pedidos){

            System.out.printf("Nome do Cliente: %s\n", pedido.getCliente().getNome());
            System.out.printf("Telefone para contato: %s\n", pedido.getCliente().getNumTelefone());
            System.out.printf("Endereço: Rua %s - nº %s - Bairro %s - Ponto de Refência: %s\n",
                    pedido.getCliente().getEndereco().getRua(), pedido.getCliente().getEndereco().getNumDaResidencia(),
                    pedido.getCliente().getEndereco().getBairro(), pedido.getCliente().getEndereco().getLocalDeReferencia());
            System.out.printf("Valor do Pedido: %.2f\n", pedido.getValorDoPedido());
            System.out.printf("Data do Pedido: %s\n", pedido.getDataDoPedido());
            System.out.printf("Horario do Pedido: %s\n", pedido.getHorarioPedidoRealizado());

            if(pedido instanceof PedidoComEntregaDomicilio){
                PedidoComEntregaDomicilio pedidoce = (PedidoComEntregaDomicilio) pedido;
                System.out.printf("Valor Final (Pedido + Entrega): %.2f\n", pedidoce.valorFinalPedido());
            }

            System.out.println("|-----------------------------------------------------|");
        }

    }
}
