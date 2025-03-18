package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date dtNascimento;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	//Construtor
	public Cliente() {}
	
	public Cliente(String nome, String email, Date dtNascimento) {
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
	}

	
	//Métodos get e set
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

	//To String
	@Override
	public String toString() {
		return "Cliente: "
				+ getNome()
				+" - "
				+sdf.format(dtNascimento) 
				+ " - "
				+getEmail();
	}
	
	
	
	
	
	
	
}


