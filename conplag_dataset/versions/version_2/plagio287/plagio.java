public class ImplementacionClaseAnonima {
    interface Calculo {
        int ejecutar(int x, int y);
    }

    public static void main(String[] args) {
        Calculo multiplicacion = new Calculo() {
            @Override
            public int ejecutar(int x, int y) {
                return x * y;
            }
        };
        System.out.println("Multiplicación: " + multiplicacion.ejecutar(5, 3));
    }
}