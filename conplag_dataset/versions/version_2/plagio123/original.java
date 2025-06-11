public class BucleInfinitoPersonalizado {
    public static void main(String[] args) {
        boolean seguir = true;
        int i = 0;
        while (seguir) {
            System.out.println("Contando: " + i);
            if (i == 3) {
                seguir = false;
            }
            i++;
        }
    }
}