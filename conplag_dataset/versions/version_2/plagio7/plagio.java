// plagiado_7.java
public class RevertirTexto {
    public static void main(String[] args) {
        String texto = "Hola";
        StringBuilder sb = new StringBuilder(texto);
        String alReves = sb.reverse().toString(); // Uso de StringBuilder
        System.out.println("Texto de entrada: " + texto);
        System.out.println("Texto al revés: " + alReves);
    }
}