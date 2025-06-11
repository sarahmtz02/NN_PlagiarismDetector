public class SelectorDeCaso {
    public static void main(String[] args) {
        int eleccion = 2;
        String mensaje;
        switch (eleccion) {
            case 1:
                mensaje = "Has elegido el caso A";
                break;
            case 2:
                mensaje = "Has elegido el caso B";
                break;
            default:
                mensaje = "Caso desconocido";
                break;
        }
        System.out.println(mensaje);
    }
}