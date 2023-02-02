package state;

public interface IEstadoPedido {

    void avanzar(PedidoRappi pedido);

    void devolver(PedidoRappi pedido);

    String consultar();
}
