public class ObjetoConAccionExterna {
    public void ejecutarAccion() {
        System.out.println("Acción realizada por un método accesible.");
    }

    public static void main(String[] args) {
        ObjetoConAccionExterna instancia = new ObjetoConAccionExterna();
        instancia.ejecutarAccion();
    }
}