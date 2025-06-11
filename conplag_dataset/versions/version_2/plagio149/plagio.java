public class ExpresionFuncionalBasica {
    interface Calculo {
        int ejecutar(int x, int y);
    }

    public static void main(String[] args) {
        Calculo multiplicacion = (x, y) -> { return x * y; };
        System.out.println("Salida funcional: " + multiplicacion.ejecutar(5, 7));
    }
}