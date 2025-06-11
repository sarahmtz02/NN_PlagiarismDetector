public class TipoDeValor {
    public static void analizarSigno(int valor) {
        String descripcion;
        if (valor > 0) {
            descripcion = "positivo";
        } else {
            if (valor < 0) {
                descripcion = "negativo";
            } else {
                descripcion = "cero";
            }
        }
        System.out.println("El valor es " + descripcion + ".");
    }

    public static void main(String[] args) {
        analizarSigno(5);
        analizarSigno(-3);
        analizarSigno(0);
    }
}