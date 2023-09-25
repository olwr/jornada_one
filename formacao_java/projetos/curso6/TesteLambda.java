package formacao_java.projetos.curso6;

import java.util.ArrayList;
import java.util.List;

import formacao_java.br.com.bytebank.banco.modelo.Cliente;
import formacao_java.br.com.bytebank.banco.modelo.Conta;
import formacao_java.br.com.bytebank.banco.modelo.ContaCorrente;
import formacao_java.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambda {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(33.0);

        Conta cp1 = new ContaPoupanca(22, 44);
        Cliente clienteCP1 = new Cliente("Guilherme");
        cp1.setTitular(clienteCP1);
        cp1.deposita(444.0);

        Conta cc2 = new ContaCorrente(22, 11);
        Cliente clienteCC2 = new Cliente("Paulo");
        cc2.setTitular(clienteCC2);
        cc2.deposita(1151.0);

        Conta cp2 = new ContaPoupanca(22, 22);
        Cliente clienteCP2 = new Cliente("Ana");
        cp2.setTitular(clienteCP2);
        cp2.deposita(223.0);

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cp1);
        lista.add(cc2);
        lista.add(cp2);

        // lista.sort( (Conta c1, Conta c2) -> { // expressão lambda
        // return Integer.compare(c1.getNumero(), c2.getNumero());
        // }
        // );

        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        lista.forEach( (conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

    }
}
