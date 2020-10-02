/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 08/09/2020
 *Descripci�: Versi�n 3 del programa que calcula el volumen de una caja, con los atributos
 *privados en la clase volumen, utilizando setters y getters para tener acceso a ellos en la
 *clase principal.
*/

package volumen_caja_v3;

public class Principal {

	public static void main(String[] args) {
		
		Volumen vol = new Volumen();

		//vol.anchura = 10;
		//vol.altura = 15;
		//vol.profundidad = 17;
		
		vol.setAtributos(1, 15, 20); //Inicializaci�n de los atributos del objeto por medio del m�todo setAtributos.
		//Impresi�n del resultado, haciendo uso de los getters.
		System.out.println("El volumen de un caja de anchura "+ vol.getAnchura() + ", altura " + vol.getAltura() + 
				" y profundidad " + vol.getProfundidad() + ", es: " + vol.volumen());

	}

}
