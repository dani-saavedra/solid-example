package chain;

public class Moneda300 implements LectorMonedas {


    @Override
    public Integer contenido(Moneda moneda) {
        return moneda.getContenido();
    }

    @Override
    public boolean acepta(Moneda moneda) {
        return "ESPECIAL 300".equals(moneda.getTipo());
    }

}
