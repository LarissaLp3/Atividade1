package ativiLing;

public class Aluno extends Pessoa{
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void apresentar (){
	
		System.out.println("Olá, sou o(a) aluno(a) " + getNome() + " com matŕicula " + getMatricula()+ " e tenho "  + getIdade() + " anos");
		
	}

}
