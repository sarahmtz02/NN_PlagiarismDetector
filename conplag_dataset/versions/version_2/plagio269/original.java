public class InterfazSimple {
    interface Dibujable {
        void dibujar();
    }

    static class Circulo implements Dibujable {
        @Override
        public void dibujar() {
            System.out.println("Dibujando un círculo.");
        }
    }

    public static void main(String[] args) {
        Dibujable forma = new Circulo();
        forma.dibujar();
    }
}