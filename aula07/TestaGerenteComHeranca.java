package aula07;

public class TestaGerenteComHeranca {

	public static void main(String[] args) {
		
		GerenteComHeranca gerente = new GerenteComHeranca();
		
		//podemos chamar métodos do funcionarios
		gerente.setNome("Venus");
		gerente.setCpf(12344556);
		
		//e tambem metodos do gerente
		gerente.setSenha(0602);
		
		//testando a heranca
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSenha());

	}

}
