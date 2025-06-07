package entidades;

import java.time.LocalDate;
import java.util.List;

import servicos.Membresia;

public class Diretor extends Administrador {
	private String area_direcao;
	
	public Diretor() {
		super();
	}

	public Diretor(String nome, String ra, String email, Integer telefone, LocalDate nascimento, LocalDate ingresso, String curso,
		Membresia membresia, String area_direcao) {
		super(nome, ra, email, telefone, nascimento, ingresso, curso, membresia);
		this.area_direcao = area_direcao;
	}

	public String getArea_direcao() {
		return area_direcao;
	}

	public void setArea_direcao(String area_direcao) {
		this.area_direcao = area_direcao;
	}

	@Override
	public String toString() {
		return super.toString() + ", Área de direção: " + area_direcao;
	}
	
	
	
}
