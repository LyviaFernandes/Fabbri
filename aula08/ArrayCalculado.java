package aula08;

public class ArrayCalculado {

	public static void main(String[] args) {
		
		final int TAMANHO_ARRAY = 10; //Declara constante
		
		int[] novoArray = new int[TAMANHO_ARRAY]; //Cria o array
		
		//calcula o valor de cada elemento do array
		for (int contador = 0; contador < novoArray.length; contador++) {
			novoArray[contador] = 2 + contador * 2;
			
		}
		//saida
		System.out.printf("%s%8s%n", "Indice", "Valor"); //titulo de ca
		
		//gera saida do valor de cada elemento array
		for (int contador = 0; contador < novoArray.length; contador++) {
			System.out.printf("%5d%8d%n", contador, novoArray[contador]);
		}
	}

}
