// plagiado_38.java
public class CalculadorAdicion { // Renombrado de clase
    public static void visualizarResultadoSuma(int primerNumero, int segundoNumero) { // Renombrado de método y parámetros
        int res = 0;
        res = primerNumero;
        res = res + segundoNumero; // Suma en dos pasos
        System.out.printf("El resultado de %d más %d es: %d%n", primerNumero, segundoNumero, res); // Uso de printf
    }

    public static void main(String[] args) {
        visualizarResultadoSuma(5, 3);
    }
}