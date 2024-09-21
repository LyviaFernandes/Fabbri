package aula3;

import java.util.Scanner;

public class TesteDeValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem vindo, Humano! Digite um número de sua escolha ^-^");
		double numero = ler.nextDouble();
		
		if ( numero > 20 && numero < 90 ) {
		System.out.println("Parabens, Humano! O número está na faixa! :D");
		
		}
		else {
			System.out.println("Ah;(, uma pena... Este número não está na faixa ;-;");
		
		}

	}

}
