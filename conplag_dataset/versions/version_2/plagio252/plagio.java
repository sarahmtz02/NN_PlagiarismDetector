public class BusquedaFlexibleDeCadena {
    public static void main(String[] args) {
        String fraseCompleta = "   Un EJEMPLO de CADENA   ";
        String patron = "ejemplo";
        String fraseNormalizada = fraseCompleta.strip().toLowerCase();
        String patronNormalizado = patron.toLowerCase();
        
        if (fraseNormalizada.indexOf(patronNormalizado) != -1) {
            System.out.println("Se encontró la subcadena sin importar mayúsculas/minúsculas ni espacios iniciales/finales.");
        } else {
            System.out.println("No se encontró la subcadena.");
        }
    }
}