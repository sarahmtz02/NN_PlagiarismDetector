public class SwitchConDefault {
    public static void main(String[] args) {
        int nivel = 3;
        switch (nivel) {
            case 1:
                System.out.println("Básico");
                break;
            case 2:
                System.out.println("Intermedio");
                break;
            default:
                System.out.println("Avanzado u otro");
        }
    }
}