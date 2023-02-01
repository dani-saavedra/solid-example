package chain;

public class Moneda1000 implements LectorMonedas {


    @Override
    public Integer contenido(Moneda moneda) {
        return moneda.getContenido();
    }

    @Override
    public boolean acepta(Moneda moneda) {
        return "COP 1000".equals(moneda.getTipo());
    }

}
