package formacao_java.projetos.curso2;

public class TesteReaproveitamento {
    public static void main(String[] args) {
        Carro carro = new Carro(1967, "Chevrolet", "Impala", "Azul", 329.000);

        System.out.println("O carro escolhido é: " 
            + carro.getMarca() + " " + carro.getModelo() + ", " + carro.getAno() + " " + carro.getCor() + ". " + "Preço - R$" + carro.getPreco());
    }
}
