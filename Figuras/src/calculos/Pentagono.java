package calculos;

public class Pentagono extends Poligonos {
	private double lado;
	private double apotema;


	public Pentagono(double lado, double apotema) {
	this.lado=lado;
	this .apotema=apotema;
	}
	public double calcularPerimetro(){
	return (lado*5);
	}
	public double calcularArea() {
		return (lado*5)*(apotema)/2;
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
