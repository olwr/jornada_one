package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.estabeleecConexao();


        // Statement stm = connection.createStatement();
        PreparedStatement stm = connection.prepareStatement("SELECT id, nome, descricao FROM produto");

        // boolean resultado = stm.execute("SELECT id, nome, descricao FROM produto");
        stm.execute();

        ResultSet rst = stm.getResultSet();

        while(rst.next()) {
            Integer id = rst.getInt("id");
            System.out.println(id);

            String nome = rst.getString("nome");
            System.out.println(nome);

            String descricao = rst.getString("descricao");
            System.out.println(descricao);
        }

        rst.close();
        stm.close();
        connection.close();
    }
}
