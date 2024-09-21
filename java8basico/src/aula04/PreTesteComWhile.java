package aula04;

import java.util.Scanner;

public class PreTesteComWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int I, Resp;
		Scanner scn = new Scanner(System.in);
		
		Resp = 1;
		while (Resp == 1) {
			System.out.println("Inicio do programa");
			I = 1;
			while (I <= 5) {
				System.out.println("Valor = " + I);
				I++;
			}
			System.out.println();
			System.out.println("deseja continuar?");
			System.out.println("Tecle 1 para SIM / 2 para NÃO");
			Resp = scn.nextInt();
		}
		System.out.println("Fim do programa...");
	}

}
