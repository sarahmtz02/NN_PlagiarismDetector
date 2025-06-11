public class ControlDeNivel {
    public static void main(String[] args) {
        int grado = 3;
        String categoria;
        if (grado == 1) {
            categoria = "Nivel inicial";
        } else if (grado == 2) {
            categoria = "Nivel medio";
        } else {
            categoria = "Nivel superior o no definido";
        }
        System.out.println(categoria);
    }
}