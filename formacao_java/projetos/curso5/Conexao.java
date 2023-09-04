package formacao_java.projetos.curso5;

public class Conexao implements AutoCloseable {
    public Conexao() {
        System.out.println("Abrindo conexão");
        throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
    }

    // public void fecha() {
    //     System.out.println("Fechando conexão");
    // }
    
    @Override
    public void close() throws Exception {
        System.out.println("Fechando conexão");
    }
}
