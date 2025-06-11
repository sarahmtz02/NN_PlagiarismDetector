public class PosicionDeSubcadena {
    public static void main(String[] args) {
        String textoCompleto = "xyzuvw abcdef";
        String sub = "abc";
        int pos = -1;
        for (int i = 0; i <= textoCompleto.length() - sub.length(); i++) {
            boolean coincide = true;
            for (int j = 0; j < sub.length(); j++) {
                if (textoCompleto.charAt(i + j) != sub.charAt(j)) {
                    coincide = false;
                    break;
                }
            }
            if (coincide) {
                pos = i;
                break;
            }
        }
        System.out.println("La subcadena se encuentra en el índice: " + pos);
    }
}