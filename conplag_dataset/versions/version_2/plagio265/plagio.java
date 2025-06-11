public class ObjetoConEncapsulamiento {
    private String descripcion;
    private double precio;

    public ObjetoConEncapsulamiento(String desc, double pr) {
        this.descripcion = desc;
        this.precio = pr;
    }

    public String leerDescripcion() {
        return descripcion;
    }

    public double leerPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        ObjetoConEncapsulamiento producto = new ObjetoConEncapsulamiento("Libro", 19.99);
        System.out.println("Detalles: " + producto.leerDescripcion() + ", Costo: " + producto.leerPrecio());
    }
}