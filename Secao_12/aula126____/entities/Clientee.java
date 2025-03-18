package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientee {
	private String nome;
	private String email;
	private Date dtNascimento;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Clientee(String nome, String email, Date dtNascimento) {
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Override
	public String toString() {
		return nome + " (" + sdf.format(dtNascimento) + " )" + email;
	}
	
	
	
}
