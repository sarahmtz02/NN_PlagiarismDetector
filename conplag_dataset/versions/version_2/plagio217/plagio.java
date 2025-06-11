public class CondicionDirectaEnMensaje {
    public static void main(String[] args) {
        int momentoDelDia = 10;
        String periodo;
        if (momentoDelDia < 12) {
            periodo = "mañana";
        } else {
            periodo = "tarde";
        }
        System.out.println("Es de " + periodo + ".");
    }
}