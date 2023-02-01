package chain.callcenter;

public interface Departamento {

    boolean puedeAtender(Solicitud solicitud);


    void atenderSolicitud(Solicitud solicitud);
}
