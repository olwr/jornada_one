package formacao_java.projetos.curso3;

public class Designer extends Funcionario {

    public Designer(String nome){
        super(nome);
    }

    public double getBonificacao() {
        System.out.println("Chamando a bonificação do DESIGNER");
        // return super.getBonificacao() + 350;
        return 350;
    }
}
