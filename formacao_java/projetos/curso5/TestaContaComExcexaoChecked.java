package formacao_java.projetos.curso5;

public class TestaContaComExcexaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        
        try {
            c.deposita();
        } catch (MinhaExcecao ex) {
            System.out.println("tratamento....");
        }
    }
}