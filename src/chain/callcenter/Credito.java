package chain.callcenter;

public class Credito implements Departamento {
    @Override
    public boolean puedeAtender(Solicitud solicitud) {
        return 2 == solicitud.getExtension();
    }

    @Override
    public void atenderSolicitud(Solicitud solicitud) {
        System.out.println("Que credito necesita? " + solicitud.getTema());
    }
}
