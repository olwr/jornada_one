package formacao_java.projetos.curso2;

public class TesteContaSemCliente {
    public static void main(String[] args) {
        Conta conta = new Conta(001, 2121);
        
        conta.deposita(15);
        // System.out.println(conta.saldo);
        System.out.println(conta.getSaldo());

        // conta.titular = new Cliente();
        conta.setTitular(new Cliente());

        // System.out.println(conta.titular);
        System.out.println(conta.getTitular());
        
        // conta.titular.nome = "Nome do Titular";
        conta.getTitular().setNome("Nome do Titular");

        // System.out.println(conta.titular.nome);
        System.out.println(conta.getTitular().getNome());
    }
    

}
