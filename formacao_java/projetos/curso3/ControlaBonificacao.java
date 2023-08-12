package formacao_java.projetos.curso3;

public class ControlaBonificacao {
    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }
    
    public double getSoma() {
        return this.soma;
    }
}
