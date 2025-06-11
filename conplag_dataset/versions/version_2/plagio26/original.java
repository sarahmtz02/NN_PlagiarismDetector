// original_26.java
public class PolimorfismoAnimal {
    static class Animal {
        public void hacerSonido() {
            System.out.println("El animal hace un sonido.");
        }
    }

    static class Perro extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El perro ladra.");
        }
    }

    static class Gato extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El gato maulla.");
        }
    }

    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido();
        miGato.hacerSonido();
    }
}