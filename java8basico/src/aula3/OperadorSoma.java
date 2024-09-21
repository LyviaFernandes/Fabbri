package aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadorSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); // capturar a entrada via teclado
		teclado.useLocale(Locale.US);  //entende numero quebrado
		
		//entrada
		System.out.println("Operador de Adição");
		System.out.println("Digite um número");
		
		float n1 = teclado.nextFloat(); //armazena variavel n1
		
		System.out.println("Caro Alien, digite outro número");
		
		float n2 = teclado.nextFloat(); // armazena a variavel n2
		
		//processamento
		
		float soma = n1 + n2;  //armazena a soma de n1 com n2
		
		//saida
		
		System.out.println("A soma de " + n1 + " e " + n2 + " é: " + soma);
		
		teclado.close();
		

	}

}
