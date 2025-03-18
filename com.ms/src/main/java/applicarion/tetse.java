package applicarion;

import conexaodb.ConexaoJDBC;

public class tetse {

	public static void main(String[] args) {
		Categoria p = new Categoria();
		//p.cadastrar();
		//p.listar();
		//p.deletarDepartamento();
		
		Vendedor v = new Vendedor();
		//v.cadastrarRetornaID();
		//v.atualiza();
		v.atualizaCommit();
	}

}
