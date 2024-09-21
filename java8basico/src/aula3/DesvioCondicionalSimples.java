package aula3;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		// Váriaveis
		int idade = 17;
		
		// processamento
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
			System.out.println("Esse texto está no bloco do if");
			
		}
		else {
			System.out.println("Você é menor de idade!");
			System.out.println("Esse texto está no bloco do else");
		}
		
		System.out.println("\nEsse texto esta fora dos blocos");	

	}

}
