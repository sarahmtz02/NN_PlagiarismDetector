public class FuncionConUnArgumento {
    public void manipular(String texto) {
        String textoModificado = "Manipulado: " + texto;
        System.out.println(textoModificado);
    }

    public static void main(String[] args) {
        FuncionConUnArgumento inst = new FuncionConUnArgumento();
        inst.manipular("Argumento de prueba");
    }
}