
public class CalculadorImposto {
	
	private double valorTotal;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.valorTotal += valor;
	}
	public double getValorTotal() {
		return valorTotal;
	}
}
