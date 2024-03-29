package formacao_java_e_spring_boot.jdbc.br.com.loja_virtual.jdbc.factory;

import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    public DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("root");

        comboPooledDataSource.setMaxPoolSize(15);

        this.dataSource = comboPooledDataSource;
    }

    public Connection estabeleecConexao() throws SQLException {
        return this.dataSource.getConnection();
        
        // DriverManager
        // .getConnection
        // ("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", 
        //     "root", "root");
    }
}
