public class ConstruirCadenaConVariables {
    public static void main(String[] args) {
        String articulo = "mesa";
        double precio = 50.75;
        String descripcion = "El " + articulo + " cuesta " + precio + " euros.";
        System.out.println(descripcion);
    }
}