package applicarion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import conexaodb.ConexaoJDBC;
import conexaodb.DbIntegridadeExcecao;

public class Vendedor {
	// Cadastrar
	public void cadastrar() {
		Scanner scanner = new Scanner(System.in);

		// Data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;

		if (conn != null) {

			String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";

			try {
				System.out.println("Entre com o nome do vendedor");
				String nomeVendedor = scanner.nextLine();

				System.out.println("Entre com o email do vendedor");
				String email = scanner.nextLine();

				// data---------
				System.out.println("Entre com a data de nascimento (dd/MM/yyyy):");
				String dataNascimentoStr = scanner.nextLine();
				Date dataNascimento = new Date(sdf.parse(dataNascimentoStr).getTime());
				// ----------------

				System.out.println("Entre com o salário: ");
				double salario = scanner.nextDouble();

				// teria o departamento

				ps = conn.prepareStatement(sql);

				ps.setString(1, nomeVendedor);
				ps.setString(2, email);
				ps.setDate(3, dataNascimento);
				ps.setDouble(4, salario);
				ps.setInt(5, 4);

				int linhasLateradas = ps.executeUpdate();
				System.out.println("Adicionado com sucesso! Linahs alteradas " + linhasLateradas);

			} catch (SQLException e) {
				System.out.println("Erro ao cadastrar!");
				e.printStackTrace();
				System.out.println(e.getMessage());
			} // referente a data
			catch (ParseException e) {
				e.printStackTrace();
			} finally {
				// sempre fechar a conexão por ultimo
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}

		}
	}

	// Cadastrar e retornar o ultimo id
	public void cadastrarRetornaID() {
		Scanner scanner = new Scanner(System.in);

		// Data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;

		if (conn != null) {

			String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";

			try {
				System.out.println("Entre com o nome do vendedor");
				String nomeVendedor = scanner.nextLine();

				System.out.println("Entre com o email do vendedor");
				String email = scanner.nextLine();

				// data---------
				System.out.println("Entre com a data de nascimento (dd/MM/yyyy):");
				String dataNascimentoStr = scanner.nextLine();
				Date dataNascimento = new Date(sdf.parse(dataNascimentoStr).getTime());
				// ----------------

				System.out.println("Entre com o salário: ");
				double salario = scanner.nextDouble();

				// teria o departamento

				// sobrecarga de prepareStatement
				ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

				ps.setString(1, nomeVendedor);
				ps.setString(2, email);
				ps.setDate(3, dataNascimento);
				ps.setDouble(4, salario);
				ps.setInt(5, 4);

				int linhasLateradas = ps.executeUpdate();

				// Retornar os ultimos ids cadastrados
				if (linhasLateradas > 0) {
					ResultSet rs = ps.getGeneratedKeys();

					while (rs.next()) {
						// Vai gerar uma tabelinha auxiliar com o ultimo id
						int id = rs.getInt(1);
						System.out.println("Cadastrado! id = " + id);
					}
				} else {
					System.out.println("Nenhuma linha alterada");
				}

				// System.out.println("Adicionado com sucesso! Linahs alteradas " +
				// linhasLateradas);

			} catch (SQLException e) {
				System.out.println("Erro ao cadastrar!");
				e.printStackTrace();
				System.out.println(e.getMessage());
			} // referente a data
			catch (ParseException e) {
				e.printStackTrace();
			} finally {
				// sempre fechar a conexão por ultimo
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}

		}
	}
	
	public void atualiza() {
		Scanner scanner = new Scanner(System.in);
		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;
		
		String sql = "UPDATE seller SET BaseSalary = ? WHERE id = ?";
		
		if(conn != null) {
			System.out.println("Entre com o id pesquisado");
			int idPesquisado = scanner.nextInt();
			
			System.out.println("Salário a ser alterado");
			double alterarSalario = scanner.nextDouble();
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setDouble(1, alterarSalario);
				ps.setInt(2, idPesquisado);
				
				int linhasAlteradas = ps.executeUpdate();
				if(linhasAlteradas > 0) {
					System.out.println("Atualização efetuada com sucesso! Linhas alteradas " + linhasAlteradas);
				}else {
					System.out.println("Não encontrado");
				}
				
			} catch (SQLException e) {
				System.out.println("Erro ao atualizar");
				System.out.println(e.getMessage());
			}finally {
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}

		}
	}
	
	public void atualizaCommit() {
		Scanner scanner = new Scanner(System.in);
		Connection conn = ConexaoJDBC.iniciarConexao();
		PreparedStatement ps = null;
		
		String sql = "UPDATE seller SET BaseSalary = ? WHERE id = ?";
		String sql2 = "UPDATE seller SET BaseSalary = ? WHERE id = ?";
		
		if(conn != null) {
			System.out.println("Entre com o id pesquisado");
			int idPesquisado = scanner.nextInt();
			
			System.out.println("Salário a ser alterado");
			double alterarSalario = scanner.nextDouble();
			
			
			System.out.println("Entre com o id  segundo pesquisado");
			int idPesquisadoSegundo = scanner.nextInt();
			
			System.out.println("Salário a ser alterado");
			double alterarSalarioSegundo = scanner.nextDouble();
			
			try {
				/*
				 * não é para confirar as alterações altomaticamente - quem confirma sou eu
				 * Vou fazer toda a operação depois eu chamo o comit
				 */
				 
				conn.setAutoCommit(false);
				
				ps = conn.prepareStatement(sql);
				ps.setDouble(1, alterarSalario);
				ps.setInt(2, idPesquisado);
				
				int linhasAlteradas = ps.executeUpdate();
				
				//simulando erro---------
				int x =1;
				if(x < 2) {
					throw new SQLException("Erro falso");
				}//---------------------------
				
				ps = conn.prepareStatement(sql2);
				ps.setDouble(1, alterarSalarioSegundo);
				ps.setInt(2, idPesquisadoSegundo);
				
				int linhasAlteradasSegundo = ps.executeUpdate();
				
				
				
				//commit
				conn.commit();
				
				if(linhasAlteradas > 0) {
					System.out.println("Atualização efetuada com sucesso! Linhas alteradas " + linhasAlteradas);
				}else {
					System.out.println("Não encontrado");
				}
				
			} catch (SQLException e) {
				//System.out.println("Erro ao atualizar");
				//System.out.println(e.getMessage());
				
				//Esse rollback vai gerar try
				try {
					conn.rollback();
					//se ocorrer um erro eu vou lançar uma nova excecao personalizada
					throw new DbIntegridadeExcecao("Transação não concluída! Rollback - Causa do erro: " + e.getMessage());
				} catch (SQLException e1) {
					// caso ocorre erro no rollback - tentei voltar mas deu um erro
					throw new DbIntegridadeExcecao("Erro quando tentava voltar a transação - Causa do erro: " + e1.getMessage());
				}
			}finally {
				ConexaoJDBC.closeStatement(ps);
				ConexaoJDBC.fecharConexao(conn);
			}

		}
	}
	
	
}
