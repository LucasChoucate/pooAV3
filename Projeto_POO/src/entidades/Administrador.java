package entidades;

import java.time.LocalDate;

public abstract class Administrador {
		private String nome;
		private String ra;
		private String email;
		private Integer telefone;
		private LocalDate nascimento;
		private LocalDate ingresso;
		private String curso;
		private Membresia membresia;
	
	public Administrador() {
	}

	public Administrador(String nome, String ra, String email, Integer telefone, 
		LocalDate nascimento, LocalDate ingresso, String curso, Membresia membresia) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.email = email;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.ingresso = ingresso;
		this.curso = curso;
		this.setMembresia(membresia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public LocalDate getIngresso() {
		return ingresso;
	}

	public void setIngresso(LocalDate ingresso) {
		this.ingresso = ingresso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
	
	public Administrador buscarRA(Administrador administrador, String RA) {
		if(administrador.getRa().equalsIgnoreCase(RA)) {
			return administrador;
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Administrador [nome=" + nome + ", ra=" + ra + ", email=" + email + ", telefone=" + telefone + ", nascimento="
				+ nascimento + ", ingresso=" + ingresso + ", curso=" + curso + "]";
	}

	
	
	
	
	
}
