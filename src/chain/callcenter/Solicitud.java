package chain.callcenter;

public class Solicitud {

    private int extension;

    private String tema;

    public Solicitud(int extension, String tema) {
        this.extension = extension;
        this.tema = tema;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
