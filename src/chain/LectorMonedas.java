package chain;

public interface LectorMonedas {

    boolean acepta(Moneda moneda);

    Integer contenido(Moneda moneda);
}
