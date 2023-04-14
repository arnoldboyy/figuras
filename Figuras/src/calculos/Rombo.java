package calculos;

public class Rombo extends Figura2d {
	private double diagonalmayor;
	private double diagonalmenor;
	private double lado;
	
	public Rombo(double diagonalmayor, double diagonalmenor, double lado) {
	this.diagonalmayor=diagonalmayor;
	this.diagonalmenor=diagonalmenor;
	this.lado =lado;
	}
	public double calcularPerimetro(){
	return (lado*4);
	}
	public double calcularArea(){
	return (diagonalmayor*diagonalmenor)/2;
	}
	public double getDiagonalmayor() {
		return diagonalmayor;
	}
	public void setDiagonalmayor(double diagonalmayor) {
		this.diagonalmayor = diagonalmayor;
	}
	public double getDiagonalmenor() {
		return diagonalmenor;
	}
	public void setDiagonalmenor(double diagonalmenor) {
		this.diagonalmenor = diagonalmenor;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	

}