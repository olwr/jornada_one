package formacao_java.projetos.curso2;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaniel = new Conta(001, 7119);
        
        // contaDaniel.saldo = 100;
        contaDaniel.deposita(50);
        System.out.println(contaDaniel.getSaldo());
        
        if (contaDaniel.saca(75)) {
            System.out.println("Saque autorizado.");
            System.out.println("Seu saldo é: " + contaDaniel.getSaldo());
        }
        
        if (contaDaniel.saca(700) == false) {
            System.out.println("Saque negado, saldo insuficiente.");
            System.out.println("Seu saldo é: " + contaDaniel.getSaldo());
        }

        Conta contaOliver = new Conta(001, 8117);
        
        contaOliver.deposita(1500);
        System.out.println(contaOliver.getSaldo());
        
        if (contaOliver.transfere(1000, contaDaniel)) {
            System.out.println("Transferência bem-sucedida.");
            System.out.println("Seu saldo restante é: " + contaOliver.getSaldo());
        } else {
            System.out.println("Transferência negada, saldo insuficiente: " + contaOliver.getSaldo());
        }

        System.out.println(contaDaniel.getSaldo());


    }
    

}
