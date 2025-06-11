public class ClaseConConstructorVacio {
    String mensaje;

    public ClaseConConstructorVacio() {
        mensaje = "Constructor por defecto ejecutado.";
    }

    public static void main(String[] args) {
        ClaseConConstructorVacio obj = new ClaseConConstructorVacio();
        System.out.println(obj.mensaje);
    }
}