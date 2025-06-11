public class BucleInfinitoConBooleano {
    public static void main(String[] args) {
        boolean ejecutar = true;
        int counter = 0;
        while (ejecutar) {
            System.out.println("Ejecutando... " + counter);
            counter++;
            if (counter == 4) {
                ejecutar = false;
            }
        }
    }
}