public class ClaseConAtributosEstaticos {
    public static int contador = 0;

    public ClaseConAtributosEstaticos() {
        contador++;
    }

    public static void main(String[] args) {
        ClaseConAtributosEstaticos obj1 = new ClaseConAtributosEstaticos();
        ClaseConAtributosEstaticos obj2 = new ClaseConAtributosEstaticos();
        System.out.println("Objetos creados: " + ClaseConAtributosEstaticos.contador);
    }
}