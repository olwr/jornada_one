package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.dao.*;
import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory.ConnectionFactory;
import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.modelo.*;

public class TestaListagemDeCategorias {

    public static void main(String[] args) throws SQLException {

        try (Connection con = new ConnectionFactory().estabeleecConexao()) {
            CategoriaDAO categoriaDAO = new CategoriaDAO(con);

            List<Categoria> listaCategorias = categoriaDAO.listarComProdutos();
            listaCategorias.stream().forEach(ct -> {
                System.out.println(ct.getNome());

                for (Produto produto : ct.getProdutos()) {
                    System.out.println(ct.getNome() + " - " + produto.getNome());
                }

            });
        }
    }
}
