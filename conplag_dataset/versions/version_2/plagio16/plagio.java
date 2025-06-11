// plagiado_16.java
public class SaludoPersonalizado {
    public static void emitirSaludo(String usuario) { // Renombrado de método y parámetro
        System.out.println("Qué tal, " + usuario + "."); // Cambio de mensaje
    }

    public static void main(String[] args) {
        emitirSaludo("Visitante");
    }
}