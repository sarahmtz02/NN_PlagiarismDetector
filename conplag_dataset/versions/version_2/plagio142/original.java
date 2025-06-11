public class MetodoConMultiplesRetornos {
    public static String obtenerDiaSemana(int dia) {
        if (dia == 1) {
            return "Lunes";
        } else if (dia == 2) {
            return "Martes";
        } else {
            return "Día inválido";
        }
    }

    public static void main(String[] args) {
        System.out.println(obtenerDiaSemana(1));
        System.out.println(obtenerDiaSemana(5));
    }
}