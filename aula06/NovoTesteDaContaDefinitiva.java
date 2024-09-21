package aula06;

import java.util.Scanner;
// cria e manipula um objeto ContaDefinitiva

public class NovoTesteDaContaDefinitiva {

	public static void main(String[] args) {
		// cria um objeto scannr para obter a entrada
		// a partir da janela de console
		Scanner scn = new Scanner(System.in);
		
		//cria um objeto contadefinitiva e armazena a minhaconta
		ContaDefinitiva minhaConta = new ContaDefinitiva();
		
		//exibe o valor inicial do nome (null)
		System.out.printf("\nNome inicial é: %s", minhaConta.getNome());
		
		//solicita e le o nome
		System.out.println("\nPor favor entre o nome da conta: "); 
		String umnome = scn.nextLine();                         //le uma linha de texto 
		minhaConta.setNome(umnome); 							//insere umnome em minhaconta
		System.out.println(); 									//pula uma linha
		
		// exibe o nome armazenado no objeto minhaconta
		System.out.printf("Nome do objeto minhaConta é: \n%s\n", minhaConta.getNome());
		
		scn.close();

	}

}
