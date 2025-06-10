package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import servicos.Membresia;

public class Membro extends Administrador {
	private List<String> area_atuacao;
	
	public Membro() {
	}

	public Membro(String nome, String ra, String email, Integer telefone, LocalDate nascimento,
			LocalDate ingresso, String curso, Membresia membresia, List<String> area_atuacao) {
		super(nome, ra, email, telefone, nascimento, ingresso, curso, membresia);
		this.area_atuacao = area_atuacao;
	}

	public List<String> getArea_atuacao() {
		return area_atuacao;
	}

	public void setArea_atuacao(List<String> area_atuacao) {
		this.area_atuacao = area_atuacao;
	}
	
	public void addAreaAtuacao(String area) {
		area_atuacao.add(area);
	}

	@Override
	public String toString() {
		return super.toString() + ", Área(s) de atuação: " + area_atuacao;
	}
	
	
	
}
