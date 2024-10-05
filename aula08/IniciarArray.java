package aula08;

public class IniciarArray {

	public static void main(String[] args) {
		//Declara a array e inicializa com o objeto Array
		int[] array = new int[10]; //cria o objeto array
		
		//saida
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		//Gera a saida de cada elemento do array
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%Sd%8d%n", i, array[i]);
			
		}
	}

}
