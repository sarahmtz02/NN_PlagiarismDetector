// original_25.java
public class InterfazForma {
    interface Forma {
        double calcularArea();
    }

    static class Circulo implements Forma {
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
        Circulo c = new Circulo(5);
        System.out.println("Área del círculo: " + c.calcularArea());
    }
}