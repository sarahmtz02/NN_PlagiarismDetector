public class ValidarIgualdadDeDatos {
    static class Coordenada {
        int cX, cY;
        Coordenada(int cX, int cY) { this.cX = cX; this.cY = cY; }

        public boolean sonIguales(Coordenada otra) {
            if (otra == null) return false;
            return this.cX == otra.cX && this.cY == otra.cY;
        }
    }

    public static void main(String[] args) {
        Coordenada coord1 = new Coordenada(1, 2);
        Coordenada coord2 = new Coordenada(1, 2);
        System.out.println("¿Coordenadas idénticas? " + coord1.sonIguales(coord2));
    }
}