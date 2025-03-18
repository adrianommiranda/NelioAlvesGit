package conexaodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoJDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/cousejdbc";
	private static final String USUARIO = "root";
	private static final String SENHA = "admin";

	//Conexão
	private static Connection conexao = null;

	//Abrir conexão
	public static Connection iniciarConexao() {

		if (conexao == null) {
			try {
				conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
				System.out.println("Conectado com sucesso mysql!");
			} catch (SQLException e) {
				System.out.println("Falha na conexão!");
				System.out.println(e.getMessage());
			}
		}
		return conexao;

	}

	//fechar conexão
	public static void fecharConexao(Connection conn) {

		if (conn != null) {
			try {
				System.out.println("Conexao fechada com sucesso!");
				conn.close();

			} catch (SQLException e) {
				System.out.println("Erro ao fechar conexão!");
				System.out.println(e.getMessage());
			}
		}
	}
	
	//Fechar o Statement
	public static void closeStatement(Statement st) {
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	//Fechar o ResultSet
	public static void closeResultSet(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	
	
}
