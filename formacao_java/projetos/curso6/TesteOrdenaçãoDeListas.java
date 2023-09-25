package formacao_java.projetos.curso6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import formacao_java.br.com.bytebank.banco.modelo.Cliente;
import formacao_java.br.com.bytebank.banco.modelo.ComparadorNumeroDeContas;
import formacao_java.br.com.bytebank.banco.modelo.ComparadorTitularDeContas;
import formacao_java.br.com.bytebank.banco.modelo.Conta;
import formacao_java.br.com.bytebank.banco.modelo.ContaCorrente;
import formacao_java.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenaçãoDeListas {
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

        for (Conta conta : lista) {
            System.out.println(conta + " Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
        }

        System.out.println();
        System.out.println("----------Ordenado--Por--Números----------");
        System.out.println();

        // ComparadorNumeroDeContas comparadorNumeros = new ComparadorNumeroDeContas();
        lista.sort(new ComparadorNumeroDeContas());
        for (Conta conta : lista) {
            System.out.println(conta + " Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
        }

        System.out.println();
        System.out.println("----------Ordenado--Por--Titulares----------");
        System.out.println();

        // ComparadorTitularDeContas comparadorTitulares = new
        // ComparadorTitularDeContas();
        lista.sort(new ComparadorTitularDeContas());
        for (Conta conta : lista) {
            System.out.println(conta + " Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
        }

        System.out.println();
        System.out.println("----------Ordenado--Pelo--Collections--Reverse--------");
        System.out.println();

        Collections.reverse(lista);
        for (Conta conta : lista) {
            System.out.println(conta + " Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
        }

        System.out.println();
        System.out.println("----------Ordenado--Pelo--Collections--Sort--Natural------");
        System.out.println();

        Collections.sort(lista); // usando lista.sort(null) dá o mesmo retorno
        for (Conta conta : lista) {
            System.out.println(conta + " Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
        }
    }
}
