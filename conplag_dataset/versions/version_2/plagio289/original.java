public class ClaseAbstractaSimple {
    static abstract class Figura {
        abstract void dibujar();
    }

    static class Cuadrado extends Figura {
        @Override
        void dibujar() {
            System.out.println("Dibujando un cuadrado.");
        }
    }

    public static void main(String[] args) {
        Figura miFigura = new Cuadrado();
        miFigura.dibujar();
    }
}