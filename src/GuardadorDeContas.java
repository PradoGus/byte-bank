
public class GuardadorDeContas {

	private Object[] contas = new Object[10];
	private int posicaoLivre = 0;

	public void adiciona(Object ref) {
		
		this.contas[this.posicaoLivre] = ref;
		posicaoLivre++;
		
	}

	public Object getReferencia(int i) {
		
		return this.contas[i];
	}

	public int getQtdDeContas() {
		
		return this.posicaoLivre;
		
	}
	
	
	
	
}
