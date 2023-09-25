package formacao_java.projetos.curso6;

import formacao_java.br.com.bytebank.banco.modelo.Cliente;
import formacao_java.br.com.bytebank.banco.modelo.Conta;
import formacao_java.br.com.bytebank.banco.modelo.ContaCorrente;
import formacao_java.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        // Conta[] contas = new Conta[5];
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(21, 120);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(21, 121);
        referencias[1] = cc2;
        
        Cliente cc3 = new Cliente("Alberto");
        referencias[2] = cc3;
        
        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // cast

        System.out.println(((Conta) referencias[0]).getNumero());
        System.out.println(((Conta) referencias[1]).getNumero());
        System.out.println(ref.getNumero());
        // System.out.println(contas[2].getNumero()); // exception NullPointerException
        // System.out.println(cc2.getNumero()); // 121
    }
}
