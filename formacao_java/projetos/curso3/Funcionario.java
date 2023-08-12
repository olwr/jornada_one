package formacao_java.projetos.curso3;

// não pode mais ser instanciado
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    // sem corpo, não há implementação
    public abstract double getBonificacao();
    // {return this.salario * 0.05;}

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}