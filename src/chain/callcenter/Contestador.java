package chain.callcenter;

import chain.LectorMonedas;

import java.util.Arrays;
import java.util.List;

public class Contestador {

    private List<Departamento> departamentos;

    public Contestador(Departamento... lects) {
        this.departamentos = Arrays.asList(lects);
    }

    public void atenderLlamada(Solicitud solicitud) {
        for (Departamento departamento : departamentos) {
            if (departamento.puedeAtender(solicitud)) {
                departamento.atenderSolicitud(solicitud);
                return;
            }
        }
        System.out.println("Marque la extension correcta");
    }
}
