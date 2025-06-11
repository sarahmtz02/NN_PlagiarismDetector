public class GeometriaAbstracta {
    public static abstract class Forma {
        public abstract double obtenerSuperficie();
        public void imprimirInfo() {
            System.out.println("Soy una forma geométrica.");
        }
    }

    public static class Cuadrado extends Forma {
        private double lado;
        public Cuadrado(double lado) {
            this.lado = lado;
        }
        @Override
        public double obtenerSuperficie() {
            return lado * lado;
        }
    }

    public static void main(String[] args) {
        Cuadrado miCuadrado = new Cuadrado(4.0);
        System.out.println("Superficie del cuadrado: " + miCuadrado.obtenerSuperficie());
        miCuadrado.imprimirInfo();
    }
}