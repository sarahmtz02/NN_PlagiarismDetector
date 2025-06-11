// original_47.java
public class LanzarExcepcionPersonalizada {
    static class MiExcepcion extends Exception {
        public MiExcepcion(String mensaje) {
            super(mensaje);
        }
    }

    public static void verificarEdad(int edad) throws MiExcepcion {
        if (edad < 18) {
            throw new MiExcepcion("Acceso denegado: Menor de edad.");
        } else {
            System.out.println("Acceso concedido.");
        }
    }

    public static void main(String[] args) {
        try {
            verificarEdad(16);
        } catch (MiExcepcion e) {
            System.err.println("Capturada excepción: " + e.getMessage());
        }
    }
}