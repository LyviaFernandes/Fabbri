package aula3;

import java.util.Scanner;

public class QualMes {

	public static void main(String[] args) {
		// Variaveis
		int mes;
		Scanner scn = new Scanner(System.in);
		
		//inicio
		System.out.println("Bem Vindo, Alien!");
		
		System.out.println("Digite um número referente a um mês");
		mes = scn.nextInt();

			if (mes == 1)
				System.out.println("Janeiro");
				else
				if (mes == 2)
					System.out.println("Feveiro");
					else
					if (mes == 3)
						System.out.println("Março");
						else
						if (mes == 4)
							System.out.println("Abril");
							else
							if (mes == 5)
									System.out.println("Maio");
								else
								if (mes == 6)
										System.out.println("Junho");
									else
										if (mes == 7)
											System.out.println("Julho");
										else
											if (mes == 8)
												System.out.println("Agosto");
											else
												if (mes == 9)
													System.out.println("Setembro");
												else
													if (mes == 10)
														System.out.println("Outubro");
													else
														if (mes == 11)
															System.out.println("Novembro");
														else
															if (mes == 12)
																System.out.println("Dezembro");
															else
																System.out.println("O número é inválido...");
																	System.out.println("Fim do programa.");
	
		}
	}
