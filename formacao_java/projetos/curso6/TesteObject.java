package formacao_java.projetos.curso6;

import formacao_java.br.com.bytebank.banco.modelo.Cliente;

public class TesteObject {

    public static void main(String[] args) {
        
        Cliente clienteNormal = new Cliente("Flavio");
    
        Cliente clienteVip = new Cliente("Romulo");
    
        Object[] refs = new Object[5]; 
        
        refs[0]= clienteNormal; 
        refs[1] = clienteVip;
    
        System.out.println(((Cliente) refs[1]).getNome());
    }
}
