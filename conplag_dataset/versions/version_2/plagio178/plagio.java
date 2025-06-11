public class ContenedorClaseInterna {
    public static class SubclaseEstatica {
        public void desplegarInfo() {
            System.out.println("Información de la subclase estática.");
        }
    }

    public static void main(String[] args) {
        SubclaseEstatica instancia = new SubclaseEstatica();
        instancia.desplegarInfo();
    }
}