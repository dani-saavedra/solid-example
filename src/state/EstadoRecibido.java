package state;

public class EstadoRecibido implements IEstadoPedido {


    @Override
    public void avanzar(PedidoRappi pedido) {
        if (pedido.isPrime()) {
            pedido.setEstado(new EstadoEntregado());
        } else {
            pedido.setEstado(new EstadoCocinando());
        }
    }

    @Override
    public void devolver(PedidoRappi pedido) {

    }

    @Override
    public String consultar() {
        return "Estoy recibiendo su pedido espere";
    }

    public String interesante() {
        return "Estoy recibiendo su pedido espere";
    }
}
