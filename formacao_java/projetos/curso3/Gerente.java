package formacao_java.projetos.curso3;

public class Gerente extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Gerente(String nome) {
        super(nome);
        this.autenticador = new Autenticador();
    }

    public double getBonificacao() {
        System.out.println("Chamando a bonificação do GERENTE");
        // return super.getBonificacao() + super.getSalario();
        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
