package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Vendedor;

public interface VendedorDao {
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void DeleteId(Integer id);
	
	//Retornar um dapartamento - pesquisa
	//VendedorDao pesquisaId(Integer id);
	Vendedor pesquisaId(Integer id);
	
	//Listar todos os departamentos
	List<Vendedor> listaVendedor();
	
	//Buscar vendedores de um um dado departamento
	List<Vendedor> ListarVendedorPorDepartamento(Departamento departamento);
	
	
}
