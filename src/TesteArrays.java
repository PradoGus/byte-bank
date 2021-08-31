import java.util.ArrayList;

public class TesteArrays {

	public static void main(String[] args) {
		
	
		ContaCorrente c = new ContaCorrente(10,5);
		ContaPoupanca cp = new ContaPoupanca(10,5);
		
		ArrayList<Conta> conta = new ArrayList<Conta>();
		
		conta.add(c);
		conta.add(cp);
		
		c.deposita(50);
		cp.deposita(100);
		
		
// --------------------------------------
		
	//Forma tradicional
	
		
//		for(int i=0;i<conta.size();i++) {
//			
//			Conta ref = (Conta) conta.get(i);    //Castei a conta pois não tinha declarado o tipo da ArrayList ainda
//			System.out.println(ref.getSaldo());
//
//		}
		
// --------------------------------------
		
	//Forma menos verbal	
		
		for(Conta o : conta) {
			System.out.println(o.getSaldo());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Conta [] conta = new Conta [2];
//		
//		conta[0] = new ContaPoupanca(10, 20);
//		conta[1] = new ContaCorrente(5, 10);
//		
//		conta[0].deposita(50);
//		
//		for(int i = 0; i < conta.length; i++) {
//			System.out.println("saldo da conta "+conta[i]+" é: "+conta[i].getSaldo());
//		}
		
	
		
		

		
	}
	
}
