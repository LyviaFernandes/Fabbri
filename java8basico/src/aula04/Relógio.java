package aula04;

public class Relógio {

	public static void main(String[] args) {
		// Variaveis
		int horas, minutos, segundos;
		
		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + "h: " + minutos + "min: " + segundos + "seg");
				}
			}
		}
		

	}

}
