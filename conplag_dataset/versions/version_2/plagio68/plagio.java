// plagiado_68.java
public class AnidacionEstatica { // Renombrado de clase contenedora
    static class ClaseAnidada { // Renombrado de clase interna estática
        void imprimirInfo() { // Renombrado de método
            System.out.println("Información desde la clase anidada estática."); // Cambio de mensaje
        }
    }

    public static void main(String[] args) {
        AnidacionEstatica.ClaseAnidada miObjetoAnidado = new AnidacionEstatica.ClaseAnidada(); // Renombrado de objeto
        miObjetoAnidado.imprimirInfo();
    }
}