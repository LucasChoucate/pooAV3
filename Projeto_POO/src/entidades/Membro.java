package entidades;

import java.time.LocalDate;
import java.util.List;

public class Membro extends Pessoa{
	private boolean membro_ativo;
	private List<String> area_atuacao;
	
	public Membro() {
	}

	public Membro(String nome, String ra, String email, Integer telefone, LocalDate nascimento,
			LocalDate ingresso, String curso, Membresia membresia, boolean membro_ativo) {
		super(nome, ra, email, telefone, nascimento, ingresso, curso, membresia);
		this.membro_ativo = membro_ativo;
	}

	public boolean isMembro_ativo() {
		return membro_ativo;
	}

	public void setMembro_ativo(boolean membro_ativo) {
		this.membro_ativo = membro_ativo;
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
	
	
	
}
