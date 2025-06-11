// original_14.java
public class SwitchSimple {
    public static void main(String[] args) {
        int opcion = 2;
        switch (opcion) {
            case 1:
                System.out.println("Opción seleccionada: Uno");
                break;
            case 2:
                System.out.println("Opción seleccionada: Dos");
                break;
            case 3:
                System.out.println("Opción seleccionada: Tres");
                break;
            default:
                System.out.println("Opción no reconocida.");
        }
    }
}