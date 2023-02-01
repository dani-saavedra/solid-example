package chain;

public class Moneda500 implements LectorMonedas {


    @Override
    public Integer contenido(Moneda moneda) {
        return moneda.getContenido();
    }

    @Override
    public boolean acepta(Moneda moneda) {
         return "COP 500".equals(moneda.getTipo());
    }

}
