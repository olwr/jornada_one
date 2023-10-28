package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.SQLException;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;

public class TestaPoolConexoes {
    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            connectionFactory.estabeleecConexao();
            System.out.println("Conexão de número: " + i);
        }
    }
}
