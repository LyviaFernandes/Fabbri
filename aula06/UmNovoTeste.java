package aula06;

public class UmNovoTeste {

	public static void main(String[] args) {
		// a conta
		Conta outraconta = new Conta();
		outraconta.setSaldo(1000);
		
		//quero mudar para o saldo =200
		double novoSaldo = -200.0;
		
		//testa se o novo codigo é valido
		if (novoSaldo < 0) {
			System.out.println("Não é possivel efetuar essa transação.");
			
		}
		else {
			outraconta.setSaldo(novoSaldo);
		}

	}

}
