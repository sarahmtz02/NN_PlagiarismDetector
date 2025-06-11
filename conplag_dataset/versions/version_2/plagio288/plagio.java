public class ExtraerParteDeCadena {
    public static void main(String[] args) {
        String palabra = "desarrollo";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) { // Extraer los primeros 4 caracteres
            sb.append(palabra.charAt(i));
        }
        System.out.println("Fragmento: " + sb.toString());
    }
}