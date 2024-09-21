package aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		//entrada
		System.out.println("Exemplo de Operações Aritmeticas");
		System.out.println("Digite um exemplo qualquer:");
		
		float num1 = teclado.nextFloat();
		
		System.out.println("Digite outro número qualquer:");
		
		float num2 = teclado.nextFloat();
		
		//processamento
		float menos = num1 - num2;
		float vezes = num1 * num2;
		float divido = num1 / num2;
		int resto = (int) (num1 % num2); //type casting
		
		//saida
		System.out.printf("A diferença de %.2f e %.2f é: %.2f\n", num1, num2, menos);
		System.out.printf("O produto de %.2f e %.2f é: %.2f\n", num1, num2, vezes);
		System.out.printf("A divisão de %.2f e %.2f é: %.2f\n", num1, num2, divido);
		System.out.printf("O resto da divisão de %.2f e %.2f é: %d\n", num1, num2, resto);
		
		System.out.println("Que a força esteja com você!");
		
		

	}

}
