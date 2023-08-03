package formacao_java.projetos.curso2;

public class TesteReferencias {
    public static void main(String[] args) {
        // referência para novaConta do tipo Conta
        Conta novaConta = new Conta(001, 1324);

        // novaConta.saldo = 300;
        novaConta.deposita(300);;
        System.out.println("O saldo da nova conta é: " + novaConta.getSaldo());
        
        // referência para a mesma novaConta do tipo Conta
        Conta segundaConta = novaConta;
        System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());
        
        // segundaConta.saldo += 100;
        segundaConta.deposita(100);
        System.out.println("O saldo da nova conta é: " + novaConta.getSaldo());
        System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());

        // referência para uma conta diferente do tipo Conta
        Conta terceiraConta = new Conta(001, 4321);

        // terceiraConta.saldo = 750;
        terceiraConta.deposita(750);
        System.out.println("O saldo da terceira conta é: " + terceiraConta.getSaldo());
        
        // terceiraConta.saldo += 75;
        terceiraConta.deposita(75);
        System.out.println("O saldo da terceira conta é: " + terceiraConta.getSaldo());

        if (novaConta == segundaConta) {
            System.out.println("novaConta e segundaConta são a mesma conta!");
            System.out.println("conta1: " + novaConta + " " + "conta2: " + segundaConta);
        }
        
        if (novaConta != terceiraConta && segundaConta != terceiraConta) {
            System.out.println("novaConta e segundaConta são contas diferentes da terceiraConta!");
            System.out.println(terceiraConta);
        }
    }
}
