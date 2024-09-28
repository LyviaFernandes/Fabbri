package aula07;

import java.text.DecimalFormat;

public class UmArrayDenumeros {

	public static void main(String[] args) {
		int [] inteiro = new int[10]; //cria o array, criei um array chamado inteiro que tem 10 posiçoes
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("000");
		
		for (int i = 0; i < inteiro.length; i++) {
			inteiro[i] = (int) (Math.random() * 1000);
			System.out.println(df.format(inteiro[i]));
		}
		

	}

}
