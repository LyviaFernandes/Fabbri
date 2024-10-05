package aula08;

import javax.swing.JOptionPane;

public class CriaArrayC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[12];
		
		c[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")); 
		
		for (int i = 2; i < c.length; i++) {
			c[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
			
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%5d%8d%n", i, c[i]);
		}

	}

}
