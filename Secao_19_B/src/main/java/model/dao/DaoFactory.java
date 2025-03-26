package model.dao;

import conexaodb.ConexaoJDBC;
import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	
	/*
	 *vai retornar um new VendedorDaoJDBC() 
	 *Desta forma, a minha classe vai expor um m�todo que retorna o tipo da interface
	 *mas internamente ela vai instanciar uma implementa��o
	 *este � um macete para n�o precisar expor a implementa��o
	 *deixar somente a interface
	 */
	
	public static VendedorDao createVendedorDao() {
		//return new VendedorDaoJDBC();
		return new VendedorDaoJDBC(ConexaoJDBC.iniciarConexao());
	}
}
