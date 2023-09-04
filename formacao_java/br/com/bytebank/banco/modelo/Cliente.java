package formacao_java.br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Oliver
 * @version 0.1
 */

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
