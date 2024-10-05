//classe que analisa uma pesquisa
package aula08;

public class PesquisaDosAlunos {

	public static void main(String[] args) {
		
		// array com resposta dos alunos
		int[] resp = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		
		int[] frequi = new int[6]; //array com contadores de frequencia
		
		for (int indice = 0; indice < resp.length; indice++) {
			try {
				int posiresp = resp[indice]; 
				int qualfreq = frequi[posiresp];
				
				qualfreq++; //bloco que pode dar erro
				frequi[posiresp] = qualfreq;
			}
			catch (ArrayIndexOutOfBoundsException erroindice) { //bloco que trata o erro
				System.out.println(erroindice);
				System.out.printf("   Resposta[%d] = %d%n%n", indice, resp[indice]);
			}
		}
		
		System.out.printf("%s%12s%n", "conceito", "frequencia");
		
		//gera saida do valor de cada elemento do array
		for (int nota = 0; nota < frequi.length; nota++) {
			System.out.printf("%6d%10d%n", nota, frequi[nota]);
		}
	}

} //fim da classe pesquisa dos alunos
