public class ClaseConAtributosPrivadosYGetters {
    private String nombre;
    private int edad;

    public ClaseConAtributosPrivadosYGetters(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        ClaseConAtributosPrivadosYGetters persona = new ClaseConAtributosPrivadosYGetters("Juan", 30);
        System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
    }
}