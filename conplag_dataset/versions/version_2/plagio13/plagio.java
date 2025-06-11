// plagiado_13.java
public class ComprobarParidad {
    public static void main(String[] args) {
        int val = 7;
        String tipo;
        if (val % 2 != 0) { // Inversión de la condición
            tipo = "impar";
        } else {
            tipo = "par";
        }
        System.out.println("El número " + val + " es " + tipo + ".");
    }
}