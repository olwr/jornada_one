package formacao_java.projetos.curso6;

import java.util.ArrayList;

import formacao_java.br.com.bytebank.banco.modelo.Conta;
import formacao_java.br.com.bytebank.banco.modelo.ContaCorrente;
import formacao_java.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        
        ContaCorrente cc1 = new ContaCorrente(22, 33);
        lista.add(cc1);

        ContaPoupanca cp1 = new ContaPoupanca(22, 45);
        lista.add(cp1);

        System.out.println(lista);
        System.out.println(lista.size());
        
        Conta ref = lista.get(0);
        System.out.println(ref);

        ContaCorrente cc2 = new ContaCorrente(11, 230);
        lista.add(cc2);

        ContaPoupanca cp2 = new ContaPoupanca(11, 79);
        lista.add(cp2);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
