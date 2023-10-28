package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.estabeleecConexao();
        
        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO produto (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')"
            , Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();

        while(rst.next()) {
            Integer id = rst.getInt(1);
            System.out.println("O id criado foi: " + id);
        }

        rst.close();
        stm.close();
        connection.close();
    }
}
