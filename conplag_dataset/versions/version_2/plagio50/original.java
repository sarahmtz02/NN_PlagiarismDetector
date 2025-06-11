// original_50.java
public class EncapsulamientoEjemplo {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) { // Validación simple
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        EncapsulamientoEjemplo persona = new EncapsulamientoEjemplo();
        persona.setNombre("Luis");
        persona.setEdad(25);
        System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
    }
}