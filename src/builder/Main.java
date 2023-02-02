package builder;

public class Main {

    public static void main(String[] args) {
        Persona juan = new Persona.Builder("Juan Andres")
                .setMayorEdad(15, "Sabana")
                .build();

        System.out.println(juan);
    }
}
