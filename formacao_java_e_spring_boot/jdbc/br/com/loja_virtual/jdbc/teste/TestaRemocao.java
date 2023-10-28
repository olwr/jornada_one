package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.estabeleecConexao();
        
        PreparedStatement stm = connection.prepareStatement("DELETE FROM produto WHERE id > ?");
        stm.setInt(1, 2);
        stm.execute();

        Integer linhasRemovidas = stm.getUpdateCount();

        System.out.println("Quantidade de linhas removidas " + linhasRemovidas);

        stm.close();
        connection.close();
    }
}
