// plagiado_44.java
public class MultiplesOperaciones { // Renombrado de clase
    public int calcular(int x, int y) { // Renombrado de método y parámetros
        return x + y;
    }

    public double calcular(double x, double y) { // Renombrado de método y parámetros
        return x * y;
    }

    public static void main(String[] args) {
        MultiplesOperaciones instancia = new MultiplesOperaciones();
        System.out.println("Resultado entero: " + instancia.calcular(10, 5)); // Cambio de mensaje
        System.out.println("Resultado decimal: " + instancia.calcular(10.0, 5.0)); // Cambio de mensaje
    }
}