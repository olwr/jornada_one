package bytebank_herdado_conta;

public class Cliente implements Autenticavel {

    private String nome;
    private Autenticador autenticador;

    public String getNome() {
        return this.nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.autenticador = new Autenticador();
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
