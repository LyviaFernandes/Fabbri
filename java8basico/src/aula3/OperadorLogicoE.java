package aula3;

public class OperadorLogicoE {

	public static void main(String[] args) {
		//condição de aprovação de emprestimo
		//salario maior que 1000 reais
		//idade maior que 18
		
		int salario = 900;
		int idade = 19;
		String res;
		
		
		boolean aprovação = (salario > 1000) && (idade>18);
		
		res = (salario > 1000 && idade > 18)?"Aprovado":"Reprovado";
		
		System.out.println(aprovação);
		System.out.println(res);

	}

}
