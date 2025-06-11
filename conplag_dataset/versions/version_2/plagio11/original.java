// original_11.java
public class ClaseConAtributos {
    private String nombre;
    private int edad;

    public ClaseConAtributos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        ClaseConAtributos persona = new ClaseConAtributos("Ana", 30);
        persona.mostrarInfo();
    }
}