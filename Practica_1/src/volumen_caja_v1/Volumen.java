/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 08/09/2020
 *Descripci�: Versi�n 1 del programa que calcula el volumen de una caja, con los atributos
 *p�blicos en la clase volumen y haciendo todas las operaciones desde esta misma clase.
*/

package volumen_caja_v1;

public class Volumen {
	
static int anchura, altura, profundidad;
	
	public static void main(String[] args) {
		anchura = 10;
		altura = 15;		//Inicializaci�n de los atributos dentro del main.
		profundidad = 20;
		
		System.out.println("El volumen de un caja de anchura "+ anchura + " altura " + altura + 
				" profundidad " + profundidad + " es: " + volumen());
	}
	//M�todo est�tico para el c�lculo del volumen. 
	static int volumen() {
		return anchura*altura*profundidad;
	}

}
