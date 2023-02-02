package proxy;

public class InternetSabana implements IInternet {

    private IInternet internet;

    public InternetSabana() {
        this.internet = new Internet();
    }

    @Override
    public void navegar(String pagina) {
        //SIEMPRE LA CONSTANTE CONTRA LA VARAIBLE
        //EVITAMOS UN NULLPOINTEREXCEPTION
        if ("xxx".equals(pagina)) {
            throw new IllegalArgumentException("Ud esta entrando a un sitio prohibido, vamos hablar con el decano");
        }
        internet.navegar(pagina);
    }
}
