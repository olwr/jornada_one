package formacao_java.projetos.curso3;

public class Editor extends Funcionario {
    
    public Editor(String nome) {
        super(nome);
    }
    
    public double getBonificacao() {
        System.out.println("Chamando a bonificação do EDITOR");
        // return super.getBonificacao() + super.getSalario() / 2;
        return super.getSalario() / 2;
    }
}
