// plagiado_26.java
public class DiversidadSonora { // Renombrado de clase contenedora
    static class SerVivo { // Renombrado de clase base
        public void emitirRuido() { // Renombrado de método base
            System.out.println("Un ser vivo produce un ruido.");
        }
    }

    static class Canino extends SerVivo { // Renombrado de clase y herencia
        @Override
        public void emitirRuido() { // Método sobrescrito renombrado
            System.out.println("El canino aúlla."); // Cambio de sonido
        }
    }

    static class Felino extends SerVivo { // Renombrado de clase y herencia
        @Override
        public void emitirRuido() { // Método sobrescrito renombrado
            System.out.println("El felino ronronea."); // Cambio de sonido
        }
    }

    public static void main(String[] args) {
        SerVivo can = new Canino();
        SerVivo fel = new Felino();

        can.emitirRuido();
        fel.emitirRuido();
    }
}