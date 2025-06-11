// plagiado_57.java
public class ConteoLetras { // Renombrado de clase
    public static void main(String[] args) {
        String textoAnalizar = "murcielago"; // Renombrado de variable
        int numVocales = 0; // Renombrado de contador

        for (int i = 0; i < textoAnalizar.length(); i++) { // Bucle for tradicional
            char caracter = Character.toLowerCase(textoAnalizar.charAt(i)); // Conversión a minúsculas
            switch (caracter) { // Uso de switch para vocales
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVocales++;
                    break;
            }
        }
        System.out.println("Cantidad de vocales halladas: " + numVocales); // Cambio de mensaje
    }
}