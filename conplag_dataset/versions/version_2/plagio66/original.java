// original_66.java
public class UsoDeFinal {
    public static final int CONSTANTE_VALOR = 10;
    public final String MENSAJE_FINAL;

    public UsoDeFinal() {
        MENSAJE_FINAL = "Mensaje único";
    }

    public static void main(String[] args) {
        UsoDeFinal obj = new UsoDeFinal();
        System.out.println("Valor constante: " + CONSTANTE_VALOR);
        System.out.println("Mensaje: " + obj.MENSAJE_FINAL);
    }
}