// plagiado_39.java
public class OperacionesBasicas { // Renombrado de clase
    public int adicionar(int num1, int num2) { // Renombrado de método y parámetros
        return num1 + num2;
    }

    public int substraer(int num1, int num2) { // Renombrado de método y parámetros
        return num1 - num2;
    }

    public static void main(String[] args) {
        OperacionesBasicas ops = new OperacionesBasicas();
        System.out.println("Resultado de adición: " + ops.adicionar(10, 5)); // Mensaje modificado
        System.out.println("Resultado de substracción: " + ops.substraer(10, 5)); // Mensaje modificado
    }
}