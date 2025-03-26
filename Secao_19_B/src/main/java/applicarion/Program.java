package applicarion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import conexaodb.ConexaoJDBC;
import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		/*ConexaoJDBC.iniciarConexao();
		Departamento d = new Departamento(1, "TI");
		System.out.println(d);
		
		Vendedor v = new Vendedor(1, "Adriano", "email", new Date(), 50000.0, d);
		System.out.println(v.toString());*/
		
		//Abrindo conexão
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("******************************  Pesquisa por ID  ******************************");
		Vendedor vendedor = vendedorDao.pesquisaId(2);
		System.out.println(vendedor);
		
		
		
		/*System.out.println("\n\n******************************  Pesquisa vendedores de uma determinada categoria por ID  ******************************");
		//Abrindo conexão
		VendedorDao vendedorDao2 = DaoFactory.createVendedorDao();*/
		Departamento d = new Departamento(2, null);
		List<Vendedor> listaV = vendedorDao.ListarVendedorPorDepartamento(d);
		for (Vendedor lista: listaV) {
			System.out.println(lista);
		}
		
		
		
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Departamento department = new Departamento(2, null);
		Vendedor v5 = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		vendedorDao.insert(v5);
		System.out.println("Inserido! Novo ID = " + v5.getId());
		
		
		System.out.println("\n=== TEST 5: seller Update =====");
		vendedor = vendedorDao.pesquisaId(15);
		vendedor.setName("Adriano Miranda MMM");
		vendedorDao.update(vendedor);
		System.out.println("Update finalizado");
		
		
		System.out.println("\n=== TEST 6: seller Delete =====");
		System.out.println("Entre com o valor a ser deletedo");
		int id = 11;
		vendedorDao.DeleteId(101);
		System.out.println("Delete finalizado");
		
		

		
	}

}
