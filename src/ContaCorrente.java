
public class ContaCorrente extends Conta implements Tributavel{
	
	

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor+0.20);
	}
	
	@Override
	public double getValorImposto() {
		return super.getSaldo()*0.10;
	}
	
//	@Override
//	public String toString() {
//		return "ag: "+this.getAgencia();
//	}
}
