public class ObjetoConInicializacionImplicita {
    String textoInterno;

    public ObjetoConInicializacionImplicita() {
        this.textoInterno = "Inicializado sin argumentos.";
    }

    public static void main(String[] args) {
        ObjetoConInicializacionImplicita inst = new ObjetoConInicializacionImplicita();
        System.out.println(inst.textoInterno);
    }
}