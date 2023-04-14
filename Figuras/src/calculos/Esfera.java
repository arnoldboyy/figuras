package calculos;

public class Esfera extends Figura3d {
	private double radio;



	public Esfera( double radio) {
	this .radio=radio;
	
	}
	public double calcularVolumen(){
	return (4.0/3.0)* Math.PI * Math.pow(radio, 3);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}