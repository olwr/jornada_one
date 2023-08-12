package formacao_java.projetos.curso3;

public class TestaFuncionario {
    public static void main(String[] args) {
        // Funcionario nico = new Funcionario("Nico");
        Funcionario nico = new Gerente("Nico");
        nico.setSalario(2600.0);

        System.out.println(nico.getSalario());
        System.out.println("A bonificação de " + nico.getNome() + " é: " + nico.getBonificacao());
    }
}
