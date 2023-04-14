package calculos;

public class Cubo extends Figura3d {
	private double lado;
	


	public Cubo(double lado) {
	this.lado=lado;
	
	}
	public double calcularVolumen(){
	return (lado*3);
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
