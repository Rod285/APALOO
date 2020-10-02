/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 08/09/2020
 *Descripció: Versión 2 del programa que calcula el volumen de una caja, con los atributos
 *públicos en la clase volumen, utilizando instancia para tener acceso desde la clase principal.
*/

package volumen_caja_v2;

public class Volumen {

	int anchura, altura, profundidad; //Declaración de los atributos de manera pública.
	
	int volumen() {
		return anchura*altura*profundidad;
	}
}
