package formacao_java.br.com.bytebank.banco.modelo;

public abstract interface Autenticavel {

    // private int senha = 2222;

    public abstract boolean autentica(int senha); 
    // {
    //     if (this.senha == senha) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public int getSenha() {
    //     return this.senha;
    // }

    public abstract void setSenha(int senha);
    // {
    //     this.senha = senha;
    // }
}
