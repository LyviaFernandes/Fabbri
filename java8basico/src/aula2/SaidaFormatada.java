package aula2;

public class SaidaFormatada {

	public static void main(String[] args) {
		// Definição de variaveis
		float nota = 9.6f;  // definir e inicializar a variavel
		
		String nome = "Lyvia";  //definir a variavel string
		
		//  Processamento e Saida 
		System.out.println("Sua nota é: " + nota);  //concatenar = juntar
		
		// Um outro jeito de saida
		System.out.print("Sua nota é " + nota);
		
		// Um exemplo de saida formatada 
		System.out.printf ("Sua nota é %.2f \n", nota);
		
		// Mais um jeito de saída
		System.out.format("Saiba que sua nota é %.2f \n", nota);
		
		// Personalizando a saída
		System.out.printf("A nota de %s é %.2f \n", nome, nota);
		

	}

}
