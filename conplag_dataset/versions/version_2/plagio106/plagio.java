public class UnionDeCadenas {
    public static void main(String[] args) {
        String segmentoA = "Saludo";
        String segmentoB = "Global";
        StringBuilder constructor = new StringBuilder();
        constructor.append(segmentoA).append(" ").append(segmentoB);
        String textoUnido = constructor.toString();
        System.out.println("Unido: " + textoUnido);
    }
}