package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.dao.ProdutoDAO;
import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;
import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.modelo.Produto;

public class TestaInsercaoComProduto {
    public static void main(String[] args) throws SQLException {
        Produto comoda = new Produto("Cômoda", "Cômoda vertical");

        try (Connection con = new ConnectionFactory().estabeleecConexao() ) {
            
            // new ProdutoDAO(con).inserir(comoda);
            ProdutoDAO produtoDAO = new ProdutoDAO(con);
            produtoDAO.inserir(comoda);

            // produtoDAO.remover(2);
            
            List<Produto> listaDeProdutos = produtoDAO.listar();
            listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
        }

        // System.out.println(comoda);
    }
}
