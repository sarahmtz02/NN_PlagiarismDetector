public class VerificarTipoObjeto {
    public static void main(String[] args) {
        Object elemento = "Soy una cadena";
        if (elemento.getClass().equals(String.class)) {
            System.out.println("El elemento pertenece a la clase String.");
        } else {
            System.out.println("El elemento no es de tipo String.");
        }
    }
}