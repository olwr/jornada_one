package formacao_java.projetos.curso2;

public class CriaPersonagem {
    public static void main(String[] args) {
        Personagem avatarPersonagem = new Personagem();
        
        avatarPersonagem.nome = "avatar";
        avatarPersonagem.idade = 21;
        avatarPersonagem.raca = "Humana";
        avatarPersonagem.classe = "Avatar";

        System.out.println(avatarPersonagem.nome);
        System.out.println(avatarPersonagem.idade);
        System.out.println(avatarPersonagem.raca);
        System.out.println(avatarPersonagem.classe);

        System.out.println();

        Personagem inquisidorPersonagem = new Personagem();

        inquisidorPersonagem.nome = "Dorian";
        inquisidorPersonagem.idade = 27;
        inquisidorPersonagem.peso = 71.0;
        inquisidorPersonagem.eDeficienteOuNeurodivergente = true;
        inquisidorPersonagem.raca = "Elfo";
        inquisidorPersonagem.classe = "Arqueiro";

        System.out.println("Novo Inquisidor: " + inquisidorPersonagem.nome);
        System.out.println(inquisidorPersonagem.idade);
        System.out.println(inquisidorPersonagem.peso + "kg");
        System.out.println(inquisidorPersonagem.eDeficienteOuNeurodivergente);
        System.out.println(inquisidorPersonagem.raca);
        System.out.println(inquisidorPersonagem.classe);
    }
    

}
