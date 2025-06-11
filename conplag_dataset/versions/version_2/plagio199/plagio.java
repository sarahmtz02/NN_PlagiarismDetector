public class ObjetoConParametrosIniciales {
    String modelo;
    int anioFabricacion;

    public ObjetoConParametrosIniciales(String m, int aF) {
        modelo = m;
        anioFabricacion = aF;
    }

    public void imprimirDatos() {
        System.out.println("Modelo: " + modelo + ", Año de Fab.: " + anioFabricacion);
    }

    public static void main(String[] args) {
        ObjetoConParametrosIniciales producto = new ObjetoConParametrosIniciales("Laptop", 2023);
        producto.imprimirDatos();
    }
}