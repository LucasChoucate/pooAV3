package servicos;

public class Patinho implements Membresia {
	public double TaxaMensal() {
		double taxa = 10.0; // Valor da taxa de membresia X um semestre
		return taxa * 6.0;
	}

	@Override
	public String toString() {
		return "Sim";
	}
}
