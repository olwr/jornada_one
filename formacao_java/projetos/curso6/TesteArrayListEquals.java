package formacao_java.projetos.curso6;

import java.util.ArrayList;

import formacao_java.br.com.bytebank.banco.modelo.Conta;
import formacao_java.br.com.bytebank.banco.modelo.ContaCorrente;
import formacao_java.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        
        ContaCorrente cc1 = new ContaCorrente(22, 33);
        lista.add(cc1);

        ContaCorrente cc2 = new ContaCorrente(22, 33);
        lista.add(cc2);
        
        ContaPoupanca cp1 = new ContaPoupanca(22, 45);
        lista.add(cp1);

        System.out.println(cc1.igualdade(cc2));
        System.out.println(cc1.igualdade(cp1));

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    } 
}