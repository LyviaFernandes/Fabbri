package aula2;

import java.util.Scanner;     // Importar a biblioteca que entra com dados scanner

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);  // criar um objeto e monitorar a entrada padrão
		
		System.out.println("Digite o nome do Alien");
		String nome = teclado.nextLine();
		System.out.println("Digite a nota do Alien");
		float nota = teclado.nextFloat();
		
		System.out.printf("A nota do alien %s é %.1f \n", nome, nota);
		}

}
