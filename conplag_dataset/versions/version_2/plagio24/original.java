// original_24.java
public class ClasePadre {
    public void saludar() {
        System.out.println("Hola desde la clase padre.");
    }
}

public class ClaseHija extends ClasePadre {
    public void despedir() {
        System.out.println("Adiós desde la clase hija.");
    }

    public static void main(String[] args) {
        ClaseHija obj = new ClaseHija();
        obj.saludar();
        obj.despedir();
    }
}