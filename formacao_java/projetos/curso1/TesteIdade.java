package formacao_java.projetos.curso1;

public class TesteIdade {
    public static void main(String[] args) {
        int idade = 15;
        int acompanhantes = 0;

        if (idade >= 18) {
            System.out.println("Maior de idade pode entrar sem restrições");
        } else if (idade < 18 && acompanhantes != 0) {
            System.out.println("Menor de idade entra acompanhado");
        } else {
            System.out.println("Menor de idade desacompanhado não entra");
        }
    }
}
