package chain;

import proxy.Cuenta;
import proxy.CuentaNormal;
import proxy.CuentaNueva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Moneda> monedasInsertadas = Arrays.asList(
                new Moneda("USD 1", 1),
                new Moneda("COP 200", 200),
                new Moneda("COP 10000", 10000),
                new Moneda("ESPECIAL 300", 300)
        );
        ProcesadorMonedas procesadorMonedas = new ProcesadorMonedas(new Moneda200(), new Moneda1000(), new Moneda500());


        System.out.println(procesadorMonedas.sumaMontos(monedasInsertadas));
    }
}
