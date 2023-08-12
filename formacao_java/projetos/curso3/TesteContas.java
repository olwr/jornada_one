package formacao_java.projetos.curso3;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(500.0);

        ContaPoupaca cp = new ContaPoupaca(222, 222);
        cp.deposita(350.0);

        cc.transfere(25.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
