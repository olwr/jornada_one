package formacao_java.projetos.curso3;

public class TestaSistema {
    public static void main(String[] args) {
        Autenticavel heitor = new Gerente("Heitor");
        heitor.setSenha(2222);

        Autenticavel theo = new Administrador("Theo");
        theo.setSenha(3213);

        Autenticavel lucia = new Cliente("Lucia");
        lucia.setSenha(2222);

        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(heitor);
        sistema.autentica(theo);
        sistema.autentica(lucia);
    }
}
