package formacao_java.projetos.curso1;

public class TesteIR2 {
    public static void main(String[] args) {
        
        double salario = 3300.20;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7.5%");
            System.out.println("Você pode deduzir até R$ 142");
        } else if (salario >= 2800.1 && salario <= 3751.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 300");
        } else if (salario >= 3751.1 && salario <= 4664.0) {
            System.out.println("A sua aliquota é de 7.5%");
            System.out.println("Você pode deduzir até R$ 142");
        }
    }
}
