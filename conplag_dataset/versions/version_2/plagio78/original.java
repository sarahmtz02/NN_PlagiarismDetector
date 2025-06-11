// original_78.java
public class ClaseConGetters {
    private String item;

    public ClaseConGetters(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public static void main(String[] args) {
        ClaseConGetters obj = new ClaseConGetters("Objeto de prueba");
        System.out.println("Item: " + obj.getItem());
    }
}