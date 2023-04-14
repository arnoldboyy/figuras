package calculos;

public class Hexagono extends Poligonos {
	private double lado;
	private double apotema;


	public Hexagono(double lado, double apotema) {
	this.lado=lado;
	this .apotema=apotema;
	}
	public double calcularPerimetro(){
	return (lado*6);
	}
	public double calcularArea() {
		return (lado*6)*(apotema)/2;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

}

