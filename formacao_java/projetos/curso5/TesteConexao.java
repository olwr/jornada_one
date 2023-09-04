package formacao_java.projetos.curso5;
// import formacao_java.projetos.curso5.Conexao.*;

public class TesteConexao {
    public static void main(String[] args) {
        
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Deu erro na conexão");
        }

        // Conexao con = null;
        // try {
        //     con = new Conexao();
        //     con.leDados();
        // } catch (Exception ex) {
        //     System.out.println("Deu erro na conexão");
        // } finally {
        //     con.fecha();
        // }
    }
}
