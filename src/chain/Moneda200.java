package chain;

public class Moneda200 implements LectorMonedas {


    @Override
    public Integer contenido(Moneda moneda) {
        return moneda.getContenido();
    }

    @Override
    public boolean acepta(Moneda moneda) {
        return "COP 200".equals(moneda.getTipo());
    }

}
