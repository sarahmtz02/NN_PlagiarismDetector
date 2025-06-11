public class DibujarCuadradoDeSimbolos {
    public static void main(String[] args) {
        int lado = 4;
        String simbolo = "#";
        for (int fila = 0; fila < lado; fila++) {
            String linea = "";
            for (int columna = 0; columna < lado; columna++) {
                linea += simbolo + " ";
            }
            System.out.println(linea);
        }
    }
}