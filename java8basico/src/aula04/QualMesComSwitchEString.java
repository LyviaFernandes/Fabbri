package aula04;

import java.util.Scanner;

public class QualMesComSwitchEString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes;
		Scanner snc = new Scanner(System.in);
		
		//entrada
		System.out.println("Entre com um valor referente ao mês... um, dois, etc");
		mes = snc.nextLine();
		System.out.println();
		
		switch (mes)
		{
		case "um":	 	System.out.println("Janeiro"); 		break;
		case "dois": 	System.out.println("Fevereiro");	break;
		case "tres": 	System.out.println("Março"); 		break;
		case "quatro": 	System.out.println("Abril"); 		break;
		case "cinco": 	System.out.println("Maio"); 		break;
		case "seis": 	System.out.println("Junho");		break;
		case "sete":	System.out.println("Julho"); 		break;
		case "oito": 	System.out.println("Agosto"); 		break;
		case "nove": 	System.out.println("setembro"); 	break;
		case "dez": 	System.out.println("Outubro"); 		break;
		case "onze": 	System.out.println("Novembro"); 	break;
		case "doze": 	System.out.println("Dezembro"); 	break;
		
		}

	}

}
