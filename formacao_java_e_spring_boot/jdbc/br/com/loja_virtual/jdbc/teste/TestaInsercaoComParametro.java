package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        try (Connection connection = connectionFactory.estabeleecConexao()) {
        
            connection.setAutoCommit(false);

            try ( PreparedStatement stm = connection.prepareStatement(
                    "INSERT INTO produto (nome, descricao) VALUES (?, ?)",
                        Statement.RETURN_GENERATED_KEYS);) {
                getRst("SmartTV", "45 polegadas", stm);
                getRst("Radio", "Radio de bateria", stm);

                connection.commit();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Rollback foi executado!");
                connection.rollback();
            }
        }
    }

    private static void getRst(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        try (
            ResultSet rst = stm.getGeneratedKeys();
        ) {
            while (rst.next()) {
                Integer id = rst.getInt(1);
                System.out.println("O id criado foi: " + id);
            }
        }
    }
}
