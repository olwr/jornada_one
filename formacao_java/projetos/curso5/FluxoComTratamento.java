package formacao_java.projetos.curso5;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            // TODO: handle exception
            String mensagem = ex.getMessage();
            System.out.println("Exception " + mensagem);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // int a = i / 0;
            Conta c = null;
            try {
                c.deposita();
            } catch (MinhaExcecao ex) {
                System.out.println("...");
            }
        }
        System.out.println("Fim do metodo2");
    }
}