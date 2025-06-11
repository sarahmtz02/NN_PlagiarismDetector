public class StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Inicio");
        sb.append(" - ").append("Fin");
        System.out.println(sb.toString());
    }
}