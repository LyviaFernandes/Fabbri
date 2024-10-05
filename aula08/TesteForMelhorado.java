package aula08;

public class TesteForMelhorado {

	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;
		
		//adiciona o valor de cada elemento ao total
		for (int numero: array)
			total += numero;
		
		System.out.printf("Total dos elementos do Array: %d\n", total);
		
	}

}
