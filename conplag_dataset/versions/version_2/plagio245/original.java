public class ClaseConMetodoPublico {
    public void saludar() {
        System.out.println("Hola desde un método público.");
    }

    public static void main(String[] args) {
        ClaseConMetodoPublico obj = new ClaseConMetodoPublico();
        obj.saludar();
    }
}