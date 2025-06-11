public class AccesoACampoPublico {
    public String mensaje = "Hola mundo.";

    public static void main(String[] args) {
        AccesoACampoPublico obj = new AccesoACampoPublico();
        System.out.println(obj.mensaje);
    }
}