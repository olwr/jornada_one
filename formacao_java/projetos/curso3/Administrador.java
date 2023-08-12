package formacao_java.projetos.curso3;

public class Administrador extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Administrador(String nome) {
        super(nome);
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + super.getSalario() / 3;
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
