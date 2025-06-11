public class FabricaDeInstancias {
    static class Usuario {
        String alias;
        Usuario(String alias) { this.alias = alias; }
    }

    public static Usuario generarUsuario(String identificador) {
        Usuario nuevoUsuario = new Usuario(identificador);
        return nuevoUsuario;
    }

    public static void main(String[] args) {
        Usuario u = generarUsuario("Ana");
        System.out.println("Usuario generado: " + u.alias);
    }
}