package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//Define o formato esperado da data.
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
	
	private Date data;
	private String titulo;
	private String assunto;
	private int likes;
	
	List<Comentarios> listaComentarios = new ArrayList<>();
	
	public Post(Date data, String titulo, String assunto, int likes) {
		this.data = data;
		this.titulo = titulo;
		this.assunto = assunto;
		this.likes = likes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comentarios> getListaComentarios() {
		return listaComentarios;
	}

	/*public void setListaComentarios(List<Comentarios> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}*/

	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		//acrescentar no final
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		
		//chamando a data e um usando o sdf static
		sb.append(sdf.format(data) + "\n");
		
		sb.append(assunto + "\n");
		sb.append("Comentários:" + "\n");
		for (Comentarios comentarios : listaComentarios) {
			sb.append(comentarios.getTexto() + "\n");
		}
		return sb.toString();
	}
	
	public void adicionarComentario(Comentarios comentario) {
		listaComentarios.add(comentario);
	}
	
	public void removerComentario(Comentarios comentario) {
		listaComentarios.remove(comentario);
	}
	
}
