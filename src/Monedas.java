public class Monedas {

    //"1000","200","300",etc
    public Integer identificarMoneda(String textoMoneda) {

        if ("1000".equals(textoMoneda)) {
            return 1000;
        } else if ("200".equals(textoMoneda)) {
            return 200;
        } else if ("100".equals(textoMoneda)) {
            return 100;
        } else if ("500".equals(textoMoneda)) {
            return 500;
        }
        return 0;
    }
}
