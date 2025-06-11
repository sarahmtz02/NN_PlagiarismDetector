public class ProcesarEntradaDeConsola {
    public static void main(String[] parametros) {
        if (parametros.length > 0) {
            String primerParametro = parametros[0];
            System.out.println("El primer parámetro es: " + primerParametro);
        } else {
            System.out.println("No se han recibido parámetros.");
        }
    }
}