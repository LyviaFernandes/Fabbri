package aula07;

public class UsaEmpregado {

	public static void main(String[] args) {
		
		Empregado lala = new Empregado();
		
		lala.setNome("Venus \nmurillinho do pastel");		 //classe pessoa
		lala.setRg("348.449.940-2"); //classe pessoafisica
		lala.setCartao("LA0101");	 //classe empregado
		
		System.out.println(lala.getNome());
		System.out.println(lala.getRg());
		System.out.println(lala.getCartao());
		

	}

}
