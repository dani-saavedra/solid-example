package state;

public class PedidoRappi {

    private IEstadoPedido estado = new EstadoRecibido();

    private boolean prime;

    public PedidoRappi(boolean prime) {
        this.prime = prime;
    }

    public void siguienteEtapa() {
        System.out.println(estado.consultar());
        estado.avanzar(this);
        System.out.println(estado.consultar());
    }

    public void anteriorEtapa() {
        estado.devolver(this);
    }


    public IEstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(IEstadoPedido estado) {
        this.estado = estado;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }
}
