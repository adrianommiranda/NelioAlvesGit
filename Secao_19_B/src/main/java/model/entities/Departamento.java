package model.entities;

import java.io.Serializable;

/*
 * Implementar o implemets Serializable
 * Para que os nossos objetos serem transformados em sequencias de bytes 
 * Temos que fazer isto, se quisermos que nossos objetos sejam transformados em arquivos, trafegados em redes
 * 
 */
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	// Construtor
	public Departamento() {
	}

	public Departamento(Integer integer, String name) {
		this.id = integer;
		this.name = name;
	}

	// Get e Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * hashCode / equals Comparar meus objetos pelo conteúdo e não pela referencia
	 * de ponteiro
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// ToString
	@Override
	public String toString() {
		return "Departamento [integer=" + id + ", name=" + name + "]";
	}

}
