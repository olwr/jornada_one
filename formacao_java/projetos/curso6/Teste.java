package formacao_java.projetos.curso6;

public class Teste {
    // Array
    public static void main(String[] args) {

        int[] idades = new int[5]; // inicializa com 0
        // int idades[] = new int[5]; // também funciona, mas não é preferível

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        /* 
        
        idades[0] = 17; // int idade1 = 17;
        idades[1] = 23; // int idade2 = 23;
        idades[2] = 47; // int idade3 = 47;
        idades[3] = 39; // int idade4 = 39;
        idades[4] = 64; // int idade5 = 64;
        
        System.out.println(idades[4]);
        System.out.println(idades.length);
        */
    }
}
