public class EjemploDeSubclase {
    static class Vehiculo {
        void mover() {
            System.out.println("Vehículo en movimiento.");
        }
    }

    static class Coche extends Vehiculo {
        void arrancar() {
            System.out.println("Coche arrancando.");
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.mover();
        miCoche.arrancar();
    }
}