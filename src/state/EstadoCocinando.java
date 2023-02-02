package state;

public class EstadoCocinando implements IEstadoPedido {


    @Override
    public void avanzar(PedidoRappi pedido) {

    }

    @Override
    public void devolver(PedidoRappi pedido) {
        pedido.setEstado(new EstadoRecibido());
    }

    @Override
    public String consultar() {
        return "Ya estoy cociendo, va quedar decliososo";
    }
}
