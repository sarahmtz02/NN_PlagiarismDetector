public class ClaseConAtributosPredeterminados {
    String nombre;
    int edad;

    public ClaseConAtributosPredeterminados() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        ClaseConAtributosPredeterminados obj = new ClaseConAtributosPredeterminados();
        obj.mostrarInfo();
    }
}