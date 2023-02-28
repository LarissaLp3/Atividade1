package ativiLing;

public class Funcionario {
	
	private String nome;
	private double salario;
	private int departamento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salário: " + getSalario());
		System.out.println("Departamento: " + getDepartamento());
	}

}
