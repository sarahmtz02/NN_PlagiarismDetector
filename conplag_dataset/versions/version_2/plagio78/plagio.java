// plagiado_78.java
public class ElementoUnico { // Renombrado de clase
    public String valor; // Atributo público directo

    public ElementoUnico(String v) { // Renombrado de constructor y parámetro
        this.valor = v;
    }

    // No hay getter explícito, acceso directo
    public static void main(String[] args) {
        ElementoUnico elemento = new ElementoUnico("Contenido del elemento."); // Renombrado de instancia
        System.out.println("Valor del elemento: " + elemento.valor); // Acceso directo al atributo
    }
}