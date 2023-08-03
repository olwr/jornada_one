package formacao_java.projetos.curso2;

public class TestaValores {
    public static void main(String[] args) {
        Conta contaAlex = new Conta(003, 5123);
        contaAlex.getNumero();
        
        Conta contaAmanda = new Conta(003, 5124);
        contaAmanda.getNumero();

        Conta contaCarlos = new Conta(003, 5125);
        contaCarlos.getNumero();
    }

}
