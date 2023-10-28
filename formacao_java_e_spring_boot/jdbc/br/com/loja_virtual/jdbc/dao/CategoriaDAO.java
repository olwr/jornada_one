package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.modelo.*;

public class CategoriaDAO {

    private Connection connection;

    public CategoriaDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT id, nome FROM categoria";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Categoria categoria =
                        new Categoria(rst.getInt(1), rst.getString(2));
                    
                    categorias.add(categoria);
                }
            }
        }
        return categorias;
    }

    public List<Categoria> listarComProdutos() throws SQLException {
        Categoria ultima = null;
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT c.id, c.nome, p.id, p.nome, p.descricao " + 
            "FROM categoria c INNER JOIN produto p ON c.id = p.categoria_id";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {

                    if (ultima == null || !ultima.getNome().equals(rst.getString(2))) {

                        Categoria categoria =
                            new Categoria(rst.getInt(1), rst.getString(2));

                        categorias.add(categoria);
                        ultima = categoria;
                    }
                    Produto produto = 
                        new Produto(rst.getInt(3), rst.getString(4), rst.getString(5));
                    ultima.adicionar(produto);
                }
            }
        }
        return categorias;
    }
}
