// original_46.java
public class ClaseAbstractaVehiculo {
    public static abstract class Vehiculo {
        public abstract void acelerar();
        public void frenar() {
            System.out.println("El vehículo está frenando.");
        }
    }

    public static class Coche extends Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("El coche acelera.");
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.acelerar();
        miCoche.frenar();
    }
}