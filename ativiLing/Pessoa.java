package ativiLing;

public class Pessoa {
	private String nome;
	private double idade;
	
	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public double getIdade() {
		return idade;
	}




	public void setIdade(double idade) {
		this.idade = idade;
	}




	public void apresentar (){
		
		System.out.println("Olá, eu sou " + getNome() + " e tenho " + getIdade() + " anos");
			
	}


}
