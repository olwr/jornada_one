package formacao_java.br.com.bytebank.banco.teste;

import formacao_java.br.com.bytebank.banco.modelo.*;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(500.0);

        ContaPoupaca cp = new ContaPoupaca(222, 222);
        cp.deposita(350.0);

        // cc.transfere(25.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
        
        System.out.println("CP: " + cp);
        System.out.println("CC: " + cc);
    }
}
