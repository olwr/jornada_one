package formacao_java.projetos.curso3;

public class TesteReferencias {
    public static void main(String[] args) {
        // funciona
        // Funcionario g1 = new Gerente("Alberto");
        Gerente g1 = new Gerente("Alberto");
        g1.setSalario(5000.0);

        Funcionario f = new Designer("Jorge");
        f.setSalario(2000.0);

        Editor e = new Editor("Marcos");
        e.setSalario(2500.0);

        ControlaBonificacao controle = new ControlaBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(e);

        System.out.println(controle.getSoma());

        // não funciona
        // Gerente g1 = new Funcionario("Alberto");
        // g1.autentica(2222)
    }

}
