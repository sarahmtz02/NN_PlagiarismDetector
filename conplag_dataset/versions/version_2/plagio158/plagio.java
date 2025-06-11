public class IteracionAnidadaDoble {
    public static void main(String[] args) {
        int contadorExterior = 0;
        while (contadorExterior < 2) {
            int contadorInterior = 0;
            while (contadorInterior < 2) {
                System.out.println("Exterior: " + contadorExterior + ", Interior: " + contadorInterior);
                contadorInterior++;
            }
            contadorExterior++;
        }
    }
}