package proxy;

public class Internet implements IInternet {
    @Override
    public void navegar(String pagina) {
        System.out.println("Cargando pagina " + pagina);
    }
}
