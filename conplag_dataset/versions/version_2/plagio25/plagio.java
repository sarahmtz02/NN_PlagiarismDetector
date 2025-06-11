// plagiado_25.java
public class GeometriaBasica { // Renombrado de clase contenedora
    interface FiguraGeometrica { // Renombrado de interfaz
        double obtenerSuperficie(); // Renombrado de método de interfaz
    }

    static class Esfera implements FiguraGeometrica { // Renombrado de clase e implementación
        private double r; // Renombrado de atributo

        public Esfera(double r) {
            this.r = r;
        }

        @Override
        public double obtenerSuperficie() { // Implementación renombrada
            return 3.1415926535 * r * r; // Uso de valor literal PI
        }
    }

    public static void main(String[] args) {
        Esfera s = new Esfera(5);
        System.out.println("Superficie de la esfera (aproximada): " + s.obtenerSuperficie()); // Mensaje modificado
    }
}