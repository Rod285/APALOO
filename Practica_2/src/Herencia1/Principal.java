/*Autor: Jos� Rodrigo Mej�a Vel�zquez
 *Fecha: 17/09/2020
 *Descripci�: Clase principal de proyecto Herencia1.
*/

package Herencia1;

public class Principal {

	public static void main(String[] args) {
		Mexicano mex = new Mexicano("Rodrigo", "Mej�a", 35, "MEVRAAMMDDHDFJLDXX");
		System.out.println(mex.getInformacion());
		
		Americano ame = new Americano("John", "Smith", 36, "123456789");
		System.out.println(ame.getInformacion());
		
		Humano hum = new Humano("Hans", "Bauer", 34);
		System.out.println(hum.getNombreComleto() + " " + hum.getEdad());
		
		/*Al hacer la analog�a en �ste proyecto con el llevado a cabo con el proyecto 2, colocamos dentro del
		 *contructor Humano un mensaje mostrando la palabra Humano, adem�s de las palabras mexicano y americano
		 *en sus respectivos constructores (est�n marcados como comentarios), al ejecutar el programa y se
		 *generan los objetos mex y ame, se muestran las leyendas "Humano mexicano" y "Humano americano" antes
		 *que cualquier otra operaci�n despu�s de la creaci�n de cada objeto, por lo que observamos que primero
		 *se ejecuta el constructor de la clase Humano (superclase) y despu�s los de las clases mexicano y 
		 *americano (subclases), lo cual concuerda con lo que ocurre en el Proyecto 2.  
		 */
	}

}
