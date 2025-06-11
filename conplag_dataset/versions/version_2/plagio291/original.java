public class OperadorAsignacionAndBitwise {
    public static void main(String[] args) {
        int a = 6; // 110 en binario
        a &= 3;    // 011 en binario. Resultado 010 (2)
        System.out.println("Resultado de AND bit a bit: " + a);
    }
}