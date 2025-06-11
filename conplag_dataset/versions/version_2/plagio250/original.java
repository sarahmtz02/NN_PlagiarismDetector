import java.util.Objects;

public class ComparacionDeObjetos {
    static class Punto {
        int x, y;
        Punto(int x, int y) { this.x = x; this.y = y; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Punto punto = (Punto) o;
            return x == punto.x && y == punto.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(1, 2);
        System.out.println("¿Son iguales p1 y p2? " + p1.equals(p2));
    }
}