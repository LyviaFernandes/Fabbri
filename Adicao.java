//programa de adição que usa JOptionPane para entrada e saida

package aula09;

import javax.swing.JOptionPane;

public class Adicao {

	public static void main(String[] args) {
		//obtem a entrada do usuario a partir dos dialogos de entrada JOptionPane
		String primeironum = JOptionPane.showInputDialog("Entre com o primeiro número");
		String segundonum = JOptionPane.showInputDialog("Entre com o segundo número");
		
		//converte string em valores int para uso em um calculo
		int num1 = Integer.parseInt(primeironum);
		int num2 = Integer.parseInt(segundonum);
		
		int soma = num1 + num2;
		
		//exibe o  resultado em um dialogo de mensagem JOptionPane
		JOptionPane.showConfirmDialog(null, "A soma é " + soma, "Soma de Dois inteiros", JOptionPane.QUESTION_MESSAGE);
		
	}

}
