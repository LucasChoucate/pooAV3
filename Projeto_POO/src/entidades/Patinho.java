package entidades;

public class Patinho implements Membresia {
	public double TaxaMensal() {
		double taxa = 10.0; //valor da taxa de membresia X um semestre
		return taxa * 6.0;
	}
}
