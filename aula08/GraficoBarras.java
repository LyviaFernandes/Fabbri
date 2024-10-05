package aula08;

public class GraficoBarras {

	public static void main(String[] args) {
		// int[] arrayUm = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		//uma nota 100, 2 notas no intervalo 90, 4 notas no internalo 80,
		//2 notas no intervalo 70, uma nota no intervalo 60,
		//nenhuma nota abaixo de 60.
		
		int[] Arrayfreq = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		
		System.out.println("Distribuição das notas\n");
		//para cada elemento do array, gera uma saida de uma barra no grafico
		for (int cont = 0; cont < Arrayfreq.length; cont++) {
			//gera saida do rotulo da barra ("00b- 09: ", "10 - 19: ",... "90 - 99: ")
			if (cont == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", cont * 10, cont * 10 + 9);
			
			//imprime a barra de *
			for (int star = 0; star < Arrayfreq[cont]; star++)
				System.out.printf("*");
			
			System.out.println();
		}
	}
}
