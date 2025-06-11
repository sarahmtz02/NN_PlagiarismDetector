// plagiado_47.java
public class ManejoDeAlertaPersonalizada { // Renombrado de clase contenedora
    static class AlertaInvalida extends RuntimeException { // Renombrado de excepción y cambio a RuntimeException
        public AlertaInvalida(String info) { // Renombrado de constructor y parámetro
            super(info);
        }
    }

    public static void validarAcceso(int antiguedad) { // Renombrado de método y parámetro
        if (antiguedad < 18) {
            throw new AlertaInvalida("Error de validación: Edad insuficiente."); // Nueva excepción y mensaje
        } else {
            System.out.println("Validación exitosa.");
        }
    }

    public static void main(String[] args) {
        try {
            validarAcceso(16);
        } catch (AlertaInvalida aie) { // Captura de la nueva excepción
            System.err.println("Problema detectado: " + aie.getLocalizedMessage()); // Mensaje de error modificado
        }
    }
}