// original_59.java
public class AlcanceVariables {
    int variableClase = 10; // Variable de instancia

    public void metodoEjemplo() {
        int variableLocal = 20; // Variable local
        System.out.println("Desde método - Clase: " + variableClase);
        System.out.println("Desde método - Local: " + variableLocal);
    }

    public static void main(String[] args) {
        int variableMain = 30; // Variable local de main
        AlcanceVariables obj = new AlcanceVariables();
        System.out.println("Desde main - Clase (a través de obj): " + obj.variableClase);
        System.out.println("Desde main - Local: " + variableMain);
        obj.metodoEjemplo();
    }
}