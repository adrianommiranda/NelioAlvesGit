package model.entities;

import java.io.Serializable;
import java.util.Date;

/*
 * Implementar o implemets Serializable
 * Para que os nossos objetos serem transformados em sequencias de bytes 
 * Temos que fazer isto, se quisermos que nossos objetos sejam transformados em arquivos, trafegados em redes
 * 
 */
public class Vendedor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private Date dataAniversario;
	private Double salario;

	// Possui um departamento
	private Departamento departamento;

	// Construtor
	public Vendedor() {}

	public Vendedor(Integer id, String name, String email, Date dataAniversario, Double salario,
			Departamento departamento) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.departamento = departamento;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
		Vendedor other = (Vendedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	// ToString
	@Override
	public String toString() {
		return "Vendedor [integer=" + id + ", name=" + name + ", email=" + email + ", dataAniversario="
				+ dataAniversario + ", salario=" + salario + ", departamento=" + departamento + "]";
	}
}
