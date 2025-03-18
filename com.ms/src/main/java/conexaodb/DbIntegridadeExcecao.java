package conexaodb;

//Execao personalizada de integridade referencial

//Extende da RuntimeException
public class DbIntegridadeExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	//Vou forçar o construtor receber uma mensagem, repasso a String para super class
	public DbIntegridadeExcecao(String msg) {
		super(msg);
	}
	
}
