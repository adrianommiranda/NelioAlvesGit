package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import conexaodb.ConexaoJDBC;
import conexaodb.DbExcexao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

//Implementar  a minha interface vendedor
public class VendedorDaoJDBC implements VendedorDao {

	// Nosso dao vai ter uma dependencia com a coneao não deu certo----------------
	private Connection conn;

	public VendedorDaoJDBC(Connection conn) {
		this.conn = conn;
	}/*------------------------------------------------------------------------------*/

	// Deletar - apagar
	public void DeleteId(Integer id) {
		PreparedStatement ps = null;

		try {
			String sql = "DELETE FROM seller WHERE id = ?";

			ps = conn.prepareStatement(sql);

			ps.setInt(1, id);

			int linhasAfetadas = ps.executeUpdate();
			if (linhasAfetadas > 0) {
				System.out.println("Operação concluída com sucesso!!");
			} else {
				System.out.println("Vendedor não encontrado!");
				// posso colocar uma execão aqui dentro
			}

		} catch (SQLException e) {
			throw new DbExcexao("Erro ao deletar vendedor: " + e.getMessage());
		} finally {
			ConexaoJDBC.closeStatement(ps);
		}

	}

	public List<Vendedor> listaVendedor() {
		return null;
	}

	// Encontrar o obj, passando o id como parametro
	public Vendedor pesquisaId(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		// Connection conn = ConexaoJDBC.iniciarConexao();
		conn = ConexaoJDBC.iniciarConexao();

		if (conn != null) {
			String sql = "SELECT seller.*, department.Name AS DepNome " + "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id " + "WHERE seller.Id = ?";

			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, id); // id do parametro
				rs = ps.executeQuery();

				if (rs.next()) {

					Departamento departamento = instanciarDepartamento(rs);

					Vendedor vendedor = instanciamentoVendedor(rs, departamento);
					return vendedor;

				}
			} catch (SQLException e) {
				System.out.println("Erro ao listar");
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (ps != null)
						ps.close();
					// if (conn != null)
					// conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/*
	 * Método resultset auxiliar vendedor Não vou tratar aqui a exception do
	 * resulset, pode dar um sqlexception. Mas eu já trato no cod principal. Neste
	 * cod auxiliar eu vou propagat a exceção, AddthownsDeclaration
	 **/
	private Vendedor instanciamentoVendedor(ResultSet rs, Departamento departamento) throws SQLException {
		Vendedor vendedor = new Vendedor();
		vendedor.setId(rs.getInt("Id"));
		vendedor.setName(rs.getString("Name"));
		vendedor.setEmail(rs.getString("Email"));
		vendedor.setSalario(rs.getDouble("BaseSalary"));
		vendedor.setDataAniversario(rs.getDate("BirthDate"));
		vendedor.setDepartamento(departamento);
		return vendedor;
	}

	/*
	 * Método resultset auxiliar departamento Não vou tratar aqui a exception do
	 * resulset, pode dar um sqlexception. Mas eu já trato no cod principal. Neste
	 * cod auxiliar eu vou propagat a exceção, AddthownsDeclaration
	 **/
	private Departamento instanciarDepartamento(ResultSet rs) throws SQLException {
		Departamento departamento = new Departamento();
		departamento.setId(rs.getInt("DepartmentId"));
		departamento.setName(rs.getString("DepNome"));// alias do sql
		return departamento;
	}

	/*public List<Vendedor> ListarVendedorPorDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return null;
	}*/

	// Inserindo vendedor - retornando o ultimo id
	public void insert(Vendedor obj) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";

			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, obj.getName());
			ps.setString(2, obj.getEmail());
			ps.setDate(3, new java.sql.Date(obj.getDataAniversario().getTime()));
			ps.setDouble(4, obj.getSalario());
			ps.setInt(5, obj.getDepartamento().getId());

			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				rs = ps.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				ConexaoJDBC.closeResultSet(rs);
			} else {
				throw new DbExcexao("Erro inesperado, Linhas não afetadas!");
			}
		} catch (SQLException e) {
			throw new DbExcexao(e.getMessage());
		} finally {
			ConexaoJDBC.closeStatement(ps);
		}
	}

	// Inserindo vendedor - forma simples
	public void insertFormaSimples(Vendedor obj) {
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);

			ps.setString(1, obj.getName());
			ps.setString(2, obj.getEmail());
			ps.setDate(3, new java.sql.Date(obj.getDataAniversario().getTime()));
			ps.setDouble(4, obj.getSalario());
			ps.setInt(5, obj.getDepartamento().getId());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DbExcexao("Erro ao inserir vendedor: " + e.getMessage());
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// Update
	public void update(Vendedor obj)  {
		PreparedStatement ps = null;
		
		try {
			String sql = "UPDATE seller "
						  	+ "SET Name = ?, "
						  	+ "Email = ?, "
						  	+ "BirthDate = ?, "
						  	+ "BaseSalary = ? , "
						  	+ "DepartmentId = ? "
						  + "WHERE id = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getEmail());
			ps.setDate(3, new java.sql.Date(obj.getDataAniversario().getTime()));
			ps.setDouble(4, obj.getSalario());
			ps.setInt(5, obj.getDepartamento().getId());
			
			ps.setInt(6, obj.getId());
			
			ps.executeUpdate();
			
		}catch (SQLException e) {
			throw new DbExcexao("Erro ao atualizar vendedor: " + e.getMessage());
		} 
		finally {
			ConexaoJDBC.closeStatement(ps);
		}
	}

	// Buscar vendedores de um um dado departamento erro
	// -----------------------------------
	/*
	 * public List<Vendedor> ListarVendedorPorDepartamento2222222(Departamento
	 * departamento) { conn = ConexaoJDBC.iniciarConexao(); PreparedStatement ps =
	 * null; ResultSet rs = null;
	 * 
	 * if (conn != null) { String sql =
	 * "SELECT seller.*, department.Name as DepMame " + "FROM seller " +
	 * "INNER JOIN department " + "ON seller.DepartmentId = department.Id " +
	 * "WHERE DepartmentId = ? " + "ORDER BY Name"; try { ps =
	 * conn.prepareStatement(sql); ps.setInt(1, departamento.getId()); rs =
	 * ps.executeQuery();
	 * 
	 * // Pode ter vários vendedores por departamento e ele é uma lista
	 * List<Vendedor> litaVendedor = new ArrayList<Vendedor>();
	 * 
	 * Map<Integer, Departamento> map = new HashMap<Integer, Departamento>();
	 * 
	 * while (rs.next()) {
	 * 
	 * Departamento objDepartamento = map.get(rs.getInt("DepartmentId"));
	 * if(objDepartamento == null) { objDepartamento = instanciarDepartamento(rs);
	 * map.put(rs.getInt("DepartmentId"), objDepartamento); }
	 * 
	 * 
	 * //Departamento objDepartamento = instanciarDepartamento(rs); Vendedor
	 * vendedor = instanciamentoVendedor(rs, objDepartamento);
	 * listaVendedor().add(vendedor);
	 * 
	 * }return litaVendedor;
	 * 
	 * } catch (SQLException e) { System.out.println("Erro ao listar");
	 * e.printStackTrace(); } finally { try { if (rs != null) rs.close(); if (ps !=
	 * null) ps.close(); if (conn != null) conn.close(); } catch (SQLException e) {
	 * e.printStackTrace(); } } } return null; }
	 */

	// Buscar vendedores de um dado departamento
	/*
	 * public List<Vendedor> ListarVendedorPorDepartamento(Departamento
	 * departamento) { conn = ConexaoJDBC.iniciarConexao(); PreparedStatement ps =
	 * null; ResultSet rs = null; List<Vendedor> listaVendedor = new ArrayList<>();
	 * 
	 * if (conn != null) { String sql =
	 * "SELECT seller.*, department.Name as DepMame " + "FROM seller " +
	 * "INNER JOIN department " + "ON seller.DepartmentId = department.Id " +
	 * "WHERE DepartmentId = ? " + "ORDER BY Name"; try { ps =
	 * conn.prepareStatement(sql); ps.setInt(1, departamento.getId()); rs =
	 * ps.executeQuery(); while (rs.next()) {
	 * 
	 * Departamento objDepartamento = instanciarDepartamento(rs); Vendedor vendedor
	 * = instanciamentoVendedor(rs, objDepartamento); listaVendedor.add(vendedor); }
	 * return listaVendedor; } catch (SQLException e) {
	 * System.out.println("Erro ao listar"); e.printStackTrace(); } finally {
	 * 
	 * ConexaoJDBC.closeResultSet(rs); ConexaoJDBC.closeStatement(ps);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * return null; }
	 */

	
	//**************************Parecido mas não é o mais correto
	public List<Vendedor> ListarVendedorPorDepartamento(Departamento departamento) { 
	 	conn = ConexaoJDBC.iniciarConexao(); 
	 	PreparedStatement ps = null; 
	 	ResultSet rs = null; 
	 	List<Vendedor> listaVendedor = new ArrayList<Vendedor>();
	  	// Inicializa a lista corretamente
	 
	  	if (conn != null) { 
	  		String sql = "SELECT seller.*, department.Name as DepNome " 
	  		+ "FROM seller INNER JOIN department ON seller.DepartmentId = department.Id " 
	  		+ "WHERE DepartmentId = ? " 
	  		+ "ORDER BY Name"; 
	  		
	  		try { 
	  			ps = conn.prepareStatement(sql); 
	  			ps.setInt(1, departamento.getId()); 
	  			rs = ps.executeQuery();
	  
	  			while (rs.next()) { 
	  				Departamento objDepartamento = instanciarDepartamento(rs); 
	  				Vendedor objvendedor = instanciamentoVendedor(rs, objDepartamento); 
	  				listaVendedor.add(objvendedor); // Corrigido aqui 
	  			} return  listaVendedor;
	  
	  		} catch (SQLException e) { 
	  			System.out.println("Erro ao listar vendedores");
	  			e.printStackTrace(); 
	  		} finally { 
	  			try { 
	  				if (rs != null) rs.close(); 
	  				if (ps != null) ps.close(); 
	  				//if (conn != null) conn.close(); 
	  			} catch (SQLException e) {
	  				e.printStackTrace(); 
	  			} 
	  		} 
	  	} return listaVendedor;  // Retorna lista vazia se 	  algo der errado 
	  	
	 }
	 

}
