package entities;

public class contaBancaria {
	
	private int numeroDaConta;
	private String titularDaConta;
	private double saldo;
	
	public contaBancaria(int numeroDaConta, String titularDaConta, double saldo){
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		depositarSaldo(saldo);
		
	}
	
	public contaBancaria(int numeroDaConta, String titularDaConta){
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		saldo = 0;
		
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositarSaldo(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void saqueSaldo(double saque) {
		saldo = saldo - saque;
	}
	
	
}
