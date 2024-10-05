package aula08;

public class ArraySomaElementos {

	public static void main(String[] args) {
		
		int[] arrayUm = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		int total = 0;
		
		//adiciona o valor de cada elemento ao total
		for (int contadora = 0; contadora < arrayUm.length; contadora++) {
			total += arrayUm[contadora];
		}
		
		System.out.printf("Total dos elementos do Array: %d\n", total);
	}

} 	//final da classe
