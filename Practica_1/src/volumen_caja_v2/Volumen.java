/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 08/09/2020
 *Descripci�: Versi�n 2 del programa que calcula el volumen de una caja, con los atributos
 *p�blicos en la clase volumen, utilizando instancia para tener acceso desde la clase principal.
*/

package volumen_caja_v2;

public class Volumen {

	int anchura, altura, profundidad; //Declaraci�n de los atributos de manera p�blica.
	
	int volumen() {
		return anchura*altura*profundidad;
	}
}
