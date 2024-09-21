package aula3;

import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variaveis
		
		int a,b,c,d,x,y,h;
		
		//
        System.out.print("A: ");
        a = teclado.nextInt();
        
        System.out.print("B: ");
        b = teclado.nextInt();
        
        System.out.print("C: ");
        c = teclado.nextInt();
        
        System.out.print("D: ");
        d = teclado.nextInt();
        
        //processamento
        
        x = a * b;
        y = c * d;
        h = x - y;
        
        //saida
        
        System.out.println("X: " + x);
        System.err.println("Y: " + y);
        
        System.out.printf("\nA subtração de %d e %d é: %d", x, y, h);
        
        teclado.close();
        
        

		
	}

}
