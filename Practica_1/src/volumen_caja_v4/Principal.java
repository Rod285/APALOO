/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 08/09/2020
 *Descripci�: Versi�n 3 del programa que calcula el volumen de una caja, con los atributos
 *privados en la clase volumen, utilizando setters y getters para tener acceso a ellos en la
 *clase principal y utilizado el constructor.para inicializar los atributos.
*/

package volumen_caja_v4;

public class Principal {
	
	public static void main(String[] args) {
		
		Volumen vol = new Volumen(10, 15, 20); //Inicializaci�n de los atributos del objeto por medio del constructor.
		
		System.out.println("El volumen de un caja de anchura "+ vol.getAnchura() + ", altura " + vol.getAltura() + 
				", profundidad " + vol.getProfundidad() + ", es: " + vol.volumen());

		vol.setAnchura(1); //Modificaci�n individual del atributo anchura por medio de m�todo setAnchura.
		
		System.out.println("El volumen de un caja de anchura "+ vol.getAnchura() + ", altura " + vol.getAltura() + 
				", profundidad " + vol.getProfundidad() + ", es: " + vol.volumen());
		
		vol.setAtributos(1, 2, 3); 
		
		System.out.println("El volumen de un caja de anchura "+ vol.getAnchura() + ", altura " + vol.getAltura() + 
				", profundidad " + vol.getProfundidad() + ", es: " + vol.volumen());
		
		vol = new Volumen(2, 4, 6); //Modificaci�n delos atributos del objeto por medio del constructor Volumen.
		
		System.out.println("El volumen de un caja de anchura "+ vol.getAnchura() + ", altura " + vol.getAltura() + 
				", profundidad " + vol.getProfundidad() + ", es: " + vol.volumen());
	}

}
