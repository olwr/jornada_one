package formacao_java.projetos.curso2;

public class TesteGetESet {
    public static void main(String[] args) {
        // Conta conta = new Conta();
        Conta conta = new Conta(2109, 1317);
        
        // conta.numero = 1317;
        // conta.setNumero(1317);
        System.out.println(conta.getNumero());

        Cliente oliver = new Cliente();

        oliver.setNome("Oliver Q.");

        conta.setTitular(oliver);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("green arrow");
    }
}
