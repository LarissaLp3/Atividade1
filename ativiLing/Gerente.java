package ativiLing;

public class Gerente extends Funcionario {
	
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome (gerente): " + getNome());
		System.out.println("Salário: " + getSalario());
		System.out.println("Departamento: " + getDepartamento());
		System.out.println("Senha: " + getSenha());
	}

	

}
