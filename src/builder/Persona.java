package builder;

public class Persona {

    private String nombre;
    private int edad;
    private String ciudadResidencia;

    private String colegio;
    private String trabajo;

    private Persona() {

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudadResidencia='" + ciudadResidencia + '\'' +
                ", colegio='" + colegio + '\'' +
                ", trabajo='" + trabajo + '\'' +
                '}';
    }

    public static class Builder {
        private Persona persona;

        public Builder(String nombre) {
            persona = new Persona();
            //shadowing (mal escrito)
            persona.nombre = nombre;
        }

        public Builder setMayorEdad(int edad, String trabajo) {
            if (edad < 18) {
                throw new IllegalArgumentException("Edad no permitida");
            }
            persona.edad = edad;
            persona.trabajo = trabajo;
            persona.colegio = null;
            //Metodos encadenados
            return this;
        }

        public Builder setMenor(int edad, String colegio) {
            if (edad > 18) {
                throw new IllegalArgumentException("Edad no permitida");
            }
            persona.edad = edad;
            persona.trabajo = null;
            persona.colegio = colegio;
            return this;
        }

        //Se llama por convencion, no por obligacion
        public Persona build() {
            return this.persona;
        }
    }

}
