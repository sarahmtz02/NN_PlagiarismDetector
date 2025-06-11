// plagiado_46.java
public class TransporteMotorizado { // Renombrado de clase contenedora
    public static abstract class MedioDeTransporte { // Renombrado de clase abstracta
        public abstract void moverse(); // Renombrado de método abstracto
        public void detenerse() { // Renombrado de método concreto
            System.out.println("El medio de transporte se detiene."); // Cambio de mensaje
        }
    }

    public static class Moto extends MedioDeTransporte { // Renombrado de clase concreta
        @Override
        public void moverse() { // Implementación de método abstracto renombrado
            System.out.println("La moto avanza."); // Cambio de mensaje
        }
    }

    public static void main(String[] args) {
        Moto miMoto = new Moto();
        miMoto.moverse();
        miMoto.detenerse();
    }
}