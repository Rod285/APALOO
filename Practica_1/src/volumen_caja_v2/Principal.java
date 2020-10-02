/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 08/09/2020
 *Descripció: Versión 2 del programa que calcula el volumen de una caja, con los atributos
 *públicos en la clase volumen, utilizando instancia para tener acceso desde la clase principal.
*/

package volumen_caja_v2;

public class Principal {
	
	public static void main(String[] args) {
		
		Volumen vol = new Volumen(); //Creación del objeto de la clase Volumen

		vol.anchura = 10;
		vol.altura = 15;		//Inicialización de los atributos del objeto por medio de la instancia.
		vol.profundidad = 20;
		//Impresión del resultado por medio de la instancia.
		System.out.println("El volumen de un caja de anchura "+ vol.anchura + " altura " + vol.altura + 
				" profundidad " + vol.profundidad + " es: " + vol.volumen());
	}

}
