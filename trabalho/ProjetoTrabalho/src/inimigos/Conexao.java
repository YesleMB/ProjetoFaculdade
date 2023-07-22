package inimigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao  extends atributosInimigos{
    private static final String URL = "jdbc:mysql://localhost:3306/projeto"; // Substitua pelo URL do seu banco de dados
    private static final String USUARIO = "root"; // Substitua pelo nome de usuário do seu banco de dados
    private static final String SENHA = "12345"; // Substitua pela senha do seu banco de dados

    private Connection dbconn = null;
    private Statement sqlmgr = null;
    private ResultSet resultsql = null;

    public Connection openDadaBse() {
        try {
            Connection dbconn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado com sucesso em: " + URL);
            return dbconn;
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            return null;
        }
    }

    public void closeDatabase(Connection dbconn, Statement stmt, ResultSet rs) {
        try {
            if (stmt != null)
                stmt.close();
            if (dbconn != null)
                dbconn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }

    public int executeQuery(String sql) {
        try {
            return sqlmgr.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao executar a consulta: " + e.getMessage());
        }
        return -1;
    }
    
}
