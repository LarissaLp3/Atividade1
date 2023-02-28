package ativiLing;

public class Inicio {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("José");
		pessoa1.setIdade(18);
		pessoa1.apresentar();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Carol");
		aluno1.setIdade(17);
		aluno1.setMatricula(12345);
		aluno1.apresentar();
		
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(2);
		circulo1.calcularArea();
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setBase(2);
		triangulo1.setAltura(2);
		triangulo1.calcularArea();
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(2);
		quadrado1.calcularArea();
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Diego");
		funcionario1.setSalario(3000);
		funcionario1.setDepartamento(1);
		funcionario1.mostrarInformacoes();
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Roberta");
		gerente1.setSalario(4000);
		gerente1.setDepartamento(2);
		gerente1.setSenha("789456");
		gerente1.mostrarInformacoes();
		
		
	}

}
