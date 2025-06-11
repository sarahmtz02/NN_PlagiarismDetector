// plagiado_50.java
public class ObjetoPersona { // Renombrado de clase
    private String nomb; // Renombrado de atributo
    private int anios; // Renombrado de atributo

    public String obtenerNombre() { // Renombrado de getter
        return nomb;
    }

    public void asignarNombre(String n) { // Renombrado de setter y parámetro
        this.nomb = n;
    }

    public int obtenerAnios() { // Renombrado de getter
        return anios;
    }

    public void establecerAnios(int a) { // Renombrado de setter y parámetro, validación diferente
        if (a >= 0) { // Validacion diferente
            this.anios = a;
        } else {
            this.anios = 0; // Asignar valor por defecto
        }
    }

    public static void main(String[] args) {
        ObjetoPersona individuo = new ObjetoPersona();
        individuo.asignarNombre("María");
        individuo.establecerAnios(30);
        System.out.println("Datos del individuo: " + individuo.obtenerNombre() + " (" + individuo.obtenerAnios() + " años)"); // Cambio de mensaje
    }
}