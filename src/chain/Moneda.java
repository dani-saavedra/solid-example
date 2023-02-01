package chain;

public class Moneda {

    private final String tipo;//agrupar todas las caracteristicas de la moneda
    private final Integer contenido;

    public Moneda(String tipo, Integer contenido) {
        this.tipo = tipo;
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getContenido() {
        return contenido;
    }

}
