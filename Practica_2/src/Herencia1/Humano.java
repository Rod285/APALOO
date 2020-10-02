/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 17/09/2020
 *Descripción: Clase Humano del proyecto Herencia1, la cual es la superclase de las Clases Mexicano y Americano,
 *tiene un atributos propios llamados nombre, apellido y edad, constructor llamado Humano y dos métodos
 *getNombreCompleto y getEdad.
*/

package Herencia1;

public class Humano {

	private String nombre;
	private String apellido;
	private int edad;
	
	Humano(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;		//this. es necesario cuando el argumento recibido por el constructor
		this.edad = edad;				//tiene el mismo nombre que un atributo dentro de la clase y por medio de
		//System.out.print("Humano ");  //este se diferencían el uno del otro.
	}
	
	String getNombreComleto() {
		return "\nNombre completo: " + nombre + " " + apellido + "\nEdad: ";
	}
	
	int getEdad() {
		return edad;
	}
}
