/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 17/09/2020
 *Descripci�n: Clase Mexicano del proyecto Herencia1, se observa que la clase hereda de la Clase Humano,
 *tiene un atributo propio llamado curp, constructor llamado Mexicano y un m�todo getInformaci�n.
*/

package Herencia1;

public class Mexicano extends Humano {

	private String curp;
	
	Mexicano(String nombre, String apellido, int edad, String curp){
		//this.curp = curp;				  Marca error al querer inicializar el atributo curp antes que el
		super(nombre, apellido, edad);  //constructor de la superclase.
		this.curp = curp;
		//System.out.println("mexicano");
	}
	
	String getInformacion() {
		return super.getNombreComleto() + super.getEdad() + "\nCURP: " + curp;
	}
}
