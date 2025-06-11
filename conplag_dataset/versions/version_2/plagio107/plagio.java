public class PropiedadesEstaticas {
    public static int instanciaContador = 0;

    public PropiedadesEstaticas() {
        instanciaContador = instanciaContador + 1;
    }

    public static void main(String[] args) {
        new PropiedadesEstaticas();
        new PropiedadesEstaticas();
        System.out.println("Total de instancias: " + PropiedadesEstaticas.instanciaContador);
    }
}