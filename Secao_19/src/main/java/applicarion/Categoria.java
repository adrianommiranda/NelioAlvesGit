package applicarion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import conexaodb.ConexaoJDBC;
import conexaodb.DbIntegridadeExcecao;

public class Categoria {

	// Cadastrar
	public void cadastrar() {
		Scanner scanner = new Scanner(System.in);

		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;

		if (conn != null) {
			System.out.println("Informe o novo nome da categoria:");
			String nomeCategoria = scanner.nextLine();

			String sql = "INSERT INTO department (Name) VALUES (?)";

			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, nomeCategoria);
				ps.executeUpdate();

				System.out.println("Adicionado com sucesso!");
			} catch (SQLException e) {
				System.out.println("Erro ao cadastrar!");
				e.printStackTrace();
				System.out.println(e.getMessage());
			} finally {
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}

		}
	}

	// Listar todos
	public void listar() {
		Scanner scanner = new Scanner(System.in);

		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;

		if (conn != null) {
			String sql = "SELECT * FROM department";

			try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {
					System.out.println("ID: " + rs.getInt("id") + " -- " + " Categoria: " + rs.getString("name"));
				}

			} catch (SQLException e) {
				System.out.println("Erro ao listar");
				e.printStackTrace();
				System.out.println(e.getMessage());
			} finally {
				ConexaoJDBC.closeResultSet(rs);
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}
		}
	}

	//Deletando departamento - integridade referencial
	public void deletarDepartamento() {
		Scanner scanner = new Scanner(System.in);
		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;
		
		if(conn != null) {
			System.out.println("Entre com o código da categoria a ser excluído");
			int idDepertamento =  scanner.nextInt();
			
			String sql = "DELETE FROM department WHERE id =  ?";
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idDepertamento);
				int linhasAfetadas = ps.executeUpdate();
				
				System.out.println("Excluído com sucesso! Linhas excluídas " + linhasAfetadas);
			} catch (SQLException e) {
				//System.out.println(e.getMessage());
				//e.printStackTrace();
				//System.out.println("Não foi possível excluir");
				
				//Vou lançar a minha excecao  - passando a menssagem original
				throw new DbIntegridadeExcecao(e.getMessage());
			}finally {
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}
		}
	}

}
