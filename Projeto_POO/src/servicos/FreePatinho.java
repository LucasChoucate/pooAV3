package servicos;

public class FreePatinho implements Membresia{
	public double TaxaMensal() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Não";
	}
}
