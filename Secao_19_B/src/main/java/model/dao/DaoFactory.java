package model.dao;

import conexaodb.ConexaoJDBC;
import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	
	/*
	 *vai retornar um new VendedorDaoJDBC() 
	 *Desta forma, a minha classe vai expor um método que retorna o tipo da interface
	 *mas internamente ela vai instanciar uma implementação
	 *este é um macete para não precisar expor a implementação
	 *deixar somente a interface
	 */
	
	public static VendedorDao createVendedorDao() {
		//return new VendedorDaoJDBC();
		return new VendedorDaoJDBC(ConexaoJDBC.iniciarConexao());
	}
}
