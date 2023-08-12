package formacao_java.projetos.curso3;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente carlos = new Gerente("Carlos");

        carlos.setSalario(5500);
        carlos.setSenha(33333);

        System.out.println("A bonificação de " + carlos.getNome() + " é: " + carlos.getBonificacao());

        boolean autentica = carlos.autentica(33333);
        System.out.println(autentica);

    }
}
