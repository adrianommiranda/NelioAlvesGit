package conexaodb;

public class DbExcexao extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DbExcexao(String msg) {
		super(msg);
	}
}
