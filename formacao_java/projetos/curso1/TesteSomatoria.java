package formacao_java.projetos.curso1;

public class TesteSomatoria {
    public static void main(String[] args) {
        
        int contador = 0;
        int soma = 0;
    
        while (contador <= 10) {
            soma += contador;
            contador++;
            System.out.println(soma);
        }
    }
}
