package formacao_java.projetos.curso1;

public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int n = 1; n <= 10; n++) {
            System.out.println("Fatorial antes = " + fatorial);
            // fatorial = fatorialN * fatorial(=1) * N
            fatorial *= n;
            
            System.out.println("Fatorial de " + n + " = " + fatorial);
            System.out.println();
        }
    }
}
