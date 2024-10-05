package aula08;

public class CriaAttayComInicializador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] outroArray = {32, 27, 64, 72, 90, 12, 48, 87, 33, 8, 47, 65};
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i = 0; i < outroArray.length; i++) {
			System.out.printf("%5d%8d%n", i, outroArray[i]);
		}
	}

}
