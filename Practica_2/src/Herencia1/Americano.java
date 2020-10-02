/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 17/09/2020
 *Descripción: Clase Americano del proyecto Herencia1, se observa que la clase hereda de la Clase Humano,
 *tiene un atributo propio llamado nss, constructor llamado Americano y un método getInformación.
*/

package Herencia1;

public class Americano extends Humano {
	private String nss;
	
	Americano(String nombre, String apellido, int edad, String nss){
		//this.nss = nss; 					marca error al querer inicializar el atributo nss antes que el
		super(nombre, apellido, edad);    //constructor de la superclase.
		this.nss = nss;
		//System.out.println("americano");
	}
	
	String getInformacion() {
		return super.getNombreComleto() + super.getEdad() + "\nNSS: " + nss;
	}
}
