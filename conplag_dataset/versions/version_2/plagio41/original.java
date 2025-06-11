// original_41.java
public class ConcatenacionStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cadena");
        sb.append(" de");
        sb.append(" texto");
        sb.append(".");
        String resultado = sb.toString();
        System.out.println("Resultado: " + resultado);
    }
}