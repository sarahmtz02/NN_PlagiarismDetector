public class InteraccionConMiembros {
    String identificador = "Universo";

    public void emitirSaludo() {
        String prefijo = "Saludos, ";
        System.out.println(prefijo + this.identificador + "!");
    }

    public static void main(String[] args) {
        InteraccionConMiembros instancia = new InteraccionConMiembros();
        instancia.emitirSaludo();
    }
}