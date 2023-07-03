package formacao_java.projetos.curso1;

public class TesteIdade2 {
    public static void main(String[] args) {
        int idade = 17;
        int acompanhantes = 2;
        boolean acompanhando = acompanhantes > 0;

        if (idade >=18 || acompanhando) {
            System.out.println("Entrada liberada");
        } else {
            System.out.println("Entrada negada");
        }
    }
}
