package aula08;

import java.util.Arrays; //importar a biblioteca arrays

public class ArrayOrdenado {

	public static void main(String[] args) {
		//exemplo de arrays
		String[] nomes = { "Lyvia", "Murilos", "Otavio", "Venus", "Julia", "Ana" };
		char[] vogais = { 'i', 'o', 'a', 'e', 'u'};
		int[] numeros = { 9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
		float[] notas = { 7.6f, 8.5f, 9.7f, 5.4f, 3.6f, 2.6f};
		
		//rotina para ordenar os arrays
		Arrays.sort(nomes);
		System.out.print("\nNomes: ");
		for (String nome: nomes) {
			System.out.print(nome + ", ");
		}
		Arrays.sort(vogais);
		System.out.print("\nVogais: ");
		for (char vogal: vogais) {
			System.out.print(vogal + ", ");
		}
		Arrays.sort(numeros);
		System.out.print("\nNumeros: ");
		for (int numero: numeros) {
			System.out.print(numero + ", ");
		}
		Arrays.sort(notas);
		System.out.print("\nNotas: ");
		for (float nota: notas) {
			System.out.print(nota + ", ");
		}
		}
	}


