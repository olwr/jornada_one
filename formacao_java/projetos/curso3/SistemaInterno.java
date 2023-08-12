package formacao_java.projetos.curso3;

public class SistemaInterno {
    
    private int senha = 2222;

    public void autentica(Autenticavel pessoalAutorizado) {
        boolean acesso = pessoalAutorizado.autentica(this.senha);
        if (acesso) {
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
