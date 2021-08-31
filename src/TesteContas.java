
public class TesteContas {

	public static void main(String[] args) {
		
	
		GuardadorDeContas g1 = new GuardadorDeContas();
		ContaCorrente cc = new ContaCorrente(10,20);
		ContaPoupanca cp = new ContaPoupanca(50, 60);
		Cliente g = new Cliente();
		g.setNome("Gustavo");
		
		g1.adiciona(cc);
		g1.adiciona(cp);
		g1.adiciona(g);
		
		Object ref = g1.getReferencia(2);
		
		System.out.println(g1.getQtdDeContas());
		
		System.out.println(ref);
		
		
		
		
		
		
		
		
		
		//--------------------------------------------------------------
		
//		int t=0;
//		
//		Conta[] conta = new Conta[2];
//		
//		conta[0] = new ContaCorrente(25, 20);
//		conta[1] = new ContaPoupanca(30, 50);
//		
//		conta[t].deposita(5);
		
		

		//---------------------------------------------------------------
		
//		System.out.println("\ntemos "+conta.length+" contas na lista!\n");
//		
//		
//		for(int i=0; i < conta.length; i++) {
//			System.out.println("\nna posição "+i+" temos: "+conta[i]);
//			
			
			
		}

	}

