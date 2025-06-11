// original_68.java
public class ClasesAnidadasEstaticas {
    static class InternaEstatica {
        void mostrarMensaje() {
            System.out.println("Mensaje de la clase interna estática.");
        }
    }

    public static void main(String[] args) {
        ClasesAnidadasEstaticas.InternaEstatica objInterno = new ClasesAnidadasEstaticas.InternaEstatica();
        objInterno.mostrarMensaje();
    }
}