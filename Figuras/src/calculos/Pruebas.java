package calculos;

public class Pruebas {

public static void main(String[] args) {
Rectangulo r1 = new Rectangulo(2.0,4.0);
Rectangulo r2 = new Rectangulo(3.0,6.0);

System.out.println("FIGURAS 2D\n");
System.out.println("RECTANGULOS");
System.out.println("Perímetros");
System.out.println("Rectángulo 1:  "  + r1.calcularPerimetro());
System.out.println("Rectángulo 2:  "  + r2.calcularPerimetro());
System.out.println("Area");
System.out.println("Rectángulo 1:  " + r1.calcularArea());
System.out.println("Rectángulo 2 : "  + r2.calcularArea());

Circulo c1 = new Circulo(2);
Circulo c2 = new Circulo(4);
System.out.println("\nCIRCULOS" );
System.out.println("Perímetros");
System.out.println("Circulo 1: "+c1.calcularPerimetro());
System.out.println("Circulo 2: "+c2.calcularPerimetro());
System.out.println("Area");
System.out.println("Circulo 1: "+c1.calcularArea());
System.out.println("Circulo 2: "+c2.calcularArea());

Rombo ro1 = new Rombo(8.0,6.0,3.0);
Rombo ro2 = new Rombo(4.0,3.0,2.0);
System.out.println("\nROMBOS" );
System.out.println("Perímetros");
System.out.println("Rombo 1: "+ro1.calcularPerimetro());
System.out.println("Rombo 2: "+ro2.calcularPerimetro());
System.out.println("Area");
System.out.println("Rombo 1: "+ro1.calcularArea());
System.out.println("Rombo 2: "+ro2.calcularArea());

Cuadrado cu1 = new Cuadrado(2);
Cuadrado cu2 = new Cuadrado(4);
System.out.println("\nCUADRADOS" );
System.out.println("Perímetros");
System.out.println("Cuadrado 1: "+cu1.calcularPerimetro());
System.out.println("Cuadradoo 2: "+cu2.calcularPerimetro());
System.out.println("Area");
System.out.println("Cuadrado 1: "+cu1.calcularArea());
System.out.println("Cuadrado 2: "+cu2.calcularArea());


Pentagono pen1 = new Pentagono(2, 5);
Pentagono pen2 = new Pentagono(4, 6);
System.out.println("\nPENTAGONOS" );
System.out.println("Perímetros");
System.out.println("Pentagono 1: "+pen1.calcularPerimetro());
System.out.println("Pentagono 2: "+pen2.calcularPerimetro());
System.out.println("Area");
System.out.println("Pentagono 1: "+pen1.calcularArea());
System.out.println("Pentagono 2: "+pen2.calcularArea());

Hexagono hex1 = new Hexagono(2, 5);
Hexagono hex2 = new Hexagono(4, 6);
System.out.println("\nHEXAGONOS" );
System.out.println("Perímetros");
System.out.println("Hexagono 1: "+hex1.calcularPerimetro());
System.out.println("Hexagono 2: "+hex2.calcularPerimetro());
System.out.println("Area");
System.out.println("Hexagono 1: "+hex1.calcularArea());
System.out.println("Hexagono 2: "+hex2.calcularArea());


Cubo cub1 = new Cubo(2);
Cubo cub2 =  new Cubo(3);
System.out.println("\nFIGURAS 3D");
System.out.println("CUBOS");
System.out.println("VOLUMENES");
System.out.println("Cubo 1:  "  + cub1.calcularVolumen());
System.out.println("Cubo 2:  "  + cub2.calcularVolumen());

Cilindro cil1 = new Cilindro(2,4);
Cilindro cil2 =  new Cilindro(4,3);
System.out.println("\nCILINDROS");
System.out.println("VOLUMENES");
System.out.println("Cilindro 1:  "  + cil1.calcularVolumen());
System.out.println("Cilindro 2:  "  + cil2.calcularVolumen());

Esfera esf1 = new Esfera(2);
Esfera esf2 =  new Esfera(3);
System.out.println("\nESFERAS");
System.out.println("VOLUMENES");
System.out.println("Esfera 1:  "  + esf1.calcularVolumen());
System.out.println("Esfera 1:  "  + esf2.calcularVolumen());



}

}