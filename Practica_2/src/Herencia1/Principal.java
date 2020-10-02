/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 17/09/2020
 *Descripció: Clase principal de proyecto Herencia1.
*/

package Herencia1;

public class Principal {

	public static void main(String[] args) {
		Mexicano mex = new Mexicano("Rodrigo", "Mejía", 35, "MEVRAAMMDDHDFJLDXX");
		System.out.println(mex.getInformacion());
		
		Americano ame = new Americano("John", "Smith", 36, "123456789");
		System.out.println(ame.getInformacion());
		
		Humano hum = new Humano("Hans", "Bauer", 34);
		System.out.println(hum.getNombreComleto() + " " + hum.getEdad());
		
		/*Al hacer la analogía en éste proyecto con el llevado a cabo con el proyecto 2, colocamos dentro del
		 *contructor Humano un mensaje mostrando la palabra Humano, además de las palabras mexicano y americano
		 *en sus respectivos constructores (están marcados como comentarios), al ejecutar el programa y se
		 *generan los objetos mex y ame, se muestran las leyendas "Humano mexicano" y "Humano americano" antes
		 *que cualquier otra operación después de la creación de cada objeto, por lo que observamos que primero
		 *se ejecuta el constructor de la clase Humano (superclase) y después los de las clases mexicano y 
		 *americano (subclases), lo cual concuerda con lo que ocurre en el Proyecto 2.  
		 */
	}

}
