package programacomposicioncono;

public class Cono {
	
	//atributos
	private Circulo base;
	private float altura;
	private String color;

	//constructor
	public Cono(float cX, float cY, float r, float h, String color) { 
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}
	
	//Getters & Setters
	public Circulo getBase() {
		return base;
	}
	public void setBase(Circulo base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Método propio de la clase Cono que muestra por pantalla los atributos
	 * de un objeto de tipo Cono
	 */
	public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}
