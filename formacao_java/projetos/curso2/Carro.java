package formacao_java.projetos.curso2;

public class Carro {
    private int ano;
    private String marca;
    private String modelo;
    private String cor;
    private double preco;

    // GETTERS & SETTERS
    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Construtores
    public Carro(int ano, String marca, String modelo, String cor, double preco) {
        if (ano >= 1891) {
            this.ano = ano;
        } else {
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if (marca != null) {
            this.marca = marca;
        } else {
            System.out.println("A marca não foi informada. Por isso usaremos Wolksvagem!");
            this.marca = "Wolksvagem";
        }

        if (modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }
        
        if (cor != null) {
            this.cor = cor;
        } else {
            System.out.println("A cor não foi informada. Por isso usaremos preto!");
            this.cor = "Preto";
        }

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }
    }

    public Carro(String marca, String modelo, String cor, double preco) {
        // chamando o primeiro construtor para reaproveitar o código
        this(2017, marca, modelo, cor, preco);
    }
}
