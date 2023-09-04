package formacao_java.br.com.bytebank.banco.teste;

import formacao_java.br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(125, 0567);
        cc.deposita(1320);

        SeguroDeVida seg = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(seg);
        calc.registra(cc);

        System.out.println(calc.getTotalImposto());
    }
}
