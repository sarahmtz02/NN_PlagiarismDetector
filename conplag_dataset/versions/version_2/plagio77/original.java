// original_77.java
public class RetornoMultiple {
    public static String obtenerEstado(int codigo) {
        if (codigo == 0) {
            return "Éxito";
        } else if (codigo == 1) {
            return "Advertencia";
        } else {
            return "Error";
        }
    }

    public static void main(String[] args) {
        System.out.println(obtenerEstado(0));
        System.out.println(obtenerEstado(2));
    }
}