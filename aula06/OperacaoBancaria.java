package aula06;

public class OperacaoBancaria {

	public static void main(String[] args) {
		// criar a conta de destino para uma transferencia
		
		Conta destino = new Conta();
		Conta origem = new Conta();
		
		//adicionar dados a conta de destino
		destino.setTitular("Venus");
		destino.setNumero(9873);
		destino.setSaldo(0);
		destino.setLimite(1200.0);
		
		System.out.printf("\nO saldo da conta de %s é de %.2f", destino.getTitular(), destino.getSaldo());
		
		origem.setTitular("Fulano");
		origem.setNumero(0000013);
		origem.setSaldo(20000);
		origem.setLimite(1000000.0);
		
		origem.transfere(destino, 15000);
		
		System.out.printf("\nO saldo da conta de %s é de %.2f", origem.getTitular(), origem.getSaldo());
		System.out.printf("\nO saldo da conta de %s ficou com %.2f", destino.getTitular(), destino.getSaldo());

	}

}
