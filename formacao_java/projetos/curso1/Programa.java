package formacao_java.projetos.curso1;

class Programa {

    public static void main(String[] args) {

        // System.out.println("hello word");
        int idade = 21;
        System.out.println("minha idade é: " + idade);

        double salario = 1320.70;
        System.out.println("meu salário é: " + salario);

        double divisao = 5 / 2;
        System.out.println(divisao);

        divisao = 5.0 / 2;
        System.out.println(divisao);

        char caractere = 66;
        System.out.println(caractere);
        caractere = (char) (caractere + 1);
        System.out.println(caractere);

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}