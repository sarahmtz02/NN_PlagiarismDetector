public class ClaseAbstractaSimple {
    public static abstract class Figura {
        public abstract double calcularArea();
        public void mostrarMensaje() {
            System.out.println("Soy una figura.");
        }
    }

    public static class Circulo extends Figura {
        private double radio;
        public Circulo(double radio) {
            this.radio = radio;
        }
        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5.0);
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        miCirculo.mostrarMensaje();
    }
}