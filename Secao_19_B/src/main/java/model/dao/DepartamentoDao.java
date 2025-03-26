package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.entities.Departamento;

public interface DepartamentoDao {
	void insert(DepartamentoDao obj);
	void update(DepartamentoDao obj);
	void DeleteId(Integer id);
	
	//Retornar um dapartamento - pesquisa
	Departamento pesquisaId(Integer id);
	
	//Listar todos os departamentos
	List<DepartamentoDao> listaDepartamento();
}
