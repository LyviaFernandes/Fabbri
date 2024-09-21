package aula04;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//entrada 
		System.out.println("Coloque sua altura em metros:");
		double altura = scn.nextDouble();
		
		System.out.println("Coloque seu peso em kg:");
		double peso = scn.nextDouble();
		
		//processamento
		double imc = peso / Math.pow(altura, 2);
		
		//saida
		System.out.printf("O seu IMC é %.2f\n", imc);
		if (imc < 16.9)
		System.out.println("Muito abaixo do peso ;(");
		else if (imc >17 && imc < 18.4)
		System.out.println("Abaixo do peso :I");
		else if (imc >18.5 && imc <24.9)
		System.out.println("Peso normal :D");
		else if (imc >25 && imc <29.9)
		System.out.println("Acima do peso :o");
		else if (imc >30 && imc <34.9)
		System.out.println("Obesidade grau 1 ;-;");
		else if (imc >35 && imc >40)
		System.out.println("Obesidade grau 2 ;((");	
		else if (imc >40)
		System.out.println("Obesidade grau três 0o0'");
		
		System.out.println("\nSempre se cuide, faça exercicio e beba agua!");
		
		scn.close();
		
		
		}

}
