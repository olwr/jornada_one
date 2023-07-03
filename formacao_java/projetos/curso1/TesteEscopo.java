package formacao_java.projetos.curso1;

public class TesteEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int acompanhantes = 3;

        // boolean acompanhado = acompanhantes > 0;

        boolean acompanhado; // var temp não possui valor padrão
        // System.out.println(acompanhado); → não compila, a var não foi inicializada

        if (acompanhantes > 0) {
            acompanhado = true; // inicialidade em uma situação
        } else {
            acompanhado = false; // inicializadas para outras
        }

        System.out.println("valor de acompanhado = " + acompanhado); // como foi inicializada em um if, é obrigatório o else para que seja completa

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}

