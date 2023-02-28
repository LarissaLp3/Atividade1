package ativiLing;

public class Quadrado extends FormaGeometrica {
	
	private double lado;
	private double resultado;
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public  void calcularArea(){
		setResultado(getLado() * getLado());
		System.out.println("A área do quadrado é: " + getResultado());
		
	}

}
