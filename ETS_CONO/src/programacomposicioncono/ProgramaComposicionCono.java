package programacomposicioncono;

/**
 * Clase que muestra los atributos de un cono con un radio aleatorio adem�s de
 * calcular su �rea.
 * @author alumnodam
 *
 */

public class ProgramaComposicionCono {
	
	/**
	 * M�todo que muestra por pantalla un objeto
	 * @param datos
	 */
	private static void imprimir(Object datos) {
		System.out.println(datos);
	}
	
	/**
	 * Programa principal de la clase ProgramaComposicionCono.java
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}
}