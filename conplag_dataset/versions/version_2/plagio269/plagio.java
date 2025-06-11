public class ImplementacionDeContrato {
    interface Ejecutable {
        void ejecutar();
    }

    static class Tarea implements Ejecutable {
        @Override
        public void ejecutar() {
            System.out.println("Ejecutando la tarea.");
        }
    }

    public static void main(String[] args) {
        Ejecutable proceso = new Tarea();
        proceso.ejecutar();
    }
}