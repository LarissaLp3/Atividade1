package ativiLing;

public class Triangulo extends FormaGeometrica {
	
	private double base;
	private double altura;
	private double resultado;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public  void calcularArea(){
		setResultado(getBase() * getAltura() / 2);
		System.out.println("A área do triângulo é: " + getResultado());
		
	}
	

}
