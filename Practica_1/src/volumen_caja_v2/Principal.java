/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 08/09/2020
 *Descripci�: Versi�n 2 del programa que calcula el volumen de una caja, con los atributos
 *p�blicos en la clase volumen, utilizando instancia para tener acceso desde la clase principal.
*/

package volumen_caja_v2;

public class Principal {
	
	public static void main(String[] args) {
		
		Volumen vol = new Volumen(); //Creaci�n del objeto de la clase Volumen

		vol.anchura = 10;
		vol.altura = 15;		//Inicializaci�n de los atributos del objeto por medio de la instancia.
		vol.profundidad = 20;
		//Impresi�n del resultado por medio de la instancia.
		System.out.println("El volumen de un caja de anchura "+ vol.anchura + " altura " + vol.altura + 
				" profundidad " + vol.profundidad + " es: " + vol.volumen());
	}

}
