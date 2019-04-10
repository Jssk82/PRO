package programacomposicioncono;

public class Circulo {
	
	//Atributos
	private float x, y;
	private float radio;

	//Constructor
	public Circulo(float cX, float cY, float r) { 
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}
	
	//Getters & Setters
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}

	
	/**
	 * Método de la clase Circulo que calcula el área de un objeto Círculo
	 * @return float con el valor del área del círculo.
	 */
	public float area() {
		return (float) Math.PI * radio * radio;
	}

	/**
	 * Método propio de la clase Círculo que muestra por pantalla los atributos
	 * de un objeto de tipo Círculo y su área
	 */
	public void imprimir() {
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);
		System.out.print(" r=" + radio);
		System.out.print(" A=" + area());
	}
}