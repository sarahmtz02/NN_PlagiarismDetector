public class ObjetoConInformacionReservada {
    private String infoReservada = "Datos confidenciales.";

    private String obtenerInfo() {
        return infoReservada;
    }

    public static void main(String[] args) {
        // En este ejemplo tampoco se accede directamente desde main,
        // replicando el comportamiento del original de no exponer el método privado.
    }
}