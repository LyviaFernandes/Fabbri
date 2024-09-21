package aula3;

import java.util.Scanner;

public class TesteComOu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Inicio do programa......\n");
		
		//entrada
		System.out.println("Entre com o código de acesso: ");
		codigo = ler.nextInt();
		
		//processamento
		if (codigo == 1 || codigo == 2 || codigo == 3) {
 		  if (codigo == 1)
 			  System.out.println("Um");
 		  if (codigo == 2)
 			  System.out.println("Dois");
 		  if (codigo == 3)
 			  System.out.println("Três");
			
		}
		else {
			System.out.println("Código informado é inválido!");
			System.out.println("Tente novamente.");
			
	}
		System.out.println();
		System.out.println("Fim do programa.....\n");
		
	}

}
