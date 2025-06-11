// original_73.java
public class ClaseConConstructor {
    private String mensaje;

    public ClaseConConstructor(String textoInicial) {
        this.mensaje = textoInicial;
    }

    public void mostrarMensaje() {
        System.out.println("Mensaje de la clase: " + this.mensaje);
    }

    public static void main(String[] args) {
        ClaseConConstructor obj = new ClaseConConstructor("Hola, mundo!");
        obj.mostrarMensaje();
    }
}