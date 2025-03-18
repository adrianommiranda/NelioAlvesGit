package entities;

public class Comentarios {
	private String texto;

	public Comentarios(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Comentarios [texto=" + texto + "]";
	}
	
	
	
	
}
