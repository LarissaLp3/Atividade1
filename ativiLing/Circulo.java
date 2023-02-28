package ativiLing;

public class Circulo extends FormaGeometrica{
	private double raio;
	private double resultado;
		
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public  void calcularArea(){
		setResultado(getRaio() * getRaio() * 3.14);
		System.out.println("A área do círculo é: " + getResultado());
	}

}
