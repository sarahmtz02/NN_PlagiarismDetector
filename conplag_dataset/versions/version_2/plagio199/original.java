public class ClaseConConstructorConParametros {
    String marca;
    int año;

    public ClaseConConstructorConParametros(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }

    public static void main(String[] args) {
        ClaseConConstructorConParametros coche = new ClaseConConstructorConParametros("Toyota", 2020);
        coche.mostrarDetalles();
    }
}