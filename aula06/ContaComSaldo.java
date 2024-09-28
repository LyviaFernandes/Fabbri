package aula06;
//classe contacomsaldo com uma variavel de instancia saldo do tipo double
//e um construtor e metodo depósito que executa uma validação

public class ContaComSaldo {
	private String nome;	//variavel de instancia
	private double saldo;	//variavel de instancia
	
	//o construtor que inicializa com dois parametros
	public ContaComSaldo(String nome, double saldo) {
		this.nome = nome;		//atribui nome a variavel de instancia
		//valida que o saldo é maior que 0.0; se nao for,
		//a variavel de instancia a saldo mantem o valor inicial padrão de 0.0
		if (saldo > 0.0) {
			this.saldo = saldo; //atribui o valor da saldo a variavel de instancia
		}
		
	}
	//metodo que deposita(adiciona) apenas uma quantidade valida no saldo
	public void deposita(double valorDepositado) {
		if (valorDepositado > 0.0) { 	//se o valor é valido
			saldo += valorDepositado;	//adiciona o valor ao saldo
			
		}
	}
	public double getSaldo() {	
		return saldo;			
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo para recuperar o nome do objeto
	public String getNome() {	//<=== este é o cabeçalho do metodo
		return nome;			//retorna o valor do nome para o chamado
	}

	public void setNome(String nome) {	 //este é o cabeçalho do metodo
		this.nome = nome;				//armazena o nome
	}

}
