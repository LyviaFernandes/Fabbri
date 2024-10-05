package aula08;

import javax.swing.JOptionPane;

public class ArraySoma {

	public static void main(String[] args) {
		int[] c = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do indice: "))];
		
		c[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		for (int i = 0; i < c.length; i++) {
			c[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		}
		for (int i = 2; i < c.length; i++) {
			System.out.printf("%5d%8d%n", i, c[i]);
			
		}
		
		int soma = c[1] + c[2] + c[3];
		
		System.out.printf("A soma dos 3 primeiros numeros é: %d", soma);
		
	}

}
