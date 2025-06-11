public class BucleInfinitoControlado {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("Contando: " + i);
            i++;
            if (i > 2) {
                break;
            }
        }
    }
}