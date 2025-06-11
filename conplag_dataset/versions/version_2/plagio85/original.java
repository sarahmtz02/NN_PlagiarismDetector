public class AccesoMiembrosClase {
    String nombre = "Mundo";

    public void saludar() {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        AccesoMiembrosClase obj = new AccesoMiembrosClase();
        obj.saludar();
    }
}