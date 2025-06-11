public class ClasesConHerenciaSimple {
    static class Animal {
        void comer() {
            System.out.println("Animal comiendo.");
        }
    }

    static class Perro extends Animal {
        void ladrar() {
            System.out.println("Perro ladrando.");
        }
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.comer();
        miPerro.ladrar();
    }
}