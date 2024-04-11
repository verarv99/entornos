package Modelo;

public class Rectangulo extends Figura {
private double base;
private double altura;
/**
 * constructor por defecto. Crea un con base y altura 1 en metros
 */
public Rectangulo() {
	this.base=1;
	this.altura=1;
	
}
/**
 * constructor que recibe como parametros la base y la altura en metros
 * 
 * @param base la base del rectangulo en metros
 * @param altura la altura del rectangulo en metros
 */
public Rectangulo(double base,double altura) {
	this.base=base;
	this.altura=altura;
}
	
	
	/**
 * @see Modelos.Figura#area()
 */
	@Override
	public double area() {
		
		return base*altura;
	}
/**
 * @see Modelos.Figura#perimetro()
 */
	@Override
	public double perimetro() {
		
		return 2*base+2*altura;
	}

}
