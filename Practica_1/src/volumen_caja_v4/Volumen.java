/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 08/09/2020
 *Descripció: Versión 4 del programa que calcula el volumen de una caja, con los atributos
 *privados en la clase volumen, utilizando setters y getters para tener acceso a ellos en la
 *clase principal y utilizado el constructor.para inicializar los atributos.
*/

package volumen_caja_v4;

public class Volumen {
	private int anchura, altura, profundidad;
	
	Volumen(int x, int y, int z){   //Constructor Volumen
		anchura = x;
		altura = y;
		profundidad = z;
	}

	int volumen() {
		return anchura*altura*profundidad;
	}
	
	void setAtributos(int x, int y, int z) {
		anchura = x;
		altura = y;
		profundidad = z;
	}
	
	void setAnchura(int anchura) {
		this.anchura = anchura;				//El this se utiliza para esclarecer que la variable a la cual se 
	}										//encuentra asociada es el atributo de la clase.
	
	void setAltura(int altura) {			//Métodos set indivicuales a trvés de los cuales se pueden modificar
		this.altura = altura;				//los atributos de la clase Volumen desde la clase principal.
	}
	
	void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	public int getAnchura() {
		return anchura;
	}

	public int getAltura() {
		return altura;
	}

	public int getProfundidad() {
		return profundidad;
	}

}
