public abstract class Conta implements AutoCloseable {
	
	
	/**
	 * 
	 * @author Gustavo Prado
	 * @version 1.6
	 * 
	 * Classe que representa um tipo de Conta genérica que serve de base 
	 * para contas corrente e poupança.
	 * 
	 * 
	 */

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * 
	 * Construtor das contas, devem ser criadas sempre com agencia e número da conta.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		System.out.println("Conta "+this.numero+" criada com sucesso!");
	}
	
	@Override
	public String toString() {
		return "ag: "+this.getAgencia();
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito de "+valor+" efetuado!");
	}

	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("\nSaldo: "+this.saldo+
					"\nValor a sacar + taxa: "+valor);
		}
		this.saldo -= valor;
		System.out.println("Saque de "+valor+" efetuado!");
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
		System.out.println("Transferência de "+valor+" concluída");
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public void close() {
		System.out.println("Encerrando");
	}

}