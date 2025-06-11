// plagiado_11.java
public class DatosPersonales {
    private String nom; // Renombrado de atributo
    private int anios; // Renombrado de atributo

    public DatosPersonales(String n, int a) { // Renombrado de parámetros de constructor
        this.nom = n;
        this.anios = a;
    }

    public void imprimirDatos() { // Renombrado de método
        System.out.println("El nombre es: " + nom + ". Tiene " + anios + " años.");
    }

    public static void main(String[] args) {
        DatosPersonales sujeto = new DatosPersonales("Ana", 30);
        sujeto.imprimirDatos();
    }
}