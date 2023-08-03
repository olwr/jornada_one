package formacao_java.projetos.curso2;

public class Empresario {
    public static void main(String[] args) {
        Pessoa regina = new Pessoa();
        
        regina.nome = "Regina Mills";
        regina.cpf = "333.333.333.33";
        regina.idade = 31;

        // regina.endereco = new Endereco();
        // regina.endereco = enderecoRegina;

        regina.endereco.logradouro = "Mifflin Street";
        regina.endereco.numero = "108";
        regina.endereco.cidade = "Storybook";
        
        Empresa empresa = new Empresa();
        empresa.ceo = regina;
        
        empresa.nome = "Red Apple";
        empresa.cnpj = "00.000.000./0000-00";
        
        // empresa.endereco = new Endereco();
        
        empresa.endereco.complemento = "City Hall";
        empresa.endereco.numero = "801";
        empresa.endereco.cidade = "Storybook";
        

    }
}
