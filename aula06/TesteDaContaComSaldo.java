package aula06;

import java.util.Scanner;

public class TesteDaContaComSaldo {

	public static void main(String[] args) {
		//criando dois objetos
		ContaComSaldo conta10 = new ContaComSaldo("Venus", 50000.0);
		ContaComSaldo conta20 = new ContaComSaldo("Murilo", 100000.0);
		
		//exibe o saldo de cada objeto
		System.out.printf("O saldo da conta de %s é %.2f \n", conta10.getNome(), conta10.getSaldo());
		System.out.printf("O saldo da conta de %s é %.2f \n", conta20.getNome(), conta20.getSaldo());
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Entre com o depósito para conta 10: ");
		double ValorDeposito10 = scn.nextDouble();
		System.out.printf("\nAdicionado %.2f para o saldo da Conta10\n", ValorDeposito10);
		conta10.deposita(ValorDeposito10); //adiciona o valor ao saldo
		
		System.out.printf("O novo saldo da conta de %s é %.2f \n", conta10.getNome(), conta10.getSaldo());
		System.out.printf("O novo saldo da conta de %s é %.2f \n", conta20.getNome(), conta20.getSaldo());
		
		System.out.println("Entre com o valor do depósito para a conta20:");
		double ValorDeposito20 = scn.nextDouble();
		System.out.printf("\nAdicionado %.2f para o saldo da Conta10\n", ValorDeposito20);
		conta20.deposita(ValorDeposito20); //adiciona o valor ao saldo
		
		//exibe o saldo de cada objeto
		System.out.printf("O novo saldo da conta de %s é %.2f \n", conta10.getNome(), conta10.getSaldo());
		System.out.printf("O novo saldo da conta de %s é %.2f \n", conta20.getNome(), conta20.getSaldo());
		
		
		scn.close();

	}

}
