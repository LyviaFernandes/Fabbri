package aula06;

public class TesteComConstrutor {

	public static void main(String[] args) {
		
		//cria dois objetos contacomconstrutor
		ContaComConstrutor conta1 = new ContaComConstrutor("Venus");
		ContaComConstrutor conta2 = new ContaComConstrutor("Afrodite");
		
		//exibe o valor inicial de cada conta
		System.out.printf("\nNome em conta1 é: %s\n", conta1.getNome());
		System.out.printf("\nNome em conta1 é: %s\n", conta2.getNome());
		
		//fim da classe testecomconstrutor

	}

}
