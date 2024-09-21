package aula06;

//classe ContaDefinitiva que contem uma variavel de instancia nome
// e métodos para configurar e obter seu valor
public class ContaDefinitiva {
	private String nome;                 //variavel de instancia
	
	//metodo para definir o nome do objeto
	public void setNome(String nome) {  //<-- este é o cabeçalho do metodo
		this.nome = nome;               // armazena o nome
	}
	
	//metodo para recuperar o nome do objeto
	public String getNome() {          //<---- este é o cabeçalho do método
		return nome;                   // retorna valor do nome para o chamador
	}
	
	//fim da ContaDefinitiva
}
