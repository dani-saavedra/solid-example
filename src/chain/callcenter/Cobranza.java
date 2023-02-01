package chain.callcenter;

public class Cobranza implements Departamento {
    @Override
    public boolean puedeAtender(Solicitud solicitud) {
        return 1 == solicitud.getExtension();
    }

    @Override
    public void atenderSolicitud(Solicitud solicitud) {
        System.out.println("Esta siendo atendido por el departamento de cobranzanas bienvenido en que le podemos servir " + solicitud.getTema());
    }
}
