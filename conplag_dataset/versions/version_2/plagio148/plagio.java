public class SumarObjetosEnteros {
    public static void main(String[] args) {
        Integer valA = Integer.valueOf(10);
        Integer valB = Integer.valueOf(20);
        int total = valA.intValue() + valB.intValue(); // Unboxing explícito
        System.out.println("Total de valores Integer: " + total);
    }
}