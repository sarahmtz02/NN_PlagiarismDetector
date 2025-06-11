public class RetornoDeObjeto {
    static class Persona {
        String nombre;
        Persona(String nombre) { this.nombre = nombre; }
    }

    public static Persona crearPersona(String nombre) {
        return new Persona(nombre);
    }

    public static void main(String[] args) {
        Persona p = crearPersona("Carlos");
        System.out.println("Persona creada: " + p.nombre);
    }
}