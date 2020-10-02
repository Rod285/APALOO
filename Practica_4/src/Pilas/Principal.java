/*Autor: José Rodrigo Mejía Velázquez
 *Fecha: 29/09/2020
 *Descripción: Clase principal de proyecto Pilas 1, contiene dos estructuras for, la primera llena la
 *			   pila por medio del método push y la segunda imprime los números que son retirados por
 *			   medio del método pop, ambos están conenidos en la clase Pila. 
*/

package Pilas;

public class Principal {

	public static void main(String[] args) {
		
		Pila p1 = new Pila();
		
		for(int i = 0; i<10;i++)
			p1.push((i+1)*5);
		
		//p1.tope = 5;		//Como los atributos de la clase Pila no son privados, se puede tener
		//p1.stk[5] = 50;	//acceso a ellos desde otras clases, lo cual es inseguro.
		
		for(int i = 0; i<10; i++)
			System.out.println(p1.pop());
	}

}