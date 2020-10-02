/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 08/09/2020
 *Descripció: Versión 1 del programa que calcula el volumen de una caja, con los atributos
 *públicos en la clase volumen y haciendo todas las operaciones desde esta misma clase.
*/

package volumen_caja_v1;

public class Volumen {
	
static int anchura, altura, profundidad;
	
	public static void main(String[] args) {
		anchura = 10;
		altura = 15;		//Inicialización de los atributos dentro del main.
		profundidad = 20;
		
		System.out.println("El volumen de un caja de anchura "+ anchura + " altura " + altura + 
				" profundidad " + profundidad + " es: " + volumen());
	}
	//Método estático para el cálculo del volumen. 
	static int volumen() {
		return anchura*altura*profundidad;
	}

}
