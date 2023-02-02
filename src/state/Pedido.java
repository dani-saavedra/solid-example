package state;

public class Pedido {

    private String estado;

    void siguienteEstado() {
        if (estado.equals("Recibido")) {
            estado = "Cocinando";
        } else if (estado.equals("Cocinando")) {
            estado = "Entregando";
        } else if (estado.equals("Entregando")) {
            estado = "Entregado";
        }
    }
    void devolver() {
        if (estado.equals("Recibido")) {
            estado = "Cocinando";
        } else if (estado.equals("Cocinando")) {
            estado = "Entregando";
        } else if (estado.equals("Entregando")) {
            estado = "Entregado";
        }
    }
}
