// original_22.java
public class PuntosCoordenada {
    private int x;
    private int y;

    public PuntosCoordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimirCoordenadas() {
        System.out.println("Coordenadas: (" + this.x + ", " + this.y + ")");
    }

    public static void main(String[] args) {
        PuntosCoordenada p = new PuntosCoordenada(5, 10);
        p.imprimirCoordenadas();
    }
}