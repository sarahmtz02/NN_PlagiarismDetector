// plagiado_22.java
public class Ubicacion2D { // Renombrado de clase
    private int coordenadaX; // Renombrado de atributo
    private int coordenadaY; // Renombrado de atributo

    public Ubicacion2D(int valX, int valY) { // Renombrado de parámetros
        this.coordenadaX = valX;
        this.coordenadaY = valY;
    }

    public void mostrarPosicion() { // Renombrado de método
        System.out.println("Posición (X, Y): [" + coordenadaX + ", " + coordenadaY + "]"); // Cambio de formato de salida
    }

    public static void main(String[] args) {
        Ubicacion2D pos = new Ubicacion2D(5, 10);
        pos.mostrarPosicion();
    }
}