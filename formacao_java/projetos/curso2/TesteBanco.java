package formacao_java.projetos.curso2;

public class TesteBanco {
    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        
        // daniel.nome = "Daniel B.";
        daniel.setNome("Daniel B.");

        // daniel.cpf = "777.333.555.99";
        daniel.setCpf("777.333.555.99");

        // daniel.profissao = "programador";
        daniel.setProfissao("programador");

        Conta contaDaniel = new Conta(2501, 8100);
        // associação, composição de objeto
        // contaDaniel.titular = daniel;
        contaDaniel.setTitular(daniel);

        contaDaniel.deposita(1320);
        
        System.out.println(contaDaniel.getTitular().getNome());
        System.out.println(contaDaniel.getTitular());
    }

}
