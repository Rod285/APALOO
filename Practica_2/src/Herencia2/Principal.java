/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 17/09/2020
 *Descripción: Clase Principal del proyecto Herencia2, se crea el objeto C, para observar el orden de ejecución
 *de los constructores de las clases A, B y C.
*/

package Herencia2;

public class Principal {

	public static void main(String[] args) {
		
		C obj = new C();  
	}
	
	/*Se ejecutan los tres constructores, primero el constructor de la clase A, después el le la clase B
	 *y por último el de la clase C.
	 *
	 *Para llevar a cabo la analogía en Herencía uno se colocaron mensajes dentro de los constructores de las
	 *clases Humano, Mexicano y Americano, se especifica mejor dentro de la clase Principal del proyecto
	 *Herencia1.
	*/

}
