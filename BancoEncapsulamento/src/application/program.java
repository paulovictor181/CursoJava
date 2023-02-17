package application;

import entities.contaBancaria;
import java.util.Scanner;
import java.util.Locale;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		System.out.println("-------------Cadastro de Conta----------");
		
		Scanner scanner = new Scanner(System.in);
		contaBancaria conta;
		
		System.out.print("Digite número da conta: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Digite o nome do titular conta: ");
		scanner.nextLine();
		String nome = scanner.nextLine();
		System.out.print("Deseja fazer um deposito inicial (y/n)? ");
		char resposta = scanner.next().charAt(0);
		
		if(resposta == 'y') 
		{
			System.out.print("Digite o deposito inicial da conta: ");
			double depositoInicial = scanner.nextDouble();
			conta = new contaBancaria(numeroConta, nome, depositoInicial);
		}
		else 
		{
			conta = new contaBancaria(numeroConta, nome);
		}
		
		System.out.println();
		System.out.println("cadastro de Conta concluido");
		System.out.println("Conta Nº" + conta.getNumeroDaConta() 
							+ ", Titular:" + conta.getTitularDaConta() 
							+ " Saldo:" + conta.getSaldo());
		
		System.out.println();
		
		System.out.print("Digite o valor para deposito: ");
		conta.depositarSaldo(scanner.nextDouble());

		System.out.println("Atualização de saldo concluida");
		System.out.println("Conta Nº" + conta.getNumeroDaConta() 
		+ ", Titular:" + conta.getTitularDaConta() 
		+ " Saldo:" + conta.getSaldo());
		System.out.println();
		
		
		System.out.print("Digite o valor para saque: ");
		conta.saqueSaldo(scanner.nextDouble());

		System.out.println("Atualização de saldo concluida");
		System.out.println("Conta Nº" + conta.getNumeroDaConta() 
		+ ", Titular:" + conta.getTitularDaConta() 
		+ " Saldo:" + conta.getSaldo());
		
		
		
		
		
		
	}

}
