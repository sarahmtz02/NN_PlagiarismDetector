// plagiado_24.java
public class Superclase { // Renombrado de clase
    public void presentarse() { // Renombrado de método
        System.out.println("Saludos desde la superclase.");
    }
}

public class Subclase extends Superclase { // Renombrado de clase y herencia
    public void decirAdios() { // Renombrado de método
        System.out.println("Hasta luego de la subclase.");
    }

    public static void main(String[] args) {
        Subclase objeto = new Subclase();
        objeto.presentarse();
        objeto.decirAdios();
    }
}