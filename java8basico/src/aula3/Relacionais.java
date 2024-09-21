package aula3;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Informe o primeiro número:");		
		int n1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número:");
		int n2 = teclado.nextInt();
		
		//processamento
		
		boolean igualdade = (n1 == n2);  //testa a igualdade
		boolean maior = (n1 > n2);      //testa se n1 é maior que n2
		boolean menor = (n1 < n2);       //testa se n1 é menor que n2
		boolean diferente = (n1 != n2);  //testa se n1 é diferente de n2
		boolean menorigual = (n1 >= n2); // testa se ne1 é menor ou igual que n2
		boolean maiorigual = (n1 <= n2);  // testa se n1 é maior ou igual que n2
		
		//saida
		
		System.out.printf("Igualdade entre %d == %d resulta em %b \n", n1, n2, igualdade);
		System.out.printf("Diferença entre %d != %d resulta em %b \n", n1, n2, diferente);
		System.out.printf("Maior que entre %d > %d resulta em %b \n", n1, n2, maior);
		System.out.printf("Menor que entre %d < %d resulta em %b \n", n1, n2, menor);
		System.out.printf("Menor ou igual que entre %d >= &d resulta em %b \n", n1, n2, menorigual);
		System.out.printf("Maior ou igual que entre %d <= &d resulta em %b \n", n1, n2, maiorigual);
				

	}

}
