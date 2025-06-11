public class EnumSimple {
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES
    }

    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.LUNES;
        System.out.println("Hoy es: " + hoy);
    }
}