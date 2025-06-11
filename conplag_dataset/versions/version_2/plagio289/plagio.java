public class ImplementacionDeMetodoBase {
    static abstract class TareaGenerica {
        abstract void realizar();
    }

    static class TareaEspecifica extends TareaGenerica {
        @Override
        void realizar() {
            System.out.println("Realizando una tarea específica.");
        }
    }

    public static void main(String[] args) {
        TareaGenerica miTarea = new TareaEspecifica();
        miTarea.realizar();
    }
}