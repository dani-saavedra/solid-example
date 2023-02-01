package chain;

import java.util.Arrays;
import java.util.List;

public class ProcesadorMonedas {

    private List<LectorMonedas> lectores;

    public ProcesadorMonedas(LectorMonedas... lects) {
        this.lectores = Arrays.asList(lects);
    }

    public Integer sumaMontos(List<Moneda> monedas) {
        Integer resultado = 0;

        for (Moneda doc : monedas) {
            for (LectorMonedas lector : lectores) {
                if (lector.acepta(doc)) {
                    resultado += lector.contenido(doc);
                }
            }
        }
        return resultado;
    }

}
