package entidades;

import java.time.LocalDate;
import java.util.List;

public class Administrador extends Pessoa {
	private String area_direcao;
	private List<Membro> membros;
	
	public Administrador() {
		super();
	}

	public Administrador(String nome, String ra, String email, Integer telefone, LocalDate nascimento, LocalDate ingresso, String curso, Membresia membresia, String area_direcao, List<Membro> membros) {
		super(nome, ra, email, telefone, nascimento, ingresso, curso, membresia);
		this.area_direcao = area_direcao;
		this.membros = membros;
	}

	public String getArea_direcao() {
		return area_direcao;
	}

	public void setArea_direcao(String area_direcao) {
		this.area_direcao = area_direcao;
	}

	public List<Membro> getMembros() {
		return membros;
	}

	public void setMembros(List<Membro> membros) {
		this.membros = membros;
	}
	
	
}
