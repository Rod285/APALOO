/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 08/09/2020
 *Descripci�: Versi�n 3 del programa que calcula el volumen de una caja, con los atributos
 *privados en la clase volumen, utilizando setters y getters para tener acceso a ellos en la
 *clase principal.
*/

package volumen_caja_v3;

public class Volumen {
	private int anchura, altura, profundidad; //Declaraci�n de los atributos de forma privada.
	
	int volumen() {
		return anchura*altura*profundidad;
	}
	//M�todo setAtributos, mediante el cual se inicializan los atributos de las instancias.
	void setAtributos(int x, int y, int z) {
		anchura = x;
		altura = y;
		profundidad = z;
	}
	
	public int getAnchura() {
		return anchura;
	}

	public int getAltura() {		//M�todos getAnchura, getAltura y getProfundidad, mediante los cuales 
		return altura;				//la clase Principal puede tener acceso a los valores que tienen los atributos.
	}

	public int getProfundidad() {
		return profundidad;
	}

}
