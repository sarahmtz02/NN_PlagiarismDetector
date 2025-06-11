// plagiado_59.java
public class AmbitoDeVariables { // Renombrado de clase
    int miembroDeClase = 10; // Renombrado de variable de instancia

    public void funcionMuestra() { // Renombrado de método
        int variableDeFuncion = 20; // Renombrado de variable local
        System.out.println("En función - Objeto: " + this.miembroDeClase); // Uso de 'this' explícito
        System.out.println("En función - Propia: " + variableDeFuncion);
    }

    public static void main(String[] args) {
        int variablePrincipal = 30; // Renombrado de variable local
        AmbitoDeVariables instancia = new AmbitoDeVariables();
        System.out.println("En principal - Instancia (directo): " + instancia.miembroDeClase); // Acceso a través de instancia
        System.out.println("En principal - Propia: " + variablePrincipal);
        instancia.funcionMuestra();
    }
}