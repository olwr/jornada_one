package formacao_java.br.com.bytebank.banco.teste;

import formacao_java.br.com.bytebank.banco.modelo.*;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(001, 23650);
        
        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());

        Conta conta2 = new ContaCorrente(-21, 0);
        conta2.deposita(150);
    }
}
