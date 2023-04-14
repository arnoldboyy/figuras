package calculos;

public class Cilindro extends Figura3d {
	private double altura;
	private double radio;



	public Cilindro(double altura, double radio) {
	this.altura=altura;
	this .radio=radio;
	
	}
	public double calcularVolumen(){
	return Math.PI * Math.pow(radio, 2)*altura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
