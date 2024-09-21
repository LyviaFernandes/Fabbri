package aula06;

public class Conta {
	
		private int numero; // variavel de instancia
		private String titular;
		private double saldo, limite;
		
		public String getTitular() {
			return this.titular;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public double getLimite() {
			return this.limite;
		}
		
		public void setLimite(double limite) {
			this.limite= limite;
		}
		
		// comportamentos da conta
		public boolean saca(double quantidade) {
			if (this.saldo < quantidade) {
				System.out.println("\nSaldo insuficiente");
				return false;
			}
			else {
				this.saldo -= quantidade;
				System.out.println("\nSaque realizado com sucesso!");
				return true;
			}
		}
		
		public void deposita(double chicomoedas) {
			if (chicomoedas < 0) {
			System.out.println("\nOperação invalida!");
		}
		else {
			this.saldo += chicomoedas; //this.saldo = this.saldo + chicomoedas
		}
		}
		boolean transfere(Conta destino, double valor) {
			boolean saqueOk = this.saca(valor);
			if (saqueOk == false) {
				System.out.println("\nTransferencia não realizada!");
				return false;
			}
			else {
				destino.deposita(valor);
				System.out.println("\nTransação realizada com sucesso");
				return true;
			}
		

		}
}


