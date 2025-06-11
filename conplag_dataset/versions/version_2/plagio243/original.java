public class BucleWhileConCondicionCompuesta {
    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        while (x < 3 && y > 2) {
            System.out.println("x: " + x + ", y: " + y);
            x++;
            y--;
        }
    }
}