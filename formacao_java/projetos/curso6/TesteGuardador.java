package formacao_java.projetos.curso6;

import formacao_java.br.com.bytebank.banco.modelo.Conta;
import formacao_java.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteGuardador {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(001, 12);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(001, 13);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref);

        System.out.println(guardador.getReferencia(1));
    }
}
