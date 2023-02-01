package chain.callcenter;

public class Main {

    public static void main(String[] args) {
        Solicitud solicitud = new Solicitud(100, "NO QUIERO PAGAR");

        Contestador contestador = new Contestador(new Cobranza(), new Credito());

        contestador.atenderLlamada(solicitud);
    }
}
