import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class ConvertirStringABytes {
    public static void main(String[] args) {
        String texto = "Mundo";
        byte[] bytes = texto.getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        
        StringBuilder sb = new StringBuilder();
        while (buffer.hasRemaining()) {
            sb.append((char) buffer.get());
        }
        System.out.println("Texto a partir de bytes: " + sb.toString());
    }
}