// original_43.java
public class ClaseConMetodosPrivados {
    private int valorInterno = 100;

    private void imprimirValor() {
        System.out.println("El valor es: " + valorInterno);
    }

    public void ejecutarImpresion() {
        imprimirValor();
    }

    public static void main(String[] args) {
        ClaseConMetodosPrivados obj = new ClaseConMetodosPrivados();
        obj.ejecutarImpresion();
    }
}