package aula3;

import java.util.Locale;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		//entrada
		System.out.println("Digite um número qualquer:");
		
		double numero = teclado.nextDouble();
		
		//processamento
		double potencia = Math.pow(numero, 2);
		int potencia2 = (int) Math.pow(numero,  2);
		
		//saida
		System.out.println("O quadrado de " + numero + " é: " + potencia);
		System.out.println("O quadrado de " + numero + " é: " + potencia2);
		

	}

}
