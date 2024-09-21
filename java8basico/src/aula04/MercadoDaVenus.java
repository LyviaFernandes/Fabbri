package aula04;

import java.util.Locale;
import java.util.Scanner;

public class MercadoDaVenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		scn.useLocale(Locale.US);
		//váriaveis
		
		double valor_total_compra = 0.0;
		float valor_feijao = 5.5f;
		float valor_arroz = 4.1f;
		float valor_macarrao = 2.3f;
				
		String produto, produto1, produto2;
		
		//entrada
		System.out.println("Bem vindo(a) ao mercado da Venus!");
		System.out.println("Digite o nome do produto");
		System.out.println("arroz, feijao ou macarrao");
		
		produto = scn.nextLine();
		
		// processamento
		
		if (produto.equals("feijao"))
		valor_total_compra += valor_feijao;
		else if (produto.equals("arroz"))
			valor_total_compra += valor_arroz;
		else if (produto.equals("macarrao"))
		valor_total_compra += valor_macarrao;
		else
			System.out.println("Produto inválido!");
		 
		//entrada
				
				System.out.println("Digite o nome do produto");
				System.out.println("arroz, feijao ou macarrao");
				
				produto1 = scn.nextLine();
				
				// processamento
				
				if (produto1.equals("feijao"))
				valor_total_compra += valor_feijao;
				else if (produto1.equals("arroz"))
					valor_total_compra += valor_arroz;
				else if (produto1.equals("macarrao"))
				valor_total_compra += valor_macarrao;
				else
					System.out.println("Produto inválido!");
				//entrada
				
				System.out.println("Digite o nome do produto");
				System.out.println("arroz, feijao ou macarrao");
				
				produto2 = scn.nextLine();
				
				// processamento
				
				if (produto2.equals("feijao"))
				valor_total_compra += valor_feijao;
				else if (produto2.equals("arroz"))
					valor_total_compra += valor_arroz;
				else if (produto2.equals("macarrao"))
				valor_total_compra += valor_macarrao;
				else
					System.out.println("Produto inválido!");
		// Saida
		System.out.printf("\nO valor total da compra é de %.1f", valor_total_compra);
		
		scn.close();
		
		
		
	}

}
