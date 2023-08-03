package formacao_java.projetos.curso2;

public class CriaConta {
    public static void main(String[] args) {
        // instanciação/construção 
        Conta primeiraConta = new Conta(001, 4567); // objeto/instância do tipo Conta 

        // primeiraConta.saldo = 200;
        primeiraConta.deposita(200);
        // System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.getSaldo());

        /* todo o atributo sem valor começa zerado/com valor default. o valor padrão pode ser alterado na classe e receber novo valor no objeto
        System.out.println(primeiraConta.agencia); → 0
        System.out.println(primeiraConta.numero); → 0
        System.out.println(primeiraConta.titular); → null
        */
        
        // primeiraConta.saldo += 300; 
        primeiraConta.deposita(300); 
        // System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(001, 2493); // referência para locação de memória do objeto

        // segundaConta.retornaSaldo() = 150;
        segundaConta.deposita(150);
        // System.out.println(segundaConta.saldo);
        System.out.println(segundaConta.getSaldo());

        // System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
        System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());
        // System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
        System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());
    }
}
