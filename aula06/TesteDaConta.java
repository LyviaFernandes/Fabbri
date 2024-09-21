package aula06;

public class TesteDaConta {

	public static void main(String[] args) {
		Conta minhaconta; // Declarar a variavel minhaconta do tipo conta
		minhaconta = new Conta(); //associar o objeto conta a variavel
		
		//adicionar dados a minhaconta
		minhaconta.setTitular("Venus");
		minhaconta.setSaldo(100987);
		minhaconta.setSaldo(1345.60);
		minhaconta.setLimite(500.0);
		
		System.out.println("O saldo da minha conta é: " + minhaconta.getSaldo());
		
		//saca 200 reais
		minhaconta.saca(200);
		
		//deposita 500
		minhaconta.deposita(500);
		System.out.println("Depois das operações o saldo da conta é: " + minhaconta.getSaldo());
		

	}

}
