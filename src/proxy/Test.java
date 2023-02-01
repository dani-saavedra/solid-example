package proxy;

public class Test {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaNormal("cliente");
        cuenta.movimiento(10);
        cuenta.movimiento(-20);
        System.out.println(cuenta.getCantidad());


        Cuenta cuentaNueva = new CuentaNueva("cliente");
        cuentaNueva.movimiento(10);
        cuentaNueva.movimiento(-20);
        System.out.println(cuentaNueva.getCantidad());
    }
}
