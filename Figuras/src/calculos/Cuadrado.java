package calculos;

public class Cuadrado extends Poligonos {
private double lado;


public Cuadrado(double lado) {
this.lado=lado;
}
public double calcularPerimetro(){
return (lado*4);
}
public double calcularArea(){
return lado*lado;
}
public double getLado() {
	return lado;
}
public void setLado(double lado) {
	this.lado = lado;
}



}
