
public class TesteTributavel {

	public static void main(String[] args) {
		
		
		ContaCorrente conta = new ContaCorrente(2,5);
		conta.deposita(200);
		SeguroVida seguro = new SeguroVida();
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.registra(conta);
		calculador.registra(seguro);
		
		System.out.println("Valor imposto total: "+calculador.getValorTotal());
		
		System.out.println("conta: "+conta.getValorImposto());
		System.out.println("");
		System.out.println("seguro: "+seguro.getValorImposto());

	}

}
