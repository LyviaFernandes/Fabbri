package aula07;

public class GerenteComHeranca extends Funcionario {
	private int senha;
	private int funcionario;
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}
	public boolean autentica(int senha) {
		if ( this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
			
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
		
	}

}
