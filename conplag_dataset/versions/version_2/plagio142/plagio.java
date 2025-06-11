public class SelectorDia {
    public static String determinarNombreDia(int numDia) {
        String nombre = "";
        switch (numDia) {
            case 1:
                nombre = "Lunes";
                break;
            case 2:
                nombre = "Martes";
                break;
            default:
                nombre = "Día desconocido";
                break;
        }
        return nombre;
    }

    public static void main(String[] args) {
        System.out.println(determinarNombreDia(1));
        System.out.println(determinarNombreDia(5));
    }
}