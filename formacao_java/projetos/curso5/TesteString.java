package formacao_java.projetos.curso5;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Alura";
        // não funciona
        // nome.replace("A", "a");

        // devolve um boolean
        System.out.println(nome.contains("ura"));
        System.out.println(nome.contains("s"));

        // devolve um int
        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        // devolve uma string
        System.out.println(nome.substring(1, 4));

        // devolve um char
        System.out.println(nome.charAt(2));

        // devolve um int
        System.out.println(nome.indexOf("ra"));

        String vaziaComEspaco = " ";
        String vazia = vaziaComEspaco.trim();

        // devolve um boolean
        System.out.println(vaziaComEspaco.isEmpty());
        System.out.println(vazia.isEmpty());
        // com espaço == false, sem espaço == true

        String outro = nome.replace("A", "a");

        String outroNome = nome.toUpperCase();
        System.out.println(outroNome);

        System.out.println(nome);
        System.out.println(outro);
    }
}

