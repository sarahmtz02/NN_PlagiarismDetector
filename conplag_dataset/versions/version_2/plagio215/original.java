public class ClaseConMetodosPrivados {
    private String mensajeSecreto = "Contenido oculto.";

    private void imprimirSecreto() {
        System.out.println(mensajeSecreto);
    }

    public static void main(String[] args) {
        ClaseConMetodosPrivados obj = new ClaseConMetodosPrivados();
        // obj.imprimirSecreto(); // Esto daría un error de compilación si no es desde un método público
        // No hay un método público para llamar a imprimirSecreto directamente en este ejemplo.
    }
}